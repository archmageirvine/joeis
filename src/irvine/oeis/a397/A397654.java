package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397654 allocated for Robert G. Wilson v.
 * @author Sean A. Irvine
 */
public class A397654 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, 9, k -> Functions.FACTORIAL.z(k).multiply(k).multiply(Functions.STIRLING2.z(mN, k + 1)));
  }
}
