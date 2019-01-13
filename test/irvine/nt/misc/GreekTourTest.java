package irvine.nt.misc;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class GreekTourTest extends TestCase {

  public void test() {
    assertEquals(Z.ZERO, GreekTour.greek(0, 0));
    assertEquals(Z.ONE, GreekTour.greek(1, 1));
    assertEquals(Z.ONE, GreekTour.greek(2, 2));
    assertEquals(Z.TWO, GreekTour.greek(3, 3));
    assertEquals(Z.valueOf(256), GreekTour.greek(3, 10));
    assertEquals(Z.valueOf(86), GreekTour.greek(5, 5));
  }
}
