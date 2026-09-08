package irvine.oeis.a399;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A399470 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A399470 extends Sequence1 {
  
  // After Felix Huber

  private int mN = 0;
  private long[] mDivisors;
  private int mCount;

  private boolean f(final long j, final Set<Long> u, final Set<Long> v) {
    if (v.contains(2 * j)) {
      return false;
    }
    for (final long k : u) {
      if (v.contains(j + k)) {
        return false;
      }
    }
    return true;
  }

  private void g(final int i, final Set<Long> u, final Set<Long> v) {
    if (i >= mDivisors.length) {
      for (final long j : mDivisors) {
        if (!u.contains(j) && f(j, u, v)) {
          return;
        }
      }
      ++mCount;
      return;
    }

    final long j = mDivisors[i];
    if (f(j, u, v)) {
      final Set<Long> uu = new HashSet<>(u);
      uu.add(j);
      final Set<Long> vv = new HashSet<>(v);
      vv.add(2 * j);
      for (final long k : u) {
        vv.add(j + k);
      }
      g(i + 1, uu, vv);
    }
    g(i + 1, u, v);
  }

  @Override
  public Z next() {
    ++mN;
    mDivisors = ZUtils.toLong(Jaguar.factor(mN).divisorsSorted());
    mCount = 0;
    g(0, new HashSet<>(), new HashSet<>());
    return Z.valueOf(mCount);
  }
}
