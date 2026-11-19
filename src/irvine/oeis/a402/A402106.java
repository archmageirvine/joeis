package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033676;
import irvine.oeis.a033.A033677;

/**
 * A402106 allocated for Hassan Baloui.
 * @author Sean A. Irvine
 */
public class A402106 extends Sequence1 {

  private final Sequence mA = new A033677();
  private final Sequence mB = new A033676();

  @Override
  public Z next() {
    return mA.next().sqrt().subtract(mB.next().sqrt());
  }
}
