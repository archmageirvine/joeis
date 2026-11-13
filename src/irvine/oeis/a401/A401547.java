package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002828;
import irvine.oeis.a053.A053610;

/**
 * A401547 Numbers k such that the greedy algorithm for writing k as a sum of positive squares uses more squares than necessary; i.e., numbers k such that A053610(k) &gt; A002828(k).
 * @author Sean A. Irvine
 */
public class A401547 extends Sequence1 {

  private long mN = 0;
  private final Sequence mA = new A053610();
  private final Sequence mB = new A002828().skip();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().compareTo(mB.next()) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

