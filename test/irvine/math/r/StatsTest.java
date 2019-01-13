package irvine.math.r;

import junit.framework.TestCase;

import static irvine.TestUtils.assertEqualsLocal;

/**
 * Tests statistical functions. Many of the explicit values given here in
 * the tests were computed using the independent Magma number theory
 * package.
 *
 * @author Sean A. Irvine
 */
public class StatsTest extends TestCase {

  public void testErf() {
    assertEqualsLocal(Double.NaN, Stats.erf(Double.NaN), 1.0E-12);
    assertEqualsLocal(1.0, Stats.erf(Double.POSITIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(-1.0, Stats.erf(Double.NEGATIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(1.0, Stats.erf(Double.MAX_VALUE), 1.0E-12);
    assertEqualsLocal(0.0, Stats.erf(0.0), 1.0E-12);

    assertEquals(0.1124629160182848922032750717, Stats.erf(0.1), 1.0E-12);
    assertEquals(0.2227025892104784541401390068, Stats.erf(0.2), 1.0E-12);
    assertEquals(0.3286267594591274276389140479, Stats.erf(0.3), 1.0E-12);
    assertEquals(0.4283923550466684551036038453, Stats.erf(0.4), 1.0E-12);
    assertEquals(0.5204998778130465376827466539, Stats.erf(0.5), 1.0E-12);
    assertEquals(0.6038560908479259225626224361, Stats.erf(0.6), 1.0E-12);
    assertEquals(0.6778011938374184729756288092, Stats.erf(0.7), 1.0E-12);
    assertEquals(0.7421009647076604861671105865, Stats.erf(0.8), 1.0E-12);
    assertEquals(0.7969082124228321285187247851, Stats.erf(0.9), 1.0E-12);
    assertEquals(0.8427007929497148693412206351, Stats.erf(1.0), 1.0E-12);
    assertEquals(0.8802050695740816997718677663, Stats.erf(1.1), 1.0E-12);
    assertEquals(0.9103139782296353802384057757, Stats.erf(1.2), 1.0E-12);
    assertEquals(0.9340079449406524366038933275, Stats.erf(1.3), 1.0E-12);
    assertEquals(0.9522851197626488105164826915, Stats.erf(1.4), 1.0E-12);
    assertEquals(0.9661051464753107270669762616, Stats.erf(1.5), 1.0E-12);
    assertEquals(0.9763483833446440077742834471, Stats.erf(1.6), 1.0E-12);
    assertEquals(0.9837904585907745636262425881, Stats.erf(1.7), 1.0E-12);
    assertEquals(0.9890905016357307141837328108, Stats.erf(1.8), 1.0E-12);
    assertEquals(0.9927904292352574699483575393, Stats.erf(1.9), 1.0E-12);
    assertEquals(0.9953222650189527341620692564, Stats.erf(2.0), 1.0E-12);
    assertEquals(0.9970205333436670144961149834, Stats.erf(2.1), 1.0E-12);
    assertEquals(0.998137153702018108556548244, Stats.erf(2.2), 1.0E-12);
    assertEquals(0.9988568234026433485346525406, Stats.erf(2.3), 1.0E-12);
    assertEquals(0.9993114861033549214302550678, Stats.erf(2.4), 1.0E-12);
    assertEquals(0.9995930479825550410604357843, Stats.erf(2.5), 1.0E-12);
    assertEquals(0.9997639655834706507960089968, Stats.erf(2.6), 1.0E-12);
    assertEquals(0.9998656672600594756708598813, Stats.erf(2.7), 1.0E-12);
    assertEquals(0.9999249868053345409757767548, Stats.erf(2.8), 1.0E-12);
    assertEquals(0.9999589021219005411643161325, Stats.erf(2.9), 1.0E-12);
    assertEquals(0.9999779095030014145586272239, Stats.erf(3.0), 1.0E-12);
    assertEquals(0.9999883513426328004039662938, Stats.erf(3.1), 1.0E-12);
    assertEquals(0.9999939742388482379050282576, Stats.erf(3.2), 1.0E-12);
    assertEquals(0.9999999229960725430358713018, Stats.erf(3.8), 1.0E-12);
    assertEquals(0.9999999652077514027682577217, Stats.erf(3.9), 1.0E-12);
    assertEquals(0.9999999845827420997199811478, Stats.erf(4.0), 1.0E-12);
    assertEquals(0.9999999932999723459151016273, Stats.erf(4.1), 1.0E-12);
    assertEquals(0.9999999971445058204078113843, Stats.erf(4.2), 1.0E-12);
    assertEquals(0.999999998806528206277958696, Stats.erf(4.3), 1.0E-12);
    assertEquals(0.9999999995108289729394111582, Stats.erf(4.4), 1.0E-12);
    assertEquals(0.9999999998033839558457112524, Stats.erf(4.5), 1.0E-12);
    assertEquals(0.9999999999225040040255816811, Stats.erf(4.6), 1.0E-12);
    assertEquals(0.9999999999700474021362033968, Stats.erf(4.7), 1.0E-12);
    assertEquals(0.999999999988647856415078039, Stats.erf(4.8), 1.0E-12);
    assertEquals(0.9999999999957810634759942186, Stats.erf(4.9), 1.0E-12);
    assertEquals(0.9999999999999999280959021645, Stats.erf(5.9), 1.0E-12);
    assertEquals(0.9999999999999999784802632875, Stats.erf(6.0), 1.0E-12);
    assertEquals(0.9999999999999999936853978498, Stats.erf(6.1), 1.0E-12);
    assertEquals(0.9999999999999999981833243828, Stats.erf(6.2), 1.0E-12);
    assertEquals(0.9999999999999999994875778313, Stats.erf(6.3), 1.0E-12);
    assertEquals(0.9999999999999999998582919652, Stats.erf(6.4), 1.0E-12);
    assertEquals(0.9999999999999999999999999938, Stats.erf(7.6), 1.0E-12);
    assertEquals(0.9999999999999999999999999987, Stats.erf(7.7), 1.0E-12);
    assertEquals(0.9999999999999999999999999997, Stats.erf(7.8), 1.0E-12);
    assertEquals(0.9999999999999999999999999999, Stats.erf(7.9), 1.0E-12);
    assertEquals(1.0, Stats.erf(8.0), 1.0E-12);
    assertEquals(1.0, Stats.erf(8.1), 1.0E-12);
    assertEquals(1.0, Stats.erf(8.8), 1.0E-12);
    assertEquals(1.0, Stats.erf(8.9), 1.0E-12);
    assertEquals(1.0, Stats.erf(9.0), 1.0E-12);

    /* check symmetry about 0 */
    for (double x = 0.01; x < 5.0; x += 0.01) {
      assertEqualsLocal(-Stats.erf(-x), Stats.erf(x), 1.0E-12);
    }
  }

  public void testErfc() {
    assertEqualsLocal(Double.NaN, Stats.erfc(Double.NaN), 1.0E-12);
    assertEqualsLocal(0.0, Stats.erfc(Double.POSITIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(2.0, Stats.erfc(Double.NEGATIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(0.0, Stats.erfc(Double.MAX_VALUE), 1.0E-12);

    // should be 1.0 - erf(x)
    for (double x = -10.0; x < 10.0; x += 0.01) {
      assertEquals(1.0 - Stats.erf(x), Stats.erfc(x), 1.0E-12);
    }
  }

  public void testNormal() {
    assertEqualsLocal(Double.NaN, Stats.normal(Double.NaN), 1.0E-12);
    assertEqualsLocal(1.0, Stats.normal(Double.POSITIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(0.0, Stats.normal(Double.NEGATIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(1.0, Stats.normal(Double.MAX_VALUE), 1.0E-12);
    assertEqualsLocal(0.5, Stats.normal(0.0), 1.0E-12);
    assertEqualsLocal(0.97725, Stats.normal(2.0), 1.0E-4);
    assertEqualsLocal(0.69146, Stats.normal(0.5), 1.0E-4);
    assertEqualsLocal(0.53983, Stats.normal(0.1), 1.0E-4);

    // in terms of error function
    for (double x = -10.0; x < 10.0; x += 0.01) {
      assertEquals(Stats.erfc(-x / Math.sqrt(2.0)) / 2.0, Stats.normal(x), 1.0E-12);
    }
  }

  public void testInormal() {
    assertEqualsLocal(Double.NaN, Stats.inverseNormal(Double.NaN), 1.0E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Stats.inverseNormal(Double.POSITIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(Double.NEGATIVE_INFINITY, Stats.inverseNormal(Double.NEGATIVE_INFINITY), 1.0E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Stats.inverseNormal(Double.MAX_VALUE), 1.0E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Stats.inverseNormal(1.0), 1.0E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Stats.inverseNormal(2.0), 1.0E-12);
    assertEqualsLocal(Double.NEGATIVE_INFINITY, Stats.inverseNormal(0.0), 1.0E-12);
    assertEqualsLocal(Double.NEGATIVE_INFINITY, Stats.inverseNormal(-1.0), 1.0E-12);
    assertEqualsLocal(Double.NEGATIVE_INFINITY, Stats.inverseNormal(-12345.678), 1.0E-12);
    assertEqualsLocal(0.0, Stats.inverseNormal(0.5), 1.0E-12);
    assertEqualsLocal(0.0025, Stats.inverseNormal(0.501), 1.0E-4);
    assertEqualsLocal(0.5244, Stats.inverseNormal(0.7), 1.0E-4);
    assertEqualsLocal(0.8416, Stats.inverseNormal(0.8), 1.0E-4);
    assertEqualsLocal(1.2816, Stats.inverseNormal(0.9), 1.0E-4);
    assertEqualsLocal(3.0902, Stats.inverseNormal(0.999), 1.0E-4);

    /* check symmetry about 0.5 */
    for (double x = 0.01; x < 5.0; x += 0.01) {
      assertEqualsLocal(-Stats.inverseNormal(0.5 - x), Stats.inverseNormal(0.5 + x), 1.0E-12);
    }
    /* check normal and inverse normal */
    for (double x = -5.0; x < 5.0; x += 0.01) {
      assertEqualsLocal(x, Stats.inverseNormal(Stats.normal(x)), 1.0E-8);
    }
  }

  public void testBeta() {
    // check for NaN operation
    assertEqualsLocal(Double.NaN, Stats.beta(Double.NaN, Double.NaN, Double.NaN), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(Double.NaN, 0.0, 0.5), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(Double.NaN, 1.0, 0.5), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(0.0, Double.NaN, 0.5), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(1.0, Double.NaN, 0.5), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(0.0, 0.5, Double.NaN), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(1.0, 0.5, Double.NaN), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(0.0, 0.5, 0.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(0.0, 0.5, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(0.5, 0.0, 0.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(0.5, 0.0, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(0.0, -0.5, 0.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(0.0, -0.5, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(-0.5, 0.0, 0.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.beta(-0.5, 0.0, 1.0), 0.0);

    // check x = 0 asymptote
    assertEqualsLocal(0.0, Stats.beta(0.5, 0.5, 0.0), 0.0);
    assertEqualsLocal(0.0, Stats.beta(0.5, 1.0, 0.0), 0.0);
    assertEqualsLocal(0.0, Stats.beta(0.5, 2.0, 0.0), 0.0);
    assertEqualsLocal(0.0, Stats.beta(1.0, 0.5, 0.0), 0.0);
    assertEqualsLocal(0.0, Stats.beta(2.0, 0.5, 0.0), 0.0);
    assertEqualsLocal(0.0, Stats.beta(0.5, Double.POSITIVE_INFINITY, 0.0), 0.0);
    assertEqualsLocal(0.0, Stats.beta(Double.POSITIVE_INFINITY, 0.5, 0.0), 0.0);

    // check x = 1 asymptote
    assertEqualsLocal(1.0, Stats.beta(0.5, 0.5, 1.0), 0.0);
    assertEqualsLocal(1.0, Stats.beta(0.5, 1.0, 1.0), 0.0);
    assertEqualsLocal(1.0, Stats.beta(0.5, 2.0, 1.0), 0.0);
    assertEqualsLocal(1.0, Stats.beta(1.0, 0.5, 1.0), 0.0);
    assertEqualsLocal(1.0, Stats.beta(2.0, 0.5, 1.0), 0.0);
    assertEqualsLocal(1.0, Stats.beta(0.5, Double.POSITIVE_INFINITY, 1.0), 0.0);
    assertEqualsLocal(1.0, Stats.beta(Double.POSITIVE_INFINITY, 0.5, 1.0), 0.0);


    for (double a = 0.1; a < 10.0; a += Math.PI) {
      for (double b = 0.1; b < 10.0; b += Math.PI) {
        for (double x = 0.1; x < 1.0; x += 0.0123456789) {
          assertEqualsLocal(Beta.ibeta(a, b, x), Stats.beta(a, b, x), 1.0E-12);
        }
      }
    }
  }

  public void testGamma() {
    for (double x = -0.001; x > -10.0; x -= 0.3) {
      assertEqualsLocal(Double.NaN, Stats.gamma(0.0, 0.0, x), 1.0E-6);
      assertEqualsLocal(Double.NaN, Stats.gamma(1.0, 0.0, x), 1.0E-6);
      assertEqualsLocal(Double.NaN, Stats.gamma(0.0, 1.0, x), 1.0E-6);
      assertEqualsLocal(Double.NaN, Stats.gamma(0.0, 0.5, x), 1.0E-6);
      assertEqualsLocal(Double.NaN, Stats.gamma(0.5, 0.5, x), 1.0E-6);
      assertEqualsLocal(Double.NaN, Stats.gamma(0.4, 0.2, x), 1.0E-6);
    }

    for (double a = 0.0; a < 10.0; a += 0.1) {
      for (double b = 0.0; b < 10.0; b += 0.1) {
        for (double x = 0.0; x < 10.0; x += 0.1) {
          assertEqualsLocal(Stats.gamma(a, b, x), Gamma.incompletegamma(b, a * x), 1.0E-6);
        }
      }
    }
  }

  public void testGammaComplement() {
    for (double x = -0.001; x > -10.0; x -= 0.3) {
      assertEqualsLocal(Double.NaN, Stats.gammacomplement(0.0, 0.0, x), 1.0E-6);
      assertEqualsLocal(Double.NaN, Stats.gammacomplement(1.0, 0.0, x), 1.0E-6);
      assertEqualsLocal(Double.NaN, Stats.gammacomplement(0.0, 1.0, x), 1.0E-6);
      assertEqualsLocal(Double.NaN, Stats.gammacomplement(0.0, 0.5, x), 1.0E-6);
      assertEqualsLocal(Double.NaN, Stats.gammacomplement(0.5, 0.5, x), 1.0E-6);
      assertEqualsLocal(Double.NaN, Stats.gammacomplement(0.4, 0.2, x), 1.0E-6);
    }

    for (double a = 0.0; a < 10.0; a += 0.1) {
      for (double b = 0.0; b < 10.0; b += 0.1) {
        for (double x = 0.0; x < 10.0; x += 0.1) {
          assertEqualsLocal(Stats.gammacomplement(a, b, x), Gamma.incompletegammacomplement(b, a * x), 1.0E-6);
        }
      }
    }
  }

  public void testF() {
    for (int df1 = 1; df1 < 100; ++df1) {
      for (int df2 = 1; df2 < 100; ++df2) {
        for (double x = 0.1; x < 1.0; x += 0.1) {
          assertEquals("df1=" + df1 + " df2=" + df2 + " x=" + x, 1.0 - x, Stats.f(df1, df2, Stats.ifc(df1, df2, x)), 1.0E-4);
        }
      }
    }
  }

  public void testPoisson() {
    // test out of range
    assertEqualsLocal(Double.NaN, Stats.poisson(1, 0.0), 0);
    assertEqualsLocal(Double.NaN, Stats.poisson(1, -0.0), 0);
    assertEqualsLocal(Double.NaN, Stats.poisson(-1, 1.0), 0);
    assertEqualsLocal(Double.NaN, Stats.poisson(-Integer.MAX_VALUE, 1.0), 0);

    // simple spot checks
    assertEquals(0.3679, Stats.poisson(0, 1.0), 1.0E-3);
    assertEquals(0.3679 + 0.3679, Stats.poisson(1, 1.0), 1.0E-3);
    assertEquals(0.3679 + 0.3679 + 0.1839, Stats.poisson(2, 1.0), 1.0E-3);
    assertEquals(0.3679 + 0.3679 + 0.1839 + 0.0613, Stats.poisson(3, 1.0), 1.0E-3);

  }

  public void testPoissoncomplement() {
    // test out of range
    assertEqualsLocal(Double.NaN, Stats.poissoncomplement(1, 0.0), 0);
    assertEqualsLocal(Double.NaN, Stats.poissoncomplement(1, -0.0), 0);
    assertEqualsLocal(Double.NaN, Stats.poissoncomplement(-1, 1.0), 0);
    assertEqualsLocal(Double.NaN, Stats.poissoncomplement(-Integer.MAX_VALUE, 1.0), 0);

    for (int i = 0; i < 20; ++i) {
      for (double m = 0.0; m < 5.0; m += 0.1) {
        assertEqualsLocal(1.0 - Stats.poisson(i, m), Stats.poissoncomplement(i, m), 1.0E-8);
      }
    }
  }

  public void testinversepoisson() {
    // test out of range
    assertEqualsLocal(Double.NaN, Stats.inversepoisson(-1, 0.0), 0);
    assertEqualsLocal(Double.NaN, Stats.inversepoisson(1, -1.0), 0);
    assertEqualsLocal(Double.NaN, Stats.inversepoisson(-1, 0.5), 0);
    assertEqualsLocal(Double.NaN, Stats.inversepoisson(-Integer.MAX_VALUE, 1.0), 0);

    for (int i = 0; i < 5; ++i) {
      for (double m = 0.1; m < 5.0; m += 0.1) {
        assertEqualsLocal(i + " " + m, m, Stats.inversepoisson(i, Stats.poisson(i, m)), 1.0E-5);
      }
    }
  }

  public void testBinomial() {
    // test out of range
    assertEqualsLocal(Double.NaN, Stats.binomial(1, 1, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomial(1, 1, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomial(2, 1, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomial(1, 2, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomial(1, 2, -0.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomial(1, 2, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomial(3, 2, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomial(-1, 1, 0.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomial(-1, -1, -1.0), 0.0);

    // test k = n
    for (int i = 0; i < 100; ++i) {
      for (double x = 0.0; x < 1.0; x += 0.3) {
        assertEqualsLocal(1.0, Stats.binomial(i, i, x), 1.0E-12);
      }
    }
  }

  public void testBinomialcomplement() {
    // test out of range
    assertEqualsLocal(Double.NaN, Stats.binomialcomplement(1, 1, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomialcomplement(1, 1, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomialcomplement(2, 1, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomialcomplement(1, 2, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomialcomplement(1, 2, -0.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomialcomplement(1, 2, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomialcomplement(3, 2, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.binomialcomplement(-1, -1, -1.0), 0.0);

    // test k = n
    for (int i = 0; i < 100; ++i) {
      for (double x = 0.0; x < 1.0; x += 0.3) {
        assertEqualsLocal(0.0, Stats.binomialcomplement(i, i, x), 1.0E-12);
      }
    }

    // check sum
    for (int i = 2; i < 100; ++i) {
      for (int j = 0; j <= i; ++j) {
        for (double x = 0.0; x < 1.0; x += 0.1) {
          assertEqualsLocal(i + " " + j + " " + x, 1.0, Stats.binomial(j, i, x) + Stats.binomialcomplement(j, i, x), 1.0E-6);
        }
      }
    }
  }

  public void testinversebinomial() {
    // test out of range
    assertEqualsLocal(Double.NaN, Stats.inversebinomial(1, 1, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.inversebinomial(1, 1, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.inversebinomial(2, 1, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.inversebinomial(1, 2, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.inversebinomial(1, 2, -0.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.inversebinomial(1, 2, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.inversebinomial(3, 2, 1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.inversebinomial(-1, -1, -1.0), 0.0);

    // check functional inverse
    for (int i = 2; i < 10; ++i) {
      for (int j = 0; j < i; ++j) {
        for (double x = 0.1; x < 0.95; x += 0.1) {
          assertEqualsLocal(i + " " + j + " " + x + " " + Stats.binomial(j, i, x), x, Stats.inversebinomial(j, i, Stats.binomial(j, i, x)), 1.0E-4);
        }
      }
    }
  }

  public void testNegativeBinomial() {
    // test out of range
    assertEqualsLocal(Double.NaN, Stats.negativebinomial(1, 1, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.negativebinomial(1, 1, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.negativebinomial(2, 1, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.negativebinomial(1, 2, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.negativebinomial(1, 2, -0.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.negativebinomial(1, 2, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.negativebinomial(-1, -1, -1.0), 0.0);
  }

  public void testNegativeBinomialComplement() {
    // test out of range
    assertEqualsLocal(Double.NaN, Stats.negativebinomialcomplement(1, 1, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.negativebinomialcomplement(1, 1, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.negativebinomialcomplement(2, 1, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.negativebinomialcomplement(1, 2, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.negativebinomialcomplement(1, 2, -0.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.negativebinomialcomplement(1, 2, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.negativebinomialcomplement(-1, -1, -1.0), 0.0);

    // check sum
    for (int i = 2; i < 100; ++i) {
      for (int j = 0; j <= i; ++j) {
        for (double x = 0.0; x < 1.0; x += 0.1) {
          assertEqualsLocal(i + " " + j + " " + x, 1.0, Stats.negativebinomial(j, i, x) + Stats.negativebinomialcomplement(j, i, x), 1.0E-6);
        }
      }
    }
  }

  public void testinversenegativebinomial() {
    // test out of range
    assertEqualsLocal(Double.NaN, Stats.inversenegativebinomial(1, 1, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.inversenegativebinomial(1, 1, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.inversenegativebinomial(2, 1, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.inversenegativebinomial(1, 2, -1.0), 0.0);
    assertEqualsLocal(Double.NaN, Stats.inversenegativebinomial(1, 2, -0.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.inversenegativebinomial(1, 2, 1.1), 0.0);
    assertEqualsLocal(Double.NaN, Stats.inversenegativebinomial(-1, -1, -1.0), 0.0);

    // check functional inversenegative
    for (int i = 2; i < 10; ++i) {
      for (int j = 0; j < i; ++j) {
        for (double x = 0.1; x < 0.95; x += 0.1) {
          assertEqualsLocal(i + " " + j + " " + x + " " + Stats.binomial(j, i, x), x, Stats.inversenegativebinomial(j, i, Stats.negativebinomial(j, i, x)), 1.0E-4);
        }
      }
    }
  }
}
