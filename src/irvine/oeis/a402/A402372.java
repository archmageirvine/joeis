package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a395.A395245;

/**
 * A402372 allocated for Marko Radulovic.
 * @author Sean A. Irvine
 */
public class A402372 extends Sequence1 {

  private final DirectSequence mA = new A395245();
  private long mN = 0;

  private Z q(final long i, final long j, final long n) {
    return (i & 1) == 0 || (j & 1) == 1
      ? Z.ZERO
      : Functions.FACTORIAL.z(n - 2).multiply((n - j + 1) * (n - i + 1) - n + Math.max(i, j) - 1);
  }

  @Override
  public Z next() {
    return mA.a(++mN).multiply(Functions.FACTORIAL.z(mN))
      .subtract(Integers.SINGLETON.sum(1, mN, j -> Integers.SINGLETON.sum(1, mN, i -> q(i, j, mN).square())))
      .multiply2();
  }
}
