package irvine.math.polynomial;

import irvine.math.group.SymmetricGroup;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class WreathExponentiationTest extends TestCase {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();

  public void testI() {
    assertEquals("I_1(Z(S2)) = (1/2)x_2 + (1/2)x_1^2", WreathExponentiation.i(Z2, 1).toString());
    assertEquals("I_2(Z(S2)) = (1/2)x_4 + (1/2)x_1^2x_2", WreathExponentiation.i(Z2, 2).toString());
    assertEquals("I_3(Z(S2)) = (1/2)x_2x_6 + (1/2)x_1^2x_3^2", WreathExponentiation.i(Z2, 3).toString());
  }

  public void testI13() {
    assertEquals("I_1(Z(S2))*I_1(Z(S2))*I_1(Z(S2)) = (7/8)x_2^4 + (1/8)x_1^8", WreathExponentiation.i(Z2, 1).pow(HararyMultiply.OP, 3, Integer.MAX_VALUE).toString());
  }

  public void testI12() {
    final CycleIndex i1 = WreathExponentiation.i(Z2, 1);
    final CycleIndex i2 = WreathExponentiation.i(Z2, 2);
    assertEquals("I_1(Z(S2))*I_2(Z(S2)) = (1/2)x_4^2 + (1/4)x_2^4 + (1/4)x_1^4x_2^2", i1.op(HararyMultiply.OP, i2).toString());
  }

  public void testS2S3() {
    final CycleIndex z3 = SymmetricGroup.create(3).cycleIndex();
    assertEquals("[Z(S3)]^(Z(S2)) = (1/4)x_4^2 + (1/6)x_2x_6 + (13/48)x_2^4 + (1/6)x_1^2x_3^2 + (1/8)x_1^4x_2^2 + (1/48)x_1^8", WreathExponentiation.exponentiation(Z2, z3).toString());
  }
}
