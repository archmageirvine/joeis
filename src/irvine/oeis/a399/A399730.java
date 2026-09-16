package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.partition.PartitionUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399730 allocated for Vladeta Jovovic.
 * @author Sean A. Irvine
 */
public class A399730 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    final int[] c = new int[mN + 1];
    Z sum = Z.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      final Z t = Functions.FACTORIAL.z(mN).divide(PartitionUtils.per(c));
      final long e = PartitionUtils.isAllPartsEven(p) ? Binomial.binomial(p.length, 2).longValueExact() : Binomial.binomial(p.length - 1, 2).longValueExact();
      sum = sum.signedAdd(((mN - p.length) & 1) == 0, t.shiftLeft(e));
    }
    return sum;
  }
}
