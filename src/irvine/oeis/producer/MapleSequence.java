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
 * Produce a sequence from a Maple program.
 * @author Sean A. Irvine
 */
public class MapleSequence extends AbstractSequence implements Closeable {

  // todo This should be considered preliminary
  //  - it needs to handle more styles of Maple programs
  //  - it needs to deal with offsets
  //  - it needs to check the error stream
  //  - it needs to check other error conditions

  private final Process mProc;
  private final PrintWriter mOut;
  private final BufferedReader mIn;
  private int mTimeOut;

  /**
   * Construct a sequence backed by a Maple program with default offset = 0.
   * @param pariProgram Maple program
   */
  public MapleSequence(final String pariProgram) {
    this(0, pariProgram);
  }

  /**
   * Construct a sequence backed by a Maple program.
   * @param offset first index
   * @param mapleProgram Maple program
   */
  public MapleSequence(int offset, final String mapleProgram) {
    super(offset);
    final ProcessBuilder pb = new ProcessBuilder(MapleProducer.MAPLE_COMMAND, "-q");
    final boolean verbose = "true".equals(System.getProperty("oeis.verbose", "false"));
    try {
      mProc = pb.start();
      new DrainStreamThread(mProc.getErrorStream(), verbose);
      mOut = new PrintWriter(mProc.getOutputStream());
      mIn = new BufferedReader(new InputStreamReader(mProc.getInputStream()));
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    //System.out.println("Sending: " + mapleProgram);
    final Header header = new Header(mapleProgram);
    offset = header.getOffset();
    setOffset(offset);
    final int nStart = header.getNStart();
    try {
      mTimeOut = Integer.parseInt(System.getProperty("oeis.timeout", "360000")) - 1; // 100 hours = almost never
    } catch (final RuntimeException exc) {
      mTimeOut = 3;
    }

    if (verbose) {
      StringUtils.warning("# Text sent to Maple process:\n" + mapleProgram);
    }
    final String programType = header.getType();
    switch (programType) {
      case "an":
        mOut.println(mapleProgram);
        mOut.println("alarm(" + mTimeOut + ",for(n=" + offset + ",+oo,print(floor(a(n)))));");
        break;
        // todo the following are the PARI versions
//      case "decexp":
//        mOut.println(mapleProgram);
//        mOut.println("alarm(" + mTimeOut + ",for(n=" + offset + ",+oo, d=floor(XX); XX=(XX-d)*10; print(d)));");
//        break;
//      case "isok":
//        mOut.println(mapleProgram);
//        mOut.println("alarm(" + mTimeOut + ",for(n=" + nStart + ",+oo,if(isok(n),print(n))));");
//        break;
//      case "print": // the program has a trailing "print()" function
//        mOut.println(mapleProgram);
//        break;
      default:
        throw new RuntimeException("Unknown type of Maple program " + programType + "\n" + mapleProgram);
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
        throw new UnsupportedOperationException("Maple process no longer alive", e); // too bad, we tried to clean up
      }
    }
    try { 
      final String line = mIn.readLine();
      if (line == null) {
        close();
        throw new UnsupportedOperationException("Timeout after " + mTimeOut + "s");
      }
      return new Z(line);
    } catch (final IOException e) {
      throw new UnsupportedOperationException("Maple failed to produce more terms", e);
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
