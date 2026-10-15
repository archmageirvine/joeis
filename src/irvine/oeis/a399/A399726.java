package irvine.oeis.a399;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399726 allocated for James Guillochon.
 * @author Sean A. Irvine
 */
public class A399726 extends Sequence0 {

  // After James Guillochon

  // State: (free heads, open-bottom tower ends, outer closed dolls, outer tops)
  private static final class State {
    private final int mS;
    private final int mF;
    private final int mE;
    private final int mT;

    private State(final int s, final int f, final int e, final int t) {
      mS = s;
      mF = f;
      mE = e;
      mT = t;
    }

    @Override
    public int hashCode() {
      int h = mS;
      h = 31 * h + mF;
      h = 31 * h + mE;
      return 31 * h + mT;
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
      return mS == other.mS && mF == other.mF
        && mE == other.mE && mT == other.mT;
    }
  }

  private Map<State, Z> mState = new HashMap<>();

  private static void add(final Map<State, Z> map, final int s, final int f, final int e, final int t, final Z weight, final int multiplicity) {
    if (multiplicity == 0) {
      return;
    }
    final State key = new State(s, f, e, t);
    final Z value = weight.multiply(Z.valueOf(multiplicity));
    map.put(key, map.getOrDefault(key, Z.ZERO).add(value));
  }

  private static void addTopTransitions(final Map<State, Z> next, final Z w, final int s2, final int f2, final int e, final int t, final int multiplicity) {
    if (multiplicity == 0) {
      return;
    }
    add(next, s2 + 1, f2, e, t + 1, w, multiplicity);
    add(next, s2, f2, e, t + 1, w, s2 * multiplicity);
    add(next, s2, f2, e, t, w, t * multiplicity);
  }

  @Override
  public Z next() {
    if (mState.isEmpty()) {
      mState.put(new State(0, 0, 0, 0), Z.ONE);
      return Z.ONE;
    }

    final Map<State, Z> next = new HashMap<>();
    for (final Map.Entry<State, Z> entry : mState.entrySet()) {
      final State q = entry.getKey();
      final Z w = entry.getValue();
      final int s = q.mS;
      final int f = q.mF;
      final int e = q.mE;
      final int t = q.mT;

      // Transitions that do not create an outer top.
      add(next, s + 1, f, e + 1, t, w, 1);
      add(next, s, f, e + 1, t, w, s);

      add(next, s + 1, f - 1, e + 1, t, w, f);
      add(next, s, f, e, t, w, e);

      // Transitions that involve an outer top.
      // The three choices of (s2, f2, multiplicity).
      addTopTransitions(next, w, s, f + 1, e, t, 1);
      addTopTransitions(next, w, s - 1, f + 1, e, t, s);
      addTopTransitions(next, w, s, f, e, t, f + e);
    }

    mState = next;
    Z sum = Z.ZERO;
    for (final Z w : mState.values()) {
      sum = sum.add(w);
    }
    return sum;
  }

}
