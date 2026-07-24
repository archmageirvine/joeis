package irvine.oeis.a397;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence1;

/**
 * A397901 Number of distinct products z*w, where z and w range over the nonzero Gaussian integers a+b*i with 0 &lt;= a, b &lt;= n and i the imaginary unit.
 * @author Sean A. Irvine
 */
public class A397901 extends Sequence1 {

  private final HashSet<Zi> mSeen = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k <= mN; ++k) {
      final Zi r0 = new Zi(k, mN);
      final Zi s0 = new Zi(mN, k);
      for (long j = 0; j <= mN; ++j) {
        for (long i = 0; i <= mN; ++i) {
          final Zi r1 = new Zi(j, i);
          mSeen.add(r0.multiply(r1));
          mSeen.add(s0.multiply(r1));
        }
      }
    }
    return Z.valueOf(mSeen.size() - 1); // -1 for 0+0i
  }
}
