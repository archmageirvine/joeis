package irvine.math.plantri;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Batagelj4ExtenderReducerTest extends AbstractExtenderReducerTest {

  protected ExtenderReducer getER(final PlantriGraphState g) {
    Min3Quadrangulations.init(g);
    return new Batagelj4ExtenderReducer(g);
  }
}
