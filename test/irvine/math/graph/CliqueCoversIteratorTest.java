package irvine.math.graph;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class CliqueCoversIteratorTest extends TestCase {

  public void test() {
    final Graph g = GraphFactory.create(6);
    g.addEdge(0, 1);
    g.addEdge(0, 4);
    g.addEdge(1, 2);
    g.addEdge(1, 4);
    g.addEdge(2, 3);
    g.addEdge(3, 4);
    g.addEdge(3, 5);
    final CliqueCoversIterator cci = new CliqueCoversIterator(g);
    assertEquals("[19, 6, 12, 24, 40]", Arrays.toString(cci.next()));
    assertNull(cci.next());
  }
}
