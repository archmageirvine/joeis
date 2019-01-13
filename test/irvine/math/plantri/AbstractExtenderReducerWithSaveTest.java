package irvine.math.plantri;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public abstract class AbstractExtenderReducerWithSaveTest extends TestCase {

  protected abstract ExtenderReducerWithSave getER(final PlantriGraphState g);

  private long sumStarts(final Edge[] edges) {
    long s = 0;
    for (final Edge e : edges) {
      s += e.mStart;
    }
    return s;
  }

  public void testAddReduce() {
    final PlantriGraphState g = new PlantriGraphState(new EdgeFactory(), Plantri.MAX_VERTICES, Plantri.NUM_EDGES);
    final ExtenderReducerWithSave er = getER(g);
    final int nv = g.mNumVertices;
    final int ne = g.mNumEdges;
    final Edge[] h = Arrays.copyOf(g.mEdges, g.mEdges.length);
    final long se = sumStarts(g.mEdges);
    final Edge[] saveList = new Edge[4];
    er.extend(g.mEdges[23], saveList);
    assertTrue(se != sumStarts(g.mEdges));
    er.reduce(g.mEdges[23], saveList);
    assertEquals(nv, g.mNumVertices);
    assertEquals(ne, g.mNumEdges);
    assertTrue(Arrays.equals(h, g.mEdges));
  }

}
