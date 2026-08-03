package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A397279 allocated for Takayuki Kuriyama.
 * @author Sean A. Irvine
 */
public class A397279 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A397279() {
    super(1, 1, 1, (x, y) -> Z.ONE.shiftLeft(x).subtract(1).shiftLeft(y));
  }

  @Override
  public Z next() {
    final String s = super.next().toString(2);
    return new Z(s + s, 2);
  }
}
