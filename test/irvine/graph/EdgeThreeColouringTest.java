package irvine.graph;

import java.util.Collection;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class EdgeThreeColouringTest extends TestCase {

  public void test() {
    final CubicGenerator cubicGenerator = new CubicGenerator();
    long cnt = 0;
    for (int k = 0; k < 4; ++k) {
      final Collection<Graph<Integer, String>> graphs = cubicGenerator.next();
      for (final Graph<Integer, String> g : graphs) {
        if (g.isEdgeColourable(3)) {
          final EdgeThreeColouring ci = new EdgeThreeColouring(g);
          ci.run();
          cnt += ci.getCount();
        }
      }
    }
    assertEquals(76, cnt);
  }
}
