package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class PsiTest extends TestCase {

  public void testPsi() {
    assertEquals("-0.57721566490153286061", Psi.psi(1).toString(20));
    assertEquals("0.42278433509846713939", Psi.psi(2).toString(20));
    assertEquals("0.92278433509846713939", Psi.psi(3).toString(20));
    try {
      Psi.psi(0);
      fail();
    } catch (final IllegalArgumentException e) {
      // expected
    }
  }
}
