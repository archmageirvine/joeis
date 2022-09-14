package irvine.math.z;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class QuadraticCongruenceTest extends TestCase {

  public void testX2ModPrime() {
    assertEquals("[0]", QuadraticCongruence.solve(Z.ZERO, Z.TWO).toString());
    assertEquals("[1]", QuadraticCongruence.solve(Z.ONE, Z.TWO).toString());
    assertEquals("[0]", QuadraticCongruence.solve(Z.ZERO, Z.THREE).toString());
    assertEquals("[1, 2]", QuadraticCongruence.solve(Z.ONE, Z.THREE).toString());
    assertEquals("[]", QuadraticCongruence.solve(Z.TWO, Z.THREE).toString());
    assertEquals("[0]", QuadraticCongruence.solve(Z.ZERO, Z.FIVE).toString());
    assertEquals("[1, 4]", QuadraticCongruence.solve(Z.ONE, Z.FIVE).toString());
    assertEquals("[]", QuadraticCongruence.solve(Z.TWO, Z.FIVE).toString());
    assertEquals("[]", QuadraticCongruence.solve(Z.THREE, Z.FIVE).toString());
    assertEquals("[2, 3]", QuadraticCongruence.solve(Z.FOUR, Z.FIVE).toString());
  }

  public void testX2Mod2Exponent2() {
    assertEquals("[0, 2]", QuadraticCongruence.solve(Z.ZERO, Z.TWO, 2).toString());
    assertEquals("[1, 3]", QuadraticCongruence.solve(Z.ONE, Z.TWO, 2).toString());
    assertEquals("[]", QuadraticCongruence.solve(Z.TWO, Z.TWO, 2).toString());
    assertEquals("[]", QuadraticCongruence.solve(Z.THREE, Z.TWO, 2).toString());
  }

  public void testX2Mod3Exponent2() {
    assertEquals("[4, 5]", QuadraticCongruence.solve(Z.SEVEN, Z.THREE, 2).toString());
  }

  public void testX2Mod2Exponent3() {
    assertEquals("[0, 4]", QuadraticCongruence.solve(Z.ZERO, Z.TWO, 3).toString());
    assertEquals("[1, 3, 5, 7]", QuadraticCongruence.solve(Z.ONE, Z.TWO, 3).toString());
    assertEquals("[]", QuadraticCongruence.solve(Z.TWO, Z.TWO, 3).toString());
    assertEquals("[]", QuadraticCongruence.solve(Z.THREE, Z.TWO, 3).toString());
    assertEquals("[2, 6]", QuadraticCongruence.solve(Z.FOUR, Z.TWO, 3).toString());
    assertEquals("[]", QuadraticCongruence.solve(Z.FIVE, Z.TWO, 3).toString());
    assertEquals("[]", QuadraticCongruence.solve(Z.SIX, Z.TWO, 3).toString());
    assertEquals("[]", QuadraticCongruence.solve(Z.SEVEN, Z.TWO, 3).toString());
  }

  public void testX2Mod2Exponent4() {
    assertEquals("[1, 7, 9, 15]", QuadraticCongruence.solve(Z.ONE, Z.TWO, 4).toString());
  }

  public void testX2Mod3Exponent9() {
    assertEquals("[8573, 11110]", QuadraticCongruence.solve(Z.SEVEN, Z.THREE, 9).toString());
  }

  public void testX2Mod17Exponent5() {
    assertEquals("[654137, 765720]", QuadraticCongruence.solve(Z.valueOf(9964), Z.valueOf(17), 5).toString());
  }

  public void testGeneral() {
    assertEquals("[55, 314, 1203, 1462]", QuadraticCongruence.solve(Z.ONE, Z.ZERO, Z.NINE, Z.valueOf(1517)).toString());
    assertEquals("[216, 586, 831, 1201]", QuadraticCongruence.solve(Z.ONE, Z.valueOf(100), Z.NINE, Z.valueOf(1517)).toString());
    //assertEquals("[382810, 1036947]", QuadraticCongruence.solve(Z.ONE, Z.valueOf(100), Z.NINE, Z.valueOf(1419857)).toString());
  }

  public void testBugMod1001() {
    assertEquals("[1, 89, 141, 232, 768, 859, 911, 999]", QuadraticCongruence.solve(Z.ONE, Z.ONE, Z.valueOf(-2), Z.valueOf(1001)).toString());
  }

  public void testBugMod100000000001() {
    assertEquals("[9090909088, 18181818179, 27272727270, 36363636361, 45454545452, 54545454543, 63636363634, 72727272725, 81818181816, 90909090907, 99999999998]", QuadraticCongruence.solve(Z.ONE, Z.SIX, Z.NINE, Z.valueOf(100000000001L)).toString());
  }

  public void testBugMod49() {
    assertEquals("[0, 7, 14, 21, 28, 35, 42]", QuadraticCongruence.solve(Z.ONE, Z.ZERO, Z.ZERO, Z.valueOf(49)).toString());
  }
}
