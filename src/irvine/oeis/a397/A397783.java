package irvine.oeis.a397;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001694;

/**
 * A397783 allocated for Lee M. J. Rich.
 * @author Sean A. Irvine
 */
public class A397783 extends Sequence1 {

  protected final HashSet<Z> mSeen = new HashSet<>();
  private final DirectSequence mS = DirectSequence.create(new A001694());
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    if (mA.isOne()) {
      mA = Z.FOUR;
      return mA;
    }
    long k = 2;
    while (true) {
      final Z s = mS.a(++k);
      if (!mSeen.contains(s) && Functions.GCD.l(mA, s) > 1) {
        mA = s;
        mSeen.add(s);
        return mA;
      }
    }
  }
}
