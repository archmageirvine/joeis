package irvine.math.plantri;

import java.util.Arrays;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class BatageljSExtenderReducerTest extends AbstractExtenderReducerTest {

  @Override
  protected void extraChecks(final PlantriGraphState g, final Edge extension) {
    assertEquals(9, g.mNumVertices);
    assertEquals(42, g.mNumEdges);
    assertEquals(2, extension.mStart);
    assertEquals(5, extension.mEnd);
    assertEquals("[4, 6, 6, 4, 4, 6, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(g.mDegree));
  }

  protected ExtenderReducer getER(final PlantriGraphState g) {
    Min4.init(g);
    return new BatageljSExtenderReducer(g);
  }
}
