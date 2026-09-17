package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.partition.PartitionUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399731 allocated for Vladeta Jovovic.
 * @author Sean A. Irvine
 */
public class A399731 extends Sequence0 {

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    final IntegerPartition part = new IntegerPartition(mN);
    int[] p;
    final int[] c = new int[mN + 1];
    Z sum = Z.ZERO;
    while ((p = part.next()) != null) {
      if (PartitionUtils.isAllPartsEven(p)) {
        continue;
      }
      IntegerPartition.toCountForm(p, c);
      final Z t = Functions.FACTORIAL.z(mN).divide(PartitionUtils.per(c));
      sum = sum.signedAdd(((2 * mN - p.length) & 1) == 0, t.shiftLeft(Binomial.binomial(p.length - 1, 2).longValueExact()));
    }
    return sum;
  }
}
