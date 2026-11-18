package irvine.oeis.a401;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a025.A025487;

/**
 * A401855 a(1) = 1, for n&gt;1, a(n) is the smallest prime number where A025487(n)/a(n) is still in A025487.
 * @author Sean A. Irvine
 */
public class A401855 extends A025487 {

  private final HashSet<Z> mA = new HashSet<>();

  @Override
  public Z next() {
    final Z t = super.next();
    mA.add(t);
    if (t.isOne()) {
      return t;
    }
    for (final Z p : Jaguar.factor(t).toZArray()) {
      if (mA.contains(t.divide(p))) {
        return p;
      }
    }
    throw new RuntimeException();
  }
}
