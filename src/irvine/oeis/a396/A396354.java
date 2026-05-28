package irvine.oeis.a396;

import irvine.math.z.Z;

/**
 * A396354 allocated for Ramin Mohammadi Masoudi.
 * @author Sean A. Irvine
 */
public class A396354 extends A396351 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
