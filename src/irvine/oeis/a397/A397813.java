package irvine.oeis.a397;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;

/**
 * A397813 a(0) = 1; for n &gt; 0, with p = the n-th prime, a(n) = a(n-1) - p if that value is positive, previously unused, and not prime, otherwise a(n) is the least unused number &gt;= a(n-1) + p,.
 * @author Sean A. Irvine
 */
public class A397813 extends Sequence0 {

  private final Sequence mPrimes = new A000040();
  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mUsed.add(Z.ONE);
      mA = Z.ONE;
      return Z.ONE;
    }
    final Z p = mPrimes.next();
    final Z t = mA.subtract(p);
    if (t.signum() > 0 && !t.isProbablePrime() && mUsed.add(t)) {
      mA = t;
      return mA;
    }
    Z u = mA.add(p);
    while (!mUsed.add(u)) {
      u = u.add(1);
    }
    mA = u;
    return mA;
  }
}
