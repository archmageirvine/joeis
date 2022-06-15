package irvine.oeis.producer;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Produce a sequence from a PARI program.
 * @author Sean A. Irvine
 */
public class PariSequence implements Sequence, Closeable {

  // todo This should be considered preliminary
  //  - it needs to handle more styles of PARI programs
  //  - it needs to deal with offsets
  //  - it needs to check the error stream
  //  - it needs to check other error conditions

  private final Process mProc;
  private final PrintWriter mOut;
  private final BufferedReader mIn;

  // The follow is more of utility applicable to other CAS as well
  // todo Perhaps as a class that can pull out other features from the header line
  private static final String OFFSET_TAG = "offset=";
  private static int getOffset(final String program) {
    int offset = 0;
    final int offsetPos = program.indexOf(OFFSET_TAG);
    if (offsetPos >= 0) {
      int k = offsetPos + OFFSET_TAG.length();
      while (Character.isDigit(program.charAt(k))) {
        offset *= 10;
        offset += program.charAt(k) - '0';
        ++k;
      }
    }
    return offset;
  }

  private static int getPariType(final String program) {
    // todo parse header line or similar to determine program type
    return 0; // a(n) = ... type
  }

  /**
   * Construct a sequence backed by a PARI program.
   * @param pariProgram PARI program
   */
  public PariSequence(final String pariProgram) {
    final ProcessBuilder pb = new ProcessBuilder(PariProducer.PARI_COMMAND, "--fast", "--quiet");
    try {
      mProc = pb.start();
      mOut = new PrintWriter(mProc.getOutputStream());
      mIn = new BufferedReader(new InputStreamReader(mProc.getInputStream()));
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    //System.out.println("Sending: " + pariProgram);
    final int offset = getOffset(pariProgram);
    final int programType = getPariType(pariProgram);
    mOut.println(pariProgram); // Send the program to PARI
    switch (programType) {
      case 0:
        mOut.println("for(n=" + offset + ",+oo,print(a(n)));");
        break;
      default:
        throw new RuntimeException("Unknown type of PARI program " + programType + "\n" + pariProgram);
    }
    mOut.flush();
  }

  @Override
  public Z next() {
    // If we detect a problem, try hard to close things down
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
      return new Z(line);
    } catch (final IOException e) {
      throw new UnsupportedOperationException("PARI failed to produce more terms", e);
    }
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
