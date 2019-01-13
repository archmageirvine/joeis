package irvine.math.plantri;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Min5BExtenderReducerTest extends AbstractExtenderReducerTest {

  protected ExtenderReducer getER(final PlantriGraphState g) {
    Min5.init(g);
    return new Min5BExtenderReducer(g, new Marks(Plantri.MAX_VERTICES), new EdgeFactory());
  }

  public void testPlanarC5() {
    assertEquals(1, new Plantri().count(14, -1, 5, -1, false, false, false, false));
    assertEquals(1, new Plantri().count(15, -1, 5, -1, false, false, false, false));
    assertEquals(3, new Plantri().count(16, -1, 5, -1, false, false, false, false));
    assertEquals(627, new Plantri().count(22, -1, 5, -1, false, false, false, false));
  }
}
