package irvine.math.set;

import irvine.math.z.Z;

import java.util.Iterator;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class IntegerSetTest extends TestCase {

  public void test() {
    final IntegerSet set = new IntegerSet(0, 3);
    assertEquals(Z.FOUR, set.size());
    assertTrue(set.contains(0));
    assertTrue(set.contains(1));
    assertTrue(set.contains(2));
    assertTrue(set.contains(3));
    assertFalse(set.contains(4));
    assertFalse(set.contains(-1));
    assertEquals("\\{0,...,3\\}", set.toString());
    final Iterator<Integer> it = set.iterator();
    assertTrue(it.hasNext());
    assertEquals(0, it.next().intValue());
    assertTrue(it.hasNext());
    assertEquals(1, it.next().intValue());
    assertTrue(it.hasNext());
    assertEquals(2, it.next().intValue());
    assertTrue(it.hasNext());
    assertEquals(3, it.next().intValue());
    assertFalse(it.hasNext());
  }

  public void testSingle() {
    final IntegerSet set = new IntegerSet(42, 42);
    assertEquals(Z.ONE, set.size());
    assertTrue(set.contains(42));
    assertFalse(set.contains(43));
    assertFalse(set.contains(41));
    assertEquals("\\{42\\}", set.toString());
  }

  public void testPair() {
    final IntegerSet set = new IntegerSet(42, 43);
    assertEquals("\\{42,43\\}", set.toString());
  }
}
