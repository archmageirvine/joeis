package irvine.oeis.a401;

import java.util.HashSet;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A401329 Least elements of periodic cycles of the map T(n) = n + D(n) - D(n+1), where D(n) is the largest positive proper divisor of n.
 * @author Sean A. Irvine
 */
public class A401329 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 1;
  {
    LeastPrimeFactorizer.setVerbose(false);
  }

  private Z t(final Z n) {
    final Z n1 = n.add(1);
    return n.add(n.divide(Functions.LPF.z(n))).subtract(n1.divide(Functions.LPF.z(n1)));
  }

  private boolean is(final Z n) {
    final HashSet<Z> seen = new HashSet<>();
    Z m = n;
    while (seen.add(m)) {
      m = t(m);
      if (m.compareTo(n) < 0) {
        return false;
      }
    }
    return m.equals(n);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(Z.valueOf(++mN))) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 1000000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
  }
}
