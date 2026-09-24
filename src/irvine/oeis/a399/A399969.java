package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A399969 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A399969 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A399969() {
    super(1, k -> Z.valueOf(k + 2).mod(Functions.SIGMA0.z(k)).isZero());
  }
}
