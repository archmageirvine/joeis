package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a066.A066417;

/**
 * A399716 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A399716 extends Sequence1 {

  private final DirectSequence mA = new A066417();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      long sum = 0;
      while (sum < mN && m != 0) {
        m = mA.a(m).mod(m);
        sum += m;
      }
      if (sum == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

