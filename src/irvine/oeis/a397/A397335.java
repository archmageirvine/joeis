package irvine.oeis.a397;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397335 Number of distinct final products of the prefix-constrained binary words counted by A394165.
 * @author Sean A. Irvine
 */
public class A397335 extends Sequence0 {

  private long mN = 0;
  private Set<Z> mStates = null;

  @Override
  public Z next() {
    if (mStates == null) {
      mStates = Collections.singleton(Z.ONE);
    } else {
      final Set<Z> newStates = new HashSet<>(mStates);
      final Z limit = Z.ONE.shiftLeft(++mN);
      for (final Z p : mStates) {
        final Z q = p.multiply(mN + 1);
        if (q.compareTo(limit) <= 0) {
          newStates.add(q);
        }
      }
      mStates = newStates;
    }
    return Z.valueOf(mStates.size());
  }
}
