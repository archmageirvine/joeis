package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400937 allocated for Benjamin Simon Strang.
 * @author Sean A. Irvine
 */
public class A400937 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((9 * ++mN * mN - 12 * mN + 6) / 2);
  }
}

