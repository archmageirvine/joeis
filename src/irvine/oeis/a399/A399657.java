package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A399657 Values of L(p(n)#), where L(n) is the summatory function of the Liouville function A008836(n) and p(n)# the primorial function.
 * @author Sean A. Irvine
 */
public class A399657 extends Sequence1 {

  private final Sequence mA = new A002110().skip();
  private long mN = 1;
  private long mSum = 0;

  @Override
  public Z next() {
    final long pHash = mA.next().longValueExact();
    while (mN <= pHash) {
      mSum += Functions.LIOUVILLE_LAMBDA.l(mN++);
    }
    return Z.valueOf(mSum);
  }
}
