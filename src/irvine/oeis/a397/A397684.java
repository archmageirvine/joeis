package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397684 Number of n-digit numbers such that, if the digit j occurs, then every digit from 0 to j also occurs.
 * @author Sean A. Irvine
 */
public class A397684 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, 9, k -> Functions.FACTORIAL.z(k).multiply(k).multiply(Functions.STIRLING2.z(mN, k + 1)));
  }
}
