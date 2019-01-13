package irvine.factor.project.hp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class HomePrimeVerifyTest extends TestCase {

  public void testClean() throws IOException {
    try (final ByteArrayOutputStream bos = new ByteArrayOutputStream();
         final PrintStream out = new PrintStream(bos);
         final ByteArrayInputStream is = new ByteArrayInputStream("[ 2 ]\nprime 0\n[ 3 ]\nprime 0\n[ 4 ]\n2.2\n{ 22 }\n2.11\n{ 211 }\nprime 2\n[ 5 ]\nprime 0\n[ 6 ]\n2.3\n\n{ 23 }\nprime 1\n[ 7 ]\nprime 0\n[ 8 ]\n2.2.2\n{ 222 }\n2.3.37\n{ 2337 }\n3.19.41\n{ 31941 }\n3.3.3.7.13.13\n{ 33371313 }\n3.11123771\n{ 311123771 }\n7.149.317.941\n{ 7149317941 }\n229.31219729\n{ 22931219729 }\n11.2084656339\n{ 112084656339 }\n3.347.911.118189\n{ 3347911118189 }\n11.613.496501723\n{ 11613496501723 }\n97.130517.917327\n{ 97130517917327 }\n53.1832651281459\n{ 531832651281459 }\n3.3.3.11.139.653.3863.5107\n{ 3331113965338635107 }\nprime 13\n".getBytes())) {
      HomePrimeVerify.verify(is, 10, out);
      assertEquals("", bos.toString());
    }
  }

  public void test1() throws IOException {
    try (final ByteArrayOutputStream bos = new ByteArrayOutputStream();
         final PrintStream out = new PrintStream(bos);
         final ByteArrayInputStream is = new ByteArrayInputStream("[ 3 ]\nprime 0\n".getBytes())) {
      HomePrimeVerify.verify(is, 10, out);
      assertEquals("Expected entry for 2 but found entry for 3", bos.toString().trim());
    }
  }

  public void test2() throws IOException {
    try (final ByteArrayOutputStream bos = new ByteArrayOutputStream();
         final PrintStream out = new PrintStream(bos);
         final ByteArrayInputStream is = new ByteArrayInputStream("[ 2 ]\nprime 0\n[ 3 ]\nprime 0\n[ 4 ]\n2.2\n{ 22 }\n2.11\n{ 211 }\nprime 2\n[ 5 ]\nprime 0\n[ 6 ]\n2.3\n\n{ 23 }\nprime 1\n[ 7 ]\nprime 0\n[ 8 ]\n2.2.2\n{ 222 }\n2.3.37\n{ 2337 }\n3.19.41\n{ 31941 }\n3.3.3.13.13\n{ 33371313 }\nprime 13\n".getBytes())) {
      HomePrimeVerify.verify(is, 10, out);
      assertEquals("8: PRODUCT ERROR: 4563 != 31941\n8: FINAL NOT PRIME: 3331313\n8: Step mismatch: prime 13 :: should be 4\n", bos.toString());
    }
  }

}
