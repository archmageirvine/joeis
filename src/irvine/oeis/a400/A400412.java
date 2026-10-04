package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A400353.
 * @author Sean A. Irvine
 */
public class A400412 extends Sequence1 {

  // This could be made more efficient by caching the odd,s values of is

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;
  private long mM = 0;

  private boolean is(final long n) {
    final Z[] divs = Jaguar.factor(n).divisorsSorted();
    long s = 1;
    long odd = 1; // divs[0] = 1
    for (int k = 1; k < divs.length; ++k) {
      if (divs[k].isOdd()) {
        ++odd;
        if (divs[k].compareTo(divs[k - 1].multiply2()) >= 0) {
          ++s;
        }
      }
    }
    return odd == mN && s == mM;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    if ((mN & 1) == 1 && (mM & 1) == 0) {
      return Z.ZERO;
    }
    if (Predicates.PRIME.is(mN) && mM > 1 && mM < mN) {
      return Z.ZERO;
    }
    long k = 0;
    while (true) {
      if (is(++k)) {
        return Z.valueOf(k);
      }
      if (mVerbose && k % 10000000 == 0) {
        StringUtils.message("n=" + mN + " k=" + mM + " search completed to " + k);
      }
    }
  }
}

