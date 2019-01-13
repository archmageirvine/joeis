package irvine.math.generic;

import irvine.TestUtils;
import irvine.math.c.C;
import irvine.math.c.ComplexField;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class Buchholz1F1Test extends TestCase {

  public void testBesselJ() {
    TestUtils.assertEquals(new C(0.590323140482135454587, -0.1590078575429586310494), Buchholz1F1.besselJ(ComplexField.SINGLETON, new C(0.2, 0.3), new C(0.2, 0.3)), 1E-15);
  }

  // Test cases from "Computation of Hypergeometric Functions" by John Pearson
  public void testPearson1F1() {
    final ComplexField cf = ComplexField.SINGLETON;
    TestUtils.assertEquals(new C(0.695536565102261), Buchholz1F1.hypergeometric(cf, new C(-0.1), new C(0.2), new C(0.5)), 1E-15); // 2
    TestUtils.assertEquals(new C(1.468693939915885, -2.287355287178842), Buchholz1F1.hypergeometric(cf, new C(1, 1), new C(1, 1), new C(1, -1)), 1E-14); // 4
    TestUtils.assertEquals(new C(1.000000000100000), Buchholz1F1.hypergeometric(cf, new C(1E-8), new C(1E-8), new C(1E-10)), 1E-8); // 5
    TestUtils.assertEquals(new C(2.202646579480672E4, 2.202646579480672E-5), Buchholz1F1.hypergeometric(cf, C.ONE, C.ONE, new C(10, 1E-9)), 1E-10); // 7, Pearson has wrong value
    TestUtils.assertEquals(new C(4.403093158961343E2), Buchholz1F1.hypergeometric(cf, C.ONE, new C(3), new C(10)), 1E-12); // 8
    TestUtils.assertEquals(new C(1.724131075992688E41), Buchholz1F1.hypergeometric(cf, new C(8.1), new C(10.1), new C(100)), 1E28); // 10
    TestUtils.assertEquals(new C(2.748892975858683E12), Buchholz1F1.hypergeometric(cf, new C(100), new C(1.5), new C(2.5)), 1.0); // 12
//    TestUtils.assertEquals(new C(-10.048954112964948), Buchholz1F1.hypergeometric(cf, new C(-60), C.ONE, new C(10)), 1E-12); // 13, Don't support this yet
    TestUtils.assertEquals(new C(1.818086887618945E22), Buchholz1F1.hypergeometric(cf, new C(60), C.ONE, new C(10)), 1E10); // 14
    //TestUtils.assertEquals(new C(-6.713066845459067E-4), Buchholz1F1.hypergeometric(cf, new C(60), C.ONE, new C(-10)), 1E-16); // 15, Don't support this yet
    TestUtils.assertEquals(new C(1.2331425409985889E18), Buchholz1F1.hypergeometric(cf, new C(-60), C.ONE, new C(-10)), 1E6); // 16
    TestUtils.assertEquals(new C(2.27992985382866), Buchholz1F1.hypergeometric(cf, new C(1000), C.ONE, new C(0.001)), 1E-12); // 17
//    TestUtils.assertEquals(new C(0.001053895943365), Buchholz1F1.hypergeometric(cf, new C(500), C.ONE, new C(-5)), 1E-12); // 19
//    TestUtils.assertEquals(new C(0.251406264291805), Buchholz1F1.hypergeometric(cf, new C(-500), C.ONE, new C(5)), 1E-12); // 20
    TestUtils.assertEquals(new C(8.857934344815256E9), Buchholz1F1.hypergeometric(cf, new C(20), new C(-10 + 1E-9), new C(-2.5)), 1E4); // 21
    TestUtils.assertEquals(new C(98.353133058093164), Buchholz1F1.hypergeometric(cf, new C(20), new C(10 - 1E-9), new C(2.5)), 1E-12); // 22
    TestUtils.assertEquals(new C(-1.051351454763442E14), Buchholz1F1.hypergeometric(cf, new C(-20), new C(-10 + 1E-12), new C(2.5)), 1E10); // 23
    TestUtils.assertEquals(new C(0.507421537454510, 0.298577267504408), Buchholz1F1.hypergeometric(cf, new C(-5), new C(-5 + 1E-9, -5 + 1E-9), new C(-1)), 1E-14); //25
    TestUtils.assertEquals(new C(2.718281828457880E12), Buchholz1F1.hypergeometric(cf, C.ONE, new C(1E-12), C.ONE), 1E-1); // 34
    TestUtils.assertEquals(new C(1.332534440778499E23), Buchholz1F1.hypergeometric(cf, new C(10), new C(1E-12), new C(10)), 1E11); // 35
  }

}
