package irvine.oeis.a400;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400311 allocated for Eric Fox.
 * @author Sean A. Irvine
 */
public class A400311 extends CachedSequence {

  private final HashSet<Z> mForbidden = new HashSet<>();

  /** Construct the sequence. */
  public A400311() {
    super(0);
  }

  //  0 <= i < j < k <= n, |(j-i)*(a(k)-a(i)) - (k-i)*(a(j)-a(i))|
  private boolean isOk(final long k, final Z ak) {
    for (long i = 0; i < k; ++i) {
      for (long j = i + 1; j < k; ++j) {
        final Z t = ak.subtract(a(i)).multiply(j - i).subtract(a(j).subtract(a(i)).multiply(k - i)).abs();
        if (mForbidden.contains(t)) {
          return false;
        }
      }
    }
//    for (long i = 0; i < k; ++i) {
//      for (long j = i + 1; j < k; ++j) {
//        final Z t = a(j).subtract(ak).multiply(i).add(ak.subtract(a(i)).multiply(j)).add(a(i).subtract(a(j)).multiply(k));
//        if (t.isZero()) {
//          return false; // collinear
//        }
//      }
//    }
    return true;
  }

  private void accept(final long k, final Z ak) {
    for (long i = 0; i < k; ++i) {
      for (long j = i + 1; j < k; ++j) {
        final Z t = ak.subtract(a(i)).multiply(j - i).subtract(a(j).subtract(a(i)).multiply(k - i)).abs();
        mForbidden.add(t);
      }
    }
  }

  @Override
  protected Z compute(final Z m) {
    final long n = m.longValueExact();
    if (n <= 1) {
      mForbidden.add(Z.ZERO);
      return Z.ZERO;
    }
    Z a = a(n - 1);
    while (true) {
      a = a.add(1);
      if (isOk(n, a)) {
        accept(n, a);
        return a;
      }
    }
  }
}
