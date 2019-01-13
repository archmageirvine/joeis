package irvine;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

/**
 * Wraps standard input and output so they can be captured per test.
 * @author Sean A. Irvine
 */
public class StandardIoTestCase extends TestCase {

  protected PrintStream mOldOut = null;
  private PrintStream mOldErr = null;
  private ByteArrayOutputStream mOutStream = null;
  private ByteArrayOutputStream mErrStream = null;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mOldOut = System.out;
    mOldErr = System.err;
    mOutStream = new ByteArrayOutputStream();
    mErrStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(mOutStream));
    System.setErr(new PrintStream(mErrStream));
  }

  @Override
  protected void tearDown() throws Exception {
    System.setErr(mOldErr);
    System.setOut(mOldOut);
    mOutStream.close();
    mErrStream.close();
    mOutStream = null;
    mErrStream = null;
    mOldOut = null;
    mOldErr = null;
    super.tearDown();
  }

  protected void reset() {
    mOutStream.reset();
    mErrStream.reset();
  }

  protected String getOut() {
    return mOutStream.toString();
  }

  protected String getErr() {
    return mErrStream.toString();
  }
}
