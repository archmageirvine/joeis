package irvine.factor.project.factorial;

import java.util.Arrays;
import java.util.Collections;

import irvine.graph.Graph;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class GraphSupportTest extends TestCase {

  public void test() {
    final Graph<String, String> graph = new Graph<>();
    for (int k = 0; k < 7; ++k) {
      graph.addVertex(k + "!");
    }
    GraphSupport.augmentGraph(graph, Arrays.asList(
      Collections.singletonList(Z.TWO),
      Collections.singletonList(Z.TWO),
      Collections.singletonList(Z.THREE),
      Collections.singletonList(Z.SEVEN),
      Collections.singletonList(Z.FIVE),
      Collections.singletonList(Z.valueOf(11)),
      Arrays.asList(Z.SEVEN, Z.valueOf(103))
    ), 1);
    assertEquals("[2! -- 3, 3! -- 7, 4! -- 5, 4! -- 5, 5! -- 11, 5! -- 11, 6! -- 103, 6! -- 7, 96! -- 103] order=16 size=9", graph.toString());
  }
}
