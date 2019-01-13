package irvine.math.polynomial;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class BarSymmetricGroupCycleIndexTest extends TestCase {

  public void test2() {
    assertEquals("Z_{2}' = (1/2)x_4 + (1/2)x_1^2x_2", BarSymmetricGroupCycleIndex.barSymmetricGroupCycleIndex(2).toString());
  }

  public void test3() {
    assertEquals("Z_{3}' = (1/3)x_3x_6 + (1/2)x_1x_4^2 + (1/6)x_1^3x_2^3", BarSymmetricGroupCycleIndex.barSymmetricGroupCycleIndex(3).toString());
  }
}
