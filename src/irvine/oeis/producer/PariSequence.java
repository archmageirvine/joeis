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
    mOut.println(pariProgram); // Send the program to PARI
//    if (pariProgram.startsWith("a(n)")) {
//      mOut.println("for(n=0,+oo,print(a(n)));"); // todo deal with offset
//    }
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
