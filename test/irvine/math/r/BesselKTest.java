package irvine.math.r;

import static irvine.TestUtils.assertEqualsLocal;
import junit.framework.TestCase;

/**
 * Tests mathematical functions. Many of the explicit values given here in
 * the tests were computed using the independent Magma number theory
 * package.
 *
 * @author Sean A. Irvine
 */
public class BesselKTest extends TestCase {

  public void testK0() {
    for (double x = 0.0; x > -100.0; x -= Math.PI) {
      assertEqualsLocal(Double.NaN, BesselK.k0(x), 0.0);
    }
    assertEquals(2.4270692, BesselK.k0(0.1), 1E-5);
    assertEquals(1.7527038, BesselK.k0(0.2), 1E-5);
    assertEquals(1.3724600, BesselK.k0(0.3), 1E-5);
    assertEquals(1.1145291, BesselK.k0(0.4), 1E-5);
    assertEquals(0.9244190, BesselK.k0(0.5), 1E-5);
    assertEquals(0.7775220, BesselK.k0(0.6), 1E-5);
    assertEquals(0.0347395, BesselK.k0(3.0), 1E-5);
    assertEquals(0.0139659, BesselK.k0(3.8), 1E-5);
    assertEquals(0.0124823, BesselK.k0(3.9), 1E-5);
    assertEquals(0.0111597, BesselK.k0(4.0), 1E-5);
    assertEquals(0.0099800, BesselK.k0(4.1), 1E-5);
    assertEquals(0.0041189, BesselK.k0(4.9), 1E-5);
    assertEquals(0.0036911, BesselK.k0(5.0), 1E-5);
    assertEquals(0.0033083, BesselK.k0(5.1), 1E-5);
    assertEquals(0.0000628, BesselK.k0(8.8), 1E-5);
    assertEquals(0.0000565, BesselK.k0(8.9), 1E-5);
    assertEquals(0.0000244, BesselK.k0(9.7), 1E-5);
    assertEquals(0.0000219, BesselK.k0(9.8), 1E-5);
    assertEquals(0.0000197, BesselK.k0(9.9), 1E-5);
    assertEquals(0.0000178, BesselK.k0(10.0), 1E-5);
  }

  public void testk0exp() {
    assertEqualsLocal(Double.NaN, BesselK.k0exp(Double.NaN), 1E-12);
    assertEqualsLocal(Double.NaN, BesselK.k0exp(Double.NEGATIVE_INFINITY), 1E-12);

    for (double x = 0.0001; x < 900.0; x *= Math.PI) {
      assertEqualsLocal("x=" + x, BesselK.k0(x) * Math.exp(x), BesselK.k0exp(x), 1E-8);
      assertEqualsLocal("x=" + x, BesselK.k0(-x) * Math.exp(x), BesselK.k0exp(-x), 1E-8);
    }
  }

  public void testK1() {
    for (double x = 0.0; x > -100.0; x -= Math.PI) {
      assertEqualsLocal(Double.NaN, BesselK.k1(x), 0.0);
    }
    assertEquals(9.8538446, BesselK.k1(0.1), 1E-5);
    assertEquals(4.7759724, BesselK.k1(0.2), 1E-5);
    assertEquals(3.0559919, BesselK.k1(0.3), 1E-5);
    assertEquals(2.1843543, BesselK.k1(0.4), 1E-5);
    assertEquals(1.6564411, BesselK.k1(0.5), 1E-5);
    assertEquals(1.3028349, BesselK.k1(0.6), 1E-5);
    assertEquals(1.0502836, BesselK.k1(0.7), 1E-5);
    assertEquals(0.8617816, BesselK.k1(0.8), 1E-5);
    assertEquals(0.7165336, BesselK.k1(0.9), 1E-5);
    assertEquals(0.6019073, BesselK.k1(1.0), 1E-5);
    assertEquals(0.5097600, BesselK.k1(1.1), 1E-5);
    assertEquals(0.4345924, BesselK.k1(1.2), 1E-5);
    assertEquals(0.0949825, BesselK.k1(2.3), 1E-5);
    assertEquals(0.0837248, BesselK.k1(2.4), 1E-5);
    assertEquals(0.0013439, BesselK.k1(6.0), 1E-5);
    assertEquals(0.0006998, BesselK.k1(6.6), 1E-5);
    assertEquals(0.0000230, BesselK.k1(9.8), 1E-5);
    assertEquals(0.0000207, BesselK.k1(9.9), 1E-5);
    assertEquals(0.0000186, BesselK.k1(10.0), 1E-5);
  }

  public void testk1exp() {
    assertEqualsLocal(Double.NaN, BesselK.k1exp(Double.NaN), 1E-12);
    assertEqualsLocal(Double.NaN, BesselK.k1exp(Double.NEGATIVE_INFINITY), 1E-12);

    for (double x = 0.0001; x < 900.0; x *= Math.PI) {
      assertEqualsLocal("x=" + x, BesselK.k1(x) * Math.exp(x), BesselK.k1exp(x), 1E-8);
      assertEqualsLocal("x=" + x, BesselK.k1(-x) * Math.exp(x), BesselK.k1exp(-x), 1E-8);
    }
  }

