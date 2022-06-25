package irvine.oeis.producer;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * Produce a sequence from a PARI program.
 * @author Sean A. Irvine
 */
public class PariSequence implements SequenceWithOffset, Closeable {

  // todo This should be considered preliminary
  //  - it needs to handle more styles of PARI programs
  //  - it needs to deal with offsets
  //  - it needs to check the error stream
  //  - it needs to check other error conditions

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose", "false"));
  private final String mTimeout = System.getProperty("oeis.timeout", "3600000"); // 1000 hours = almost never
  private final Process mProc;
  private final PrintWriter mOut;
  private final BufferedReader mIn;
  private final Header mHeader;

  /**
   * Construct a sequence backed by a PARI program.
   * @param pariProgram PARI program
   */
  public PariSequence(final String pariProgram) {
    final ProcessBuilder pb = new ProcessBuilder(PariProducer.PARI_COMMAND, "--fast", "--quiet");
    try {
      
      mProc = pb.start();
      new DrainStreamThread(mProc.getErrorStream(), mVerbose);
      mOut = new PrintWriter(mProc.getOutputStream());
      mIn = new BufferedReader(new InputStreamReader(mProc.getInputStream()));
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    //System.out.println("Sending: " + pariProgram);
    mHeader = new Header(pariProgram);
    final int offset = mHeader.getOffset();
    final String programType = mHeader.getType();
    mOut.println(pariProgram); // Send the program to PARI
    switch (programType) {
      case "an0":
        mOut.println("alarm(" + mTimeout + ",for(n=0,+oo,print(a(n))));"); // special for P.H.
        break;
      case "an":
        mOut.println("alarm(" + mTimeout + ",for(n=" + offset + ",+oo,print(a(n))));");
        break;
      case "isok0":
        mOut.println("alarm(" + mTimeout + ",for(n=0,+oo,if(isok(n),print(n))));");
        break;
      case "isok":
        mOut.println("alarm(" + mTimeout + ",for(n=" + offset + ",+oo,if(isok(n),print(n))));");
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
        // too bad, we tried to clean up
      }
      return null;
    }
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
  public int getOffset() {
    return mHeader.getOffset();
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
