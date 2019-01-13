package irvine.math.polynomial;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ExtendedSymmetricGroupCycleIndexTest extends TestCase {

  public void test() {
    assertEquals("S_{3}^{(3)} = (1/3)x_1^3x_3^8 + (1/2)x_1^9x_2^9 + (1/6)x_1^{27}", ExtendedSymmetricGroupCycleIndex.extendedSymmetricGroupCycleIndex(3, 3).toString());
  }
}
