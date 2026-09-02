package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A397012 allocated for Mohammad F. Marashdeh.
 * @author Sean A. Irvine
 */
public class A397012 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A397012() {
    super(0, 0, 0, (x, y) -> Functions.TRIANGULAR.z(x).multiply(3).add(y * y));
  }
}

