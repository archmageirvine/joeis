package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397034 allocated for Nayanesh Reddy Galiveeti.
 * @author Sean A. Irvine
 */
public class A397034 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n2 = CR.valueOf(Z.valueOf(++mN).square());
    return n2.divide(2).subtract(n2.divide(CR.valueOf(mN + 1).log())).add(mN).floor();
  }
}
