package irvine.oeis.a400;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400658 Lexicographically earliest sequence of distinct natural numbers such that the concatenation of a(n-1) with a(n) is divisible by the sum of their digits and no quotient repeats.
 * @author Sean A. Irvine
 */
public class A400658 extends Sequence1 {

  private final TreeSet<Long> mUsed = new TreeSet<>();
  private final HashSet<Z> mForbidden = new HashSet<>();
  private long mLeastUsed = 1;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    while (mUsed.remove(mLeastUsed)) {
      ++mLeastUsed;
    }
    final String s = mA.toString();
    long k = mLeastUsed;
    while (true) {
      final Z t = new Z(s + k);
      final long d = Functions.DIGIT_SUM.l(t);
      if (t.mod(d) == 0 && mForbidden.add(t.divide(d))) {
        mUsed.add(k);
        mA = Z.valueOf(k);
        return mA;
      }
      while (mUsed.contains(++k)) {
        // do nothing
      }
    }
  }
}
