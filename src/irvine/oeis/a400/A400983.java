package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a078.A078417;

/**
 * A400983 Number of steps after which the Collatz trajectories of A078417(n) and A078417(n)+1 first coincide.
 * @author Sean A. Irvine
 */
public class A400983 extends A078417 {

  @Override
  public Z next() {
    Z t0 = super.next();
    Z t1 = t0.add(1);
    long cnt = 0;
    while (!t0.equals(t1)) {
      t0 = Functions.COLLATZ.z(t0);
      t1 = Functions.COLLATZ.z(t1);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
