package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a046.A046471;

/**
 * A398119 allocated for M\u00e1rcio Ven\u00edcio Pilar Alc\u00e2ntara.
 * @author Sean A. Irvine
 */
public class A398119 extends A398120 {

  private final Sequence mA = new A046471().skip();

  @Override
  public Z next() {
    return super.next().add(mA.next()).add(1);
  }
}
