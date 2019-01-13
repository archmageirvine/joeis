package irvine.math.plantri;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(Batagelj4ExtenderReducerTest.class);
    suite.addTestSuite(Batagelj5ExtenderReducerTest.class);
    suite.addTestSuite(BatageljSExtenderReducerTest.class);
    suite.addTestSuite(BipScannerTest.class);
    suite.addTestSuite(Bipartite4CScannerTest.class);
    suite.addTestSuite(BipartitePExtenderReducerTest.class);
    suite.addTestSuite(BipartiteQExtenderReducerTest.class);
    suite.addTestSuite(BipartiteScannerTest.class);
    suite.addTestSuite(BipartiteTest.class);
    suite.addTestSuite(BipExtensionFinderTest.class);
    suite.addTestSuite(CanonTest.class);
    suite.addTestSuite(CubeTest.class);
    suite.addTestSuite(Degree3ExtenderReducerTest.class);
    suite.addTestSuite(Degree4ExtenderReducerTest.class);
    suite.addTestSuite(Degree5ExtenderReducerTest.class);
    suite.addTestSuite(DoubleScannerTest.class);
    suite.addTestSuite(EdgeCountsTest.class);
    suite.addTestSuite(ExtensionFinderTest.class);
    suite.addTestSuite(IcosahedronTest.class);
    suite.addTestSuite(Min3QuadrangulationsTest.class);
    suite.addTestSuite(Min4ScannerTest.class);
    suite.addTestSuite(Min4Test.class);
    suite.addTestSuite(Min5AExtenderReducerTest.class);
    suite.addTestSuite(Min5BExtenderReducerTest.class);
    suite.addTestSuite(Min5BMirrorExtenderReducerTest.class);
    suite.addTestSuite(Min5C4ExtensionFinderTest.class);
    suite.addTestSuite(Min5CExtenderReducerTest.class);
    suite.addTestSuite(Min5CScannerTest.class);
    suite.addTestSuite(Min5ExtensionFinderTest.class);
    suite.addTestSuite(Min5ScannerTest.class);
    suite.addTestSuite(Min5Test.class);
    suite.addTestSuite(NumberingTest.class);
    suite.addTestSuite(OctahedronTest.class);
    suite.addTestSuite(PlantriGraphStateTest.class);
    suite.addTestSuite(PlantriTest.class);
    suite.addTestSuite(PlantriCliHelperTest.class);
    suite.addTestSuite(PolytopeC3ScannerTest.class);
    suite.addTestSuite(PolytopeScannerTest.class);
    suite.addTestSuite(QuadrangulationAllExtensionFinderTest.class);
    suite.addTestSuite(QuadrangulationAllScannerTest.class);
    suite.addTestSuite(QuadrangulationConnectivityTest.class);
    suite.addTestSuite(QuadrangulationDispatcherTest.class);
    suite.addTestSuite(QuadrangulationExtensionFinderTest.class);
    suite.addTestSuite(QuadrangulationMin3ExtensionFinderTest.class);
    suite.addTestSuite(QuadrangulationMin3ScannerTest.class);
    suite.addTestSuite(QuadrangulationNf4ExtensionFinderTest.class);
    suite.addTestSuite(QuadrangulationNf4ScannerTest.class);
    suite.addTestSuite(QuadrangulationsTest.class);
    suite.addTestSuite(QuadrangulationsP0ExtenderReducerTest.class);
    suite.addTestSuite(QuadrangulationP1ExtenderReducerTest.class);
    suite.addTestSuite(QuadrangulationScannerTest.class);
    suite.addTestSuite(QuadrangulationsP2ExtenderReducerTest.class);
    suite.addTestSuite(QuadrangulationP3ExtenderReducerTest.class);
    suite.addTestSuite(SimpleDispatcherTest.class);
    suite.addTestSuite(SimpleScannerTest.class);
    suite.addTestSuite(StarTest.class);
    suite.addTestSuite(TestCanonicalizationTest.class);
    suite.addTestSuite(TriangTest.class);
    suite.addTestSuite(TriangleTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
