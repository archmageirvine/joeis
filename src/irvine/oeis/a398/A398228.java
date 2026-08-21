package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A398228 allocated for Vincenzo Manto.
 * @author Sean A. Irvine
 */
public class A398228 extends TwoParameterFormSequence {

  private static Z lucas(final long k) {
    // Slight contortions to make Lucas look monotonic increasing
    if (k == 0) {
      return Z.ONE;
    }
    if (k == 1) {
      return Z.TWO;
    }
    return Functions.LUCAS.z(k);
  }

  /** Construct the sequence. */
  public A398228() {
    super(0, 0, 0, (j, k) -> j <= k ? lucas(k).add(lucas(j)) : null);
  }
}
