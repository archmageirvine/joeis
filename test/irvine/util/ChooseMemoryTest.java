package irvine.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import irvine.TestUtils;
import junit.framework.TestCase;


/**
 * Test the corresponding class.
 * @author Real Time Genomics
 */
public class ChooseMemoryTest extends TestCase {

  private void run(final String... args) {
    try {
      ChooseMemory.main(args);
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void test() throws IOException {
    final PrintStream oldOut = System.out;
    final PrintStream oldErr = System.err;
    try (final ByteArrayOutputStream out = new ByteArrayOutputStream();
         final ByteArrayOutputStream err = new ByteArrayOutputStream();
         final PrintStream pout = new PrintStream(out);
         final PrintStream perr = new PrintStream(err)) {
      System.setOut(pout);
      System.setErr(perr);
      run(new String[0]);
      run("0");
      run("101");
      run("100");
      pout.flush();
      perr.flush();
      final String outString = out.toString();
      final String errString = err.toString();
      assertTrue(outString.contains("m"));
      TestUtils.containsAll(errString,
        "Percentage must be greater than 0.",
        "Percentage must be less than or equal to 100.");
    } finally {
      System.setOut(oldOut);
      System.setErr(oldErr);
    }
  }
}
