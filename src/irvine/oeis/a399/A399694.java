package irvine.oeis.a399;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399694 Rank-2 Enots-Wolley sequence: the lexicographically earliest sequence of distinct positive integers beginning 1, 2 such that every later term has exactly two distinct prime factors, shares a prime factor with the previous term but none with the term two places back, and has a prime factor not dividing the previous term.
 * @author Sean A. Irvine
 */
public class A399694 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    long k = 2;
    while (true) {
      ++k;
      if (Functions.GCD.l(mA, k) == 1 && Functions.GCD.l(mB, k) != 1 && !mUsed.contains(k) && Functions.OMEGA.i(k) == 2) {
        for (final Z p : Jaguar.factor(k).toZArray()) {
          if (!mB.mod(p).isZero()) {
            mUsed.add(k);
            mA = mB;
            mB = Z.valueOf(k);
            return mB;
          }
        }
      }
    }
  }
}
