package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Tests the Squfof factoring algorithm
 *
 * @author Sean A. Irvine
 */
public class SqufofTest extends AbstractFactorTest {

  @Override
  public void setUp() {
    mF = new Squfof();
  }

  private void check(final long... expected) {
    Z n = Z.ONE;
    for (final long p : expected) {
      n = n.multiply(p);
    }
    final FactorSequence fs = new FactorSequence();
    fs.add(n);
    mF.factor(fs);
    assertTrue(fs.isComplete());
    for (final long pp : expected) {
      final Z p = Z.valueOf(pp);
      final int exponent = fs.getExponent(p);
      final int status = fs.getStatus(p);
      assertTrue(exponent > 0);
      assertEquals(status, FactorSequence.PRIME);
      fs.remove(p);
      if (exponent != 1) {
        fs.add(p, status, exponent - 1);
      }
    }
    assertEquals(0, fs.omega());
  }

  public void test() {
    check(65539, 65543);
    check(65539, 65539);
    check(17, 65539, 65543);
    check(17, 17, 65539, 65539);
    check(16411, 16411, 16411, 16411);
    check(17, 65539, 65543, 65543);
    check(2, 3, 5, 7, 11, 13, 17, 19, 23, 31);
  }

}
