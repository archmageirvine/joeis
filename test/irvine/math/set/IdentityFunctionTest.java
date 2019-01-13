package irvine.math.set;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class IdentityFunctionTest extends TestCase {

  public void test() {
    final IdentityFunction<String> id = new IdentityFunction<>(new FiniteSet<>("hi"));
    assertEquals("hi", id.image("hi"));
    assertTrue(id.isOnto());
    assertTrue(id.isOneToOne());
    assertEquals(new FiniteSet<>("hi"), id.image());
  }
}
