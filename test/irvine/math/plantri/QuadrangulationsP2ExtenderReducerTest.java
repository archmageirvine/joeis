package irvine.math.plantri;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class QuadrangulationsP2ExtenderReducerTest extends AbstractExtenderReducerTest {

  protected ExtenderReducer getER(final PlantriGraphState g) {
    Min3Quadrangulations.init(g);
    return new QuadrangulationP2ExtenderReducer(g);
  }
}
