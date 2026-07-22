package irvine.oeis.a397;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A397992 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A397992 extends A397991 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}

