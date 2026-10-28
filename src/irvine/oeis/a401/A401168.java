package irvine.oeis.a401;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401168 a(n) = least k such that 2*x^k/(1 + x^(2*k)) &lt; 1/2, where x = u/(u+1) and u = 2*n*(n+1).
 * @author Sean A. Irvine
 */
public class A401168 extends Sequence1 {

  private static final CR L = CR.THREE.sqrt().add(2).log();
  private long mN = 0;

  @Override
  public Z next() {
    final Z u = Z.valueOf(++mN + 1).multiply(mN).multiply2();
    return L.divide(CR.valueOf(new Q(1, u).add(1)).log()).floor().add(1);
  }
}

