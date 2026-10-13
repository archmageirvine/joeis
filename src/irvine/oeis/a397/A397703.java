package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A397703 Numbers k such that sigma(k) = psi(k) + tau(k)^4 + omega(k)^4.
 * @author Sean A. Irvine
 */
public class A397703 extends A000040 {

  private static final Z Z241149 = Z.valueOf(241149);

  @Override
  public Z next() {
    Z p = super.next();
    if (!Functions.GCD.z(Z241149, p).isOne()) {
      p = super.next();
    }
    return Z241149.multiply(p.square());
  }
}

