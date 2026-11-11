package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a090.A090025;

/**
 * A398767 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A398767 extends Sequence1 {

  private final Sequence mA = new A090025().skip();
  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(3).subtract(mA.next()).subtract(1);
  }
}

