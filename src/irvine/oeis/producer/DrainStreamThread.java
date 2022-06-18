package irvine.oeis.producer;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

/**
 * Drain the error thread, optionally retaining any error message.
 * @author Sean A. Irvine
 */
class DrainStreamThread extends Thread {

  private final InputStream mInputStream;
  private final boolean mPrintErrors;
  private boolean mError = false;

  DrainStreamThread(final InputStream is, final boolean printErrors) {
    mInputStream = is;
    mPrintErrors = printErrors;
  }

  @Override
  public void run() {
    try {
      try (final StringWriter output = new StringWriter()) {
        final byte[] buff = new byte[4096];
        int len;
        while ((len = mInputStream.read(buff)) >= 1) {
          output.append(new String(buff, 0, len));
        }
        final String errString = output.toString();
        if (mPrintErrors) {
          System.err.println(errString);
        }
      }
    } catch (final IOException e) {
      mError = true;
    } finally {
      try {
        mInputStream.close();
      } catch (final IOException e) {
        // too bad, we tried
      }
    }
  }

  boolean isError() {
    return mError;
  }

}
