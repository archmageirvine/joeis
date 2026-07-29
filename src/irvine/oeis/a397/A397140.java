package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A397140 a(n) = number of positive g &lt; prime(n) such that g and g+1 are both primitive roots modulo prime(n).
 * @author Sean A. Irvine
 */
public class A397140 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long cnt = 0;
    long order = Functions.ORDER.l(p, 1);
    for (long x = 2; x < p; ++x) {
      final long t = order;
      order = Functions.ORDER.l(p, x);
      if (t == p - 1 && order == p - 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

