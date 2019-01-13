package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ZByteArrayTest extends TestCase {

  private static final Random RANDOM = new Random();


  public void testToByteArray() {
    for (int i = -10; i < 10; ++i) {
      final BigInteger n = BigInteger.valueOf(i);
      final Z zn = Z.valueOf(i);
      final byte[] b = n.toByteArray();
      final byte[] c = zn.toByteArray();
      assertEquals(b.length, c.length);
      for (int j = 0; j < b.length; ++j) {
        assertEquals(b[j], c[j]);
      }
    }
    for (int i = 10; i < 1000; ++i) {
      BigInteger n = new BigInteger(i, RANDOM);
      if (RANDOM.nextBoolean()) {
        n = n.negate();
      }
      final Z zn = Z.valueOf(n);
      final byte[] b = n.toByteArray();
      final byte[] c = zn.toByteArray();
      assertEquals(String.valueOf(n), b.length, c.length);
      for (int j = 0; j < b.length; ++j) {
        assertEquals(b[j], c[j]);
      }
    }
  }

}
