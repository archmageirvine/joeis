package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A398096 Number of nonisomorphic n X n symmetric nonnegative integer matrices with each row sum nonzero and at most 2, under row and column permutations.
 * @author Sean A. Irvine
 */
public class A398096 extends A398094 {

  @Override
  public Z next() {
    computeRow();
    return Functions.SUM.z(mRow);
  }
}
