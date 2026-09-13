package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A398649 allocated for Jakub Mr\u00e1\u010dek.
 * @author Sean A. Irvine
 */
public class A398649 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A398649() {
    super(1, 1, 0, (x, y) -> new Z(String.valueOf(x) + String.valueOf(y) + (x + y)));
  }
}
