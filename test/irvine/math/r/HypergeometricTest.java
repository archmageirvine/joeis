package irvine.math.r;

import static irvine.TestUtils.assertEqualsLocal;
import static irvine.math.r.Hypergeometric.hypergeometric;
import static irvine.math.r.Hypergeometric.hypergeometric21;
import static irvine.math.r.Hypergeometric.hypergeometric12;
import static irvine.math.r.Hypergeometric.hypergeometric30;

import junit.framework.TestCase;

/**
 * Tests mathematical functions. Many of the explicit values given here in
 * the tests were computed using the independent Magma number theory
 * package.
 *
 * @author Sean A. Irvine
 */
public class HypergeometricTest extends TestCase {

  // The hypergeometric functions are very complex and there is a very wide
  // scope for possible arguments. These test cases were produced using the
  // independent code provided in Numerical Recipes in C, but should not
  // be considered as very rigorous.

  public void testHyp1() {
    assertEquals(1.00000000, hypergeometric21(0.1, 0.1, 0.1, 0.0), 1E-5);
    assertEquals(1.01059175, hypergeometric21(0.1, 0.1, 0.1, 0.1), 1E-5);
    assertEquals(1.02256513, hypergeometric21(0.1, 0.1, 0.1, 0.2), 1E-5);
    assertEquals(1.03631115, hypergeometric21(0.1, 0.1, 0.1, 0.3), 1E-5);
    assertEquals(1.05241001, hypergeometric21(0.1, 0.1, 0.1, 0.4), 1E-5);
    assertEquals(1.07177341, hypergeometric21(0.1, 0.1, 0.1, 0.5), 1E-5);
    assertEquals(1.09595799, hypergeometric21(0.1, 0.1, 0.1, 0.6), 1E-5);
    assertEquals(1.12794483, hypergeometric21(0.1, 0.1, 0.1, 0.7), 1E-5);
    assertEquals(1.11590827, hypergeometric21(0.1, 0.1, 0.2, 0.9), 1E-5);
    assertEquals(1.00000000, hypergeometric21(0.1, 0.1, 0.3, 0.0), 1E-5);
    assertEquals(1.00349903, hypergeometric21(0.1, 0.1, 0.3, 0.1), 1E-5);
    assertEquals(1.00738001, hypergeometric21(0.1, 0.1, 0.3, 0.2), 1E-5);
    assertEquals(1.01174045, hypergeometric21(0.1, 0.1, 0.3, 0.3), 1E-5);
    assertEquals(1.05233693, hypergeometric21(0.1, 0.3, 0.4, 0.5), 1E-5);
    assertEquals(1.00447738, hypergeometric21(0.1, 0.3, 0.7, 0.1), 1E-5);
    assertEquals(1.00939226, hypergeometric21(0.1, 0.3, 0.7, 0.2), 1E-5);
    assertEquals(1.02709675, hypergeometric21(0.1, 0.3, 0.9, 0.6), 1E-5);
    assertEquals(1.13679779, hypergeometric21(0.1, 0.6, 0.9, 0.9), 1E-4);
    assertEquals(1.00000000, hypergeometric21(0.1, 0.7, 0.1, 0.0), 1E-4);
    assertEquals(1.25892448, hypergeometric21(0.1, 0.9, 0.9, 0.9), 1E-4);
  }

  public void testHyp2() {
    assertEquals(1.00000000, hypergeometric21(0.2, 0.1, 0.1, 0.0), 1E-4);
    assertEquals(1.02129555, hypergeometric21(0.2, 0.1, 0.1, 0.1), 1E-4);
    assertEquals(1.04563963, hypergeometric21(0.2, 0.1, 0.1, 0.2), 1E-4);
    assertEquals(1.00000000, hypergeometric21(0.2, 0.8, 0.7, 0.0), 1E-4);
    assertEquals(1.45353734, hypergeometric21(0.2, 0.9, 0.1, 0.2), 1E-4);
    assertEquals(1.23403490, hypergeometric21(0.2, 0.9, 0.8, 0.6), 1E-4);
    assertEquals(1.32061303, hypergeometric21(0.2, 0.9, 0.8, 0.7), 1E-4);
  }

