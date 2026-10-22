package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399581 allocated for Karan Sharma.
 * @author Sean A. Irvine
 */
public class A399581 extends Sequence1 {

  private static final CR C1 = CR.LOG2.multiply(7);
  private static final CR C2 = CR.SEVEN.log().divide(CR.LOG2);
  private long mN = 0;

  @Override
  public Z next() {
    final CR v = C2.multiply(++mN);
    return CR.valueOf(mN).divide(CR.valueOf(v.ceil()).subtract(v).multiply(C1)).floor();
  }
}

