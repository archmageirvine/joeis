package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a024.A024619;
import irvine.oeis.a272.A272619;
import irvine.oeis.a381.A381801;

/**
 * A396967 Numbers k that are neither powers of primes nor have residues r (mod k) for which s = r + m*k is such that rad(s) | k but rad(r) does not divide k, and rad(k) does not divide r, where rad = A007947.
 * @author Sean A. Irvine
 */
public class A396967 extends A024619 {

  private final A272619 mA = new A272619();
  private final A381801 mB = new A381801();

  private boolean isOk(final long k, final Z[] a, final long[] s) {
    final long rad = Functions.RAD.l(k);
    for (final Z rr : a) {
      final long r = rr.longValueExact();
      for (final long v : s) {
        if (r == v && r % rad != 0) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next();
      final long m = k.longValueExact();
      if (isOk(m, mB.row(m), mA.row(m))) {
        return k;
      }
    }
  }
}