  public void testHyp3() {
    assertEquals(1.00000000, hypergeometric21(0.3, 0.1, 0.1, 0.0), 1E-4);
    assertEquals(1.03211296, hypergeometric21(0.3, 0.1, 0.1, 0.1), 1E-4);
    assertEquals(1.12151277, hypergeometric21(0.3, 0.4, 0.7, 0.5), 1E-4);
    assertEquals(1.16165197, hypergeometric21(0.3, 0.4, 0.7, 0.6), 1E-4);
    assertEquals(3.93797612, hypergeometric21(0.3, 0.5, 0.1, 0.7), 1E-4);
    assertEquals(5.67206526, hypergeometric21(0.3, 0.5, 0.1, 0.8), 1E-4);
    assertEquals(1.02799106, hypergeometric21(0.3, 0.7, 0.8, 0.1), 1E-4);
    assertEquals(1.16561353, hypergeometric21(0.3, 0.9, 0.9, 0.4), 1E-4);
    assertEquals(1.99525964, hypergeometric21(0.3, 0.9, 0.9, 0.9), 1E-4);
  }

  public void testHyp4() {
    assertEquals(1.00000000, hypergeometric21(0.4, 0.1, 0.1, 0.0), 1E-4);
    assertEquals(1.04304481, hypergeometric21(0.4, 0.1, 0.1, 0.1), 1E-4);
    assertEquals(1.09336221, hypergeometric21(0.4, 0.1, 0.1, 0.2), 1E-4);
    assertEquals(10.77092075, hypergeometric21(0.4, 0.4, 0.1, 0.9), 1E-4);
    assertEquals(1.61864376, hypergeometric21(0.4, 0.5, 0.5, 0.7), 1E-4);
    assertEquals(1.50093865, hypergeometric21(0.4, 0.6, 0.2, 0.3), 1E-4);
    assertEquals(1.76923728, hypergeometric21(0.4, 0.6, 0.2, 0.4), 1E-4);
    assertEquals(2.51188397, hypergeometric21(0.4, 0.9, 0.9, 0.9), 1E-4);
  }

  public void testHyp5() {
    assertEquals(1.00000000, hypergeometric21(0.5, 0.1, 0.1, 0.0), 1E-4);
    assertEquals(1.04304481, hypergeometric21(0.5, 0.4, 0.5, 0.1), 1E-4);
    assertEquals(2.28110933, hypergeometric21(0.5, 0.9, 0.5, 0.6), 1E-4);
  }

  public void testHyp6() {
    assertEquals(1.00000000, hypergeometric21(0.6, 0.1, 0.1, 0.0), 1E-4);
    assertEquals(121.06608582, hypergeometric21(0.6, 0.9, 0.1, 0.9), 1E-2);
    assertEquals(3.98106217, hypergeometric21(0.6, 0.9, 0.9, 0.9), 1E-4);
  }

  public void testHyp7() {
    assertEquals(1.00000000, hypergeometric21(0.7, 0.1, 0.1, 0.0), 1E-4);
    assertEquals(1.58489120, hypergeometric21(0.7, 0.2, 0.7, 0.9), 1E-4);
    assertEquals(29.48426247, hypergeometric21(0.7, 0.4, 0.1, 0.9), 1E-3);
    assertEquals(44.30445099, hypergeometric21(0.7, 0.5, 0.1, 0.9), 1E-3);
    assertEquals(3.17913580, hypergeometric21(0.7, 0.6, 0.3, 0.6), 1E-4);
    assertEquals(4.42162037, hypergeometric21(0.7, 0.6, 0.3, 0.7), 1E-4);
  }

  public void testHyp8() {
    assertEquals(1.05819988, hypergeometric21(0.8, 0.2, 0.3, 0.1), 1E-4);
    assertEquals(1.47327316, hypergeometric21(0.8, 0.9, 0.4, 0.2), 1E-4);
    assertEquals(1.83696198, hypergeometric21(0.8, 0.9, 0.4, 0.3), 1E-4);
    assertEquals(3.62389731, hypergeometric21(0.8, 0.9, 0.9, 0.8), 1E-4);
    assertEquals(6.30956125, hypergeometric21(0.8, 0.9, 0.9, 0.9), 1E-4);
  }

