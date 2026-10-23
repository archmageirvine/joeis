package irvine.oeis.a401;

import irvine.math.MemoryFunctionInt3;
import irvine.math.predicate.Predicates;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401145 Number of partitions of n into distinct parts such that n plus the product of the parts is prime.
 * @author Sean A. Irvine
 */
public class A401145 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final MemoryFunctionInt3<Z> b = new MemoryFunctionInt3<>() {
      @Override
      protected Z compute(final int m, final int k, final int p) {
        if ((mN & 1) == 0 && (p & 1) == 0) {
          return Z.ZERO;
        }
        if (m == 0) {
          return Predicates.PRIME.is(p + mN) ? Z.ONE : Z.ZERO;
        }
        return Integers.SINGLETON.sum(1, Math.min(m, k), j -> get(m - j, j - 1, p * j));
      }
    };
    return b.get(mN, mN, 1);
  }
}
