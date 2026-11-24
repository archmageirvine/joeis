package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a051.A051037;
import irvine.oeis.a238.A238690;

/**
 * A399984 a(n) = A238690(A051037(n)).
 * @author Sean A. Irvine
 */
public class A399984 extends A051037 {

  private final DirectSequence mA = new A238690();

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
