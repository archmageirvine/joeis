package irvine.math;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Vladimir Reshetnikov
 * @author Sean A. Irvine
 */
public class SparseIntegerTest extends TestCase {

  public void testSmallArithmetic() {
    final SparseInteger one = SparseInteger.create(1);
    final SparseInteger two = SparseInteger.create(2);
    final SparseInteger three = SparseInteger.add(one, two);

    final SparseInteger alsoOne = SparseInteger.create(1);
    final SparseInteger alsoThree = SparseInteger.create(3);

    assertTrue(alsoOne.equals(one));
    assertTrue(one.equals(alsoOne));
    assertFalse(one.equals(two));
    assertTrue(one.compareTo(two) < 0);

    assertEquals(0, one.compareTo(alsoOne));

    assertTrue(three.equals(alsoThree));
    assertEquals(0, three.compareTo(alsoThree));

    assertTrue(three.compareTo(two) > 0);

    assertFalse(one.equals(three));
    assertFalse(one.equals(null));
    assertTrue(one.compareTo(two) < 0);
    assertTrue(alsoThree.compareTo(two) > 0);

    final SparseInteger six = SparseInteger.multiply(two, three);
    assertTrue(SparseInteger.create(6).equals(six));
    assertTrue(0 == six.compareTo(six));
    assertTrue(six.equals(six));

    final SparseInteger big = SparseInteger.create(Long.MAX_VALUE);
    final SparseInteger huge = SparseInteger.multiply(big, big);
    assertTrue(huge.equals(huge));
    assertEquals(0, huge.compareTo(huge));
    assertTrue(three.compareTo(huge) < 0);
    assertTrue(huge.compareTo(two) > 0);
  }

  public void testLargeArithmetic() {
    final SparseInteger two = SparseInteger.create(2);

    final SparseInteger big = SparseInteger.create(16).power(SparseInteger.create(1000));
    final SparseInteger huge = SparseInteger.multiply(big, big);

    assertTrue(huge.equals(huge));
    assertEquals(0, huge.compareTo(huge));
    assertTrue(two.compareTo(big) < 0);
    assertTrue(two.compareTo(huge) < 0);
    assertTrue(huge.compareTo(two) > 0);
  }
}
