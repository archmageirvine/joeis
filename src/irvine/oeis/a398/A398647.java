package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A398647 Numbers that can be obtained by concatenating the decimal representations of x, y, and x*y for x &gt;= 1 and y &gt;= 0.
 * @author Sean A. Irvine
 */
public class A398647 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A398647() {
    super(1, 1, 0, (x, y) -> new Z(String.valueOf(x) + String.valueOf(y) + (x * y)));
  }
}
