package irvine.math.group;

import irvine.math.set.FiniteSet;
import irvine.math.z.Z;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class IntegersModTest extends TestCase {

  public void test() {
    final IntegersMod i = new IntegersMod(Z.FOUR);
    assertEquals(Z.FOUR, i.size());
    assertTrue(i.isAbelian());
    assertTrue(i.isCommutative());
    assertTrue(i.isCyclic());
    assertTrue(i.contains(Z.ZERO));
    assertFalse(i.contains(Z.FOUR));
    assertFalse(i.contains(Z.NEG_ONE));
    assertFalse(i.contains(null));
    assertEquals("\\Z(4)", i.toString());
    assertEquals(Z.ZERO, i.zero());
    assertEquals(Z.ONE, i.one());
    assertEquals(Z.THREE, i.add(Z.ONE, Z.TWO));
    assertEquals(Z.ZERO, i.add(Z.TWO, Z.TWO));
    assertEquals(Z.TWO, i.multiply(Z.ONE, Z.TWO));
    assertEquals(Z.TWO, i.negate(Z.TWO));
    assertEquals(Z.FOUR, i.characteristic());
    try {
      i.add(null, Z.ONE);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      i.add(Z.ONE, null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      i.negate(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    final Iterator<Z> it = i.iterator();
    for (int k = 0; k < 4; ++k) {
      assertTrue(it.hasNext());
      assertEquals(Z.valueOf(k), it.next());
    }
    assertFalse(it.hasNext());
    try {
      i.pow(Z.TWO, 2147483648L);
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
    try {
      new IntegersMod(Z.ZERO);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals(Z.ONE, new IntegersMod(Z.ONE).size());
  }

  public void testDurbin17p3() {
    final IntegersMod z10 = new IntegersMod(Z.valueOf(10));
    assertEquals(Z.TWO, z10.index(z10.subgroup(Z.TWO)));
  }

  public void testDurbin17p4() {
    final IntegersMod z40 = new IntegersMod(Z.valueOf(40));
    assertEquals(Z.FOUR, z40.index(z40.generateSubgroup(new FiniteSet<>(Z.valueOf(12), Z.valueOf(20)))));
  }

  public void testIterator() {
    final IntegersMod z3 = new IntegersMod(3);
    final Iterator<Z> it = z3.iterator();
    assertTrue(it.hasNext());
    assertEquals(Z.ZERO, it.next());
    assertTrue(it.hasNext());
    assertEquals(Z.ONE, it.next());
    assertTrue(it.hasNext());
    assertEquals(Z.TWO, it.next());
    assertFalse(it.hasNext());
  }

  public void testCoerce() {
    assertEquals(Z.TWO, new IntegersMod(5).coerce(2));
    assertEquals(Z.ONE, new IntegersMod(5).coerce(6));
  }
}
