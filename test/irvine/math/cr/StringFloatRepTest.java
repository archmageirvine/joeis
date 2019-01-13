package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class StringFloatRepTest extends TestCase {

  public void testStringFloatRep() {
    assertEquals("100E1(radix 2)", CR.ONE.toStringFloatRep(3, 2, -12).toString());
    assertEquals("100E1", CR.ONE.toStringFloatRep(3, 10, -4).toString());
    assertEquals("141421356237309504880168872421E1", CR.SQRT2.toStringFloatRep(30, 10, -4).toString());
  }
}
