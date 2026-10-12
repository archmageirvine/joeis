package irvine.oeis.a400;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400561 allocated for Massimo Fontanive.
 * @author Sean A. Irvine
 */
public class A400561 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 2).add(Binomial.binomial(mN, 4)).multiply2();
  }
}
