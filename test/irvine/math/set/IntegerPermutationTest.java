package irvine.math.set;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class IntegerPermutationTest extends TestCase {

  public void test() {
    final IntegerPermutation p = IntegerPermutation.createFromOneBase(4, 1, 3, 2);
    assertEquals("[3, 0, 2, 1]", p.toString());
    assertEquals(4, p.degree());
    assertEquals(2, p.image(2));
    assertEquals(1, p.image(3));
    assertEquals("[1, 3, 2, 0]", p.inverse().toString());
    assertTrue(p.inverse().compose(p).isIdentity());
    assertTrue(IntegerPermutation.identity(5).isIdentity());
    assertEquals(0, IntegerPermutation.identity(3).degree());
  }
}
