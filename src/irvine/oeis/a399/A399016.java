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
    super(1, 1, 1, (x, y) -> y > x ? null : x % y != 0 ? new Z(String.valueOf(x) + String.valueOf(y) + "0") : new Z(String.valueOf(x) + String.valueOf(y) + (x / y)));
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return super.accept(x, y, n, prev) && n.mod(10) != 0;
  }
}
