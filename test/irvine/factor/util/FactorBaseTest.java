package irvine.factor.util;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class FactorBaseTest extends TestCase {

  public void test() {
    final FactorBase fb = new FactorBase(Z.valueOf(1234567), 12);
    assertEquals(4, fb.size());
    assertEquals(-1, fb.get(0));
    assertEquals(2, fb.get(1));
    assertEquals(3, fb.get(2));
    assertEquals(11, fb.get(3));
    assertEquals(9, fb.getShanks1(3));
    assertEquals(2, fb.getShanks2(3));
    assertNull(fb.factor(Z.valueOf(5001)));
    assertEquals("{1, 3}", fb.factor(Z.valueOf(22)).toString());
 }
}
