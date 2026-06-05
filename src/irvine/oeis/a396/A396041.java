package irvine.oeis.a396;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.a000.A000040;

/**
 * A396041 Primes q such that q^2+1 divides p*(p+2)-1 for some prime p.
 * @author Sean A. Irvine
 */
public class A396041 extends A000040 implements Conjectural {

  private static final int HEURISTIC = 10;
  private final TreeSet<Z> mA = new TreeSet<>();
  private final HashSet<Z> mReported = new HashSet<>();
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (mA.size() < HEURISTIC * (mReported.size() + 1)) {
      final Z p = super.next();
      for (final Z d : Jaguar.factor(p.multiply(p.add(2)).subtract(1)).divisors()) {
        final Z[] q = d.subtract(1).sqrtAndRemainder();
        if (q[1].isZero()) {
          if (q[0].compareTo(mPrev) > 0) {
            if (q[0].isProbablePrime()) {
              mA.add(q[0]);
            }
          } else if (q[0].isProbablePrime() && mReported.add(q[0])) {
            throw new RuntimeException("Heuristic failed: " + q[0] + " is a term and should have been output earlier");
          }
        }
      }
    }
    mPrev = mA.pollFirst();
    mReported.add(mPrev);
    return mPrev;
  }
}
