package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398933 allocated for Rafael Andres Pastrana Tordecilla.
 * @author Sean A. Irvine
 */
public class A398933 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long q = ++mN / 3;
    final long r = mN - 3 * q;
    return Functions.TRIANGULAR.z(mN).add((3 * q * q - q) / 2).add(q * r).add((2 * mN + 2) / 4);
  }
}

