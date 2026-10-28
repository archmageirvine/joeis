package irvine.oeis.a401;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401193 a(n) is the number of noncongruent Heronian triangles whose largest incircle tangent length is n.
 * @author Sean A. Irvine
 */
public class A401193 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      for (long j = 1; j <= k; ++j) {
        if (Predicates.SQUARE.is(Z.valueOf(mN + k + j).multiply(mN).multiply(k).multiply(j))) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
