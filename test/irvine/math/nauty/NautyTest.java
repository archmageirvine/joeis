package irvine.math.nauty;

import java.io.IOException;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.a003.A003400;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class NautyTest extends GenerateGraphsCliTest {

  public void testNauty() throws IOException {
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
  }

  public void testA003400() {
    final A003400 seq = new A003400();
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.ZERO, seq.next());
    assertEquals(Z.ZERO, seq.next());
    assertEquals(Z.ZERO, seq.next());
    assertEquals(Z.ZERO, seq.next());
    assertEquals(Z.EIGHT, seq.next());
    assertEquals(Z.valueOf(152), seq.next());
  }

}
