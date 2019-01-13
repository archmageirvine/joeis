package irvine.math.nauty;

import java.io.IOException;
import java.util.Arrays;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class NautyUtilTest extends TestCase {

  public void testMash() {
    assertEquals(27468, NautyUtil.mash(42, 21));
    assertEquals(27489, NautyUtil.mash(42, 42));
    assertEquals(27421, NautyUtil.mash(0, 0));
  }

  public void testCleanup() {
    assertEquals(0, NautyUtil.cleanup(0));
    assertEquals(42, NautyUtil.cleanup(42));
    assertEquals(1, NautyUtil.cleanup(Integer.MAX_VALUE));
  }

  public void testNextElement() {
    assertEquals(32, NautyUtil.nextElement(0xCCCCCCCCL, -1));
    assertEquals(41, NautyUtil.nextElement(0xCCCCCCCCL, 40));
    assertEquals(32, NautyUtil.nextElement(0xCCCCCCCCL, 15));
    assertEquals(32, NautyUtil.nextElement(new long[] {0, 0xCCCCCCCCL}, 1, 15));
    assertEquals(-1, NautyUtil.nextElement(0, -1));
  }

  public void testNauty() throws IOException {
    // tests orbJoin among other possible things
    final Graph g = GraphFactory.create(5);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(0, 3);
    g.addEdge(1, 4);
    assertEquals("{0-1, 0-2, 0-3, 1-4}", g.toString());
    final OptionBlk options = new OptionBlk();
    options.setCanon(1);
    final Nauty nauty = new Nauty(g, new int[g.order()], new int[g.order()], new NautySet(g.order()), new int[g.order()], options, new StatsBlk(), new long[100]);
    assertEquals("{2-3, 0-4, 1-4, 3-4}", nauty.canon().toString());
    assertEquals("{0-1, 0-2, 0-3, 1-4}", g.toString());
    final long[] set = new long[5];
    NautyUtil.permSet(g, 2, set, 1, new int[] {1, 2, 3, 4, 5});
    NautyUtil.permSet(g, 0, set, 2, new int[] {1, 2, 3, 4, 5});
    assertEquals("[0, 4611686018427387904, 4035225266123964416, 0, 0]", Arrays.toString(set));
  }
}
