package irvine.factor.project.alonso;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class AlonsoVerifyTest extends TestCase {

  public void testClean() throws IOException {
    try (final ByteArrayOutputStream bos = new ByteArrayOutputStream();
         final PrintStream out = new PrintStream(bos);
         final ByteArrayInputStream is = new ByteArrayInputStream("# Factorizations of Alonso sequence starting with 20.\n0 20\n1 2^2.5\n2 3^2.5^2\n3 2^2.3.271\n4 29.7699\n".getBytes())) {
      AlonsoVerify.verify(is, out);
      assertEquals("", bos.toString());
    }
  }

  public void test1() throws IOException {
    try (final ByteArrayOutputStream bos = new ByteArrayOutputStream();
         final PrintStream out = new PrintStream(bos);
         final ByteArrayInputStream is = new ByteArrayInputStream("0 20 junk\n1 2^2.5\n2 3^2.5^2\n3 2^2.3.271\n4 29.7699\n".getBytes())) {
      AlonsoVerify.verify(is, out);
      assertEquals("Strange line\n", bos.toString());
    }
  }

  public void test2() throws IOException {
    try (final ByteArrayOutputStream bos = new ByteArrayOutputStream();
         final PrintStream out = new PrintStream(bos);
         final ByteArrayInputStream is = new ByteArrayInputStream("0 20\n1 2^2.5\n2 3^2.5^2\n3 2^2.3.273\n4 29.7699\n".getBytes())) {
      AlonsoVerify.verify(is, out);
      assertEquals("4: NOT PRIME: 273 273\n4: PRODUCT ERROR: 3276 != 3252\n5: PRODUCT ERROR: 223271 != 223273\n", bos.toString());
    }
  }
}
