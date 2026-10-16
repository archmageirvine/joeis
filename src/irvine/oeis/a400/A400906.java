package irvine.oeis.a400;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A400906 allocated for Michael B. Porter.
 * @author Sean A. Irvine
 */
public class A400906 extends Sequence1 {

  private final Sequence mPiSequence = new A000796();
  private Z mPi = Z.ZERO;
  private final LinkedList<Z> mA = new LinkedList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mPi = mPi.multiply(10).add(mPiSequence.next());
      final FactorSequence fs = Jaguar.factor(mPi);
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p);
        for (int k = 0; k < e; ++k) {
          mA.add(p);
        }
      }
    }
    return mA.pollFirst();
  }
}
