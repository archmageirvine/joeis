package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A400889 allocated for M. Jeremie Lafitte (Levitas).
 * @author Sean A. Irvine
 */
public class A400889 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A400888());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = -1;
    while (true) {
      if (mA.a(++k).mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
