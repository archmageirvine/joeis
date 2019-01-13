package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class AddTest extends TestCase {

  static final Random RANDOM = new Random();


  public void testAdd() {
    assertEquals(Z.ZERO, Add.add(Z.ZERO, Z.ZERO));
    for (long i = -100L; i < 100L; ++i) {
      final Z z = Z.valueOf(i);
      assertEquals(z, Add.add(Z.ZERO, z));
      assertEquals(z, Add.add(z, Z.ZERO));
      assertEquals(Z.ZERO, Add.add(z, z.negate()));
    }
    for (int i = 30; i < 1000; ++i) {
      final BigInteger v1 = new BigInteger(i, RANDOM);
      final BigInteger v2 = new BigInteger(i, RANDOM);
      final Z z1 = Z.valueOf(v1);
      final Z z2 = Z.valueOf(v2);
      assertEquals(v1 + "+" + v2, v1.add(v2), Add.add(z1, z2).bigIntegerValue());
      assertEquals(v2 + "-" + v1, v1.negate().add(v2), Add.add(z1.negate(), z2).bigIntegerValue());
      assertEquals(v1 + "-" + v2, v1.add(v2.negate()), Add.add(z1, z2.negate()).bigIntegerValue());
      assertTrue(v1 + "-" + v1, Z.ZERO.equals(Add.add(z1, z1.negate())));
      // check immutability
      assertEquals(v1, z1.bigIntegerValue());
      assertEquals(v2, z2.bigIntegerValue());
    }
    for (int i = 30; i < 1000; i += 7) {
      final BigInteger v1 = new BigInteger(i, RANDOM);
      final BigInteger v2 = new BigInteger(i / 2, RANDOM);
      final Z z1 = Z.valueOf(v1);
      final Z z2 = Z.valueOf(v2);
      assertEquals(v1 + "+" + v2, v1.add(v2), Add.add(z1, z2).bigIntegerValue());
      assertEquals(v2 + "-" + v1, v1.negate().add(v2), Add.add(z1.negate(), z2).bigIntegerValue());
      assertEquals(v1 + "-" + v2, v1.add(v2.negate()), Add.add(z1, z2.negate()).bigIntegerValue());
      assertTrue(v1 + "-" + v1, Z.ZERO.equals(Add.add(z1, z1.negate())));
    }
  }

  public void testAddLong() {
    assertEquals(Z.ZERO, Z.ZERO.add(0L));
    for (int i = 30; i < 100; i += 3) {
      final BigInteger v1 = new BigInteger(i, RANDOM);
      final long v2 = RANDOM.nextLong();
      final Z z1 = Z.valueOf(v1);
      assertEquals(v1 + "+" + v2, v1.add(BigInteger.valueOf(v2)), z1.add(v2).bigIntegerValue());
    }
  }

  public void testBoundary() {
    final Z n = Z.valueOf(Z.BASE - 1);
    final Z i = Z.ONE.shiftLeft(2 * Z.BASE_BITS);
    final Z j = i.subtract(Z.ONE);
    final Z k = i.add(1);
    assertEquals(i.multiply2(), Add.add(j, k));
    assertEquals(j.bigIntegerValue().add(n.bigIntegerValue()), Add.add(j, n).bigIntegerValue());
  }
}
