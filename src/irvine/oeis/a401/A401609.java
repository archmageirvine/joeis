package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A401609 allocated for Alain Rocchelli.
 * @author Sean A. Irvine
 */
public class A401609 extends A000040 {

  private Z mPrimorial = Z.ONE;

  @Override
  public Z next() {
    final Z p = super.next();
    mPrimorial = mPrimorial.multiply(p);
    long cnt = 0;
    final long pp = p.longValueExact();
    for (long d = 1; d < pp; ++d) {
      final Z[] qr = mPrimorial.divideAndRemainder(d);
      if (qr[1].isZero() && qr[0].subtract(d).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
