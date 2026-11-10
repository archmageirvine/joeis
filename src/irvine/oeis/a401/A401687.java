package irvine.oeis.a401;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A401687 allocated for Ya-Ping Lu.
 * @author Sean A. Irvine
 */
public class A401687 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    final HashMap<Z, Long> seen = new HashMap<>();
    long m = -1;
    while (seen.putIfAbsent(p, ++m) == null) {
      if ((Functions.PRIME_PI.l(p) & 1) == 1) {
        p = Functions.NEXT_PRIME.z(p.multiply2());
      } else {
        p = Functions.NEXT_PRIME.z(p.divide2());
      }
    }
    return Z.valueOf(seen.get(p));
  }
}
