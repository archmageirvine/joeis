package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A401006 a(1)=1; for n &gt;= 2, a(n) = n if n is prime; otherwise, a(n) is the decimal concatenation of n/p followed by p, where p is the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A401006 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    if (n.isOne()) {
      return Z.ONE;
    }
    if (n.isProbablePrime()) {
      return n;
    }
    final Z gpf = Functions.GPF.z(n);
    return new Z(n.divide(gpf).toString() + gpf);
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }
}

