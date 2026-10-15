package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a077.A077800;
import irvine.util.array.DynamicArray;

/**
 * A400738 For n &gt;= 1, a(n) is the smallest twin prime representable as the sum of 2*n - 1 consecutive terms of A077800.
 * @author Sean A. Irvine
 */
public class A400738 extends Sequence1 {

  private final DirectSequence mS = DirectSequence.create(new A077800());
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private long mM = 0;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.THREE;
    }
    while (mFirsts.get(mN) == null) {
      ++mM;
      int j = 1;
      Z sum = mS.a(mM);
      for (long k = mM - 1; k > 1; k -= 2) {
        sum = sum.add(mS.a(k)).add(mS.a(k - 1));
        ++j;
        if (mFirsts.get(j) == null && sum.isProbablePrime() && (sum.add(2).isProbablePrime() || sum.subtract(2).isProbablePrime())) {
          mFirsts.set(j, sum);
        }
      }
    }
    return mFirsts.get(mN);
  }
}
