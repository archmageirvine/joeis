package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.partition.PartitionUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399728 Number of labeled point-determining (mating) graphs on n vertices with no vertices of degree 1.
 * @author Sean A. Irvine
 */
public class A399728 extends Sequence0 {

  private int mN = -1;

  private Z c(final int s, final int t, final int r) {
    return Integers.SINGLETON.sum(0, t / 2, q -> Functions.FACTORIAL.z(t).multiply(Z.valueOf(r - t).pow(s - 2 * q))
      .divide(Functions.FACTORIAL.z(t - 2 * q).multiply(Functions.FACTORIAL.z(q)).shiftLeft(q)));
  }

  private Z b(final int k, final int r) {
    Z sum = Z.ZERO;
    for (int s = 0; s <= k; ++s) {
      final int ss = s;
      final Z u = Integers.SINGLETON.sum(Math.max(0, ss - k + r), Math.min(ss, r), t -> c(ss, t.intValue(), r).multiply(Binomial.binomial(r, t)).multiply(Binomial.binomial(k - r, ss - t)));
      sum = sum.signedAdd((s & 1) == 0, u.shiftLeft(Binomial.binomial(k - s, 2).longValueExact()));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final IntegerPartition part = new IntegerPartition(mN);
    int[] p;
    final int[] c = new int[mN + 1];
    Z sum = Z.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      final Z t = Functions.FACTORIAL.z(mN).divide(PartitionUtils.per(c));
      sum = sum.add(b(p.length, c[1]).multiply(t).multiply(Z.NEG_ONE.pow(mN - p.length)));
    }
    return sum;
  }
}
