package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A401325 Numbers of the form (2*x + 1)*(2^y + 4*x + 1) with x,y &gt; 0.
 * @author Sean A. Irvine
 */
public class A401325 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A401325() {
    super(1, 1, 1, (x, y) -> Z.ONE.shiftLeft(y).add(4 * x + 1).multiply(2 * x + 1));
  }
}
