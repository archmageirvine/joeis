package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a397.A397600;

/**
 * A398493 allocated for Hiller Alves Fernandes.
 * @author Sean A. Irvine
 */
public class A398493 extends A397600 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(++mN, 5);
  }
}
