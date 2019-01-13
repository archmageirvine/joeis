package irvine.math.plantri;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class QuadrangulationP1ExtenderReducerTest extends AbstractExtenderReducerTest {

  protected ExtenderReducer getER(final PlantriGraphState g) {
    Min3Quadrangulations.init(g);
    return new QuadrangulationP1ExtenderReducer(g, new EdgeFactory());
  }

  public void testQuadrangulations() {
    assertEquals(3, new Plantri().count(13, -1, -1, -1, false, false, true, false));
    assertEquals(18, new Plantri().count(15, -1, -1, -1, false, false, true, false));
    assertEquals(58, new Plantri().count(16, -1, -1, -1, false, false, true, false));
    assertEquals(451, new Plantri().count(18, -1, -1, -1, false, false, true, false));
  }
}
