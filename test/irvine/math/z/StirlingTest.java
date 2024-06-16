package irvine.math.z;


import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class StirlingTest extends TestCase {

  public void testGeneralizedFirstKind() {
    assertEquals(Z.TEN, Stirling.generalizedFirstKind(-10, 1, 1));
    assertEquals(Z.valueOf(90), Stirling.generalizedFirstKind(-10, 2, 2));
    assertEquals(Z.valueOf(242), Stirling.generalizedFirstKind(-10, 3, 2));
    assertEquals(Z.valueOf(-7), Stirling.generalizedFirstKind(3, 2, 1));
  }

  public void testAssociatedSecondKind() {
    assertEquals(Z.valueOf(20415995028L), Stirling.associatedSecondKind(1, 17, 8));
    assertEquals(Z.valueOf(91891800), Stirling.associatedSecondKind(2, 17, 8));
  }

}
