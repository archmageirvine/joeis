package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400515 a(n) = (16^n + 3*4^n - 4*7^n)/12.
 * @author Sean
 */
public class A400515 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(4 * ++mN).add(Z.THREE.shiftLeft(2 * mN)).subtract(Z.SEVEN.pow(mN).multiply(4)).divide(12);
  }
}
