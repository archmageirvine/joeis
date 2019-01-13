package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ZetaTest extends TestCase {

  public void testZeta() {
    assertEquals("1.20205690315959428539973816151144999076498629234050", Zeta.zeta(3).toString(50));
    assertEquals("1.08232323371113819151600369654116790277475095191873", Zeta.zeta(4).toString(50));
    assertEquals("1.03692775514336992633136548645703416805708091950191", Zeta.zeta(5).toString(50));
    assertEquals("1.01734306198444913971451792979092052790181749003285", Zeta.zeta(6).toString(50));
    assertEquals("1.00834927738192282683979754984979675959986356056524", Zeta.zeta(7).toString(50));
    assertEquals("1.00407735619794433937868523850865246525896079064985", Zeta.zeta(8).toString(50));
    assertEquals("1.00200839282608221441785276923241206048560585139489", Zeta.zeta(9).toString(50));
    assertEquals("1.00049418860411946455870228252646993646860643575821", Zeta.zeta(11).toString(50));
  }
}
