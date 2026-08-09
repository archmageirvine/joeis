package irvine.oeis.a396;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396919 Numbers of the form 4*p or 2*p^2, where p is an odd prime.
 * @author Sean A. Irvine
 */
public class A396919 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = Z.THREE;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mP.shiftLeft(2)) > 0) {
      mA.add(mP.shiftLeft(2));
      mA.add(mP.square().multiply2());
      mP = mPrime.nextPrime(mP);
    }
    return mA.pollFirst();
  }
}
