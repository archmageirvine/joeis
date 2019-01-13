package irvine.math.z;

import java.math.BigInteger;
import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ExtendedEuclidTest extends TestCase {

  public void test() {
    for (int a = -10; a < 50; ++a) {
      for (int b = -10; b < 10; ++b) {
        final Z[] t = ExtendedEuclid.extendedEuclid(Z.valueOf(a), Z.valueOf(b));
        assertEquals(3, t.length);
        assertEquals("egcd(" + a + "," + b + ") " + Arrays.deepToString(t), t[0].intValue(), t[1].intValue() * a + t[2].intValue() * b);
      }
    }
  }

  public void test1() {
    for (int i = 3; i < 100; i += 17) {
      final BigInteger v1 = new BigInteger(i + 1, AddTest.RANDOM).add(BigInteger.ONE);
      final BigInteger v2 = new BigInteger(i, AddTest.RANDOM).add(BigInteger.ONE);
      final Z a = Z.valueOf(v1);
      final Z b = Z.valueOf(v2);
      final Z[] r = ExtendedEuclid.extendedEuclid(a, b);
      assertEquals(r[0], Add.add(Mul.multiply(a, r[1]), Mul.multiply(b, r[2])));
    }
  }
}
