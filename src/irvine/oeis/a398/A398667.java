package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398667 Initial digit of the decimal expansion of 5^(5^(5^n)).
 * @author Sean A. Irvine
 */
public class A398667 extends Sequence0 {

  private final Z mBase;
  private int mN = -1;

  protected A398667(final Z base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A398667() {
    this(Z.FIVE);
  }

  private Z f(final Z base, final Z exp) {
    final CR logBase = CR.valueOf(base).log10();
    final CR f = logBase.multiply(exp).frac();
    return CR.TEN.pow(f).floor();
  }

  @Override
  public Z next() {
    return f(mBase, mBase.pow(mBase.pow(++mN)));
  }
}
