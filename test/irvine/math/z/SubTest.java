package irvine.math.z;

import java.math.BigInteger;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class SubTest extends AddTest {

  public void testSubtract() {
    assertEquals(Z.ZERO, Z.ZERO.subtract(Z.ZERO));
    for (long i = -100L; i < 100L; ++i) {
      final Z z = Z.valueOf(i);
      assertEquals("0-" + i, z.negate(), Z.ZERO.subtract(z));
      assertEquals(z, z.subtract(Z.ZERO));
      assertEquals(Z.ZERO, z.subtract(z));
    }
    assertEquals(new BigInteger("1152921504606846975"), new Z("1152921504606846976").subtract(Z.ONE).bigIntegerValue());
    assertEquals(new BigInteger("2305843009213693951"), new Z("2305843009213693952").subtract(Z.ONE).bigIntegerValue());
    for (int i = 30; i < 1000; i += 3) {
      final BigInteger v1 = new BigInteger(i, RANDOM);
      final BigInteger v2 = new BigInteger(i, RANDOM);
      final Z z1 = Z.valueOf(v1);
      final Z z2 = Z.valueOf(v2);
      assertEquals(v1 + "-" + v2, v1.subtract(v2), z1.subtract(z2).bigIntegerValue());
      assertEquals(v1.negate().subtract(v2), z1.negate().subtract(z2).bigIntegerValue());
      assertEquals(v1.subtract(v2.negate()), z1.subtract(z2.negate()).bigIntegerValue());
      assertEquals(v1.negate().subtract(v2), z1.negate().subtract(z2).bigIntegerValue());
      assertTrue(v1 + "-" + v1, z1.subtract(z1).isZero());
      // check immutability
      assertEquals(v1, z1.bigIntegerValue());
      assertEquals(v2, z2.bigIntegerValue());
    }
  }

  public void testDifferentSigns() {
    final Z a = Z.valueOf(-4324254324L);
    assertEquals(Z.valueOf(-8648508653L), Sub.subtract(a, Z.valueOf(4324254329L)));
    assertEquals(Z.FIVE, Sub.subtract(a, Z.valueOf(-4324254329L)));
    assertEquals(Z.valueOf(8648508653L), Sub.subtract(a.negate(), Z.valueOf(-4324254329L)));
  }
}
