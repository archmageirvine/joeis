package irvine.math.z;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class BinomialTest extends TestCase {

  public void testBinomial() {
    assertEquals(Z.ONE, Binomial.binomial(-3, 0));
    assertEquals(Z.valueOf(-3), Binomial.binomial(-3, 1));
    assertEquals(Z.ONE, Binomial.binomial(0, 0));
    assertEquals(Z.ONE, Binomial.binomial(1, 1));
    assertEquals(Z.ONE, Binomial.binomial(2, 0));
    assertEquals(Z.ZERO, Binomial.binomial(3, -1));
    assertEquals(Z.TEN, Binomial.binomial(5, 3));
    assertEquals(Z.TEN, Binomial.binomial(Z.FIVE, Z.THREE));
    assertEquals(10, Binomial.binomial(5, 3, 11));
    assertEquals(1, Binomial.binomial(5, 3, 3));
  }

  public void testMultinomial() {
    assertEquals(Z.valueOf(151200), Binomial.multinomial(10, 2, 3, 2));
  }

  public void testCatalan() {
    assertEquals(Z.FIVE, Binomial.catalan(3));
  }
}
