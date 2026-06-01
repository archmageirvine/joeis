package irvine.oeis.a396;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A396248 Primes prime(k) such that prime(k) - prime(k-1) is a factorial.
 * @author Sean A. Irvine
 */
public class A396248 extends A000040 {

  private Z mP = super.next();
  private final TreeSet<Z> mF = new TreeSet<>();
  {
    mF.add(Z.ONE);
  }

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      mP = super.next();
      final Z d = mP.subtract(q);
      if (d.compareTo(mF.last()) > 0) {
        mF.add(Functions.FACTORIAL.z(mF.size() + 1));
      }
      if (mF.contains(d)) {
        return mP;
      }
    }
  }
}
