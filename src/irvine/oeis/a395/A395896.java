package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a019.A019565;

/**
 * A395896 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A395896 extends A019565 {

  @Override
  public Z next() {
    final long m = super.next().longValueExact();
    long cnt = 0;
    for (long k = 1; k < m * m; ++k) {
      if (m % Functions.RAD.l(k) == 0 && m % Functions.RAD.l(k + 1) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
