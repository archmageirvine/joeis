package irvine.math.group;

import irvine.math.z.Z;

import java.util.Iterator;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class IntegerMultiplesTest extends TestCase {

  public void test2() {
    final IntegerMultiples i = new IntegerMultiples(2);
    assertNull(i.size());
    assertTrue(i.isAbelian());
    assertTrue(i.contains(Z.ZERO));
    assertFalse(i.contains(Z.ONE));
    assertEquals("(2\\Z,+)", i.toString());
    assertTrue(i.contains(Z.valueOf(-42)));
    assertFalse(i.contains(null));
    assertEquals(Z.ZERO, i.zero());
    assertEquals(Z.FOUR, i.add(Z.TWO, Z.TWO));
    assertEquals(Z.TWO.negate(), i.negate(Z.TWO));
    assertEquals(Z.TWO, i.multiple());
    try {
      i.add(null, Z.TWO);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.add(Z.TWO, null);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.add(Z.ONE, Z.TWO);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.add(Z.TWO, Z.ONE);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.negate(null);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.negate(Z.ONE);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    final Iterator<Z> it = i.iterator();
    for (int k = 0; k < 5; ++k) {
      assertTrue(it.hasNext());
      assertEquals(Z.valueOf(2 * k), it.next());
    }
  }

  public void test42() {
    try {
      new IntegerMultiples(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    final IntegerMultiples i = new IntegerMultiples(Z.valueOf(-42));
    assertNull(i.size());
    assertTrue(i.isAbelian());
    assertTrue(i.contains(Z.valueOf(42)));
    assertFalse(i.contains(Z.ONE));
    assertFalse(i.contains(Z.TWO));
    assertEquals("(42\\Z,+)", i.toString());
    assertTrue(i.contains(Z.valueOf(-42)));
    assertFalse(i.contains(null));
    assertEquals(Z.ZERO, i.zero());
    assertEquals(Z.valueOf(84), i.add(Z.valueOf(42), Z.valueOf(42)));
    assertEquals(Z.valueOf(42).negate(), i.negate(Z.valueOf(42)));
    try {
      i.add(null, Z.ZERO);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.add(Z.ZERO, null);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.add(Z.ONE, Z.valueOf(42));
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.add(Z.valueOf(42), Z.ONE);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.negate(null);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.negate(Z.ONE);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    final Iterator<Z> it = i.iterator();
    for (int k = 0; k < 5; ++k) {
      assertTrue(it.hasNext());
      assertEquals(Z.valueOf(42L * k), it.next());
    }
  }
}
