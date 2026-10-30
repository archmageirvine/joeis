package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A401325 allocated for Luis Carlos Noguera Rodriguez.
 * @author Sean A. Irvine
 */
public class A401325 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A401325() {
    super(1, 1, 1, (x, y) -> Z.ONE.shiftLeft(y).add(4 * x + 1).multiply(2 * x + 1));
  }
}
