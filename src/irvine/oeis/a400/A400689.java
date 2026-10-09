package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A400689 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A400689 extends A400688 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
