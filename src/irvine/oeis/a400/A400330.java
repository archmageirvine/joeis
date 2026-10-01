package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A400330 allocated for Giuseppe Ciacco.
 * @author Sean A. Irvine
 */
public class A400330 extends AbstractSequence {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private long mN = 3;
  private Z mF = Z.SIX;

  /** Construct the sequence. */
  public A400330() {
    super(4);
    mFactorSequence.add(2);
    mFactorSequence.add(3);
  }

  @Override
  public Z next() {
    mFactorSequence.add(++mN);
    mF = mF.multiply(mN);
    Jaguar.factor(mFactorSequence);
    final Z[] d = mFactorSequence.divisors();
    Z min = null;
    for (final Z u : d) {
      if (u.square().compareTo(mF) < 0) {
        final Z v = mF.divide(u);
        if (Functions.GCD.z(u, v).equals(Z.TWO)) {
          //System.out.println(mN + " new min " + min + " " + u + " " + v);
          final Z diff = v.subtract(u);
          min = min == null ? diff : min.min(diff);
        }
      }
    }
    return min == null ? Z.ZERO : min;
  }
}
