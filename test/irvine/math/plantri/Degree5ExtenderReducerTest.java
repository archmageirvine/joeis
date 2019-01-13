package irvine.math.plantri;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Degree5ExtenderReducerTest extends AbstractExtenderReducerWithSaveTest {

  protected ExtenderReducerWithSave getER(final PlantriGraphState g) {
    Min3Quadrangulations.init(g);
    return new Degree5ExtenderReducer(g);
  }
}
