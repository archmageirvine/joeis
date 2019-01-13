package irvine.math.c;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ComplexHypergeometricTest extends TestCase {

  public void testFarmOutToSpecific() {
    TestUtils.assertEquals(new C(Math.E), ComplexHypergeometric.hypergeometric(new C[0], new C[0], C.ONE), 1E-15); // 0F0
    TestUtils.assertEquals(new C(2.17818355660857086), ComplexHypergeometric.hypergeometric(new C[0], new C[] {new C(0.5)}, new C(0.5)), 1E-12); // 0F1
    TestUtils.assertEquals(new C(1.317627178278510), ComplexHypergeometric.hypergeometric(new C[]{new C(0.1)}, new C[]{new C(0.2)}, new C(0.5)), 1E-15); // 1F1
  }

  // Test cases from "Computation of Hypergeometric Functions" by John Pearson
  public void testPearson1F1() {
    TestUtils.assertEquals(new C(1.317627178278510), ComplexHypergeometric.hypergeometric(new C(0.1), new C(0.2), new C(0.5)), 1E-15); // 1
    TestUtils.assertEquals(new C(0.695536565102261), ComplexHypergeometric.hypergeometric(new C(-0.1), new C(0.2), new C(0.5)), 1E-15); // 2
    TestUtils.assertEquals(new C(0.667236640109150, 0.274769720129335), ComplexHypergeometric.hypergeometric(new C(0.1), new C(0.2), new C(-0.5, 1)), 1E-14); // 3
    TestUtils.assertEquals(new C(1.468693939915885, -2.287355287178842), ComplexHypergeometric.hypergeometric(new C(1, 1), new C(1, 1), new C(1, -1)), 1E-14); // 4
    TestUtils.assertEquals(new C(1.000000000100000), ComplexHypergeometric.hypergeometric(new C(1E-8), new C(1E-8), new C(1E-10)), 1E-15); // 5
    TestUtils.assertEquals(new C(0.999999, 0.00000001), ComplexHypergeometric.hypergeometric(new C(1E-8), new C(1E-12), new C(-1E-10, 1E-12)), 1E-4); // 6, LOW ACCURACY going via Buchholz
    TestUtils.assertEquals(new C(2.202646579480672E4, 2.202646579480672E-5), ComplexHypergeometric.hypergeometric(C.ONE, C.ONE, new C(10, 1E-9)), 1E-10); // 7, Pearson has wrong value
    TestUtils.assertEquals(new C(4.403093158961343E2), ComplexHypergeometric.hypergeometric(C.ONE, new C(3), new C(10)), 1E-12); // 8
    TestUtils.assertEquals(new C(1.779668553337393E4), ComplexHypergeometric.hypergeometric(new C(500), new C(511), new C(10)), 1E-8); // 9, Pearson has wrong exponent
    TestUtils.assertEquals(new C(1.724131075992688E41), ComplexHypergeometric.hypergeometric(new C(8.1), new C(10.1), new C(100)), 1E28); // 10
    //TestUtils.assertEquals(new C(6.288367168216566E257), ComplexHypergeometric.hypergeometric(C.ONE, C.TWO, new C(600)), 1E245); // 11
    TestUtils.assertEquals(new C(2.748892975858683E12), ComplexHypergeometric.hypergeometric(new C(100), new C(1.5), new C(2.5)), 1.0); // 12
    //TestUtils.assertEquals(new C(-10.048954112964948), ComplexHypergeometric.hypergeometric(new C(-60), C.ONE, new C(10)), 1E-12); // 13, Don't support this yet
    TestUtils.assertEquals(new C(1.818086887618945E22), ComplexHypergeometric.hypergeometric(new C(60), C.ONE, new C(10)), 1E10); // 14
    //TestUtils.assertEquals(new C(-6.713066845459067E-4), ComplexHypergeometric.hypergeometric(new C(60), C.ONE, new C(-10)), 1E-16); // 15, Don't support this yet
    TestUtils.assertEquals(new C(1.2331425409985889E18), ComplexHypergeometric.hypergeometric(new C(-60), C.ONE, new C(-10)), 1E6); // 16
    TestUtils.assertEquals(new C(2.27992985382866), ComplexHypergeometric.hypergeometric(new C(1000), C.ONE, new C(0.001)), 1E-12); // 17
    //TestUtils.assertEquals(new C(1.461353307199289E299), ComplexHypergeometric.hypergeometric(new C(0.001), C.ONE, new C(700)), new C(1E287); // 18, Don't support this yet
    //TestUtils.assertEquals(new C(0.001053895943365), ComplexHypergeometric.hypergeometric(new C(500), C.ONE, new C(-5)), 1E-12); // 19
    //TestUtils.assertEquals(new C(0.251406264291805), ComplexHypergeometric.hypergeometric(new C(-500), C.ONE, new C(5)), 1E-12); // 20
    //TestUtils.assertEquals(new C(8.857934344815256E9), ComplexHypergeometric.hypergeometric(new C(20), new C(-10 + 1E-9), new C(-2.5)), 1E2); // 21
    TestUtils.assertEquals(new C(98.353133058093164), ComplexHypergeometric.hypergeometric(new C(20), new C(10 - 1E-9), new C(2.5)), 1E-12); // 22
    //TestUtils.assertEquals(new C(-1.051351454763442E14), ComplexHypergeometric.hypergeometric(new C(-20), new C(-10 + 1E-12), new C(2.5)), 1E2); // 23
    //TestUtils.assertEquals(new C(-3.000605782805072E35, 3.046849261045972E35), ComplexHypergeometric.hypergeometric(new C(50), new C(10), new C(0, 200)), 1E24); // 24
    TestUtils.assertEquals(new C(0.507421537454510, 0.298577267504408), ComplexHypergeometric.hypergeometric(new C(-5), new C(-5 + 1E-9, -5 + 1E-9), new C(-1)), 1E-14); //25
    TestUtils.assertEquals(new C(3.448551506216654E27), ComplexHypergeometric.hypergeometric(new C(4), new C(80), new C(200)), 1E23); // 26, NOTE currently low accuracy
    TestUtils.assertEquals(new C(0.024906201315854), ComplexHypergeometric.hypergeometric(new C(-4), new C(500), new C(300)), 1E-12); // 27
    //TestUtils.assertEquals(new C(7.208553632163922E10, -1.550289119122414E10), ComplexHypergeometric.hypergeometric(new C(5), new C(0.1), new C(-2, 300)), 1); // 28
    TestUtils.assertEquals(new C(2.897045042631838E10, -8.276253515853658E11), ComplexHypergeometric.hypergeometric(new C(-5), new C(0.1), new C(2, 300)), 1E-3); // 29
    TestUtils.assertEquals(new C(-9.853780031496243E135, 3.293888962100131E136), ComplexHypergeometric.hypergeometric(new C(2, 8), new C(-150, 1), new C(150)), 1E125); // 30
    //TestUtils.assertEquals(new C(7.002864442038879E50, 8.973775767458327E50), ComplexHypergeometric.hypergeometric(new C(5), C.TWO, new C(100, -1000)), 1E36); // 31
    TestUtils.assertEquals(new C(7.196140446954445E11, -1.233790613611111E12), ComplexHypergeometric.hypergeometric(new C(-5), C.TWO, new C(-100, 1000)), 1E-2); // 32
    TestUtils.assertEquals(new C(61.699999992549998, 9.8999999971), ComplexHypergeometric.hypergeometric(new C(-5), new C(-2, -1), new C(1, 2 - 1E-10)), 1E-9); // 33
    TestUtils.assertEquals(new C(2.718281828457880E12), ComplexHypergeometric.hypergeometric(C.ONE, new C(1E-12), C.ONE), 1E-1); // 34
    TestUtils.assertEquals(new C(1.332534440778499E23), ComplexHypergeometric.hypergeometric(new C(10), new C(1E-12), new C(10)), 1E11); // 35
    TestUtils.assertEquals(new C(-5.528996131321089E-1, 2.718281828459045E12), ComplexHypergeometric.hypergeometric(C.ONE, new C(-1, 1E-12), C.ONE), 1E-4); // 36
    //TestUtils.assertEquals(new C(1.805334147110282E-53), ComplexHypergeometric.hypergeometric(new C(1000), C.ONE, new C(-1000)), new C(1E-67); // 37
    //TestUtils.assertEquals(new C(2.593820783362006E215), ComplexHypergeometric.hypergeometric(new C(-1000), C.ONE, new C(1000)), new C(1E205); // 38
    //TestUtils.assertEquals(new C(7.086198763185099E43, 2.328576049934718E43), ComplexHypergeometric.hypergeometric(new C(-10, 500), new C(0, -5), new C(10)), 1E30); // 39
    TestUtils.assertEquals(new C(0.993763703678828, 0.099687801957356), ComplexHypergeometric.hypergeometric(new C(20), new C(10, 1000), new C(-5)), 1E-14); // 40
  }


}
