package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A399940 Number of permutations of 1..n such that the Hankel matrix of some subsequence of an odd number of consecutive terms is singular.
 * @author Sean A. Irvine
 */
public class A399940 extends A399939 {

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(mN + 1).subtract(super.next());
  }
}
