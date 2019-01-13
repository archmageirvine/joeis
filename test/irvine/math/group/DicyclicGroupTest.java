package irvine.math.group;

import irvine.math.z.Z;
import irvine.util.Pair;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DicyclicGroupTest extends TestCase {

  public void test() {
    final DicyclicGroup g = new DicyclicGroup(4);
    assertEquals(Z.valueOf(16), g.size());
    assertEquals("(0,0)", g.zero().toString());
    assertTrue(g.contains(g.zero()));
    final Pair<Integer, Integer> e = new Pair<>(3, 1);
    assertTrue(g.contains(e));
    assertEquals(e, g.add(e, g.zero()));
    final Pair<Integer, Integer> h = g.add(e, e);
    assertEquals("(4,0)", h.toString());
    assertEquals(g.zero(), g.add(h, h));
    assertEquals("\\mbox{Dic}_{4}", g.toString());
  }
}
