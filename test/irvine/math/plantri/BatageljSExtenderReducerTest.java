package irvine.math.plantri;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class BatageljSExtenderReducerTest extends AbstractExtenderReducerTest {

  protected ExtenderReducer getER(final PlantriGraphState g) {
    Min4.init(g);
    return new BatageljSExtenderReducer(g);
  }
}
