package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A400630 Number of semi-meanders with n crossings and winding number n-4, for n &gt;= 4.
 * @author Sean A. Irvine
 */
public class A400630 extends AbstractSequence {

  private long mN = 4;

  /** Construct the sequence. */
  public A400630() {
    super(4);
  }

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().divide2().subtract(10);
  }
}

