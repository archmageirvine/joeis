package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a008.A008479;

/**
 * A399126 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A399126 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A399126() {
    super(1, 1, new A008479(), (n, k) -> Z.FOUR.equals(k) && Functions.RAD.z(n).multiply(Functions.LPF.z(n).pow(3)).equals(Z.valueOf(n)));
  }
}
