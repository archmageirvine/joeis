package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002487;

/**
 * A401481 Binary encodings of the top-to-bottom column words of the Gosper-Lafitte triangle.
 * @author Sean A. Irvine
 */
public class A401481 extends Sequence1 {

  private final Sequence mA = new A002487();
  private long mQ = mA.next().longValueExact();

  @Override
  public Z next() {
    final long p = mQ;
    mQ = mA.next().longValueExact();
    Z sum = Z.ZERO;
    for (long j = 0; j < mQ; ++j) {
      final long t = ((j * p + mQ - 1) % mQ + 1 - p) & 1;
      if (t != 0) {
        sum = sum.add(Z.ONE.shiftLeft(j));
      }
    }
    return sum;
  }
}

