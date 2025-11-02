package irvine.oeis.producer;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

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
  private final String mTimeOut;

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
    try {
      mProc = pb.start();
      final boolean verbose = "true".equals(System.getProperty("oeis.verbose", "false"));
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
    final String programType = header.getType();
    mOut.println(pariProgram); // Send the program to PARI
    mTimeOut = System.getProperty("oeis.timeout", "3600000"); // 1000 hours = almost never
    switch (programType) {
      case "an0":
        mOut.println("alarm(" + mTimeOut + ",for(n=0,+oo,print(floor(a(n)))));"); // special for P.H.
        break;
      case "an":
        mOut.println("alarm(" + mTimeOut + ",for(n=" + offset + ",+oo,print(floor(a(n)))));");
        break;
//      case "dex": // A036792
//        default(realprecision, 20080);
//        y=0; x=Pi; m=x; x2=x*x; n=1; nf=1; s=1; while (x!=y, y=x; n++; nf*=n; n++; nf*=n; m*=x2; s=-s; x+=s*m/(n*nf));
//        for (n=1, 20000, d=floor(x); x=(x-d)*10; print(d));
//        break;
      case "isok0":
        mOut.println("alarm(" + mTimeOut + ",for(n=0,+oo,if(isok(n),print(n))));");
        break;
      case "isok":
        mOut.println("alarm(" + mTimeOut + ",for(n=" + nStart + ",+oo,if(isok(n),print(n))));");
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
      final String line = mIn.readLine();
      if (line == null) {
        close();
        throw new UnsupportedOperationException("PARI did not answer during " + mTimeOut + "s");
      }
      return new Z(line);
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
