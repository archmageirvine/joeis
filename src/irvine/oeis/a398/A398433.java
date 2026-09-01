package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A398433 Numbers k such that the set of positive divisors of k is not a Sidon set, but the set of positive divisors of every proper divisor of k is a Sidon set.
 * @author Sean A. Irvine
 */
public class A398433 extends Sequence1 {

  // After Felix Huber

  private final List<Boolean> mS = new ArrayList<>();
  private final List<Boolean> mP = new ArrayList<>();
  private long mNext = 1;
  private int mN = -1;

  private boolean s(final long n) {
    if (n < mS.size() && mS.get((int) n) != null) {
      return mS.get((int) n);
    }
    final long[] divisors = ZUtils.toLong(Jaguar.factor(n).divisors());
    final Set<Long> sums = new HashSet<>();
    for (int i = 0; i < divisors.length; ++i) {
      for (int j = i; j < divisors.length; ++j) {
        if (!sums.add(divisors[i] + divisors[j])) {
          setS(n, false);
          return false;
        }
      }
    }
    setS(n, true);
    return true;
  }

  private boolean p(final long n) {
    if (n < mP.size() && mP.get((int) n) != null) {
      return mP.get((int) n);
    }
    if (s(n)) {
      setP(n, false);
      return false;
    }
    for (final long d : ZUtils.toLong(Jaguar.factor(n).divisors())) {
      if (d < n && !s(d)) {
        setP(n, false);
        return false;
      }
    }
    setP(n, true);
    return true;
  }

  private void setS(final long n, final boolean value) {
    while (mS.size() <= n) {
      mS.add(null);
    }
    mS.set((int) n, value);
  }

  private void setP(final long n, final boolean value) {
    while (mP.size() <= n) {
      mP.add(null);
    }
    mP.set((int) n, value);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      mNext = 6;
      return Z.SIX;
    }
    ++mNext;
    while (!p(mNext)) {
      ++mNext;
    }
    return Z.valueOf(mNext);
  }
}
