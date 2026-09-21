package irvine.oeis.a399;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000142;

/**
 * A399803 Smallest prime that is the sum of n distinct elements from the union of primes and factorials.
 * @author Sean A. Irvine
 */
public class A399803 extends Sequence1 {

  private final DirectSequence mU = DirectSequence.create(0, new UnionSequence(new A000040(), new A000142()));
  private long mN = 0;

  private static final class State implements Comparable<State> {
    private final Z mKey;
    private final Z mSum;
    private final int mCnt;
    private final int mPos;

    private State(final Z sum, final Z min, final int cnt, final int pos) {
      mKey = sum.max(min);
      mSum = sum;
      mCnt = cnt;
      mPos = pos;
    }

    @Override
    public int compareTo(final State state) {
      final int b = mKey.compareTo(state.mKey);
      if (b != 0) {
        return b;
      }
      final int c = mSum.compareTo(state.mSum);
      if (c != 0) {
        return c;
      }
      final int d = Integer.compare(mCnt, state.mCnt);
      if (d != 0) {
        return d;
      }
      return Long.compare(mPos, state.mPos);
    }
  }

  @Override
  public Z next() {
    ++mN;
    final TreeSet<State> s = new TreeSet<>();
    s.add(new State(Z.ZERO, Z.ZERO, 0, 0));
    while (true) {
      final State state = s.pollFirst();
      if (state.mCnt == mN && state.mSum.isProbablePrime()) {
        return state.mSum;
      }
      if (state.mCnt < mN) {
        final Z v = mU.a(state.mPos);
        final Z min = v.multiply(mN - state.mCnt);
        s.add(new State(state.mSum.add(v), min, state.mCnt + 1, state.mPos + 1));
        s.add(new State(state.mSum, min, state.mCnt, state.mPos + 1));
      }
    }
  }
}

