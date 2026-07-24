package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A397789 a(n) = nearest prime to prime(n)^(3/2).
 * @author Sean A. Irvine
 */
public class A397789 extends A000040 {

  @Override
  public Z next() {
    final Z p3 = super.next().pow(3);
    final CR x = CR.valueOf(p3).sqrt();
    final Z prev = Functions.PREV_PRIME.z(x.ceil());
    final Z next = Functions.NEXT_PRIME.z(x.floor());
    final Z dp = p3.subtract(prev.square());
    final Z dn = next.square().subtract(p3);
    return dp.compareTo(dn) <= 0 ? prev : next;
  }
}
