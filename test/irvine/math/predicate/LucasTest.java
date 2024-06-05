package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class LucasTest extends TestCase {

  public void testInverseLucas() {
    try {
      Lucas.inverseLucas(Z.NEG_ONE);
      fail("Exception did not fire");
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Lucas.inverseLucas(Z.ZERO);
      fail("Exception did not fire");
    } catch (final ArithmeticException e) {
      // ok
    }

    for (int i = 0; i < 1000; ++i) {
      if (i != 2) {
        assertEquals(i, Lucas.inverseLucas(Functions.LUCAS.z(i)));
      }
    }
    for (int i = 5; i < 1000; ++i) {
      final int j = -Lucas.inverseLucas(Functions.LUCAS.z(i).subtract(Z.ONE));
      if (i != j && i - 1 != j && i != j - 1) {
        fail("Estimate is off the mark by more than 1: " + i + " " + j);
      }
    }

    assertEquals(-3, Lucas.inverseLucas(Z.FIVE));
    assertEquals(-3, Lucas.inverseLucas(Z.SIX));
    assertEquals(-367, Lucas.inverseLucas(new Z("49941774772757703300470707773688236620346480720862218592914831305649185180430")));
    assertEquals(-366, Lucas.inverseLucas(new Z("49941774772757703300470707773688236620346480720862218592914831305649185180428")));
    assertEquals(5000, Lucas.inverseLucas(Functions.LUCAS.z(5000)));
    assertEquals(10000, Lucas.inverseLucas(Functions.LUCAS.z(10000)));
    assertEquals(50000, Lucas.inverseLucas(Functions.LUCAS.z(50000)));
  }

  public void testIs() {
    final Predicate p = new Lucas();
    assertTrue(p.is(1));
    assertTrue(p.is(2));
    assertTrue(p.is(3));
    assertTrue(p.is(4));
    assertFalse(p.is(5));
    assertFalse(p.is(6));
    assertTrue(p.is(7));
    assertTrue(p.is(Functions.LUCAS.z(200)));
    assertTrue(p.is(Functions.LUCAS.z(201)));
  }
}
