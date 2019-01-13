package irvine.math;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class RandomUtilsTest extends TestCase {

  public void testDice() {
    try {
      RandomUtils.rollDice(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      RandomUtils.rollDice(3, 0, 2);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals(0, RandomUtils.rollDice());
    assertEquals(1, RandomUtils.rollDice(1));
    assertEquals(5, RandomUtils.rollDice(1, 1, 1, 1, 1));
    final int[] p = {6, 6};
    final boolean[] seen = new boolean[13];
    for (int i = 0; i < 1000; ++i) {
      final int r = RandomUtils.rollDice(p);
      assertTrue(r >= 2 && r <= 12);
      seen[r] = true;
    }
    for (int i = 2; i <= 12; ++i) {
      assertTrue(seen[i]);
    }
  }

  public void testBinomial() {
    try {
      RandomUtils.binomial(-1, 0.5);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.binomial(0, -1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.binomial(0, 1.1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.binomial(0, Double.NaN);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals(10000000, RandomUtils.binomial(10000000, 1));
    assertEquals(0, RandomUtils.binomial(10000000, 0));
    for (int i = 0; i < 50; ++i) {
      final int b = RandomUtils.binomial(i, 0.5);
      assertTrue(b >= 0);
      assertTrue(b <= i);
    }
    int b = 0;
    for (int i = 0; i < 50; ++i) {
      b += RandomUtils.binomial(20, 0.999);
    }
    assertTrue(b >= 18 * 49);
    assertTrue(b <= 20 * 50);
    b = 0;
    for (int i = 0; i < 50; ++i) {
      b += RandomUtils.binomial(1, 0.5);
    }
    assertTrue(b > 0);
    assertTrue(b < 50);
  }

  public void testGeometric() {
    try {
      RandomUtils.geometric(-1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.geometric(1.1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.geometric(Double.NaN);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals(0, RandomUtils.geometric(1));
    assertEquals(0, RandomUtils.geometric(0));
    final int[] r = new int[1000];
    for (int i = 0; i < 50000; ++i) {
      final int b = RandomUtils.geometric(0.5);
      assertTrue(b >= 0);
      assertTrue(b <= 10000);
      if (b < r.length) {
        r[b]++;
      }
    }
    int inversions = 0;
    int nonzero = 0;
    for (int i = 1; i < r.length; ++i) {
      if (r[i] > r[i - 1]) {
        ++inversions;
      }
      if (r[i] > 0) {
        ++nonzero;
      }
    }
    assertTrue(inversions < 10);
    assertTrue(nonzero > 10);
  }

  public void testNegativeBinomial() {
    try {
      RandomUtils.negativeBinomial(0, 0.5);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.negativeBinomial(1, -1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.negativeBinomial(1, 1.1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.negativeBinomial(1, Double.NaN);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals(0, RandomUtils.negativeBinomial(10000000, 0));
    assertEquals(0, RandomUtils.negativeBinomial(10000000, 1));
    for (int i = 1; i < 50; ++i) {
      final int b = RandomUtils.negativeBinomial(i, 0.5);
      assertTrue(b >= 0);
      assertTrue(b <= 1000000);
    }
    int b = 0;
    for (int i = 0; i < 50; ++i) {
      b += RandomUtils.negativeBinomial(1, 0.5);
    }
    assertTrue(b > 0);
    assertTrue(b < 50000);
  }

  public void testPoisson() {
    try {
      RandomUtils.poisson(0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.poisson(Double.NaN);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    final int[] r = new int[3];
    for (int i = 0; i < 50000; ++i) {
      final int b = RandomUtils.poisson(0.5);
      assertTrue(b >= 0);
      assertTrue(b <= 10000);
      if (b < r.length) {
        r[b]++;
      }
    }
    assertTrue(r[0] != 0);
    assertTrue(r[1] != 0);
    assertTrue(r[2] != 0);
  }

  public void testNormal() {
    assertEquals(Double.POSITIVE_INFINITY, RandomUtils.normal(Double.POSITIVE_INFINITY, 1), 1E-12);
    assertEquals(5, RandomUtils.normal(5, 0), 1E-12);
    double s = 0;
    for (int i = 0; i < 1000; ++i) {
      s += RandomUtils.normal(0, 1);
    }
    s /= 1000;
    assertTrue(s > -0.1 && s < 0.1);
  }

  public void testLogNormal() {
    assertEquals(Double.POSITIVE_INFINITY, RandomUtils.lognormal(Double.POSITIVE_INFINITY, 1), 1E-12);
    assertEquals(Math.exp(5), RandomUtils.lognormal(5, 0), 1E-12);
    double s = 0;
    for (int i = 0; i < 1000; ++i) {
      s += Math.log(RandomUtils.lognormal(0, 1));
    }
    s /= 1000;
    assertTrue(s > -0.1 && s < 0.1);
  }

  public void testExponential() {
    assertEquals(Double.POSITIVE_INFINITY, RandomUtils.exponential(0), 1E-12);
    double s = 0;
    for (int i = 0; i < 1000; ++i) {
      s += RandomUtils.exponential(1);
    }
    s /= 1000;
    assertTrue(s > 0 && s < 5);
  }

  public void testErlang() {
    try {
      RandomUtils.erlang(0, 5);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.erlang(1, 0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.erlang(1, -0.1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals(0, RandomUtils.erlang(5, Double.POSITIVE_INFINITY), 1E-12);
    double s = 0;
    for (int i = 0; i < 1000; ++i) {
      s += RandomUtils.erlang(1, 2);
    }
    s /= 1000;
    assertTrue(s > 0 && s < 8);
  }

  public void testGamma() {
    try {
      RandomUtils.gamma(0, 5);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.gamma(1, -0.1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    double s = 0;
    double v = 0;
    for (int i = 0; i < 10000; ++i) {
      final double t = RandomUtils.gamma(1, 0.5);
      s += t;
      v += t * t;
    }
    s /= 10000;
    v /= 10000;
    v -= s * s;
    assertTrue(s > 0.2 && s < 0.8);
    assertTrue("variance was " + v, v > 0.1 && v < 0.4);
    s = 0;
    v = 0;
    for (int i = 0; i < 10000; ++i) {
      final double t = RandomUtils.gamma(0.5, 2);
      s += t;
      v += t * t;
    }
    s /= 10000;
    v /= 10000;
    v -= s * s;
    assertTrue(s > 0.5 && s < 1.5);
    assertTrue("variance was " + v, v > 1.5 && v < 2.5);
    s = 0;
    v = 0;
    for (int i = 0; i < 100000; ++i) {
      final double t = RandomUtils.gamma(1, 4);
      s += t;
      v += t * t;
    }
    s /= 100000;
    v /= 100000;
    v -= s * s;
    assertTrue(s > 3.8 && s < 4.2);
    assertTrue("variance was " + v, v > 15.5 && v < 16.5);
  }

  public void testBeta() {
    try {
      RandomUtils.beta(0, 5);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.beta(1, -0.1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    for (int i = 0; i < 10; ++i) {
      assertTrue(RandomUtils.beta(1, 1) >= 0);
      assertTrue(RandomUtils.beta(1, 1) <= 1);
    }
    double s = 0;
    for (int i = 0; i < 1000; ++i) {
      s += RandomUtils.beta(5, 1);
    }
    s /= 1000;
    assertTrue(s > 0 && s < 1);
  }

  public void testWeibull() {
    try {
      RandomUtils.weibull(0, 5);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.weibull(1, -0.1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    double s = 0;
    for (int i = 0; i < 1000; ++i) {
      s += RandomUtils.weibull(2, 5);
    }
    s /= 1000;
    assertTrue("mu was " + s, s > 0.8862269 * 4 && s < 0.8862269 * 6);
  }

  public void testTriangular() {
    try {
      RandomUtils.triangular(0, 5, -1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.triangular(0, -2, 0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      RandomUtils.triangular(0, 5, 6);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    double s = 0;
    double z = 0;
    for (int i = 0; i < 100000; ++i) {
      final double v = RandomUtils.triangular(2, 5, 4);
      assertTrue(v >= 2);
      assertTrue(v <= 5);
      s += v;
      z += v * v;
    }
    s /= 100000;
    z /= 100000;
    final double mu = (2 + 5 + 4) / 3.0;
    assertTrue("mu was " + s + " expected " + mu, s > 0.9 * mu && s < 1.1 * mu);
    final double variance = (4 + 25 + 16 - 10 - 8 - 20) / 18.0;
    z -= s * s;
    assertTrue(z > 0.9 * variance);
    assertTrue(z < 1.1 * variance);
  }

}
