package irvine.math.cc;

import irvine.math.cr.CR;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CCTest extends TestCase {

  public void test() {
    assertEquals(CR.ZERO, CC.I.re());
    assertEquals(CR.ONE, CC.I.im());
    assertEquals(CR.HALF, CC.HALF.re());
    assertEquals(CR.ZERO, CC.HALF.im());
    assertEquals("0.0000000000+1.0000000000i", CC.I.toString());
    assertEquals(1, CC.ONE.longValue());
    assertTrue(Double.isNaN(CC.I.doubleValue()));
  }
}
