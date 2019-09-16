package irvine.math.plantri;

import java.util.Arrays;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Batagelj5ExtenderReducerTest extends AbstractExtenderReducerTest {

  @Override
  protected void extraChecks(final PlantriGraphState g, final Edge extension) {
    assertEquals(9, g.mNumVertices);
    assertEquals(30, g.mNumEdges);
    assertEquals(8, extension.mStart);
    assertEquals(6, extension.mEnd);
    assertEquals("[3, 3, 3, 3, 5, 2, 3, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(g.mDegree));
  }

  protected ExtenderReducer getER(final PlantriGraphState g) {
    Min3Quadrangulations.init(g);
    return new Batagelj5ExtenderReducer(g);
  }
}
