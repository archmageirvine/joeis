package irvine.math.plantri;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Degree4ExtenderReducerTest extends AbstractExtenderReducerWithSaveTest {

  protected ExtenderReducerWithSave getER(final PlantriGraphState g) {
    Min3Quadrangulations.init(g);
    return new Degree4ExtenderReducer(g);
  }
}
