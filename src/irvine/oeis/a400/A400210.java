package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000203;
import irvine.oeis.a001.A001227;

/**
 * A400210 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A400210 extends Sequence1 {

  private final Sequence mA000203 = new A000203();
  private final Sequence mA001227 = new A001227();

  @Override
  public Z next() {
    return mA000203.next().subtract(mA001227.next());
  }
}
