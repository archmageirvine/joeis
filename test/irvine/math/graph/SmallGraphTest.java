package irvine.math.graph;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SmallGraphTest extends AbstractGraphTest {

  @Override
  protected Graph create(final int order) {
    return new SmallGraph(order);
  }

  public void testDelete() {
    final Graph g = create(3);
    g.addEdge(0, 1);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    final Graph h = g.delete(1);
    assertEquals(2, h.order());
    assertTrue(h.isConnected());
    assertEquals("{0-1}", h.toString());
  }
}
