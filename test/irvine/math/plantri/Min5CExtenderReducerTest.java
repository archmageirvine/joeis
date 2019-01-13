package irvine.math.plantri;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Min5CExtenderReducerTest extends AbstractExtenderReducerWithSaveTest {

  protected ExtenderReducerWithSave getER(final PlantriGraphState g) {
    Min5.init(g);
    return new Min5CExtenderReducer(g);
  }

  public void testPlanarC5() {
    assertEquals(4, new Plantri().count(17, -1, 5, -1, false, false, false, false));
    assertEquals(12, new Plantri().count(18, -1, 5, -1, false, false, false, false));
  }
}
