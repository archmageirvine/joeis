package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398809 Number of integer quadruples (w,x,y,z), all &gt; 0, such that w &lt;= s, x &lt;= t, y &lt;= u, z &lt;= v for some factorization n = s*t*u*v.
 * @author Sean A. Irvine
 */
public class A398809 extends Sequence0 {

  private long mN = 0;
  private List<Long> mDivisors;
  private Map<Long, Integer> mIndex;
  private long[] mWeight;
  private final Map<State, Z> mCache = new HashMap<>();

  private BitSet step(final BitSet t, final int e) {
    final BitSet result = new BitSet(mDivisors.size());
    for (int mi = t.nextSetBit(0); mi >= 0; mi = t.nextSetBit(mi + 1)) {
      final long m = mDivisors.get(mi);
      for (int ai = e; ai < mDivisors.size(); ++ai) {
        final long a = mDivisors.get(ai);
        if (a > m) {
          break;
        }
        if (m % a == 0) {
          final long q = m / a;
          result.set(mIndex.get(q));
        }
      }
    }
    return result;
  }

  private Z h(final int t, final BitSet set) {
    if (t == 0) {
      return set.get(mIndex.get(1L)) ? Z.ONE : Z.ZERO;
    }
    final State key = new State(t, set);
    final Z cached = mCache.get(key);
    if (cached != null) {
      return cached;
    }
    Z sum = Z.ZERO;
    for (int e = 0; e < mDivisors.size(); ++e) {
      final BitSet u = step(set, e);
      if (!u.isEmpty()) {
        final Z term = h(t - 1, u);
        if (!term.isZero()) {
          sum = sum.add(term.multiply(mWeight[e]));
        }
      }
    }
    mCache.put(key, sum);
    return sum;
  }

  /**
   * Immutable cache key.
   */
  private static final class State {
    private final int mT;
    private final BitSet mSet;
    private final int mHash;

    State(final int t, final BitSet set) {
      mT = t;
      mSet = (BitSet) set.clone();
      mHash = 31 * t + mSet.hashCode();
    }

    @Override
    public int hashCode() {
      return mHash;
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj) {
        return true;
      }
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mT == other.mT && mSet.equals(other.mSet);
    }
  }

  @Override
  public Z next() {
    ++mN;
    final FactorSequence fs = Jaguar.factor(mN);
    if (fs.omega() == 1) {
      final Z p = fs.toZArray()[0];
      final int e = fs.getExponent(p);
      return Integers.SINGLETON.sum(0, Math.min(3, e), j -> Z.NEG_ONE.pow(j).multiply(Binomial.binomial(3, j)).multiply(Binomial.binomial(e - j + 3, 3)).multiply(p.pow(e - j)));
    }
    mDivisors = new ArrayList<>();
    for (final Z d : fs.divisorsSorted()) {
      mDivisors.add(d.longValueExact());
    }
    mIndex = new HashMap<>();
    for (int i = 0; i < mDivisors.size(); ++i) {
      mIndex.put(mDivisors.get(i), i);
    }
    mWeight = new long[mDivisors.size()];
    long p = 0;
    for (int i = 0; i < mDivisors.size(); ++i) {
      final long x = mDivisors.get(i);
      mWeight[i] = x - p;
      p = x;
    }
    mCache.clear();
    final BitSet initial = new BitSet(mDivisors.size());
    initial.set(mIndex.get(mN));
    return h(4, initial);
  }
}
