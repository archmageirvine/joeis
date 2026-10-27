package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.partition.DistinctPartsPartition;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401265 allocated for Yunjae Lee.
 * @author Sean A. Irvine
 */
public class A401265 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final DistinctPartsPartition part = new DistinctPartsPartition(mN);
    long cnt = 0;
    int[] p;
    while ((p = part.next()) != null) {
      if (Predicates.SQUARE.is(Functions.PRODUCT.l(p))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
