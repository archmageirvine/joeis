package irvine.math.group;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ShanksPhiTest extends TestCase {

  public void test() {
    assertEquals("[]", ShanksPhi.phi(Z.ONE).toString());
    assertEquals("[]", ShanksPhi.phi(Z.TWO).toString());
    assertEquals("[2]", ShanksPhi.phi(Z.THREE).toString());
    assertEquals("[2]", ShanksPhi.phi(Z.FOUR).toString());
    assertEquals("[4]", ShanksPhi.phi(Z.FIVE).toString());
    assertEquals("[2]", ShanksPhi.phi(Z.SIX).toString());
    assertEquals("[2, 2]", ShanksPhi.phi(Z.EIGHT).toString());
    assertEquals("[2, 3]", ShanksPhi.phi(Z.NINE).toString());
    assertEquals("[2, 2, 3, 4]", ShanksPhi.phi(Z.valueOf(104)).toString());
    assertEquals("[2, 2, 3, 4]", ShanksPhi.phi(Z.valueOf(105)).toString());
    assertEquals("[2, 2, 3, 9, 343]", ShanksPhi.phi(Z.valueOf(3 * 3 * 3 * 7 * 7 * 7 * 7)).toString());
  }
}
