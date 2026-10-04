package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398441 Irregular triangle in which the n-th row contains distinct values of A399722 that have the same periodicity 2^(A020914(n)-1).
 * @author Sean A. Irvine
 */
public class A398441 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private List<Z> mR = Collections.singletonList(Z.ONE);
  private long mN = 0;
  private long mKm = 2;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      if (++mN > 1) {
        final List<Z> t1 = new ArrayList<>();
        final long m = mN - 1;
        final long c = Z.THREE.pow(mN).compareTo(Z.TWO.pow(mKm + 1)) < 0 ? 1 : 2;
        for (final Z ri : mR) {
          Z rt = ri;
          long dm = mKm;
          for (long j = 1; j < m; ++j) {
            rt = rt.subtract(Z.THREE.pow(m - j)).makeOdd();
            dm -= rt.auxiliary();
          }
          for (long j = 1; j < dm; ++j) {
            t1.add(ri.multiply(3).add(Z.TWO.pow(mKm - dm + j)));
          }
        }
        mKm += c;
        mR = t1;
      }
      mA.addAll(mR);
    }
    return mA.pollFirst();
  }
}
