package irvine.oeis.a398;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A398830 Numbers j, such that there exists no k, k&lt;j, where 2*k-sigma(k) = 2*j-sigma(j) and tau(k) = tau(j).
 * @author Sean A. Irvine
 */
public class A398830 extends Sequence1 {

  private long mN = 0;
  private final HashSet<Pair<Long, Long>> mSeen = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mSeen.add(new Pair<>(Functions.SIGMA0.l(mN), Functions.SIGMA1.l(mN) - 2 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
