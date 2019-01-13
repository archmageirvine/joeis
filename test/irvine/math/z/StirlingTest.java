package irvine.math.z;


import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class StirlingTest extends TestCase {

  public void testFirstKind() {
    assertEquals(Z.ONE, Stirling.firstKind(1, 1));
    assertEquals(Z.ZERO, Stirling.firstKind(1, 0));
    assertEquals(Z.ZERO, Stirling.firstKind(0, 1));
    assertEquals(Z.valueOf(-1146901283528L), Stirling.firstKind(17, 8));
  }

  public void testSecondKind() {
    assertEquals(Z.valueOf(20415995028L), Stirling.secondKind(17, 8));
  }

  public void testGeneralizedFirstKind() {
    assertEquals(Z.TEN, Stirling.generalizedFirstKind(-10, 1, 1));
    assertEquals(Z.valueOf(90), Stirling.generalizedFirstKind(-10, 2, 2));
    assertEquals(Z.valueOf(242), Stirling.generalizedFirstKind(-10, 3, 2));
    assertEquals(Z.valueOf(-7), Stirling.generalizedFirstKind(3, 2, 1));
  }

  public void testAssociatedFirstKind() {
    assertEquals(Z.valueOf(183783600), Stirling.associatedFirstKind(17, 8));
  }

  public void testAssociatedSecondKind() {
    assertEquals(Z.valueOf(20415995028L), Stirling.associatedSecondKind(1, 17, 8));
    assertEquals(Z.valueOf(91891800), Stirling.associatedSecondKind(2, 17, 8));
  }

  public void testIllegal() {
    try {
      Stirling.firstKind(-1, 10);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      Stirling.firstKind(10, -1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      Stirling.secondKind(-1, 10);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }
}
