package irvine.math.graph;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SparseGraphTest extends AbstractGraphTest {

  @Override
  protected Graph create(final int order) {
    return new SparseGraph(order);
  }

  public void testAddBeyondEnd() {
    final SparseGraph sg = new SparseGraph(0);
    sg.addEdge(0, 1);
    assertEquals(2, sg.order());
  }
}
