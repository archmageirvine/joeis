package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085830.
 * @author Sean A. Irvine
 */
public class A397640 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int syn = 0;
    long k = 0;
    while (syn < 0b1111111110) {
      syn |= Functions.SYNDROME.i(Z.valueOf(++k).pow(mN));
    }
    return Z.valueOf(k);
  }
}
