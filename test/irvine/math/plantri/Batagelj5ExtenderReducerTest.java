package irvine.math.plantri;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Batagelj5ExtenderReducerTest extends AbstractExtenderReducerTest {

  protected ExtenderReducer getER(final PlantriGraphState g) {
    Min3Quadrangulations.init(g);
    return new Batagelj5ExtenderReducer(g);
  }
}
