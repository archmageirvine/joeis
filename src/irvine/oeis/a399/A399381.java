package irvine.oeis.a399;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399381 a(n) is the minimum positive integer k such that k*n-1 is squarefree.
 * @author Sean A. Irvine
 */
public class A399381 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z t = Z.NEG_ONE;
    long k = 0;
    while (true) {
      t = t.add(mN);
      ++k;
      if (Predicates.SQUARE_FREE.is(t)) {
        return Z.valueOf(k);
      }
    }
  }
}

