package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398834 Number of positive integer divisors of (3^n-1)/2.
 * @author Sean A. Irvine
 */
public class A398834 extends Sequence1 {

  private long mN = 0;
  private final Z mX;
  private final Z mY;
  private final Z mD;

  protected A398834(final long x, final long y) {
    mX = Z.valueOf(x);
    mY = Z.valueOf(y);
    mD = Z.valueOf(x - y);
  }

  /** Construct the sequence. */
  public A398834() {
    this(3, 1);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.SIGMA0.z(mX.pow(mN).subtract(mY.pow(mN)).divide(mD));
  }
}
