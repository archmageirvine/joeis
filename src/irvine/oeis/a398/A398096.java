package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A398096 allocated for Andrew Howroyd.
 * @author Sean A. Irvine
 */
public class A398096 extends A398094 {

  @Override
  public Z next() {
    computeRow();
    return Functions.SUM.z(mRow);
  }
}
