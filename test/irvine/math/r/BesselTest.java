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
public class BesselTest extends TestCase {

  public void testI0() {
    assertEqualsLocal(Double.NaN, Bessel.i0(Double.NaN), 1E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Bessel.i0(Double.POSITIVE_INFINITY), 1E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Bessel.i0(Double.NEGATIVE_INFINITY), 1E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Bessel.i0(Double.MAX_VALUE), 1E-12);
    assertEqualsLocal(1, Bessel.i0(0.0), 1E-12);
    // comparisons from method in Numerical Recipes
    assertEquals(1.002502, Bessel.i0(0.1), 1E-5);
    assertEquals(1.010025, Bessel.i0(0.2), 1E-5);
    assertEquals(1.022627, Bessel.i0(0.3), 1E-5);
    assertEquals(1.040402, Bessel.i0(0.4), 1E-5);
    assertEquals(1.063483, Bessel.i0(0.5), 1E-5);
    assertEquals(1.092045, Bessel.i0(0.6), 1E-5);
    assertEquals(11.301922, Bessel.i0(4.0), 1E-5);
    assertEquals(12.323569, Bessel.i0(4.1), 1E-5);
    assertEquals(13.442454, Bessel.i0(4.2), 1E-5);
    assertEquals(14.667975, Bessel.i0(4.3), 1E-5);
    assertEquals(16.010437, Bessel.i0(4.4), 1E-5);
    assertEquals(96.961647, Bessel.i0(6.4), 1E-3);
    assertEquals(106.292854, Bessel.i0(6.5), 1E-3);
    assertEquals(116.537315, Bessel.i0(6.6), 1E-3);
    assertEquals(127.785309, Bessel.i0(6.7), 1E-3);
    assertEquals(140.136185, Bessel.i0(6.8), 1E-3);
    assertEquals(153.699005, Bessel.i0(6.9), 1E-3);
    assertEquals(2560.962402, Bessel.i0(9.9), 1E-3);
    assertEquals(7288.489258, Bessel.i0(11.0), 1.0);
    assertEquals(8017.754883, Bessel.i0(11.1), 1.0);
    assertEquals(65970.500000, Bessel.i0(13.3), 1.0);
    assertEquals(308375.468750, Bessel.i0(14.9), 1.0);

    /* positive should equal negative */
    for (double x = 1.0; x < 1E308; x *= Math.PI) {
      assertEqualsLocal(Bessel.i0(x), Bessel.i0(-x), 1E-12);
    }
  }

  public void testI0exp() {
    assertEqualsLocal(Double.NaN, Bessel.i0exp(Double.NaN), 1E-12);

    for (double x = 0.0001; x < 900.0; x *= Math.PI) {
      assertEqualsLocal("x=" + x, Bessel.i0(x) * Math.exp(-x), Bessel.i0exp(x), 1E-12);
      assertEqualsLocal("x=" + x, Bessel.i0(-x) * Math.exp(-x), Bessel.i0exp(-x), 1E-12);
    }
  }


  public void testI1() {
    assertEqualsLocal(Double.NaN, Bessel.i1(Double.NaN), 1E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Bessel.i1(Double.POSITIVE_INFINITY), 1E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Bessel.i1(Double.NEGATIVE_INFINITY), 1E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Bessel.i1(Double.MAX_VALUE), 1E-12);
    assertEqualsLocal(0, Bessel.i1(0.0), 1E-12);
    assertEquals(0.050063, Bessel.i1(0.1), 1E-5);
    assertEquals(0.100501, Bessel.i1(0.2), 1E-5);
    assertEquals(0.151694, Bessel.i1(0.3), 1E-5);
    assertEquals(1.448244, Bessel.i1(1.9), 1E-5);
    assertEquals(1.590637, Bessel.i1(2.0), 1E-5);
    assertEquals(1.745500, Bessel.i1(2.1), 1E-5);
    assertEquals(1.914095, Bessel.i1(2.2), 1E-5);
    assertEquals(2.097800, Bessel.i1(2.3), 1E-5);
    assertEquals(2.298124, Bessel.i1(2.4), 1E-5);
    assertEquals(6.792714, Bessel.i1(3.6), 1E-5);
    assertEquals(7.435746, Bessel.i1(3.7), 1E-5);
    assertEquals(8.140425, Bessel.i1(3.8), 1E-5);
    assertEquals(8.912788, Bessel.i1(3.9), 1E-5);
    assertEquals(9.759465, Bessel.i1(4.0), 1E-5);
    assertEquals(10.687741, Bessel.i1(4.1), 1E-5);
    assertEquals(11.705618, Bessel.i1(4.2), 1E-5);
    assertEquals(206.791718, Bessel.i1(7.3), 1E-3);
    assertEquals(227.175018, Bessel.i1(7.4), 1E-3);
    assertEquals(249.584366, Bessel.i1(7.5), 1E-3);
    assertEquals(274.222473, Bessel.i1(7.6), 1E-3);
    assertEquals(1507.878784, Bessel.i1(9.4), 1E-3);
    assertEquals(1658.453003, Bessel.i1(9.5), 1E-3);
    assertEquals(151302.859375, Bessel.i1(14.2), 1.0);
    assertEquals(166663.046875, Bessel.i1(14.3), 1.0);
    assertEquals(183586.375000, Bessel.i1(14.4), 1.0);
    assertEquals(202232.640625, Bessel.i1(14.5), 1.0);
    assertEquals(222777.437500, Bessel.i1(14.6), 1.0);
    assertEquals(245414.250000, Bessel.i1(14.7), 1.0);
    assertEquals(270357.000000, Bessel.i1(14.8), 1.0);
    assertEquals(297840.593750, Bessel.i1(14.9), 1.0);
    for (double x = 1.0; x < 1E308; x *= Math.PI) {
      assertEqualsLocal(-Bessel.i1(x), Bessel.i1(-x), 1E-12);
    }
  }

