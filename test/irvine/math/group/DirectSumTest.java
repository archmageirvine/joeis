package irvine.math.group;

import irvine.math.z.Integers;
import junit.framework.TestCase;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DirectSumTest extends TestCase {
  
  public void testSum() {
    final IntegersMod m4 = new IntegersMod(4);
    final IntegersMod m7 = new IntegersMod(7);
    final DirectSum<Z, Z> ring = new DirectSum<>(m4, m7);
    final Pair<Z, Z> a = new Pair<>(Z.THREE, Z.TWO);
    final Pair<Z, Z> b = new Pair<>(Z.ONE, Z.FOUR);
    assertEquals(b, ring.multiply(a, a));
    assertEquals(b, ring.pow(a, 2));
    assertEquals(Z.SIX, ring.ord(a));
    assertEquals(new Pair<>(Z.ONE, Z.ONE), ring.one());
    assertTrue(ring.isCommutative());
    assertFalse(ring.isIntegralDomain());
  }

  public void testIntegralDomain() {
    assertFalse(new DirectSum<>(Integers.SINGLETON, Integers.SINGLETON).isIntegralDomain());
    assertTrue(new DirectSum<>(Integers.SINGLETON, new IntegersMod(1)).isIntegralDomain());
    assertTrue(new DirectSum<>(new IntegersMod(1), Integers.SINGLETON).isIntegralDomain());
  }

  public void testDurbin22p3() {
    final IntegersMod z3 = new IntegersMod(3);
    final DirectSum<Z, Z> ring = new DirectSum<>(z3, z3);
    assertEquals(new Pair<>(Z.ZERO, Z.ONE), ring.isZeroDivisor(new Pair<>(Z.TWO, Z.ZERO)));
  }

  public void testCharacteristic1() {
    final IntegersMod z3 = new IntegersMod(3);
    final DirectSum<Z, Z> ring = new DirectSum<>(z3, z3);
    assertEquals(Z.THREE, AbstractRing.characteristic(ring));
  }

}
