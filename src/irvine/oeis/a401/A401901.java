package irvine.oeis.a401;

import java.util.ArrayDeque;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401901
 * @author Sean A. Irvine
 */
public class A401901 extends Sequence1 {

  private static class State {
    private final Z mJ;
    private final Z mB;
    private final Z mFirst;

    State(final Z j, final Z b, final Z first) {
      mJ = j;
      mB = b;
      mFirst = first;
    }
  }

  private final ArrayDeque<State> mStack = new ArrayDeque<>();
  private Z mOriginal = Z.ONE;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    mP = mP.add(Z.ONE);
    final Z j;
    final Z b;
    if (!mStack.isEmpty()) {
      final State s = mStack.pop();
      j = s.mJ;
      b = s.mB;
      if (b.compareTo(s.mFirst) > 0) {
        mStack.push(new State(j, b.subtract(Z.ONE), s.mFirst));
      }
    } else {
      j = mOriginal;
      b = Z.ZERO;
      mOriginal = mOriginal.add(Z.ONE);
    }
    if (j.compareTo(Z.ONE) > 0 && mP.compareTo(b.add(Z.ONE)) > 0) {
      mStack.push(new State(j.subtract(Z.ONE), mP.subtract(Z.ONE), b.add(Z.ONE)));
    }
    return j;
  }
}
