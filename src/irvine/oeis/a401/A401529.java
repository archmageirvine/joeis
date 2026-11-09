package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a100.A100743;

/**
 * A401529 Number of labeled simple graphs on n vertices (not necessarily connected) with burning number 2.
 * @author Sean A. Irvine
 */
public class A401529 extends Sequence1 {

  private long mN = 0;
  private final Sequence mA = new A100743().skip(2);

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return Z.ONE.shiftLeft(Functions.BINOMIAL.l(mN, 2)).subtract(mA.next());
  }
}

