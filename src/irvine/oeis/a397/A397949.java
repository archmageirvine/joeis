package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A397949 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A397949 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 1;

  private long compute(long m) {
    long cnt = 0;
    do {
      ++cnt;
      m += Functions.OMEGA.i(m);
    } while (!Predicates.PRIME.is(m));
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long k = compute(++mM);
      if (mFirsts.get(k) == 0) {
        mFirsts.set(k, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
