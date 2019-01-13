package irvine.math.plantri;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class StarTest extends TestCase {

  public void test() {
    final PlantriGraphState g = new PlantriGraphState(new EdgeFactory(), 7, 100);
    Star.makeStar(7, g);
    assertEquals(7, g.mNumVertices);
    assertEquals("[6, 1, 1, 1, 1, 1, 1]", Arrays.toString(g.mDegree));
    assertEquals("{0-0, 0-1, 0-2, 0-3, 0-4, 0-5, 0-6}", g.toGraph().toString());
  }
}
