package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001097;
import irvine.util.array.DynamicArray;

/**
 * A400913 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A400913 extends Sequence1 {

  private final DirectSequence mS = DirectSequence.create(new A001097());
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
