package irvine.math.group;

import irvine.math.api.Group;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class GaloisFieldTest extends TestCase {

  public void testBad() {
    try {
      new GaloisField(Z.FOUR);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      new GaloisField(Z.FOUR, 1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void test3() {
    final GaloisField gf3 = new GaloisField(3);
    assertEquals(Z.THREE, gf3.characteristic());
    assertEquals(Z.THREE, gf3.size());
    assertEquals(Z.TWO, gf3.inverse(Z.TWO));
    assertEquals(Z.ONE, gf3.multiply(Z.TWO, Z.TWO));
    final Group<Z> m = gf3.multiplicativeGroup();
    assertEquals(Z.ONE, m.add(Z.TWO, Z.TWO));
  }

  public void test9() {
    final GaloisField gf9 = new GaloisField(Z.THREE, 2);
    assertEquals(Z.THREE, gf9.characteristic());
    assertEquals(Z.NINE, gf9.size());
    assertEquals(Z.FIVE, gf9.inverse(Z.TWO));
    assertEquals(Z.TWO, gf9.inverse(Z.FIVE));
    assertEquals(Z.ONE, gf9.divide(Z.FIVE, Z.FIVE));
    assertEquals(Z.TWO, gf9.divide(Z.SEVEN, Z.EIGHT));
  }
}
