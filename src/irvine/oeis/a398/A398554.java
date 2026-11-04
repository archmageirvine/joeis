package irvine.oeis.a398;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398554 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A398554 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 1;
  private Z mN2 = Z.ONE;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN2.square().multiply(4)) > 0) {
      final Z t = Z.valueOf(2 * mN);
      for (long m = (mN & 1) + 1; m < mN; m += 2) {
        if (Functions.GCD.l(mN, m) == 1) {
          final Z v = mN2.multiply2().add(t.multiply(m)).square().subtract(mN2.add(Z.valueOf(m).square()));
          if (v.isProbablePrime()) {
            mA.add(v);
          }
        }
      }
      mN2 = Z.valueOf(++mN).square();
    }
    return mA.pollFirst();
  }
}
