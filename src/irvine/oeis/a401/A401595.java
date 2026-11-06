package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a053.A053616;

/**
 * A053616 Pyramidal sequence: distance to nearest triangular number.
 * @author Sean A. Irvine
 */
public class A401595 extends Sequence0 {

  private final DirectSequence mA = new A053616();
  private long mN = -1;

  @Override
  public Z next() {
    return mA.a(Z.valueOf(++mN).pow(3));
  }
}
