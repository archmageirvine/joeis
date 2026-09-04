package irvine.oeis.a399;

import java.util.HashSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399310 Number of distinct entries in a slice of Pascal's square pyramid (A086754).
 * @author Sean A. Irvine
 */
public class A399310 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Z> seen = new HashSet<>();
    for (long k = 0; 2 * k <= mN; ++k) {
      final Z bk = Binomial.binomial(mN, k);
      for (long j = k; 2 * j <= mN; ++j) {
        seen.add(bk.multiply(Binomial.binomial(mN, j)));
      }
    }
    return Z.valueOf(seen.size());
  }
}
