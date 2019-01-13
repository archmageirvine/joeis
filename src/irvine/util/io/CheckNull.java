package irvine.util.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 * Program to check for null bytes in a file.
 *
 * @author Sean A. Irvine
 */
public final class CheckNull {

  private CheckNull() { }

  /**
   * Test if an input stream contains at least one null byte.
   *
   * @param is input stream
   * @return true if stream has a null
   * @exception IOException if an I/O error occurs.
   */
  public static boolean streamHasNull(final InputStream is) throws IOException {
    int v;
    while ((v = is.read()) != -1) {
      if (v == 0) {
        return true;
      }
    }
    return false;
  }

  private static boolean checkFile(final String f) throws IOException {
    try (final BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f))) {
      return streamHasNull(bis);
    }
  }

  /**
   * Check files for null bytes.
   *
   * @param args see usage
   * @exception Exception if an error occurs
   */
  public static void main(final String[] args) throws Exception {
    if (args == null || args.length == 0) {
      System.err.println("Usage: CheckNull file*");
      return;
    }
    for (final String s : args) {
      if (checkFile(s)) {
        System.err.println(s);
      }
    }
  }
}
