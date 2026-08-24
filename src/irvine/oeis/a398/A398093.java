package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A398093 a(n) is the number of distinct ordered difference sequences of graceful permutations of length n.
 * @author Sean A. Irvine
 */
public class A398093 extends A398094 {

  @Override
  public Z next() {
    computeRow();
    return Functions.SUM.z(mRow);
  }
}
