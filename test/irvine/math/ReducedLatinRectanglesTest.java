package irvine.math;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ReducedLatinRectanglesTest extends TestCase {

  public void test() {
    assertEquals(Z.valueOf(1064), new ReducedLatinRectangles(6, 3).count());
    assertEquals(Z.valueOf(9408), new ReducedLatinRectangles(6, 6).count());
  }
}
