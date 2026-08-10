package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397621 allocated for Dar\u00edo Clavijo.
 * @author Sean A. Irvine
 */
public class A397621 extends Sequence1 {

  // After Dar&iacute;o Clavijo

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int l = 64 - Long.numberOfLeadingZeros(mN);
    int m = -1;
    long b = 1;
    long c = 1;
    long r = 0;
    int s = 0;
    for (int k = 0; k < l; ++k) {
      final long bit = (mN >>> (l - 1 - k)) & 1;
      r = (r << 1) | bit;
      if ((Long.bitCount(c & r) & 1) != 0) {
        final long T = c;
        c ^= b << (k - m);
        if ((s << 1) <= k) {
          s = k + 1 - s;
          b = T;
          m = k;
        }
      }
    }
    return Z.valueOf(s);
  }
}
