package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a071.A071364;
import irvine.oeis.a238.A238690;

/**
 * A400536 a(n) = A238690(A071364(n)).
 * @author Sean A. Irvine
 */
public class A400536 extends A071364 {

  private final DirectSequence mA = DirectSequence.forceCreate(1, new A238690());

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
