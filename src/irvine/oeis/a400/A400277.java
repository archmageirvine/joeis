package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400277 a(n) = phi(n)^2 mod (n+1), where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A400277 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.PHI.z(++mN).modSquare(Z.valueOf(mN + 1));
  }
}
