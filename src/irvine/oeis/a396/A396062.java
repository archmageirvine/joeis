package irvine.oeis.a396;

import irvine.math.MemoryFunction1;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396062 Define the level of a number in A395720 as the largest integer m such that repeated application of the inner operation can be performed m times, with each intermediate value remaining in A395720. Let a(n) be the smallest kangaroo number in A395720 of level n.
 * @author Sean A. Irvine
 */
public class A396062 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunction1<Z> mT = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return Z.TEN.pow(2L * n);
    }
  };

  private boolean isGrandKangaroo(final Z n, final int order) {
    if (order == 1) {
      return Predicates.KANGAROO.is(n);
    }
    final String s = n.toString();
    final Z m = new Z(s.substring(1, s.length() - 1));
    return m.compareTo(mT.get(order - 1)) > 0 && !m.isZero() && n.mod(m).isZero() && isGrandKangaroo(m, order - 1);
  }

  @Override
  public Z next() {
    ++mN;
    Z k = mT.get(mN);
    while (true) {
      k = k.add(1);
      if (isGrandKangaroo(k, mN)) {
        return k;
      }
    }
  }
}
