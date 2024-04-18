package irvine.math.z;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class InverseEulerTest extends TestCase {

  public void test() {
    assertEquals("[11, 22]", new InverseEuler().inversePhiC(Z.TEN).toString());
  }
}
