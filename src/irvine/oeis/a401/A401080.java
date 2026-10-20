package irvine.oeis.a401;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A401080 allocated for Charles Delaporte.
 * @author Sean A. Irvine
 */
public class A401080 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 5;
  private long mM = 2;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN) >= 0) {
      if (2 * ++mM > mN) {
        ++mN;
        mM = 3;
        if (mVerbose && mN % 100 == 0) {
          StringUtils.message("Searching n=" + mN);
        }
      }
      final Z t = Binomial.binomial(mN, mM);
      if (Predicates.TRIANGULAR.is(t)) {
        final Z res = Functions.TRINV.z(t).add(1);
        mA.add(res);
        if (mVerbose) {
          StringUtils.message("Found a solution: binomial(" + res + ",2) = binomial(" + mN + "," + mM + ")");
        }
      }
    }
    return mA.pollFirst();
  }
}
