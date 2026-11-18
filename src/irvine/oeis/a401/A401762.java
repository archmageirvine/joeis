package irvine.oeis.a401;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401762 allocated for Pietro Tiaraju Giavarina dos Santos.
 * @author Sean A. Irvine
 */
public class A401762 extends Sequence1 {

  // R[state][symbol] = {written symbol, movement, next state}
  private static final int[][][] R = {
    {
      {1, 1, 1},
      {2, -1, 0},
      {1, -1, 0}
    },
    {
      {2, -1, 0},
      {2, 1, 1},
      {0, 1, 0}
    }
  };

  private int mN;
  private Z[] mPow4;
  private Map<Key, Z> mCache;

  private static final class Key {
    private final int mState;
    private final int mPos;
    private final int mK;
    private final Z mTape;

    private Key(final int state, final int pos, final int k, final Z tape) {
      mState = state;
      mPos = pos;
      mK = k;
      mTape = tape;
    }

    @Override
    public int hashCode() {
      int h = mTape.hashCode();
      h = 31 * h + mState;
      h = 31 * h + mPos;
      return 31 * h + mK;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Key)) {
        return false;
      }
      final Key other = (Key) obj;
      return mState == other.mState
        && mPos == other.mPos
        && mK == other.mK
        && mTape.equals(other.mTape);
    }
  }

  private Z f(final int state, final Z tape, final int pos, final int k) {
    if (k == mN) {
      return Z.ONE;
    }

    final Key key = new Key(state, pos, k, tape);
    final Z cached = mCache.get(key);
    if (cached != null) {
      return cached;
    }

    // Each tape cell occupies two bits:
    // 00 = never visited, 01 = visited and contains 0,
    // 10 = visited and contains 1, 11 = visited and contains 2.
    final int index = pos + mN;
    final int shift = 2 * index;
    final int digit = tape.shiftRight(shift).intValue() & 3;
    final int first = digit == 0 ? 0 : digit - 1;
    final int last = digit == 0 ? 2 : first;

    Z sum = Z.ZERO;
    for (int s = first; s <= last; ++s) {
      final int[] transition = R[state][s];
      final int written = transition[0];
      final int newState = transition[2];
      final int newPos = pos + transition[1];
      // Update the tape cell, preserving its visited status.
      final Z newTape = tape.add(mPow4[index].multiply(Z.valueOf(written + 1L - digit)));
      sum = sum.add(f(newState, newTape, newPos, k + 1));
    }
    mCache.put(key, sum);
    return sum;
  }

  @Override
  public Z next() {
    // Powers of four encode the tape using two bits per cell
    mPow4 = new Z[2 * ++mN + 1];
    for (int i = 0; i < mPow4.length; ++i) {
      mPow4[i] = Z.ONE.shiftLeft(2L * i);
    }
    mCache = new HashMap<>();
    return f(0, Z.ZERO, 0, 0).add(f(1, Z.ZERO, 0, 0));
  }
}
