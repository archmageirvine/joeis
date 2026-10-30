package irvine.oeis.a401;

import irvine.math.MemoryFunction3;
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
    final MemoryFunction3<Z, Z> b = new MemoryFunction3<>() {
      @Override
      protected Z compute(final Z m, final Z k, final Z p) {
        if ((mN & 1) == 0 && p.isEven()) {
          return Z.ZERO;
        }
        if (m.isZero()) {
          return Predicates.PRIME.is(p.add(mN)) ? Z.ONE : Z.ZERO;
        }
        return Integers.SINGLETON.sum(1, m.min(k).longValueExact(), j -> get(m.subtract(j), Z.valueOf(j - 1), p.multiply(j)));
      }
    };
    return b.get(Z.valueOf(mN), Z.valueOf(mN), Z.ONE);
  }
}