  public void testHyp9() {
    assertEquals(1.09946597, hypergeometric21(0.9, 0.1, 0.1, 0.1), 1E-4);
    assertEquals(1.15005863, hypergeometric21(0.9, 0.1, 0.8, 0.7), 1E-4);
    assertEquals(1.20813870, hypergeometric21(0.9, 0.1, 0.8, 0.8), 1E-4);
    assertEquals(4.83560705, hypergeometric21(0.9, 0.2, 0.3, 0.9), 1E-4);
    assertEquals(53.22185135, hypergeometric21(0.9, 0.4, 0.1, 0.9), 1E-3);
    assertEquals(174.68730164, hypergeometric21(0.9, 0.7, 0.1, 0.9), 1E-3);
    assertEquals(11.75381088, hypergeometric21(0.9, 0.8, 0.4, 0.8), 1E-4);
    assertEquals(30.32771873, hypergeometric21(0.9, 0.8, 0.4, 0.9), 1E-4);
  }

  public void testHypExtreme() {
    assertEquals(1.00466522, hypergeometric21(0.9, 0.1, 2, 0.1), 1E-4);
    assertEquals(Double.POSITIVE_INFINITY, hypergeometric21(0.9, 0.1, -2, 0.7), 1E-4);
    assertEquals(1.0, hypergeometric21(-2, -2, -1.5, 1), 1E-4);
  }

