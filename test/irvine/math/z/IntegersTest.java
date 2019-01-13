package irvine.math.z;

import irvine.math.api.Operation;
import irvine.math.group.IntegerMultiples;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class IntegersTest extends TestCase {

  public void test() {
    final Integers i = Integers.SINGLETON;
    assertNull(i.size());
    assertTrue(i.isAbelian());
    assertTrue(i.isCommutative());
    assertTrue(i.contains(Z.ZERO));
    assertTrue(i.contains(Z.valueOf(-42)));
    assertFalse(i.contains(null));
    assertEquals("\\Z", i.toString());
    assertEquals(Z.ZERO, i.zero());
    assertEquals(Z.ZERO, i.characteristic());
    assertEquals(Z.ONE, i.one());
    assertEquals(Z.THREE, i.add(Z.ONE, Z.TWO));
    assertEquals(Z.TWO, i.multiply(Z.ONE, Z.TWO));
    assertEquals(Z.TWO.negate(), i.negate(Z.TWO));
    assertEquals(Z.FIVE, i.index(new IntegerMultiples(5)));
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
    for (int e : new int[] {0, 1, -1, 2, -2}) {
      assertTrue(it.hasNext());
      assertEquals(Z.valueOf(e), it.next());
    }
    assertEquals(Z.ONE, i.sqrt(Z.ONE));
    assertTrue(i.isCyclic());
    assertNull(i.ord(Z.TWO));
    assertEquals(Z.ONE, i.ord(Z.ONE));
    try {
      i.pow(Z.TWO, 2147483648L);
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
    assertEquals(0x01234567, i.hashCode());
  }

  public void testOperation() {
    final Operation<Z> op = Integers.SINGLETON.operation();
    assertEquals(Z.THREE, op.op(Z.ONE, Z.TWO));
  }

  public void testCompare() {
    assertEquals(0, Integers.SINGLETON.compare(Z.ONE, Z.ONE));
    assertEquals(-1, Integers.SINGLETON.compare(Z.ONE, Z.THREE));
    assertEquals(1, Integers.SINGLETON.compare(Z.THREE, Z.ONE));
  }

  public void testCoerce() {
    assertEquals(Z.TWO, Integers.SINGLETON.coerce(2));
  }
}
