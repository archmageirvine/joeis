package irvine.oeis.a003;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.PalmerSymPowerCycleIndex;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A003190Test extends TestCase {

  public void testSymFn5() {
    final PalmerSymPowerCycleIndex fn = new PalmerSymPowerCycleIndex();
    final CycleIndex s5 = fn.cycleIndex(3, 5);
    s5.multiply(new Q(120));
    assertEquals("Z(S5)^(3) = 24x_5^2 + 30x_2x_4^2 + 20x_1x_3x_6 + 20x_1x_3^3 + 15x_1^2x_2^4 + 10x_1^4x_2^3 + x_1^{10}", s5.toString());
  }

  public void testSymFn6() {
    final PalmerSymPowerCycleIndex fn = new PalmerSymPowerCycleIndex();
    final CycleIndex s6 = fn.cycleIndex(3, 6);
    s6.multiply(new Q(720));
    assertEquals("Z(S6)^(3) = 144x_5^4 + 120x_2x_6^3 + 180x_2^2x_4^4 + 15x_2^{10} + 120x_1^2x_3^2x_6^2 + 80x_1^2x_3^6 + 45x_1^4x_2^8 + 15x_1^8x_2^6 + x_1^{20}", s6.toString());
  }

  public void testSymFn7() {
    final PalmerSymPowerCycleIndex fn = new PalmerSymPowerCycleIndex();
    final CycleIndex s7 = fn.cycleIndex(3, 7);
    s7.multiply(new Q(5040));
    // NB: This differs from the expression in the paper 420x_1x_4x_6x_{12}^2
    assertEquals("Z(S7)^(3) = 720x_7^5 + 504x_5^3x_{10}^2 + 504x_5^7 + 840x_2x_3x_6^5 + 420x_1x_4x_6x_{12}^2 + 210x_1x_2^2x_3^2x_6^4 + 840x_1x_2^3x_4^7 + 280x_1^2x_3^{11} + 420x_1^3x_2x_3^4x_6^3 + 105x_1^3x_2^{16} + 70x_1^5x_3^{10} + 105x_1^7x_2^{14} + 21x_1^{15}x_2^{10} + x_1^{35}", s7.toString());
  }

//  public void testJ() {
//    assertEquals(2, A003190.j(4, new int[] {0, 1, 0, 1, 1}));
//    assertEquals(2, A003190.j(4, new int[] {0, 1, 2, 1, 0}));
//    assertEquals(2, A003190.j(4, new int[] {0, 4, 0, 0, 1}));
//    assertEquals(10, A003190.j(4, new int[] {0, 5, 0, 1, 0}));
//    assertEquals(14, A003190.j(4, new int[] {0, 4, 2, 0, 0}));
//    assertEquals(70, A003190.j(4, new int[] {0, 8, 0, 0, 0}));
//
//    // Have no idea what these numbers should be ...
//    assertEquals(1, A003190.j(2, 4, new int[] {0, 1, 0, 1, 1}));
//    assertEquals(1, A003190.j(2, 4, new int[] {0, 1, 2, 1, 0}));
//    assertEquals(1, A003190.j(2, 4, new int[] {0, 4, 0, 0, 1}));
//    assertEquals(5, A003190.j(2, 4, new int[] {0, 5, 0, 1, 0}));
//    assertEquals(7, A003190.j(2, 4, new int[] {0, 4, 2, 0, 0}));
//    assertEquals(35, A003190.j(2, 4, new int[] {0, 8, 0, 0, 0}));
//
//    assertEquals(2, A003190.j(3, 4, new int[] {0, 1, 0, 1, 1}));
//    assertEquals(2, A003190.j(3, 4, new int[] {0, 1, 2, 1, 0}));
//    assertEquals(2, A003190.j(3, 4, new int[] {0, 4, 0, 0, 1}));
//    assertEquals(7, A003190.j(3, 4, new int[] {0, 5, 0, 1, 0}));
//    assertEquals(10, A003190.j(3, 4, new int[] {0, 4, 2, 0, 0}));
//    assertEquals(47, A003190.j(3, 4, new int[] {0, 8, 0, 0, 0}));
//
//    assertEquals(1, A003190.j(4, 4, new int[] {0, 1, 0, 1, 1}));
//    assertEquals(1, A003190.j(4, 4, new int[] {0, 1, 2, 1, 0}));
//    assertEquals(1, A003190.j(4, 4, new int[] {0, 4, 0, 0, 1}));
//    assertEquals(5, A003190.j(4, 4, new int[] {0, 5, 0, 1, 0}));
//    assertEquals(7, A003190.j(4, 4, new int[] {0, 4, 2, 0, 0}));
//    assertEquals(35, A003190.j(4, 4, new int[] {0, 8, 0, 0, 0}));
//  }
}
