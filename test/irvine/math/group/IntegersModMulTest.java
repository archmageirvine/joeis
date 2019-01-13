package irvine.math.group;

import irvine.math.z.Z;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class IntegersModMulTest extends TestCase {

  public void test() {
    final IntegersModMul i = new IntegersModMul(Z.valueOf(12));
    assertEquals(Z.FOUR, i.size());
    assertTrue(i.isAbelian());
    assertTrue(i.contains(Z.ONE));
    assertTrue(i.contains(Z.valueOf(11)));
    assertFalse(i.contains(null));
    assertEquals("\\Z_{(12)}", i.toString());
    assertEquals(Z.ONE, i.zero());
    assertEquals(Z.ONE, i.add(Z.ONE, Z.ONE));
    assertEquals(Z.valueOf(11), i.add(Z.FIVE, Z.SEVEN));
    assertEquals(Z.FIVE, i.negate(Z.FIVE));
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
    assertTrue(it.hasNext());
    assertEquals(Z.ONE, it.next());
    assertTrue(it.hasNext());
    assertEquals(Z.FIVE, it.next());
    assertTrue(it.hasNext());
    assertEquals(Z.SEVEN, it.next());
    assertTrue(it.hasNext());
    assertEquals(Z.valueOf(11), it.next());
    assertFalse(it.hasNext());
  }

  public void testIsomorphism() {
    assertFalse(new IntegersModMul(104).isIsomorphic(new IntegersModMul(103)));
    assertTrue(new IntegersModMul(104).isIsomorphic(new IntegersModMul(105)));
    assertFalse(new IntegersModMul(104).isIsomorphic(new IntegersModMul(106)));
    assertTrue(new IntegersModMul(3).isIsomorphic(new CyclicGroup(2)));
    assertFalse(new IntegersModMul(3).isIsomorphic(new CyclicGroup(3)));
  }

}
