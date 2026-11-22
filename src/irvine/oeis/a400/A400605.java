package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a060.A060843;
import irvine.oeis.a398.A398770;

/**
 * A400605 Square array read by antidiagonals: S(n,m) is the maximal number of steps that an n-state m-symbol Turing machine can make on an initially blank tape before eventually halting.
 * @author Gregory Morse
 */
public class A400605 extends Sequence1 {
  private final A060843 mBinary = new A060843();
  private final A398770 mTwoStates = new A398770();
  private int mDiagonal = 1;
  private int mStates = 0;

  @Override
  public Z next() {
    if (--mStates < 1) {
      mStates = mDiagonal++;
    }
    final int symbols = mDiagonal - mStates;
    if (symbols == 1) {
      return Z.valueOf(mStates);
    }
    if (mStates == 1) {
      return Z.ONE;
    }
    if (symbols == 2 && mStates <= mBinary.size()) {
      return mBinary.a(mStates);
    }
    if (mStates == 2 && symbols <= mTwoStates.size()) {
      return mTwoStates.a(symbols);
    }
    throw new UnsupportedOperationException("Busy Beaver value not known");
  }
}
