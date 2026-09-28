package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A399016 Numbers that can be obtained by concatenating the decimal representations of x, y, and x/y for x &gt;= 1 and y a divisor of x.
 * @author Sean A. Irvine
 */
public class A399016 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A399016() {
    super(1, 1, 0, (x, y) -> new Z(String.valueOf(x) + String.valueOf(y) + Z.valueOf(x).pow(y)));
  }
}
