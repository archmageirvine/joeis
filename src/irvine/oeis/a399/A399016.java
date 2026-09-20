package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A398649 Numbers that can be obtained by concatenating the decimal representations of x, y, and x+y for x &gt;= 1 and y &gt;= 0.
 * @author Sean A. Irvine
 */
public class A399016 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A399016() {
    super(1, 1, 1, (x, y) -> x % y != 0 ? null : new Z(String.valueOf(x) + String.valueOf(y) + (x / y)));
  }
}
