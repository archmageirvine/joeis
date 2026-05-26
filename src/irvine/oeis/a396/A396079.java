package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.a395.A395579;

/**
 * A396079 Product of the least factors in all proper factorizations of n into factors &gt; 1, up to permutation; a(n) = 1 for noncomposite n.
 * @author Sean A. Irvine
 */
public class A396079 extends A395579 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
