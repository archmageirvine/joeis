package irvine.math;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class OrderedPairTest extends TestCase {

  public void test() {
    final OrderedPair p = new OrderedPair(2, 3);
    assertEquals("(2,3)", p.toString());
    assertEquals(p, new OrderedPair(2, 3));
    assertEquals(p, new OrderedPair(3, 2));
  }
}
