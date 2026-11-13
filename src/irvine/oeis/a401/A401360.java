package irvine.oeis.a401;

import irvine.math.z.Z;

/**
 * A401360 Number of earlier bars in A401167 that are invisible from the point (n,n-1).
 * @author Sean A. Irvine
 */
public class A401360 extends A401167 {

  /** Construct the sequence. */
  public A401360() {
    super(1);
  }

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mN - visible(mN, Z.valueOf(mN - 1)));
  }
}
