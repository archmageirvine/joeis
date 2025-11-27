package irvine.oeis.producer;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.string.StringUtils;

/**
 * Produce a sequence from a PARI program.
 * @author Sean A. Irvine
 */
public class PariSequence extends AbstractSequence implements Closeable {

  // todo This should be considered preliminary
  //  - it needs to handle more styles of PARI programs
  //  - it needs to deal with offsets
  //  - it needs to check the error stream
  //  - it needs to check other error conditions

  private final Process mProc;
  private final PrintWriter mOut;
  private final BufferedReader mIn;
  private int mTimeOut;

  /**
   * Construct a sequence backed by a PARI program with default offset = 0.
   * @param pariProgram PARI program
   */
  public PariSequence(final String pariProgram) {
    this(0, pariProgram);
  }

  /**
   * Construct a sequence backed by a PARI program.
   * @param offset first index
   * @param pariProgram PARI program
   */
  public PariSequence(int offset, final String pariProgram) {
    super(offset);
    final ProcessBuilder pb = new ProcessBuilder(PariProducer.PARI_COMMAND, "--fast", "--quiet");
    final boolean verbose = "true".equals(System.getProperty("oeis.verbose", "false"));
    try {
//      pb.redirectErrorStream(true);
//      pb.redirectOutput(Redirect.INHERIT);
      mProc = pb.start();
      new DrainStreamThread(mProc.getErrorStream(), verbose);
      mOut = new PrintWriter(mProc.getOutputStream());
      mIn = new BufferedReader(new InputStreamReader(mProc.getInputStream()));
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    //System.out.println("Sending: " + pariProgram);
    final Header header = new Header(pariProgram);
    offset = header.getOffset();
    setOffset(offset);
    final int nStart = header.getNStart();
    try {
      mTimeOut = Integer.parseInt(System.getProperty("oeis.timeout", "360000")) - 1; // 100 hours = almost never
    } catch (final RuntimeException exc) {
      mTimeOut = 3;
    }

    if (verbose) {
      StringUtils.warning("# Text sent to PARI process:\n" + pariProgram);
    }
    final String programType = header.getType();
    switch (programType) {
      case "an":
        mOut.println(pariProgram);
        mOut.println("alarm(" + mTimeOut + ",for(n=" + offset + ",+oo,print(floor(a(n)))));");
        break;
      case "decexp":
        mOut.println(pariProgram);
        mOut.println("alarm(" + mTimeOut + ",for(n=" + offset + ",+oo, d=floor(XX); XX=(XX-d)*10; print(d)));");
        break;
      case "isok":
        mOut.println(pariProgram);
        mOut.println("alarm(" + mTimeOut + ",for(n=" + nStart + ",+oo,if(isok(n),print(n))));");
        break;
      case "print": // the program has a trailing "print()" function
        mOut.println(pariProgram);
        break;
      default:
        throw new RuntimeException("Unknown type of PARI program " + programType + "\n" + pariProgram);
    }
    mOut.flush();
    mOut.close();
  }

  @Override
  public Z next() {
    // If we detect a problem, try hard to close things down
    if (!mProc.isAlive()) {
      try {
        close();
      } catch (final IOException e) {
        throw new UnsupportedOperationException("PARI process no longer alive", e); // too bad, we tried to clean up
      }
    }
    try { 
/*
      int loop = 4;
      while (--loop >= 0 && !mIn.ready()) {
          Thread.sleep(500);
      }
*/
      final String line = mIn.readLine();
      if (line == null) {
        close();
//        throw new TimeoutException("PARI did not answer during " + mTimeOut + "s");
//        return null;
        throw new UnsupportedOperationException("Timeout after " + mTimeOut + "s");
      }
      return new Z(line);
/*
    } catch (final InterruptedException e) {
      throw new UnsupportedOperationException("PARI: InterruptedException", e);
*/
    } catch (final IOException e) {
      throw new UnsupportedOperationException("PARI failed to produce more terms", e);
    }
  }

  @Override
  public void close() throws IOException {
    try {
      mOut.close();
    } finally {
      try {
        mIn.close();
      } finally {
        if (mProc.isAlive()) {
          mProc.destroyForcibly();
        }
      }
    }
  }
}
