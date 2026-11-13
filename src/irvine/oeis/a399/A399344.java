package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a238.A238690;
import irvine.oeis.a397.A397500;

/**
 * A399344 a(n) = A238690(A397500(n)).
 * @author Sean A. Irvine
 */
public class A399344 extends A397500 {

  private final DirectSequence mA = new A238690();

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
