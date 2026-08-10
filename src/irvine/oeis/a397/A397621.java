package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397621 allocated for Dar\u00edo Clavijo.
 * @author Sean A. Irvine
 */
public class A397621 extends Sequence0 {

  // After Dar&iacute;o Clavijo

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    int result = 0;
    if (mN != 0) {
      final int l = 64 - Long.numberOfLeadingZeros(mN);
      final int[] b = new int[l];
      for (int i = 0; i < l; ++i) {
        b[i] = (int) ((mN >>> (l - 1 - i)) & 1);
      }
      final int[] c = new int[l + 1];
      final int[] bigB = new int[l + 1];
      c[0] = 1;
      bigB[0] = 1;
      int bigL = 0;
      int m = -1;
      for (int k = 0; k < l; ++k) {
        int d = b[k];
        for (int i = 1; i <= bigL; ++i) {
          d ^= c[i] & b[k - i];
        }
        if (d == 1) {
          final int[] t = c.clone();
          final int s = k - m;
          for (int i = 0; i + s <= l; ++i) {
            c[i + s] ^= bigB[i];
          }
          if (2 * bigL <= k) {
            bigL = k + 1 - bigL;
            System.arraycopy(t, 0, bigB, 0, l + 1);
            m = k;
          }
        }
      }
      result = bigL;
    }
    return Z.valueOf(result);
  }
}
