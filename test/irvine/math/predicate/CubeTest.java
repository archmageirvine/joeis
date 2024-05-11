package irvine.math.predicate;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CubeTest extends TestCase {

  public void test() {
    final Cube p = new Cube();
    assertTrue(p.is(0));
    assertTrue(p.is(1));
    assertFalse(p.is(2));
    assertFalse(p.is(3));
    assertFalse(p.is(4));
    assertFalse(p.is(7));
    assertTrue(p.is(8));
    assertTrue(p.is(27));
  }
}
