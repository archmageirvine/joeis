package irvine.oeis;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class WalkCubeSequenceTest extends TestCase {

  public void test() {
    final WalkCubeSequence w = new WalkCubeSequence(0, 3, 5, "", 1, "220201012120110");
    assertEquals(Z.ONE, w.next());
    assertEquals(Z.ONE, w.next());
    assertEquals(Z.FOUR, w.next());
    assertEquals(Z.TEN, w.next());
    assertEquals(Z.valueOf(38), w.next());
    assertEquals(Z.valueOf(133), w.next());
    assertEquals(Z.valueOf(512), w.next());
    assertEquals(Z.valueOf(2022), w.next());
  }
}
