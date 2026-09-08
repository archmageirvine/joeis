package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399487 Initial digit of the decimal expansion of n^(n^(n^8)).
 * @author Sean A. Irvine
 */
public class A399487 extends Sequence1 {

  private final long mExp;
  private int mN = 0;

  protected A399487(final long exp) {
    mExp = exp;
  }

  /** Construct the sequence. */
  public A399487() {
    this(8);
  }

  private Z f(final Z base, final Z exp) {
    final CR logBase = CR.valueOf(base).log10();
    final CR f = logBase.multiply(exp).frac();
    return CR.TEN.pow(f).floor();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    return f(n, n.pow(n.pow(mExp)));
  }
}
