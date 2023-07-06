package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Bell matrix transform.
 * @author Sean A. Irvine
 */
public class BellMatrixTransformSequence extends MemoryFunction2<Integer, Z> {

  private final ArrayList<Z> mA;

  /**
   * Construct a new Bell matrix on the given sequence.
   * @param a sequence data
   */
  public BellMatrixTransformSequence(final ArrayList<Z> a) {
    mA = a;
  }

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    return Integers.SINGLETON.sum(1, n - k + 1, j -> Binomial.binomial(n - 1, j - 1).multiply(get(n - j, k - 1)).multiply(mA.get(j - 1)));
  }
}