  public void testConfluentHypergeometric() {
    // The hypergeometric functions are very complex and there is a very wide
    // scope for possible arguments. These test cases were produced using the
    // independent code provided in Numerical Recipes in C, but should not
    // be considered as very rigorous.
    assertEquals(1.105170918075647624811707826258, hypergeometric(0.1, 0.1, 0.1), 1E-12);
    assertEquals(1.221402758160169833921071994393, hypergeometric(0.1, 0.1, 0.2), 1E-12);
    assertEquals(1.349858807576003103983744313055, hypergeometric(0.1, 0.1, 0.3), 1E-12);
    assertEquals(1.491824697641270317824852952580, hypergeometric(0.1, 0.1, 0.4), 1E-12);
    assertEquals(1.64872127070012814684865078750, hypergeometric(0.1, 0.1, 0.5), 1E-12);
    assertEquals(1.82211880039050897487536766777, hypergeometric(0.1, 0.1, 0.6), 1E-12);
    assertEquals(2.0137527074704765216245493878911, hypergeometric(0.1, 0.1, 0.7), 1E-12);
    assertEquals(1.299389313469805993588466644011, hypergeometric(0.1, 0.5, 1), 1E-12);
    assertEquals(1.0172553460822537198440826175233, hypergeometric(0.1, 0.6, 0.1), 1E-12);
    assertEquals(1.0357539057047563875097703200388, hypergeometric(0.1, 0.6, 0.2), 1E-12);
    assertEquals(1.0556011197107903655233892710508, hypergeometric(0.1, 0.6, 0.3), 1E-12);
    assertEquals(1.114176033596322369912114308248, hypergeometric(0.1, 0.9, 0.8), 1E-12);
    assertEquals(1.132899274454937632516579326259, hypergeometric(0.1, 0.9, 0.9), 1E-12);
    assertEquals(1.152881953489862291673258705962, hypergeometric(0.1, 0.9, 1), 1E-12);
    assertEquals(1.0614054047351452704332200852203, hypergeometric(0.2, 0.7, 0.2), 1E-12);
    assertEquals(1.095580073057197082840598746098, hypergeometric(0.2, 0.7, 0.3), 1E-12);
    assertEquals(2.0594916082274799669494850362521, hypergeometric(0.3, 0.4, 0.9), 1E-12);
    assertEquals(2.242716874440587563833313693963, hypergeometric(0.3, 0.4, 1), 1E-12);
    assertEquals(4.144647433694409527769832612222, hypergeometric(0.4, 0.2, 0.9), 1E-12);
    assertEquals(4.73198598151041283034836616530, hypergeometric(0.4, 0.2, 1), 1E-12);
    assertEquals(1.64621903094936646049271977437, hypergeometric(0.4, 0.6, 0.7), 1E-12);
    assertEquals(1.77614793903525308521823194680, hypergeometric(0.4, 0.6, 0.8), 1E-12);
    assertEquals(1.59674258069408657631109006002, hypergeometric(0.5, 0.3, 0.3), 1E-12);
    assertEquals(1.84538667936326124228537545747, hypergeometric(0.5, 0.3, 0.4), 1E-12);
    assertEquals(1.404690373313338926422505956350, hypergeometric(0.5, 0.6, 0.4), 1E-12);
    assertEquals(1.53207729716317734388562765021, hypergeometric(0.5, 0.6, 0.5), 1E-12);
    assertEquals(3.72312110570279255320714749119, hypergeometric(0.6, 0.2, 0.6), 1E-12);
    assertEquals(4.412749390833215403600709080833, hypergeometric(0.6, 0.2, 0.7), 1E-12);
    assertEquals(1.75647987835862498423257428767, hypergeometric(0.7, 0.1, 0.1), 1E-12);
    assertEquals(2.63606853568025888821862924319, hypergeometric(0.7, 0.1, 0.2), 1E-12);
    assertEquals(1.55963602537559488417094523729, hypergeometric(0.7, 0.8, 0.5), 1E-12);
    assertEquals(1.70717248846299472085865449002, hypergeometric(0.7, 0.8, 0.6), 1E-12);
    assertEquals(1.298939101492602711529635497249, hypergeometric(0.8, 0.6, 0.2), 1E-12);
    assertEquals(1.475382693153627005830681830627, hypergeometric(0.8, 0.6, 0.3), 1E-12);
    assertEquals(2.248691091450241797419310616491, hypergeometric(0.9, 0.5, 0.5), 1E-12);
    assertEquals(2.60385147451330049454895413373, hypergeometric(0.9, 0.5, 0.6), 1E-12);
    assertEquals(4.82026388939872743235371459291, hypergeometric(1, 0.2, 0.5), 1E-12);
    assertEquals(5.99815095909378174415607782973, hypergeometric(1, 0.2, 0.6), 1E-12);
    assertEquals(1.105170918075647624811707826258, hypergeometric(1, 1, 0.1), 1E-12);
    assertEquals(1.221402758160169833921071994393, hypergeometric(1, 1, 0.2), 1E-12);
    assertEquals(2.459603111156949663800126562934, hypergeometric(1, 1, 0.9), 1E-12);
    assertEquals(2.71828182845904523536028747058, hypergeometric(1, 1, 1), 1E-12);
  }
  
  public void testKummer() {
    assertEquals(2.718145931, hypergeometric(10000, 10000.5, 1), 1E-6);
  }

  public void testHypergeometric12() {
    assertEqualsLocal(Double.NaN, hypergeometric12(1.0, 0.0, 0.0, 0.0), 1E-6);
    assertEqualsLocal(Double.NaN, hypergeometric12(1.0, 0.0, 0.0, 1.0), 1E-6);
    assertEqualsLocal(Double.NaN, hypergeometric12(1.0, 0.0, 0.0, 0.5), 1E-6);
    assertEqualsLocal(Double.NaN, hypergeometric12(1.0, 0.0, 1.0, 0.0), 1E-6);
    assertEqualsLocal(Double.NaN, hypergeometric12(1.0, 0.0, 1.0, 1.0), 1E-6);
    assertEqualsLocal(Double.NaN, hypergeometric12(1.0, 0.0, 1.0, 0.5), 1E-6);
    assertEqualsLocal(Double.NaN, hypergeometric12(1.0, 1.0, 0.0, 0.0), 1E-6);
    assertEqualsLocal(Double.NaN, hypergeometric12(1.0, 1.0, 0.0, 1.0), 1E-6);
    assertEqualsLocal(Double.NaN, hypergeometric12(1.0, 1.0, 0.0, 0.5), 1E-6);
    assertEquals(2.120516960, hypergeometric12(0.3, 0.3, 0.3, 0.3), 1E-6);
    assertEquals(3.703838895, hypergeometric12(0.7, 0.3, 0.3, 0.3), 1E-6);
    assertEquals(2.120516960, hypergeometric12(0.7, 0.3, 0.7, 0.3), 1E-6);
    assertEquals(4.028761585, hypergeometric12(0.7, 0.3, 0.7, 0.7), 1E-6);
    assertEquals(98.24294839, hypergeometric12(0.7, 0.01, 0.7, 0.7), 1E-6);
  }

