package irvine.math.z;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class InverseEulerTest extends TestCase {

  public void test() {
    assertEquals("[22, 11]", new InverseEuler().inversePhi(Z.TEN).toString());
  }
}
