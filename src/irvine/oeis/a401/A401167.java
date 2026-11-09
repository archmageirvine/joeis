
package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A401167 a(0) = 0; a(n+1) is the number of preceding bars visible from the top of bar n, where bar k has height a(k).
 * @author Sean A. Irvine
 */
public class A401167 extends AbstractSequence {

  // After Rok Cestnik

  private final List<Z> mB = new ArrayList<>();
  protected int mN;

  protected A401167(final int offset) {
    super(offset);
    mB.add(Z.ZERO);
    mN = offset - 1;
  }

  /** Construct the sequence. */
  public A401167() {
    this(0);
  }

  /**
   * Count the visible bars at position n and height h.
   * @param n position
   * @param h height
   * @return number of visible bars
   */
  protected int visible(final int n, final Z h) {
    int count = 0;
    Z bestNum = null;
    Z bestDen = null;
    for (int j = n - 1; j >= 0; --j) {
      final Z num = mB.get(j).subtract(h);
      final Z den = Z.valueOf(n - j);
      if (bestNum == null || num.multiply(bestDen).compareTo(bestNum.multiply(den)) > 0) {
        ++count;
        bestNum = num;
        bestDen = den;
      }
    }
    return count;
  }

  @Override
  public Z next() {
    if (++mN > 0) {
      mB.add(Z.valueOf(visible(mN - 1, mB.get(mN - 1))));
    }
    return mB.get(mN);
  }
}
