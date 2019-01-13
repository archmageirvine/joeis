package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ShiftTest extends TestCase {

  public void testShift() {
    CRTest.assertEquals("shift", CR.TWO, CR.ONE.shiftLeft(1));
    CRTest.assertEquals("shift", CR.FOUR, CR.ONE.shiftLeft(2));
    CRTest.assertEquals("shift", CR.TWO, CR.ONE.shiftLeft(2).shiftRight(1));
  }
}
