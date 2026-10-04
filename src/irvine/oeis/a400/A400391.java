package irvine.oeis.a400;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400391 Irregular table read by rows: T(n, k) = gcud(d(n, k), n/d(n, k)), where d(n, k) = A027750(n, k) is the k-th divisor of n, and gcud is the greatest common unitary divisor.
 * @author Sean A. Irvine
 */
public class A400391 extends Sequence1 {

  private long mN = 0;
  private final LinkedList<Z> mRow = new LinkedList<>();

  @Override
  public Z next() {
    if (mRow.isEmpty()) {
      for (final Z dd : Jaguar.factor(++mN).divisorsSorted()) {
        final long d = dd.longValue();
        mRow.add(Functions.GCUD.z(dd, mN / d));
      }
    }
    return mRow.pollFirst();
  }
}
