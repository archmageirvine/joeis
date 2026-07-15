package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397501 a(n) is the number of set partitions of {0, ..., n} in which, for every part P, the sum of binomial(n, k) over k in P is a power of 2.
 * @author Sean A. Irvine
 */
public class A397501 extends Sequence0 {

  // After Felix Huber

  private int mN = -1;
  private Z[] mBinomial;
  private HashMap<BitSet, Z> mCache;

  @Override
  public Z next() {
    ++mN;
    mBinomial = new Z[mN + 1];
    for (int k = 0; k <= mN; ++k) {
      mBinomial[k] = Binomial.binomial(mN, k);
    }

    if (mN >= 3) {
      int d = mN - 1;
      while ((d & 1) == 0) {
        d >>= 1;
      }
      if (d == 1) {
        return Z.ONE.shiftLeft((mN - 1) / 2).add(1);
      }
    }

    final BitSet all = new BitSet();
    all.set(0, mN + 1);
    mCache = new HashMap<>();
    return c(all);
  }

  private Z c(final BitSet r) {
    final Z cached = mCache.get(r);
    if (cached != null) {
      return cached;
    }

    if (r.isEmpty()) {
      return Z.ONE;
    }

    int m = -1;
    Z best = Z.NEG_ONE;
    for (int k = r.nextSetBit(0); k >= 0; k = r.nextSetBit(k + 1)) {
      if (m < 0 || mBinomial[k].compareTo(best) > 0) {
        best = mBinomial[k];
        m = k;
      }
    }

    final BitSet s = (BitSet) r.clone();
    s.clear(m);

    final ArrayList<Integer> v = new ArrayList<>();
    for (int k = s.nextSetBit(0); k >= 0; k = s.nextSetBit(k + 1)) {
      v.add(k);
    }
    v.sort((x, y) -> mBinomial[y].compareTo(mBinomial[x]));

    final int p = v.size();

    final Z[] q = new Z[p + 1];
    q[0] = Z.ZERO;
    for (int j = 0; j < p; ++j) {
      q[j + 1] = q[j].add(mBinomial[v.get(j)]);
    }
    final Z z = q[p];

    final ArrayList<Z> w = new ArrayList<>();
    if (best.compareTo(best.add(z)) <= 0) {
      Z t = Z.ONE;
      while (t.compareTo(best) < 0) {
        t = t.multiply2();
      }
      Z y = t;
      while (y.compareTo(best.add(z)) <= 0) {
        y = y.multiply2();
      }
      y = y.divide2();

      for (Z x = t; x.compareTo(y) <= 0; x = x.multiply2()) {
        w.add(x);
      }
    }

    final int[] h = new int[p];
    final int[] g = new int[p];

    for (int j = p - 1; j >= 0; --j) {
      Z y = mBinomial[v.get(j)];
      int x = 0;
      while (y.isEven()) {
        y = y.divide2();
        ++x;
      }
      if (j == p - 1) {
        h[j] = mBinomial[v.get(j)].isOdd() ? 1 : 0;
        g[j] = x;
      } else {
        h[j] = h[j + 1] + (mBinomial[v.get(j)].isOdd() ? 1 : 0);
        g[j] = Math.min(g[j + 1], x);
      }
    }

    class Search {
      private Z mSum = Z.ZERO;

      void f(final int pos, final Z have, final Z remain, final Z target, final BitSet remove) {
        if (have.equals(target)) {
          final BitSet next = (BitSet) s.clone();
          next.andNot(remove);
          mSum = mSum.add(c(next));
          return;
        }

        if (have.compareTo(target) > 0 || pos >= p || have.add(remain).compareTo(target) < 0) {
          return;
        }

        final Z diff = target.subtract(have);

        if (diff.isOdd() && h[pos] == 0) {
          return;
        }

        if (g[pos] > 0) {
          final Z mod = Z.ONE.shiftLeft(g[pos]);
          if (!diff.mod(mod).isZero()) {
            return;
          }
        }

        final int j = v.get(pos);
        final Z k = mBinomial[j];
        final Z u = remain.subtract(k);

        f(pos + 1, have, u, target, remove);

        if (have.add(k).compareTo(target) <= 0) {
          remove.set(j);
          f(pos + 1, have.add(k), u, target, remove);
          remove.clear(j);
        }
      }
    }

    final Search search = new Search();

    for (final Z x : w) {
      if (x.equals(best)) {
        search.mSum = search.mSum.add(c(s));
      } else {
        final Z y = x.subtract(best);
        if (y.compareTo(z) <= 0) {
          search.f(0, Z.ZERO, z, y, new BitSet());
        }
      }
    }

    mCache.put((BitSet) r.clone(), search.mSum);
    return search.mSum;
  }
}
