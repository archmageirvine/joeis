package irvine.oeis.a397;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397366 allocated for Ruud H.G. van Tol.
 * @author Sean A. Irvine
 */
public class A397366 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mN;
      final Z m = Z.valueOf(4 * mN - 1);
      final Z m4 = m.subtract(Z.FOUR.mod(m));
      for (final Z d : Jaguar.factor(mN * mN).divisors()) {
        mA.add(d.modMultiply(m4, m));
      }
    }
    return mA.pollFirst();
  }
}
