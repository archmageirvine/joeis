package irvine.oeis.a402;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A402240 allocated for Yinon Werner.
 * @author Sean A. Irvine
 */
public class A402240 extends Sequence0 {

  private static final Z ONE = Z.ONE;

  private int mN = -1;
  private Map<State, Z> mCache;

  private static class State {
    private final int mY;
    private final Z mAllowed;
    private final Z mChosen;

    State(final int y, final Z allowed, final Z chosen) {
      mY = y;
      mAllowed = allowed;
      mChosen = chosen;
    }

    @Override
    public int hashCode() {
      int h = mY;
      h = 31 * h + mAllowed.hashCode();
      h = 31 * h + mChosen.hashCode();
      return h;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mY == other.mY && mAllowed.equals(other.mAllowed) && mChosen.equals(other.mChosen);
    }
  }

  private Z f(final int y, final Z allowed, final Z chosen) {
    if (y == 0) {
      return Z.ONE;
    }
    final State state = new State(y, allowed, chosen);
    final Z cached = mCache.get(state);
    if (cached != null) {
      return cached;
    }

    // Numbers strictly below y.
    final Z low = ONE.shiftLeft(y).subtract(ONE);
    // Retain chosen numbers below 2^(bit length of y-1).
    final int bitLength = Integer.SIZE - Integer.numberOfLeadingZeros(y - 1);
    final int limit = 1 << bitLength;
    final Z keep = ONE.shiftLeft(limit).subtract(ONE);
    // Case 1: y is not included.
    Z total = f(y - 1, allowed.and(low), chosen.and(keep));
    // Case 2: y is included, provided it is allowed.
    if (allowed.testBit(y)) {
      final Z c = chosen.setBit(y);
      Z bad = Z.ZERO;
      for (int w = 1; w < y; ++w) {
        final int v = w | y;
        if (v <= mN && !c.testBit(v)) {
          bad = bad.setBit(w);
        }
      }
      total = total.add(f(y - 1, allowed.and(low).andNot(bad), c.and(keep)));
    }
    mCache.put(state, total);
    return total;
  }

  @Override
  public Z next() {
    ++mN;
    mCache = new HashMap<>();
    // Bits 1 through n initially allowed; bit 0 is excluded.
    final Z allowed = ONE.shiftLeft(mN + 1).subtract(Z.TWO);
    return f(mN, allowed, Z.ZERO);
  }
}
