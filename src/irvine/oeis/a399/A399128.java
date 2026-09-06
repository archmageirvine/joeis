package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a008.A008479;

/**
 * A399128 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A399128 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A399128() {
    super(1, 1, new A008479(), (n, k) -> Z.FIVE.equals(k) && Functions.RAD.z(n).multiply(Functions.LPF.z(n).pow(4)).equals(Z.valueOf(n)));
  }
}
