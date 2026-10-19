package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000961;
import irvine.oeis.a003.A003963;

/**
 * A400993 a(n) = (prime index of the n-th prime power)^(exponent of the n-th prime power) (cf. A000961).
 * @author Sean A. Irvine
 */
public class A400993 extends A000961 {

  private final DirectSequence mA = new A003963();

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
