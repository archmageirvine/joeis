package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a281.A281230;

/**
 * A399298 Number of cycles of the discrete Arnold cat map on an n X n array.
 * @author Sean A. Irvine
 */
public class A399298 extends A281230 {

  private long mN = 0;

  private Z b(final long n, final long k) {
    if (k == 0) {
      return Z.valueOf(n).square();
    }
    return (k & 1) == 1
      ? Functions.GCD.z(n, Functions.LUCAS.z(k)).square()
      : Functions.GCD.z(n, Functions.FIBONACCI.z(k)).multiply(Functions.GCD.z(mN, Functions.FIBONACCI.z(k).multiply(5)));
  }

  @Override
  public Z next() {
    ++mN;
    final long t = super.next().longValueExact();
    return Integers.SINGLETON.sum(0, t - 1, k -> b(mN, k)).divide(t);
  }
}

