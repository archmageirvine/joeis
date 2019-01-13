package irvine.math.plantri;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CanonTest extends Min5ScannerTest {

  public void test3ConnectedPlanarTriangulations() {
    assertEquals(7595, new Plantri().count(12, -1, -1, -1, false, false, false, false));
  }

  public void test3ConnectedPlanarTriangulationsOP() {
    assertEquals(2274, new Plantri().count(11, -1, -1, -1, true, false, false, false));
  }

  public void test2ConnectedPlanarTriangulations() {
    assertEquals(723, new Plantri().count(10, -1, 2, -1, false, false, false, false));
  }

  public void test2ConnectedPlanarTriangulationsOP() {
    assertEquals(37, new Plantri().count(8, -1, 2, -1, true, false, false, false));
  }

  public void test3ConnectedPlanarSimpleMinDeg4OP() {
    assertEquals(720, new Plantri().count(11, 4, -1, -1, true, true, false, false));
  }

  public void test3ConnectedPolygons() {
    assertEquals(773, new Plantri().count(9, -1, -1, 0, false, false, false, false));
  }

  public void test3ConnectedPolygonsC2XM2() {
    assertEquals(1160, new Plantri().count(9, 2, 2, 0, false, false, false, true));
  }

  public void test3ConnectedPolygonsC2XM2OP() {
    assertEquals(2168, new Plantri().count(9, 2, 2, 0, true, false, false, true));
  }

  public void testQuadrangulations() {
    assertEquals(451, new Plantri().count(18, -1, -1, -1, false, false, true, false));
  }

  public void testQuadrangulationsOP() {
    assertEquals(92, new Plantri().count(16, -1, -1, -1, true, false, true, false));
  }

  public void testQuadrangulationsM3C4() {
    assertEquals(37, new Plantri().count(16, 3, 4, -1, false, false, true, false));
  }
}
