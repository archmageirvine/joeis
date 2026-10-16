package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006666;
import irvine.oeis.a006.A006667;

/**
 * A400965 allocated for Carlos Alberto Terencio de Bastos.
 * @author Sean A. Irvine
 */
public class A400965 extends Sequence1 {

  private final Sequence mA = new A006666();
  private final Sequence mB = new A006667();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.TWO.pow(mA.next()).subtract(Z.THREE.pow(mB.next()).multiply(++mN));
  }
}
