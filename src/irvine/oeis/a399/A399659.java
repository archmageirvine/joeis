package irvine.oeis.a399;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399659 allocated for Niccol\u00f2 Castronuovo.
 * @author Sean A. Irvine
 */
public class A399659 extends Sequence0 {

  private static final class State {
    private final int mH;
    private final int mR;

    private State(final int h, final int r) {
      mH = h;
      mR = r;
    }

    @Override
    public boolean equals(final Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof State)) {
        return false;
      }
      final State state = (State) o;
      return mH == state.mH && mR == state.mR;
    }

    @Override
    public int hashCode() {
      return 31 * mH + mR;
    }
  }

  private Map<State, Z> mCur = new HashMap<>();
  {
    mCur.put(new State(0, 0), Z.ONE);
  }

  @Override
  public Z next() {
    // Sum values where height (h) == 0 for the current term
    Z sum = Z.ZERO;
    for (final Map.Entry<State, Z> entry : mCur.entrySet()) {
      if (entry.getKey().mH == 0) {
        sum = sum.add(entry.getValue());
      }
    }
    // Compute the next state map
    final Map<State, Z> nxt = new HashMap<>();
    for (final Map.Entry<State, Z> entry : mCur.entrySet()) {
      final State s = entry.getKey();
      final Z v = entry.getValue();
      final int h = s.mH;
      final int r = s.mR;
      // Up move: (h + 1, r)
      nxt.merge(new State(h + 1, r), v, Z::add);
      // Down move: if h > 0, (h - 1, max(r - 1, 0))
      if (h > 0) {
        nxt.merge(new State(h - 1, Math.max(r - 1, 0)), v, Z::add);
      }
      // Level move: if r == 0, (h, h)
      if (r == 0) {
        nxt.merge(new State(h, h), v, Z::add);
      }
    }
    mCur = nxt;
    return sum;
  }
}
