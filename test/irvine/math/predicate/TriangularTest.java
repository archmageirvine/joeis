package irvine.math.predicate;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class TriangularTest extends TestCase {

  public void test() {
    final Predicate p = new Triangular();
    assertTrue(p.is(0));
    assertTrue(p.is(1));
    assertFalse(p.is(2));
    assertTrue(p.is(3));
    assertFalse(p.is(4));
    assertTrue(p.is(6));
    assertFalse(p.is(7));
    assertTrue(p.is(10));
    assertTrue(p.is(78));
  }
}
