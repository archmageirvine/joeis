package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A399227 a(n) = (2*n-1)*2^(w(2*n-1)-1) where w(m) = v_2(usigma(m)) = A007814(A034448(m)) for odd m.
 * @author Sean A. Irvine
 */
public class A399227 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mN).shiftLeft(Functions.USIGMA1.z(mN).makeOdd().auxiliary() - 1);
  }
}