  public void testI1exp() {
    assertEqualsLocal(Double.NaN, Bessel.i1(Double.NaN), 1E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Bessel.i1(Double.POSITIVE_INFINITY), 1E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Bessel.i1(Double.NEGATIVE_INFINITY), 1E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Bessel.i1(Double.MAX_VALUE), 1E-12);
    assertEqualsLocal(0, Bessel.i1(0.0), 1E-12);

    for (double x = 0.0001; x < 900.0; x *= Math.PI) {
      assertEqualsLocal("x=" + x, Bessel.i1(x) * Math.exp(-x), Bessel.i1exp(x), 1E-12);
      assertEqualsLocal("x=" + x, Bessel.i1(-x) * Math.exp(-x), Bessel.i1exp(-x), 1E-12);
    }
  }

  public void testI() {
    assertEqualsLocal(Double.NaN, Bessel.i(-0.5, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Bessel.i(-Math.PI, -1.0), 0.0);

    // i0 cross check
    for (double x = 0.0; x < 10.0; x += 0.01) {
      assertEqualsLocal(Bessel.i0(x), Bessel.i(0, x), 1E-8);
    }
    // i1 cross check
    for (double x = 0.0; x < 10.0; x += 0.01) {
      assertEqualsLocal(Bessel.i1(x), Bessel.i(1, x), 1E-8);
    }
    // these tests only cover part of the function parameters
    assertEqualsLocal(0.01133461, Bessel.i(2, 0.3), 1E-4);
    assertEqualsLocal(0.04636528, Bessel.i(2, 0.6), 1E-4);
    assertEqualsLocal(0.10825972, Bessel.i(2, 0.9), 1E-4);
    assertEqualsLocal(0.20259570, Bessel.i(2, 1.2), 1E-4);
    assertEqualsLocal(0.33783460, Bessel.i(2, 1.5), 1E-4);
    assertEqualsLocal(4.25395393, Bessel.i(2, 3.6), 1E-4);
    assertEqualsLocal(5.79829836, Bessel.i(2, 3.9), 1E-4);
    assertEqualsLocal(7.86835003, Bessel.i(2, 4.2), 1E-4);
    assertEqualsLocal(10.64151764, Bessel.i(2, 4.5), 1E-4);
    assertEqualsLocal(46.78709412, Bessel.i(2, 6.0), 1E-4);
    assertEqualsLocal(62.71553040, Bessel.i(2, 6.3), 1E-4);
    assertEqualsLocal(84.02075195, Bessel.i(2, 6.6), 1E-4);
    assertEqualsLocal(112.51667023, Bessel.i(2, 6.9), 1E-4);
    assertEqualsLocal(646.17126465, Bessel.i(2, 8.7), 1E-2);
    assertEqualsLocal(864.49621582, Bessel.i(2, 9.0), 1E-2);
    assertEqualsLocal(1156.60058594, Bessel.i(2, 9.3), 1E-2);
    assertEqualsLocal(1547.44921875, Bessel.i(2, 9.6), 1E-2);
    assertEqualsLocal(2070.46606445, Bessel.i(2, 9.9), 1E-2);
    assertEqualsLocal(0.00000000, Bessel.i(3, 0.0), 1E-4);
    assertEqualsLocal(0.00056567, Bessel.i(3, 0.3), 1E-4);
    assertEqualsLocal(0.00460217, Bessel.i(3, 0.6), 1E-4);
    assertEqualsLocal(0.01597211, Bessel.i(3, 0.9), 1E-4);
    assertEqualsLocal(0.03935901, Bessel.i(3, 1.2), 1E-4);
    assertEqualsLocal(0.08077411, Bessel.i(3, 1.5), 1E-4);
    assertEqualsLocal(261.21972656, Bessel.i(3, 8.1), 1E-4);
    assertEqualsLocal(353.66729736, Bessel.i(3, 8.4), 1E-2);
    assertEqualsLocal(0.19720723, Bessel.i(4, 2.7), 1E-4);
    assertEqualsLocal(0.32570514, Bessel.i(4, 3.0), 1E-4);
    assertEqualsLocal(0.52053821, Bessel.i(4, 3.3), 1E-4);
    assertEqualsLocal(0.81045610, Bessel.i(4, 3.6), 1E-4);
    assertEqualsLocal(1.23550487, Bessel.i(4, 3.9), 1E-4);
    assertEqualsLocal(1.85127628, Bessel.i(4, 4.2), 1E-4);
    assertEqualsLocal(2.73472214, Bessel.i(4, 4.5), 1E-4);
    assertEqualsLocal(3.99207640, Bessel.i(4, 4.8), 1E-4);
    assertEqualsLocal(5.76966143, Bessel.i(4, 5.1), 1E-4);
    assertEqualsLocal(8.26861668, Bessel.i(4, 5.4), 1E-4);
    assertEqualsLocal(11.76490211, Bessel.i(4, 5.7), 1E-4);
    assertEqualsLocal(16.63655472, Bessel.i(4, 6.0), 1E-4);
    assertEqualsLocal(23.40064621, Bessel.i(4, 6.3), 1E-4);
    assertEqualsLocal(0.00015904, Bessel.i(5, 0.9), 1E-4);
    assertEqualsLocal(0.00068790, Bessel.i(5, 1.2), 1E-4);
    assertEqualsLocal(261.47930908, Bessel.i(5, 9.0), 1E-4);
    assertEqualsLocal(363.46734619, Bessel.i(5, 9.3), 1E-2);
    assertEqualsLocal(504.09164429, Bessel.i(5, 9.6), 1E-2);
    assertEqualsLocal(697.68603516, Bessel.i(5, 9.9), 1E-2);
    assertEqualsLocal(3.35577440, Bessel.i(6, 6.0), 1E-4);
    assertEqualsLocal(5.04266500, Bessel.i(6, 6.3), 1E-4);
    assertEqualsLocal(7.50644112, Bessel.i(6, 6.6), 1E-4);
    assertEqualsLocal(0.00002841, Bessel.i(7, 1.5), 1E-4);
    assertEqualsLocal(0.00010495, Bessel.i(7, 1.8), 1E-4);
    assertEqualsLocal(0.49537942, Bessel.i(7, 5.4), 1E-4);
    assertEqualsLocal(0.79510725, Bessel.i(7, 5.7), 1E-4);
    assertEqualsLocal(0.00000000, Bessel.i(8, 0.6), 1E-4);
    assertEqualsLocal(0.00000004, Bessel.i(8, 0.9), 1E-4);
    assertEqualsLocal(14.57120991, Bessel.i(8, 8.4), 1E-4);
    assertEqualsLocal(21.77696037, Bessel.i(8, 8.7), 1E-4);
    assertEqualsLocal(32.33716965, Bessel.i(8, 9.0), 1E-4);
    assertEqualsLocal(0.00075232, Bessel.i(9, 3.6), 1E-4);
    assertEqualsLocal(0.00163286, Bessel.i(9, 3.9), 1E-4);
    assertEqualsLocal(3.75332785, Bessel.i(9, 8.1), 1E-4);
    assertEqualsLocal(5.80457687, Bessel.i(9, 8.4), 1E-4);
    assertEqualsLocal(8.90144444, Bessel.i(9, 8.7), 1E-4);
    assertEqualsLocal(13.54546928, Bessel.i(9, 9.0), 1E-4);
    assertEqualsLocal(20.46665573, Bessel.i(9, 9.3), 1E-4);
    assertEqualsLocal(30.72313690, Bessel.i(9, 9.6), 1E-4);
    assertEqualsLocal(45.84284210, Bessel.i(9, 9.9), 1E-4);
  }


  public void testJ0() {
    assertEquals(0.997501562066, Bessel.j0(0.1), 1E-7);
  }

  public void testY0() {
    assertEqualsLocal(Double.NaN, Bessel.y0(Double.NaN), 1E-12);
    assertEqualsLocal(Double.NaN, Bessel.y0(Double.POSITIVE_INFINITY), 1E-12);
    assertEqualsLocal(Double.NaN, Bessel.y0(Double.NEGATIVE_INFINITY), 1E-12);
    assertEqualsLocal(Double.NaN, Bessel.y0(0.0), 1E-12);
    for (double x = 1.0; x < 1E308; x *= Math.PI) {
      assertEqualsLocal(Double.NaN, Bessel.y0(-x), 1E-12);
    }
    // comparisons from Numerical Recipes
    assertEquals(-1.5342386, Bessel.y0(0.1), 1E-5);
    assertEquals(-1.0811054, Bessel.y0(0.2), 1E-5);
    assertEquals(-0.8072736, Bessel.y0(0.3), 1E-5);
    assertEquals(-0.6060246, Bessel.y0(0.4), 1E-5);
    assertEquals(-0.4445187, Bessel.y0(0.5), 1E-5);
    assertEquals(-0.3085098, Bessel.y0(0.6), 1E-5);
    assertEquals(-0.1906649, Bessel.y0(0.7), 1E-5);
    assertEquals(-0.0868023, Bessel.y0(0.8), 1E-5);
    assertEquals(0.0056283, Bessel.y0(0.9), 1E-5);
    assertEquals(0.0882570, Bessel.y0(1.0), 1E-5);
    assertEquals(0.1621632, Bessel.y0(1.1), 1E-5);
    assertEquals(0.2280835, Bessel.y0(1.2), 1E-5);
    assertEquals(0.2865353, Bessel.y0(1.3), 1E-5);
    assertEquals(0.3378951, Bessel.y0(1.4), 1E-5);
    assertEquals(0.3824489, Bessel.y0(1.5), 1E-5);
    assertEquals(0.4204269, Bessel.y0(1.6), 1E-5);
    assertEquals(0.4520270, Bessel.y0(1.7), 1E-5);
    assertEquals(0.4774317, Bessel.y0(1.8), 1E-5);
    assertEquals(-0.3177464, Bessel.y0(5.8), 1E-5);
    assertEquals(-0.3043659, Bessel.y0(5.9), 1E-5);
    assertEquals(-0.2881947, Bessel.y0(6.0), 1E-5);
    assertEquals(-0.2694350, Bessel.y0(6.1), 1E-5);
    assertEquals(-0.2483100, Bessel.y0(6.2), 1E-5);
    assertEquals(-0.2250617, Bessel.y0(6.3), 1E-5);
    assertEquals(-0.1999486, Bessel.y0(6.4), 1E-5);
    assertEquals(-0.1732424, Bessel.y0(6.5), 1E-5);
    assertEquals(-0.1452262, Bessel.y0(6.6), 1E-5);
    assertEquals(-0.1161912, Bessel.y0(6.7), 1E-5);
    assertEquals(-0.0864338, Bessel.y0(6.8), 1E-5);
    assertEquals(-0.0562537, Bessel.y0(6.9), 1E-5);
    assertEquals(-0.0259497, Bessel.y0(7.0), 1E-5);
    assertEquals(0.0041817, Bessel.y0(7.1), 1E-5);
    assertEquals(0.0338503, Bessel.y0(7.2), 1E-5);
    assertEquals(0.0627739, Bessel.y0(7.3), 1E-5);
    assertEquals(0.2383359, Bessel.y0(9.1), 1E-5);
    assertEquals(0.2244937, Bessel.y0(9.2), 1E-5);
    assertEquals(0.2085700, Bessel.y0(9.3), 1E-5);
    assertEquals(0.1907440, Bessel.y0(9.4), 1E-5);
    assertEquals(0.1712106, Bessel.y0(9.5), 1E-5);
    assertEquals(0.1501801, Bessel.y0(9.6), 1E-5);
    assertEquals(0.1278748, Bessel.y0(9.7), 1E-5);
    assertEquals(0.1045270, Bessel.y0(9.8), 1E-5);
    assertEquals(0.0803774, Bessel.y0(9.9), 1E-5);
  }

  public void testJ1() {
    assertEqualsLocal(Double.NaN, Bessel.j1(Double.NaN), 1E-12);
    assertEqualsLocal(Double.NaN, Bessel.j1(Double.POSITIVE_INFINITY), 1E-12);
    assertEqualsLocal(Double.NaN, Bessel.j1(Double.NEGATIVE_INFINITY), 1E-12);
    assertEqualsLocal(0, Bessel.j1(0.0), 1E-12);
    // comparisons from Magma
    assertEquals(0.049937526036, Bessel.j1(0.1), 1E-8);
    assertEquals(0.099500832639, Bessel.j1(0.2), 1E-8);
    assertEquals(0.148318816273, Bessel.j1(0.3), 1E-8);
    assertEquals(0.196026577955, Bessel.j1(0.4), 1E-8);
    assertEquals(0.242268457675, Bessel.j1(0.5), 1E-8);
    assertEquals(0.286700988064, Bessel.j1(0.6), 1E-8);
    assertEquals(0.32899574154, Bessel.j1(0.7), 1E-8);
    assertEquals(0.368842046094, Bessel.j1(0.8), 1E-8);
    assertEquals(0.405949546079, Bessel.j1(0.9), 1E-8);
    assertEquals(0.440050585745, Bessel.j1(1), 1E-8);
    assertEquals(0.568292135757, Bessel.j1(2.1), 1E-8);
    assertEquals(0.555963049819, Bessel.j1(2.2), 1E-8);
    assertEquals(0.095465547178, Bessel.j1(3.6), 1E-8);
    assertEquals(0.053833987745, Bessel.j1(3.7), 1E-8);
    assertEquals(0.012821002927, Bessel.j1(3.8), 1E-8);
    assertEquals(-0.027244039621, Bessel.j1(3.9), 1E-8);
    assertEquals(-0.066043328024, Bessel.j1(4), 1E-8);
    assertEquals(-0.103273257747, Bessel.j1(4.1), 1E-8);
    assertEquals(-0.255864772558, Bessel.j1(6.1), 1E-8);
    assertEquals(-0.232916567073, Bessel.j1(6.2), 1E-8);
    assertEquals(-0.208086940207, Bessel.j1(6.3), 1E-8);
    assertEquals(-0.181637509024, Bessel.j1(6.4), 1E-8);
    assertEquals(-0.15384130141, Bessel.j1(6.5), 1E-8);
    assertEquals(-0.124980165161, Bessel.j1(6.6), 1E-8);
    assertEquals(-0.095342118041, Bessel.j1(6.7), 1E-8);
    assertEquals(-0.065218663402, Bessel.j1(6.8), 1E-8);
    assertEquals(-0.034902096105, Bessel.j1(6.9), 1E-8);
    assertEquals(-0.004682823482, Bessel.j1(7), 1E-8);
    assertEquals(0.025153274254, Bessel.j1(7.1), 1E-8);
    assertEquals(0.054327420222, Bessel.j1(7.2), 1E-8);
    assertEquals(0.082570430493, Bessel.j1(7.3), 1E-8);
    assertEquals(0.109625094854, Bessel.j1(7.4), 1E-8);
    assertEquals(0.13524842758, Bessel.j1(7.5), 1E-8);
    assertEquals(0.159213768396, Bessel.j1(7.6), 1E-8);
    assertEquals(0.181312715325, Bessel.j1(7.7), 1E-8);
    assertEquals(0.201356872756, Bessel.j1(7.8), 1E-8);
    assertEquals(0.219179399922, Bessel.j1(7.9), 1E-8);
    assertEquals(0.234636346854, Bessel.j1(8), 1E-8);
    assertEquals(0.247607766982, Bessel.j1(8.1), 1E-8);
    assertEquals(0.257998597649, Bessel.j1(8.2), 1E-8);
    assertEquals(0.265739302042, Bessel.j1(8.3), 1E-8);
    assertEquals(0.270786268277, Bessel.j1(8.4), 1E-8);
    assertEquals(0.273121963674, Bessel.j1(8.5), 1E-8);
    assertEquals(0.272754844546, Bessel.j1(8.6), 1E-8);
    assertEquals(0.269719024092, Bessel.j1(8.7), 1E-8);
    assertEquals(0.26407370324, Bessel.j1(8.8), 1E-8);
    assertEquals(0.043472746169, Bessel.j1(10), 1E-8);
    assertEquals(0.018395515458, Bessel.j1(10.1), 1E-8);
    assertEquals(-0.006615743298, Bessel.j1(10.2), 1E-8);
    assertEquals(-0.031317829476, Bessel.j1(10.3), 1E-8);
    assertEquals(-0.055472761849, Bessel.j1(10.4), 1E-8);
    assertEquals(-0.078850014227, Bessel.j1(10.5), 1E-8);
    assertEquals(-0.101228662586, Bessel.j1(10.6), 1E-8);
    assertEquals(-0.122399423927, Bessel.j1(10.7), 1E-8);
    assertEquals(-0.142166568299, Bessel.j1(10.8), 1E-8);
    assertEquals(-0.194258848041, Bessel.j1(12.3), 1E-8);
    assertEquals(-0.180710246883, Bessel.j1(12.4), 1E-8);
    assertEquals(-0.165483804615, Bessel.j1(12.5), 1E-8);
    assertEquals(-0.148742343422, Bessel.j1(12.6), 1E-8);
    assertEquals(-0.130662229004, Bessel.j1(12.7), 1E-8);
    assertEquals(-0.111431559278, Bessel.j1(12.8), 1E-8);
    assertEquals(-0.09124825225, Bessel.j1(12.9), 1E-8);
    assertEquals(0.193429463596, Bessel.j1(14.5), 1E-8);
    assertEquals(0.199852651447, Bessel.j1(14.6), 1E-8);
    assertEquals(0.20425126833, Bessel.j1(14.7), 1E-8);
    assertEquals(0.20659556718, Bessel.j1(14.8), 1E-8);
    assertEquals(0.20687617181, Bessel.j1(14.9), 1E-8);
    assertEquals(0.205104038614, Bessel.j1(15), 1E-8);
    for (double x = 1.0; x < 1E300; x *= Math.PI) {
      assertEqualsLocal("x=" + x, Bessel.j1(x), -Bessel.j1(-x), 1E-12);
    }
  }

  public void testY1() {
    assertEqualsLocal(Double.NaN, Bessel.y1(Double.NaN), 1E-12);
    assertEqualsLocal(Double.NaN, Bessel.y1(Double.POSITIVE_INFINITY), 1E-12);
    assertEqualsLocal(Double.NaN, Bessel.y1(Double.NEGATIVE_INFINITY), 1E-12);
    assertEqualsLocal(Double.NaN, Bessel.y1(0.0), 1E-12);
    for (double x = 1.0; x < 1E308; x *= Math.PI) {
      assertEqualsLocal(Double.NaN, Bessel.y1(-x), 1E-12);
    }
    // comparisons from Numerical Recipes
    assertEquals(-6.4589510, Bessel.y1(0.1), 1E-5);
    assertEquals(-3.3238249, Bessel.y1(0.2), 1E-5);
    assertEquals(-0.2236649, Bessel.y1(1.8), 1E-5);
    assertEquals(-0.1644058, Bessel.y1(1.9), 1E-5);
    assertEquals(-0.1070324, Bessel.y1(2.0), 1E-5);
    assertEquals(-0.0516787, Bessel.y1(2.1), 1E-5);
    assertEquals(0.0014878, Bessel.y1(2.2), 1E-5);
    assertEquals(0.0522773, Bessel.y1(2.3), 1E-5);
    assertEquals(0.1004890, Bessel.y1(2.4), 1E-5);
    assertEquals(0.1459181, Bessel.y1(2.5), 1E-5);
    assertEquals(0.1478631, Bessel.y1(5.0), 1E-5);
    assertEquals(0.1137365, Bessel.y1(5.1), 1E-5);
    assertEquals(0.0791904, Bessel.y1(5.2), 1E-5);
    assertEquals(0.0445476, Bessel.y1(5.3), 1E-5);
    assertEquals(0.0101272, Bessel.y1(5.4), 1E-5);
    assertEquals(-0.1072408, Bessel.y1(8.2), 1E-5);
    assertEquals(-0.0805975, Bessel.y1(8.3), 1E-5);
    assertEquals(-0.0534846, Bessel.y1(8.4), 1E-5);
    assertEquals(-0.0261687, Bessel.y1(8.5), 1E-5);
    assertEquals(0.0010841, Bessel.y1(8.6), 1E-5);
    assertEquals(0.0280109, Bessel.y1(8.7), 1E-5);
    assertEquals(0.0543556, Bessel.y1(8.8), 1E-5);
    assertEquals(0.0798693, Bessel.y1(8.9), 1E-5);
    assertEquals(0.1043146, Bessel.y1(9.0), 1E-5);
    assertEquals(0.1274660, Bessel.y1(9.1), 1E-5);
    assertEquals(0.1491127, Bessel.y1(9.2), 1E-5);
    assertEquals(0.1690613, Bessel.y1(9.3), 1E-5);
    assertEquals(0.1871356, Bessel.y1(9.4), 1E-5);
    assertEquals(0.2031799, Bessel.y1(9.5), 1E-5);
    assertEquals(0.2170590, Bessel.y1(9.6), 1E-5);
    assertEquals(0.2286600, Bessel.y1(9.7), 1E-5);
    assertEquals(0.2378933, Bessel.y1(9.8), 1E-5);
    assertEquals(0.2446924, Bessel.y1(9.9), 1E-5);
  }

  public void testJ() {
    // comparisons from magma
    assertEquals(2.32661479e-8, Bessel.j(-10, Constants.HALF_PI), 1E-8);
    assertEquals(0.2518929403260009457267700620, Bessel.j(0.5, 0.1), 1E-8);
  }

  public void testY() {
    // y0 and y1 compliance
    for (double x = 0.0; x < 100.0; x += 0.3) {
      assertEqualsLocal(Bessel.y0(x), Bessel.y(0, x), 1E-12);
      assertEqualsLocal(Bessel.y1(x), Bessel.y(1, x), 1E-12);
    }
    // comparisons from Numerical Recipes
    assertEquals(0, (-127.644783 - Bessel.y(2, 0.1)) / (-127.644783 + Bessel.y(2, 0.1)), 1E-5);
    assertEquals(0, (-8.298335 - Bessel.y(2, 0.4)) / (-8.298335 + Bessel.y(2, 0.4)), 1E-5);
    assertEquals(0, (-2.961478 - Bessel.y(2, 0.7)) / (-2.961478 + Bessel.y(2, 0.7)), 1E-5);
    assertEquals(0, (-1.650683 - Bessel.y(2, 1.0)) / (-1.650683 + Bessel.y(2, 1.0)), 1E-5);
    assertEquals(0, (-1.130412 - Bessel.y(2, 1.3)) / (-1.130412 + Bessel.y(2, 1.3)), 1E-5);
    assertEquals(0, (-0.854899 - Bessel.y(2, 1.6)) / (-0.854899 + Bessel.y(2, 1.6)), 1E-5);
    assertEquals(0, (-0.669879 - Bessel.y(2, 1.9)) / (-0.669879 + Bessel.y(2, 1.9)), 1E-5);
    assertEquals(0, (-0.519432 - Bessel.y(2, 2.2)) / (-0.519432 + Bessel.y(2, 2.2)), 1E-5);
    assertEquals(0, (-0.381336 - Bessel.y(2, 2.5)) / (-0.381336 + Bessel.y(2, 2.5)), 1E-5);
    assertEquals(0, (-0.247669 - Bessel.y(2, 2.8)) / (-0.247669 + Bessel.y(2, 2.8)), 1E-5);
    assertEquals(0, (-0.117536 - Bessel.y(2, 3.1)) / (-0.117536 + Bessel.y(2, 3.1)), 1E-5);
    assertEquals(0, (0.006276 - Bessel.y(2, 3.4)) / (0.006276 + Bessel.y(2, 3.4)), 1E-5);
    assertEquals(0, (0.119155 - Bessel.y(2, 3.7)) / (0.119155 + Bessel.y(2, 3.7)), 1E-5);
    assertEquals(0, (0.215904 - Bessel.y(2, 4.0)) / (0.215904 + Bessel.y(2, 4.0)), 1E-5);
    assertEquals(0, (0.203923 - Bessel.y(2, 6.1)) / (0.203923 + Bessel.y(2, 6.1)), 1E-5);
    assertEquals(0, (0.118836 - Bessel.y(2, 6.4)) / (0.118836 + Bessel.y(2, 6.4)), 1E-5);
    assertEquals(0, (0.028293 - Bessel.y(2, 6.7)) / (0.028293 + Bessel.y(2, 6.7)), 1E-5);
    assertEquals(0, (-0.060527 - Bessel.y(2, 7.0)) / (-0.060527 + Bessel.y(2, 7.0)), 1E-5);
    assertEquals(0, (-0.287858 - Bessel.y(3, 3.7)) / (-0.287858 + Bessel.y(3, 3.7)), 1E-5);
    assertEquals(0, (-0.182022 - Bessel.y(3, 4.0)) / (-0.182022 + Bessel.y(3, 4.0)), 1E-5);
    assertEquals(0, (-0.077101 - Bessel.y(3, 4.3)) / (-0.077101 + Bessel.y(3, 4.3)), 1E-5);
    assertEquals(0, (0.024063 - Bessel.y(3, 4.6)) / (0.024063 + Bessel.y(3, 4.6)), 1E-5);
    assertEquals(0, (0.207474 - Bessel.y(3, 7.3)) / (0.207474 + Bessel.y(3, 7.3)), 1E-5);
    assertEquals(0, (0.134210 - Bessel.y(3, 7.6)) / (0.134210 + Bessel.y(3, 7.6)), 1E-5);
    assertEquals(0, (0.053860 - Bessel.y(3, 7.9)) / (0.053860 + Bessel.y(3, 7.9)), 1E-5);
    assertEquals(0, (-0.027527 - Bessel.y(3, 8.2)) / (-0.027527 + Bessel.y(3, 8.2)), 1E-5);
    assertEquals(0, (0.137890 - Bessel.y(4, 8.8)) / (0.137890 + Bessel.y(4, 8.8)), 1E-5);
    assertEquals(0, (0.065323 - Bessel.y(4, 9.1)) / (0.065323 + Bessel.y(4, 9.1)), 1E-5);
    assertEquals(0, (-3.830177 - Bessel.y(5, 2.5)) / (-3.830177 + Bessel.y(5, 2.5)), 1E-5);
    assertEquals(0, (-2.454762 - Bessel.y(5, 2.8)) / (-2.454762 + Bessel.y(5, 2.8)), 1E-5);
    assertEquals(0, (-2445842688.000000 - Bessel.y(6, 0.1)) / (-2445842688.000000 + Bessel.y(6, 0.1)), 1E-5);
    assertEquals(0, (-601629.562500 - Bessel.y(6, 0.4)) / (-601629.562500 + Bessel.y(6, 0.4)), 1E-5);
    assertEquals(0, (-21295.917969 - Bessel.y(6, 0.7)) / (-21295.917969 + Bessel.y(6, 0.7)), 1E-5);
    assertEquals(0, (-2570.780518 - Bessel.y(6, 1.0)) / (-2570.780518 + Bessel.y(6, 1.0)), 1E-5);
    assertEquals(0, (-551.636047 - Bessel.y(6, 1.3)) / (-551.636047 + Bessel.y(6, 1.3)), 1E-5);
    assertEquals(0, (0.143995 - Bessel.y(6, 8.5)) / (0.143995 + Bessel.y(6, 8.5)), 1E-5);
    assertEquals(0, (0.282227 - Bessel.y(6, 9.7)) / (0.282227 + Bessel.y(6, 9.7)), 1E-5);
    assertEquals(0, (-0.344378 - Bessel.y(7, 7.3)) / (-0.344378 + Bessel.y(7, 7.3)), 1E-5);
    assertEquals(0, (-0.283481 - Bessel.y(7, 7.6)) / (-0.283481 + Bessel.y(7, 7.6)), 1E-5);
    assertEquals(0, (-144.857956 - Bessel.y(8, 2.8)) / (-144.857956 + Bessel.y(8, 2.8)), 1E-5);
    assertEquals(0, (-3.172769 - Bessel.y(8, 4.9)) / (-3.172769 + Bessel.y(8, 4.9)), 1E-5);
    assertEquals(0, (-0.992195 - Bessel.y(9, 7.0)) / (-0.992195 + Bessel.y(9, 7.0)), 1E-5);
    assertEquals(0, (-0.252556 - Bessel.y(9, 9.7)) / (-0.252556 + Bessel.y(9, 9.7)), 1E-5);
    assertEquals(0, (-51.438896 - Bessel.y(10, 4.6)) / (-51.438896 + Bessel.y(10, 4.6)), 1E-5);
    assertEquals(0, (-56626627215360.000000 - Bessel.y(11, 0.4)) / (-56626627215360.000000 + Bessel.y(11, 0.4)), 1E-5);
    assertEquals(0, (-23.000099 - Bessel.y(11, 5.8)) / (-23.000099 + Bessel.y(11, 5.8)), 1E-5);
    assertEquals(0, (-4522025.000000 - Bessel.y(12, 2.2)) / (-4522025.000000 + Bessel.y(12, 2.2)), 1E-5);
    assertEquals(0, (-1275362148352.000000 - Bessel.y(13, 1.0)) / (-1275362148352.000000 + Bessel.y(13, 1.0)), 1E-5);
    assertEquals(0, (-1.712779 - Bessel.y(13, 9.7)) / (-1.712779 + Bessel.y(13, 9.7)), 1E-5);
    assertEquals(0, (-3248133982176726859944820736.000000 - Bessel.y(14, 0.1)) / (-3248133982176726859944820736.000000 + Bessel.y(14, 0.1)), 1E-5);
    assertEquals(0, (-3.659896 - Bessel.y(14, 9.7)) / (-3.659896 + Bessel.y(14, 9.7)), 1E-5);
  }

  public void testY2() {
    // NOTE THIS NEEDS SOME NON-INTEGER TESTS

    // check against integer cases
    for (int v = 0; v < 100.0; ++v) {
      for (double x = 0.1; x < 5.0; x += 0.3) {
        assertEquals(1, Bessel.y(v, x) / Bessel.y((double) v, x), 1E-6);
      }
    }
  }


  public void testK0() {
    assertEquals(2.4270692, Bessel.k0(0.1), 1E-5);
    assertEqualsLocal(Double.NaN, Bessel.k0exp(Double.NaN), 1E-12);
    assertEquals(9.8538446, Bessel.k1(0.1), 1E-5);
    assertEqualsLocal(Double.NaN, Bessel.k1exp(Double.NaN), 1E-12);
    assertEquals(199.50396464211413930948942565611, Bessel.k(2, 0.1), 1E-8);
  }


}

