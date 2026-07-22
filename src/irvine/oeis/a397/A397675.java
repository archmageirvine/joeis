package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397675 allocated for Alex Weslowski.
 * @author Sean A. Irvine
 */
public class A397675 extends Sequence1 {

  // After Alex Weslowski

  private long mN = 0;
  private final LinkedList<Z> mPending = new LinkedList<>();

  private Q cover(final ArrayList<Long> v) {
    Q sum = Q.ZERO;
    final int m = v.size();
    final int lim = 1 << m;
    for (int mask = 1; mask < lim; ++mask) {
      long lcm = 1;
      int bits = 0;
      for (int k = 0; k < m; ++k) {
        if ((mask & (1 << k)) != 0) {
          ++bits;
          lcm = Functions.LCM.l(lcm, v.get(k));
        }
      }
      final Q t = new Q(Z.ONE, Z.valueOf(lcm));
      sum = (bits & 1) == 1 ? sum.add(t) : sum.subtract(t);
    }
    return sum;
  }

  private ArrayList<ArrayList<Long>> partitions(final long n, final long k) {
    final ArrayList<ArrayList<Long>> res = new ArrayList<>();
    if (n == 1) {
      res.add(new ArrayList<>());
      return res;
    }
    final long k0 = Math.max(k, 2);
    for (final Z dz : Jaguar.factor(Z.valueOf(n)).divisors()) {
      final long d = dz.longValueExact();
      if (d < k0 || n % d != 0) {
        continue;
      }
      for (final ArrayList<Long> p : partitions(n / d, d)) {
        boolean ok = true;
        for (final long x : p) {
          if (x % d == 0) {
            ok = false;
            break;
          }
        }
        if (ok) {
          final ArrayList<Long> q = new ArrayList<>();
          q.add(d);
          q.addAll(p);
          res.add(q);
        }
      }
    }
    return res;
  }

  @Override
  public Z next() {
    if (!mPending.isEmpty()) {
      return mPending.pollFirst();
    }

    while (true) {
      mN += 2;
      for (final ArrayList<Long> p : partitions(mN, 0)) {
        if (cover(p).equals(Q.HALF)) {
          mPending.addLast(Z.valueOf(mN));
        }
      }
      if (!mPending.isEmpty()) {
        return mPending.pollFirst();
      }
    }
  }
}
