package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ValuationTest extends TestCase {

  public void testOrdZ() {
    assertEquals(3, Functions.VALUATION.i(Z.EIGHT, Z.TWO));
    assertEquals(1, Functions.VALUATION.i(Z.SEVEN, Z.SEVEN));
    assertEquals(1, Functions.VALUATION.i(Z.TEN, Z.FIVE));
    assertEquals(0, Functions.VALUATION.i(Z.FOUR, Z.THREE));
  }

  public void testOrdL() {
    assertEquals(1, Functions.VALUATION.i(3, 3));
    assertEquals(2, Functions.VALUATION.i(9, 3));
    assertEquals(3, Functions.VALUATION.i(27, 3));
    assertEquals(0, Functions.VALUATION.i(27, 2));
    assertEquals(1, Functions.VALUATION.i(6, 2));
  }
}
