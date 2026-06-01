package irvine.oeis.a396;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396455 Primes p such that p^2 = A075254(k) for some k.
 * @author Sean A. Irvine
 */
public class A396455 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().square().compareTo(mN) >= 0) {
      final Z t = Functions.SOPFR.z(++mN).add(mN);
      final Z[] s = t.sqrtAndRemainder();
      if (s[1].isZero() && s[0].isProbablePrime()) {
        mA.add(s[0]);
      }
    }
    return mA.pollFirst();
  }
}

