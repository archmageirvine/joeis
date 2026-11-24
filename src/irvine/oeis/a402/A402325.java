package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402325 Number of ways to write n = x*y with 1 &lt;= x &lt;= n, 1 &lt;= y &lt;= n, where neither x nor y is squarefree.
 * @author Sean A. Irvine
 */
public class A402325 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.valueOf((1 - Functions.MOBIUS.i(d) * Functions.MOBIUS.i(d)) * (1 - Functions.MOBIUS.i(mN / d) * Functions.MOBIUS.i(mN / d))));
  }
}
