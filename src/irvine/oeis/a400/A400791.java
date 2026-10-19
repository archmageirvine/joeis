package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400791 a(n) = Sum_{d|n, d &gt;= 4} d * floor((d - 2)/2).
 * @author Sean A. Irvine
 */
public class A400791 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.valueOf(d >= 4 ? d * ((d - 2) / 2) : 0));
  }
}

