package irvine.oeis.a400;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400294 Numbers that are the difference of positive numbers of the form (k*(k+2))^2 (A099761).
 * @author Sean A. Irvine
 */
public class A400294 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 2;
  private Z mK0 = Z.NINE;
  private Z mK1 = Z.valueOf(64);

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mK1.subtract(mK0)) >= 0) {
      for (long j = 1; j < mN; ++j) {
        mA.add(mK1.subtract(Z.valueOf(j * (j + 2)).square()));
      }
      mK0 = mK1;
      mK1 = Z.valueOf(++mN * (mN + 2)).square();
    }
    return mA.pollFirst();
  }
}

