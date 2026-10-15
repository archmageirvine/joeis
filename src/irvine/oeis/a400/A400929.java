package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A400929 allocated for Stefano Spezia.
 * @author Sean
 */
public class A400929 extends A400928 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}

