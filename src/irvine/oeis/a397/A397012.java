package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A397012 Numbers that are a sum of three triangular numbers whose indices are in arithmetic progression; i.e., numbers of the form 3*T(k) + d^2, where T(k) = k*(k+1)/2 and k, d are integers.
 * @author Sean A. Irvine
 */
public class A397012 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A397012() {
    super(0, 0, 0, (x, y) -> Functions.TRIANGULAR.z(x).multiply(3).add(y * y));
  }
}

