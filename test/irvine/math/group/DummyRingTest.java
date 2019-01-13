package irvine.math.group;

import irvine.math.c.C;
import irvine.math.c.ComplexField;
import irvine.math.set.EffortException;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import junit.framework.TestCase;
import irvine.math.set.FiniteSet;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DummyRingTest extends TestCase {

  public void test() {
    final ComplexField c = ComplexField.SINGLETON;
    assertTrue(c.isAbelian());
    assertEquals(C.ONE, AbstractRing.pow(c, C.ZERO, 0));
    assertEquals(C.ZERO, AbstractRing.pow(c, C.ZERO, 10));
    assertEquals(C.ONE, AbstractRing.pow(c, C.I, 0));
    assertEquals(C.I, AbstractRing.pow(c, C.I, 1));
    assertEquals(new C(-1), AbstractRing.pow(c, C.I, 2));
    assertEquals(new C(0, -1), AbstractRing.pow(c, C.I, 3));
    assertEquals(C.ONE, AbstractRing.pow(c, C.I, 4));
    assertEquals(C.ONE, AbstractRing.pow(c, C.ONE, 10));
    try {
      AbstractRing.pow(c, C.ONE, -1);
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testOrd() {
    final IntegersMod m5 = new IntegersMod(5);
    assertEquals(Z.FOUR, m5.ord(Z.TWO));
  }
  
  public void testIntegralDomainViaStatic() {
    assertTrue(AbstractRing.isIntegralDomain(new IntegersMod(3)));
    assertFalse(AbstractRing.isIntegralDomain(new IntegersMod(4)));
    try {
      // Don't use SINGLETON because we fiddle the effort
      final Integers integers = new Integers() { };
      integers.setInfiniteEffort(5);
      AbstractRing.isIntegralDomain(integers);
    } catch (final EffortException e) {
      // ok
    }
  }

  public void testDurbin22p1() {
    final IntegersMod z4 = new IntegersMod(4);
    try {
      z4.isZeroDivisor(Z.ZERO);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    assertNull(z4.isZeroDivisor(Z.ONE));
    assertEquals(Z.TWO, z4.isZeroDivisor(Z.TWO));
    assertNull(z4.isZeroDivisor(Z.THREE));
  }

  public void testDurbin22p2() {
    final IntegersMod z10 = new IntegersMod(10);
    final StringBuilder zeros = new StringBuilder();
    for (Z e = Z.ONE; e.compareTo(Z.TEN) < 0; e = e.add(1)) {
      final Z d = z10.isZeroDivisor(e);
      if (d != null) {
        zeros.append(e).append(',').append(d).append(';');
      }
    }
    assertEquals("2,5;4,5;5,2;6,5;8,5;", zeros.toString());
  }

  private static class MyIntegers extends Integers {
  }

  public void testCharacteristic() {
    assertEquals(Z.FOUR, AbstractRing.characteristic(new IntegersMod(4)));
    assertEquals(Z.SIX, AbstractRing.characteristic(new DirectSum<>(new IntegersMod(2), new IntegersMod(3))));
    try {
      // Don't use SINGLETON because we fiddle the effort
      final Integers integers = new MyIntegers();
      integers.setInfiniteEffort(5);
      AbstractRing.characteristic(integers);
    } catch (final EffortException e) {
      // ok
    }
  }

  public void testCoerce() {
    try {
      new IntegerMultiples(2).coerce(3);
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }

  public void testSubring() {
    assertTrue(Integers.SINGLETON.isSubring(Integers.SINGLETON));
    assertFalse(Integers.SINGLETON.isSubring(new FiniteSet<>(Z.ZERO, Z.TWO, Z.THREE)));
    assertTrue(new IntegersMod(Z.SIX).isSubring(new FiniteSet<>(Z.ZERO, Z.THREE)));
  }
}