  public void testK() {
    // k0 and k1 compliance
    for (double x = 0.0; x < 100.0; x += 0.3) {
      assertEqualsLocal(BesselK.k0(x), BesselK.k(0, x), 1E-12);
      assertEqualsLocal(BesselK.k1(x), BesselK.k(1, x), 1E-12);
    }
    // comparisons from Magma
    assertEquals(199.50396464211413930948942565611, BesselK.k(2, 0.1), 1E-8);
    assertEquals(49.51242928773286839411307508585, BesselK.k(2, 0.2), 1E-8);
    assertEquals(21.74574028359313056898168328523, BesselK.k(2, 0.3), 1E-8);
    assertEquals(12.0363012581878713047859841646700, BesselK.k(2, 0.4), 1E-8);
    assertEquals(7.55018355124086943656770555074, BesselK.k(2, 0.5), 1E-8);
    assertEquals(5.120305224449736545039033203608, BesselK.k(2, 0.6), 1E-8);
    assertEquals(3.66132996080915283854026960446, BesselK.k(2, 0.7), 1E-8);
    assertEquals(2.71980119144634653509375142664, BesselK.k(2, 0.8), 1E-8);
    assertEquals(2.079027149887387354440494964436, BesselK.k(2, 0.9), 1E-8);
    assertEquals(1.62483889863517748281070735756, BesselK.k(2, 1), 1E-8);
    assertEquals(1.292438804574144151150415372272, BesselK.k(2, 1.1), 1E-8);
    assertEquals(1.0428288720544520126206061103337, BesselK.k(2, 1.2), 1E-8);
    assertEquals(0.105616799485192332253663818493, BesselK.k(2, 2.6), 1E-8);
    assertEquals(0.092024585328059034987781767163, BesselK.k(2, 2.7), 1E-8);
    assertEquals(0.00135107771912610972115831110733, BesselK.k(2, 6.2), 1E-8);
    assertEquals(0.00077315488076434359091827792632, BesselK.k(2, 6.7), 1E-8);
    assertEquals(0.000050648589291946075745280055555, BesselK.k(2, 9.2), 1E-8);
    assertEquals(0.0000454919681729289458367869243175, BesselK.k(2, 9.3), 1E-8);
    assertEquals(0.00000090274036171439343718709580430, BesselK.k(2, 13), 1E-8);
    assertEquals(0.00000081287961968401510562962824535, BesselK.k(2, 13.1), 1E-8);
    assertEquals(0.000000152698041345697687426719229295, BesselK.k(2, 14.7), 1E-8);
    assertEquals(0.000000137588420620251794596021067837, BesselK.k(2, 14.8), 1E-8);
    assertEquals(1, 7.101262824737944505980369331804 / BesselK.k(3, 1), 1E-8);
    assertEquals(1, 479600.249792568284850175009908050875 / BesselK.k(4, 0.1), 1E-8);
    assertEquals(1, 1197004.99168726060073310880389007772 / BesselK.k(5, 0.2), 1E-8);
    assertEquals(1, 157139.123371216684360328141929443300 / BesselK.k(5, 0.3), 1E-8);
    assertEquals(1, 930037.334160202082747674471027078232 / BesselK.k(6, 0.4), 1E-8);
    assertEquals(1, 242711.83461983827181665210626396980 / BesselK.k(6, 0.5), 1E-8);
    assertEquals(1, 548248.340858575139411144174189109987 / BesselK.k(7, 0.7), 1E-8);
    assertEquals(1, 213959.70390656500658711377933614572 / BesselK.k(7, 0.8), 1E-8);
    assertEquals(1, 93155.0468987683497581566165425874330 / BesselK.k(7, 0.9), 1E-8);
    assertEquals(1, 5243719041.99377160524101498372 / BesselK.k(9, 0.5), 1E-8);
    assertEquals(1, 1012785182.271915405104309520546192191492 / BesselK.k(9, 0.6), 1E-8);
    assertEquals(1, 188937569319.90025964462416308356 / BesselK.k(10, 0.5), 1E-8);
    assertEquals(1, 30421474101.75222525366220729806 / BesselK.k(10, 0.6), 1E-8);
    assertEquals(1, 6488530925.93006908184171023924 / BesselK.k(10, 0.7), 1E-8);
    assertEquals(1, 1699890249.90066163724535003697198830285 / BesselK.k(10, 0.8), 1E-8);
    assertEquals(1, 521014675.69556117121458789766762741135 / BesselK.k(10, 0.9), 1E-8);
    assertEquals(1, 180713289.90102945469159785117760266132 / BesselK.k(10, 1), 1E-8);
  }


}

