package irvine.oeis.a396;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A396404 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A396404 extends A396403 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
