package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A400336 Number of partial matchings of n points on a circle up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A400336 extends A400335 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z rot = Integers.SINGLETON.sum(0, mN - 1, r -> f(Functions.GCD.l(mN, r), mN / Functions.GCD.l(mN, r)));
    final Z ref = (mN & 1) == 1 ? f((mN - 1) / 2, 2).multiply(mN) : f(mN / 2 - 1, 2).multiply2().add(f(mN / 2, 2)).multiply(mN / 2);
    return rot.add(ref).divide(2 * mN);
  }
}
