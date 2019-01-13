package irvine.math.generic;

import irvine.TestUtils;
import irvine.math.c.C;
import irvine.math.c.ComplexField;
import irvine.math.r.Reals;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class TaylorSeries1F1Test extends TestCase {

  // Test cases from "Computation of Hypergeometric Functions" by John Pearson
  public void testPearson1F1() {
    final ComplexField cf = ComplexField.SINGLETON;
    TestUtils.assertEquals(new C(1.317627178278510), TaylorSeries1F1.hypergeometric(cf, new C(0.1), new C(0.2), new C(0.5)), 1E-15);
    TestUtils.assertEquals(new C(0.695536565102261), TaylorSeries1F1.hypergeometric(cf, new C(-0.1), new C(0.2), new C(0.5)), 1E-15);
    TestUtils.assertEquals(new C(0.667236640109150, 0.274769720129335), TaylorSeries1F1.hypergeometric(cf, new C(0.1), new C(0.2), new C(-0.5, 1)), 1E-14);
    TestUtils.assertEquals(new C(1.468693939915885, -2.287355287178842), TaylorSeries1F1.hypergeometric(cf, new C(1, 1), new C(1, 1), new C(1, -1)), 1E-14);
    TestUtils.assertEquals(new C(1.000000000100000), TaylorSeries1F1.hypergeometric(cf, new C(1E-8), new C(1E-8), new C(1E-10)), 1E-15);
    TestUtils.assertEquals(new C(0.999999, 0.00000001), TaylorSeries1F1.hypergeometric(cf, new C(1E-8), new C(1E-12), new C(-1E-10, 1E-12)), 1E-10);
    TestUtils.assertEquals(new C(2.202646579480672E4, 2.202646579480672E-5), TaylorSeries1F1.hypergeometric(cf, C.ONE, C.ONE, new C(10, 1E-9)), 1E-10); // Pearson has wrong value
    TestUtils.assertEquals(new C(4.403093158961343E2), TaylorSeries1F1.hypergeometric(cf, C.ONE, new C(3), new C(10)), 1E-12);
    TestUtils.assertEquals(new C(1.779668553337393E4), TaylorSeries1F1.hypergeometric(cf, new C(500), new C(511), new C(10)), 1E-8); // Pearson has wrong exponent
    TestUtils.assertEquals(new C(1.724131075992688E41), TaylorSeries1F1.hypergeometric(cf, new C(8.1), new C(10.1), new C(100)), 1E28);
    TestUtils.assertEquals(new C(2.748892975858683E12), TaylorSeries1F1.hypergeometric(cf, new C(100), new C(1.5), new C(2.5)), 1.0);
    TestUtils.assertEquals(new C(1.818086887618945E22), TaylorSeries1F1.hypergeometric(cf, new C(60), C.ONE, new C(10)), 1E10);
    TestUtils.assertEquals(new C(1.2331425409985889E18), TaylorSeries1F1.hypergeometric(cf, new C(-60), C.ONE, new C(-10)), 1E6);
    TestUtils.assertEquals(new C(2.27992985382866), TaylorSeries1F1.hypergeometric(cf, new C(1000), C.ONE, new C(0.001)), 1E-12);
    TestUtils.assertEquals(new C(8.857934344815256E9), TaylorSeries1F1.hypergeometric(cf, new C(20), new C(-10 + 1E-9), new C(-2.5)), 1E2);
    TestUtils.assertEquals(new C(98.353133058093164), TaylorSeries1F1.hypergeometric(cf, new C(20), new C(10 - 1E-9), new C(2.5)), 1E-12);
    TestUtils.assertEquals(new C(-1.051351454763442E14), TaylorSeries1F1.hypergeometric(cf, new C(-20), new C(-10 + 1E-12), new C(2.5)), 1E2);
    TestUtils.assertEquals(new C(0.507421537454510, 0.298577267504408), TaylorSeries1F1.hypergeometric(cf, new C(-5), new C(-5 + 1E-9, -5 + 1E-9), new C(-1)), 1E-14);
    TestUtils.assertEquals(new C(3.448551506216654E27), TaylorSeries1F1.hypergeometric(cf, new C(4), new C(80), new C(200)), 1E23); // NOTE currently low accuracy
    TestUtils.assertEquals(new C(0.024906201315854), TaylorSeries1F1.hypergeometric(cf, new C(-4), new C(500), new C(300)), 1E-12);
    TestUtils.assertEquals(new C(2.897045042631838E10, -8.276253515853658E11), TaylorSeries1F1.hypergeometric(cf, new C(-5), new C(0.1), new C(2, 300)), 1E-3);
    TestUtils.assertEquals(new C(-9.853780031496243E135, 3.293888962100131E136), TaylorSeries1F1.hypergeometric(cf, new C(2, 8), new C(-150, 1), new C(150)), 1E125);
    TestUtils.assertEquals(new C(7.196140446954445E11, -1.233790613611111E12), TaylorSeries1F1.hypergeometric(cf, new C(-5), C.TWO, new C(-100, 1000)), 1E-2);
    TestUtils.assertEquals(new C(61.699999992549998, 9.8999999971), TaylorSeries1F1.hypergeometric(cf, new C(-5), new C(-2, -1), new C(1, 2 - 1E-10)), 1E-9);
    TestUtils.assertEquals(new C(2.718281828457880E12), TaylorSeries1F1.hypergeometric(cf, C.ONE, new C(1E-12), C.ONE), 1E-1);
    TestUtils.assertEquals(new C(1.332534440778499E23), TaylorSeries1F1.hypergeometric(cf, new C(10), new C(1E-12), new C(10)), 1E11);
    TestUtils.assertEquals(new C(-5.528996131321089E-1, 2.718281828459045E12), TaylorSeries1F1.hypergeometric(cf, C.ONE, new C(-1, 1E-12), C.ONE), 1E-4);
    TestUtils.assertEquals(new C(0.993763703678828, 0.099687801957356), TaylorSeries1F1.hypergeometric(cf, new C(20), new C(10, 1000), new C(-5)), 1E-14);
    assertNull(TaylorSeries1F1.hypergeometric(cf, C.ONE, C.TWO, new C(600))); // too hard for Taylor series
  }

  public void testPearson1F1Real() {
    final Reals r = Reals.SINGLETON;
    assertEquals(0.695536565102261, TaylorSeries1F1.hypergeometric(r, -0.1, 0.2, 0.5), 1E-15);
    assertEquals(1.000000000100000, TaylorSeries1F1.hypergeometric(r, 1E-8, 1E-8, 1E-10), 1E-15);
    assertEquals(2.27992985382866, TaylorSeries1F1.hypergeometric(r, 1000.0, 1.0, 0.001), 1E-12);
    assertEquals(8.857934344815256E9, TaylorSeries1F1.hypergeometric(r, 20.0, -10 + 1E-9, -2.5), 1E2);
    assertEquals(98.353133058093164, TaylorSeries1F1.hypergeometric(r, 20.0, 10 - 1E-9, 2.5), 1E-12);
    assertEquals(-1.051351454763442E14, TaylorSeries1F1.hypergeometric(r, -20.0, -10 + 1E-12, 2.5), 1E2);
    assertEquals(3.448551506216654E27, TaylorSeries1F1.hypergeometric(r, 4.0, 80.0, 200.0), 1E23); // NOTE currently low accuracy
    assertEquals(0.024906201315854, TaylorSeries1F1.hypergeometric(r, -4.0, 500.0, 300.0), 1E-12);
    assertEquals(2.718281828457880E12, TaylorSeries1F1.hypergeometric(r, 1.0, 1E-12, 1.0), 1E-1);
    assertEquals(1.332534440778499E23, TaylorSeries1F1.hypergeometric(r, 10.0, 1E-12, 10.0), 1E11);
    assertNull(TaylorSeries1F1.hypergeometric(r, 1.0, 2.0, 600.0)); // too hard for Taylor series
  }

}