  public void testHypergeometric30() {
    // only tests a very few boundary points
    assertEqualsLocal(1.0, hypergeometric30(1.0, 0.0, 0.0, 0.0), 1E-6);
    assertEqualsLocal(1.0, hypergeometric30(0.0, 1.0, 0.0, 0.0), 1E-6);
    assertEqualsLocal(1.0, hypergeometric30(0.0, 0.0, 1.0, 0.0), 1E-6);
    assertEqualsLocal(1.0, hypergeometric30(1.0, 0.0, 0.0, 0.5), 1E-6);
    assertEqualsLocal(1.0, hypergeometric30(0.0, 1.0, 0.0, 0.5), 1E-6);
    assertEqualsLocal(1.0, hypergeometric30(0.0, 0.0, 1.0, 0.5), 1E-6);
    assertEqualsLocal(1.0, hypergeometric30(1.0, 0.0, 0.0, 1.0), 1E-6);
    assertEqualsLocal(1.0, hypergeometric30(0.0, 1.0, 0.0, 1.0), 1E-6);
    assertEqualsLocal(1.0, hypergeometric30(0.0, 0.0, 1.0, 1.0), 1E-6);
    assertEqualsLocal(3.0, hypergeometric30(-2, 1, 1, 1), 1E-6);
    assertEqualsLocal(0.91, hypergeometric30(-2, 1, 1, 0.05), 1E-6);
    assertEqualsLocal(1.33, hypergeometric30(-2, -3, 1, 0.05), 1E-6);
    assertEqualsLocal(-0.2, hypergeometric30(-2, -3, -5, 0.05), 1E-6);
    assertEqualsLocal(-0.3869076701, hypergeometric30(-2.5, -3.4, -5, 0.05), 1E-6);
    assertEqualsLocal(0.292284855729988, hypergeometric30(-2.5, -3.4, -20, 0.005), 1E-6);
    assertEqualsLocal(1.0, hypergeometric30(0, 2, 1, 0.5), 1E-6);
    assertEqualsLocal(1.1385125, hypergeometric30(288.69040339304007, 0.33939894815115945, 802.1763674457245, 1.3696408451835396E-6), 1E-6);
    assertTrue(Double.isNaN(hypergeometric30(4.403949152322575E19, 2.854317537600957E19, 5.097556739418512E19, 1.0368259432389503E19)));
  }
  
  /*
  public void testRandom() {
    final java.util.Random r = new java.util.Random();
    while (true) {
      final double a = 1000 * r.nextDouble();
      final double b = 1000 * r.nextDouble();
      final double c = 1000 * r.nextDouble();
      final double x = 1000 * r.nextDouble();
      hypergeometric30(a, b, c, x);
    }
  }
  */

