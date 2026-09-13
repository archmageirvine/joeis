package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398810 allocated for Soslan Daurov.
 * @author Sean A. Irvine
 */
public class A398810 extends Sequence0 {

  // After Soslan Daurov

  private int mN = 0;
  private List<Integer> mDivisors;
  private int[] mWeight;
  private Map<Integer, Integer> mIndex;
  private Map<State, BitSet> mStepCache;
  private Map<State, Z> mHCache;

  private static final class State {
    private final int mT;
    private final BitSet mSet;

    private State(final int t, final BitSet set) {
      mT = t;
      mSet = (BitSet) set.clone();
    }

    @Override
    public int hashCode() {
      return 31 * mT + mSet.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mT == other.mT && mSet.equals(other.mSet);
    }
  }

  private BitSet step(final BitSet t, final int e) {
    final State key = new State(e, t);
    final BitSet cached = mStepCache.get(key);
    if (cached != null) {
      return (BitSet) cached.clone();
    }
    final BitSet result = new BitSet(mDivisors.size());
    for (int mi = t.nextSetBit(0); mi >= 0; mi = t.nextSetBit(mi + 1)) {
      final int value = mDivisors.get(mi);
      for (int ai = e; ai < mDivisors.size(); ++ai) {
        final int a = mDivisors.get(ai);
        if (value % a == 0) {
          result.set(mIndex.get(value / a));
        }
      }
    }
    mStepCache.put(key, (BitSet) result.clone());
    return result;
  }

  private Z h(final int t, final BitSet set) {
    if (t == 0) {
      return set.get(0) ? Z.ONE : Z.ZERO;
    }

    final State key = new State(t, set);
    final Z cached = mHCache.get(key);
    if (cached != null) {
      return cached;
    }

    Z sum = Z.ZERO;
    for (int e = 0; e < mDivisors.size(); ++e) {
      final BitSet u = step(set, e);
      if (!u.isEmpty()) {
        sum = sum.add(h(t - 1, u).multiply(mWeight[e]));
      }
    }

    mHCache.put(key, sum);
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    mDivisors = new ArrayList<>();
    for (int x = 1; x <= mN; ++x) {
      if (mN % x == 0) {
        mDivisors.add(x);
      }
    }
    final int size = mDivisors.size();
    mWeight = new int[size];
    mIndex = new HashMap<>();
    int previous = 0;
    for (int i = 0; i < size; ++i) {
      final int x = mDivisors.get(i);
      mWeight[i] = x - previous;
      previous = x;
      mIndex.put(x, i);
    }
    mStepCache = new HashMap<>();
    mHCache = new HashMap<>();
    final BitSet initial = new BitSet(size);
    initial.set(mIndex.get(mN));
    return h(5, initial);
  }
}
