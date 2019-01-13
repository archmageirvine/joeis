package irvine.math.plantri;

import java.util.Arrays;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Min5BMirrorExtenderReducerTest extends AbstractExtenderReducerTest {

  @Override
  protected ExtenderReducer getER(final PlantriGraphState g) {
    Min5.init(g);
    return new Min5BMirrorExtenderReducer(g);
  }

  @Override
  protected void extraChecks(final PlantriGraphState g, final Edge extension) {
    assertEquals(14, g.mNumVertices);
    assertEquals(72, g.mNumEdges);
    assertEquals(4, extension.mStart);
    assertEquals(12, extension.mEnd);
    assertTrue(extension.isValid5Edge());
    assertEquals("[6, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(g.mDegree));
  }
}
