package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A396692 Pandigital numbers that are anagrams of the concatenation of their prime factors.
 * @author Sean A. Irvine
 */
public class A396692 extends Sequence1 {

  private final Permutation mPerm = new Permutation(new int[] {1, 0, 2, 3, 4, 5, 6, 7, 8, 9}, false);
  private static final long DESC = 9876543210L;

  @Override
  public Z next() {
    while (true) {
      final int[] p = mPerm.next();
      if (p == null) {
        return null;
      }
      final Z n = Permutation.permToZ(p);
      final FactorSequence fs = Jaguar.factor(n);
      final StringBuilder sb = new StringBuilder();
      for (final Z q : fs.toZArray()) {
        sb.append(q);
      }
      if (sb.length() == 10 && Functions.DIGIT_SORT_DESCENDING.l(new Z(sb)) == DESC) {
        return n;
      }
    }
  }
}
