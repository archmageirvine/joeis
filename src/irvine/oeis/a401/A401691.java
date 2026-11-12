package irvine.oeis.a401;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401691 allocated for Jishnu Babu Ranitha.
 * @author Sean A. Irvine
 */
public class A401691 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.product(1, ++mN, k -> Z.THREE.pow(k).add(1)).multiply(Z.THREE.pow(mN));
  }
}
