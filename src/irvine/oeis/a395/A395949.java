package irvine.oeis.a395;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395949 allocated for Daniel Crespo.
 * @author Sean A. Irvine
 */
public class A395949 extends Sequence1 {

  private static final long[] DIGITS = {0, 2, 3, 5, 7};
  private final TreeSet<State> mA = new TreeSet<>();
  private Z mPrev = Z.ZERO;

  private static final class State implements Comparable<State> {
    private final Z mA;
    private final Z mB;
    private final long mC;

    private State(final Z b, final long c) {
      mB = b;
      mC = c;
      mA = new Z(mB.toString() + c);
    }

    @Override
    public int compareTo(final State state) {
      final int c = mA.compareTo(state.mA);
      if (c != 0) {
        return c;
      }
      final int d = mB.compareTo(state.mB);
      if (d != 0) {
        return d;
      }
      return Long.compare(mC, state.mC);
    }
  }

  {
    mA.add(new State(Z.TWO, 2));
    mA.add(new State(Z.THREE, 3));
    mA.add(new State(Z.FIVE, 5));
    mA.add(new State(Z.SEVEN, 7));
  }

  @Override
  public Z next() {
    while (true) {
      final State s = mA.pollFirst();
      final Z b10 = s.mB.multiply(10);
      for (final long d : DIGITS) {
        mA.add(new State(b10.add(d), s.mC + d));
      }
      if (!s.mA.equals(mPrev) && s.mA.isProbablePrime()) {
        mPrev = s.mA;
        return mPrev;
      }
    }
  }
}

