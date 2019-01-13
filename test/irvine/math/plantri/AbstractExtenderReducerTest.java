package irvine.math.plantri;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public abstract class AbstractExtenderReducerTest extends TestCase {

  protected abstract ExtenderReducer getER(final PlantriGraphState g);

  static long sumStarts(final Edge[] edges) {
    long s = 0;
    for (final Edge e : edges) {
      s += e.mStart;
    }
    return s;
  }

  protected void extraChecks(final PlantriGraphState g, final Edge extension) {
  }

  public void testAddReduce() {
    final PlantriGraphState g = new PlantriGraphState(new EdgeFactory(), Plantri.MAX_VERTICES, Plantri.NUM_EDGES);
    final ExtenderReducer er = getER(g);
    final int nv = g.mNumVertices;
    final int ne = g.mNumEdges;
    final Edge[] h = Arrays.copyOf(g.mEdges, g.mEdges.length);
    final long se = sumStarts(g.mEdges);
    final int deg = g.mDegree[1];
    final Edge extension = er.extend(g.mEdges[23]);
    assertNotNull(extension);
    assertTrue(se != sumStarts(g.mEdges));
    extraChecks(g, extension);
    er.reduce(g.mEdges[23]);
    assertEquals(deg, g.mDegree[1]);
    assertEquals(nv, g.mNumVertices);
    assertEquals(ne, g.mNumEdges);
    assertTrue(Arrays.equals(h, g.mEdges));
  }

}
