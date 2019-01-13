package irvine.math.z;

import java.math.BigInteger;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Div2Test extends TestCase {

  public void testDiv2() {
    Z.ZERO.mAuxiliary = 0;
    assertTrue(Z.ZERO == Z.ZERO.divide2());
    assertEquals(0, Z.ZERO.auxiliary());
    assertEquals(Z.ONE, Z.TWO.divide2());
    assertEquals(Z.NEG_ONE, Z.TWO.negate().divide2());
    assertEquals(Z.ZERO, Z.ONE.divide2());
    assertEquals(1, Z.ONE.auxiliary());
    assertEquals(Z.ZERO, Z.NEG_ONE.divide2());
    final BigInteger two = BigInteger.valueOf(2L);
    for (int i = 2; i < 100; ++i) {
      final BigInteger d = new BigInteger(i, AddTest.RANDOM);
      final Z zd = Z.valueOf(d);
      assertEquals(d.divide(two), zd.divide2().bigIntegerValue());
      assertEquals(d.mod(two).intValue(), zd.auxiliary());
      assertEquals(d.negate().divide(two), zd.negate().divide2().bigIntegerValue());
    }
  }

}
