package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398449 Triangle read by rows: T(n,k), (1 &lt;= k &lt;= n), equals the largest prime factor of prime(n)^prime(k) + prime(k)^prime(n).
 * @author Sean A. Irvine
 */
public class A398449 extends Sequence1 {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final Z p = Functions.PRIME.z(mN);
    final Z q = Functions.PRIME.z(mM);
    return Functions.GPF.z(p.pow(q).add(q.pow(p)));
  }
}

