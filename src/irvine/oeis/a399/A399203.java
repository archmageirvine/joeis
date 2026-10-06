package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.partition.PartitionUtils;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399203 allocated for Vladeta Jovovic.
 * @author Sean A. Irvine
 */
public class A399203 extends Sequence0 {

  private int mN = -1;

  // C_lambda(j) = Sum_{i>=1} r_i*gcd(i,j),
  private long cLambda(final int[] r, final long j) {
    long sum = 0;
    for (int i = 1; i < r.length; ++i) {
      sum += r[i] * Functions.GCD.l(i, j);
    }
    return sum;
  }

  // M_lambda(d) = (1/d)*Sum_{e|d} mu(d/e)*2^C_lambda(e),
  private long mLambda(final int[] r, final long d) {
    return Integers.SINGLETON.sumdiv(d, e -> Functions.MOBIUS.z(d / e).shiftLeft(cLambda(r, e))).divide(d).longValueExact();
  }

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    final int[] c = new int[mN + 1];
    Q sum = Q.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      final long shift = Integers.SINGLETON.sum(1, c.length, d -> Z.valueOf(mLambda(c, d)).multiply(cLambda(c, d))).longValueExact();
      sum = sum.add(new Q(Z.ONE.shiftLeft(shift), PartitionUtils.per(c)));
    }
    return sum.toZ();
  }
}
