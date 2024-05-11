package irvine.math.predicate;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SquareTest extends TestCase {

  public void test() {
    final Square p = new Square();
    assertTrue(p.is(0));
    assertTrue(p.is(1));
    assertFalse(p.is(2));
    assertFalse(p.is(3));
    assertTrue(p.is(4));
    assertFalse(p.is(7));
    assertTrue(p.is(4L));
    assertFalse(p.is(7L));
    assertTrue(p.is(Z.FOUR));
    assertFalse(p.is(Z.SEVEN));
  }
}