  // Test cases from "Computation of Hypergeometric Functions" by John Pearson
  public void testPearson1F1() {
    // NB Pearson also has complex cases not included here

    // Some of these are hard to get right with the usual methods

    assertEquals(1.317627178278510, hypergeometric(0.1, 0.2, 0.5), 1E-15);
    assertEquals(0.695536565102261, hypergeometric(-0.1, 0.2, 0.5), 1E-15);
    assertEquals(1.000000000100000, hypergeometric(1E-8, 1E-8, 1E-10), 1E-15);
    assertEquals(4.403093158961343E2, hypergeometric(1, 3, 10), 1E-12);
    assertEquals(1.779668553337393E4, hypergeometric(500, 511, 10), 1E-8); // Pearson has wrong exponent
    assertEquals(1.724131075992688E41, hypergeometric(8.1, 10.1, 100), 1E-12);
    assertEquals(2.748892975858683E12, hypergeometric(100, 1.5, 2.5), 1.0);
    //assertEquals(-10.048954112964948, hypergeometric(-60, 1, 10), 1E-12); // Don't support this yet
    assertEquals(1.818086887618945E22, hypergeometric(60, 1, 10), 1E10);
    //assertEquals(-6.713066845459067E-4, hypergeometric(60, 1, -10), 1E-16); // Don't support this yet
    assertEquals(1.2331425409985889E18, hypergeometric(-60, 1, -10), 1E6);
    assertEquals(2.27992985382866, hypergeometric(1000, 1, 0.001), 1E-12);
    //assertEquals(1.461353307199289E299, hypergeometric(0.001, 1, 700), 1E287); // Don't support this yet
    //assertEquals(0.001053895943365, hypergeometric(500, 1, -5), 1E-12);
    //assertEquals(0.251406264291805, hypergeometric(-500, 1, 5), 1E-12);
    //assertEquals(8.857934344815256E9, hypergeometric(20, -10 + 1E-9, -2.5), 1);
    assertEquals(98.353133058093164, hypergeometric(20, 10 - 1E-9, 2.5), 1E-12);
    //assertEquals(-1.051351454763442E14, hypergeometric(-20, -10 + 1E-12, 2.5), 1E2);
    assertEquals(3.448551506216654E27, hypergeometric(4, 80, 200), 1E23); // NOTE currently low accuracy
    assertEquals(0.024906201315854, hypergeometric(-4, 500, 300), 1E-12);
    assertEquals(2.718281828457880E12, hypergeometric(1, 1E-12, 1), 1E-1);
    assertEquals(1.332534440778499E23, hypergeometric(10, 1E-12, 10), 1E11);
    //assertEquals(1.805334147110282E-53, hypergeometric(1000, 1, -1000), 1E-67);
    //assertEquals(2.593820783362006E215, hypergeometric(-1000, 1, 1000), 1E205);
  }

  // Test cases from "Computation of Hypergeometric Functions" by John Pearson
  public void testPearson2F1() {
    assertEquals(1.046432811217352, hypergeometric21(0.1, 0.2, 0.3, 0.5), 1E-12); // low accuracy!
    assertEquals(0.956434210968214, hypergeometric21(-0.1, 0.2, 0.3, 0.5), 1E-14); // low accuracy!
    assertEquals(1.000000000000010, hypergeometric21(1E-8, 1E-8, 1E-8, 1E-6), 1E-14);
    assertEquals(0.492238858852651, hypergeometric21(2 + 1E-9, 3, 5, -0.75), 1E-14);
    assertEquals(0.474999999913750, hypergeometric21(-2, -3, -5 + 1E-9, 0.5), 1E-14);
    assertEquals(0.625000000000000, hypergeometric21(-1, -1.5, -2 - 1E-15, 0.5), 1E-14);
    assertEquals(9.332636185032189E-302, hypergeometric21(500, -500, 500, 0.75), 1E-315);
    assertEquals(8.709809816217217E-103, hypergeometric21(500, 500, 500, -0.6), 1E-114);
    //assertEquals(5.233580403196932E94, hypergeometric21(-1000, -2000, -4000.1, -0.5), 1E82); // Don't support this yet - next bunch mostly NaN
    //assertEquals(2.653635302903707E-31, hypergeometric21(-100, -200, -300 + 1E-9, 0.5 * Math.sqrt(2)), 1E-40)
    //assertEquals(3.912238919661547E98, hypergeometric21(300, 10, 5, 0.5), 1E86);
    //assertEquals(1.661006238211309E-7, hypergeometric21(5, -300, 10, 0.5), 1E-18);
    //assertEquals(-3.852027081523919E32, hypergeometric21(10, 5, -300.5, 0.5), 1E20); // !!! Badly wrong
    //assertEquals(-0.631220676949703, hypergeometric21(2.25, 3.75, -0.5, -1), 1E-14);
  }
}
