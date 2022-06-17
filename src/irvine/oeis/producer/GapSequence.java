package irvine.oeis.producer;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Produce a sequence from a PARI program.
 * @author Sean A. Irvine
 */
public class GapSequence implements Sequence, Closeable {

  // todo This should be considered preliminary
  //  - it needs to check the error stream
  //  - it needs to check other error conditions

  private final Process mProc;
  private final PrintWriter mOut;
  private final BufferedReader mIn;

  private final List<Z> mTerms = new LinkedList<>();

  /**
   * Construct a sequence backed by a GAP program.
   * @param gapProgram GAP program
   */
  public GapSequence(final String gapProgram) {
    final ProcessBuilder pb = new ProcessBuilder(GapProducer.GAP_COMMAND, "--quiet");
    try {
      mProc = pb.start();
      mOut = new PrintWriter(mProc.getOutputStream());
      mIn = new BufferedReader(new InputStreamReader(mProc.getInputStream()));
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    //System.out.println("Sending: " + gapProgram);
    final Header header = new Header(gapProgram);
    //final int offset = header.getOffset();
    final String programType = header.getType();
    mOut.println(gapProgram); // Send the program to PARI
    switch (programType) {
      case "list":
        break;
      default:
        throw new RuntimeException("Unknown type of GAP program " + programType + "\n" + gapProgram);
    }
    mOut.flush();
    mOut.close();
  }

  private String parse(final String part) {
    int start = 0;
    while (start < part.length() && !Character.isDigit(part.charAt(start))) {
      ++start;
    }
    if (start == part.length()) {
      return null;
    }
    int end = start + 1;
    while (end < part.length() && Character.isDigit(part.charAt(end))) {
      ++end;
    }
    return part.substring(start, end);
  }

  @Override
  public Z next() {
    if (mTerms.isEmpty()) {
      if (!mProc.isAlive()) {
        close();
        return null;
      }
      // todo check error stream
      try {
        final String line = mIn.readLine();
        if (line == null) {
          close();
          return null;
        }
        for (final String part : line.split("\\s+")) {
          final String t = parse(part);
          if (t != null) {
            mTerms.add(new Z(t));
          }
        }
      } catch (final IOException e) {
        throw new UnsupportedOperationException("PARI failed to produce more terms", e);
      }
    }
    if (mTerms.isEmpty()) {
      throw new UnsupportedOperationException("Underlying program completed");
    }
    return mTerms.remove(0);
  }

  @Override
  public void close() {
    // todo each of these steps needs care!
    try {
      mOut.close();
      mIn.close();
    } catch (final IOException e) {
      // too bad we failed to close
    }
    // todo perhaps we should not bother with the following wait
    // but it gives PARI a chance to exit cleanly
    try {
      mProc.waitFor(1, TimeUnit.SECONDS);
    } catch (final InterruptedException e) {
      // too bad we will attempt to kill it
    }
    if (mProc.isAlive()) {
      mProc.destroyForcibly();
    }
  }
}
