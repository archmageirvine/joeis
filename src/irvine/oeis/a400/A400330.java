package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400330 allocated for Giuseppe Ciacco.
 * @author Sean A. Irvine
 */
public class A400330 extends Sequence2 {

  // todo Something is wrong with the sequence definition

  private final FactorSequence mFactorSequence = new FactorSequence();
  private long mN = 1;

  @Override
  public Z next() {
    mFactorSequence.add(++mN);
    Jaguar.factor(mFactorSequence);
    final Z[] d = mFactorSequence.divisorsSorted();
    Z min = null;
    for (int k = 1; k < d.length; ++k) {
      final Z u = d[k];
      for (int j = k - 1; j >= 0; --j) {
        final Z v = d[j];
        if (min != null && u.subtract(v).compareTo(min) >= 0) {
          break;
        }
        if (Functions.GCD.z(u, v).equals(Z.TWO)) {
          System.out.println(mN + " new min " + min + " " + u + " " + v);
          min = u.subtract(v);
        }
      }
    }
    return min == null ? Z.ZERO : min;
  }
}
