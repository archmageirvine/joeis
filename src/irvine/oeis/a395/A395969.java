package irvine.oeis.a395;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395969 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A395969 extends Sequence1 {

  // After Robert Israel

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.TWO);
    mA.add(Z.EIGHT);
  }
  private long mN = 1;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z lo = Z.TEN.pow(mN).subtract(1);
      final Z hi = Z.TEN.pow(++mN).subtract(1);
      for (final Z t : Jaguar.factor(Z.TEN.pow(2 * mN).subtract(1).divide(3)).divisors()) {
        final Z t1 = t.subtract(1);
        if (t1.compareTo(lo) >= 0 && t1.compareTo(hi) < 0) {
          mA.add(t1);
        }
      }
    }
    return mA.pollFirst();
  }
}
