package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398029 a(n) is the number of closed binary operations on n labeled elements such that the set of ordered triples (x, y, xy) contains at least one of each of the 5 kinds of ordered triple: (a,a,a), (a,a,b), (a,b,a), (b,a,a), (a,b,c), for distinct elements a,b,c.
 * @author Sean A. Irvine
 */
public class A398029 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ZERO;
    }
    final long m = mN * mN - mN;
    return Z.valueOf(mN).pow(mN).subtract(Z.valueOf(mN - 1).pow(mN)).subtract(1)
      .multiply(Z.valueOf(mN).pow(m).subtract(Z.valueOf(mN - 1).pow(m).multiply2()).add(Z.valueOf(mN - 2).pow(m)).subtract(Z.TWO.pow(m)).add(2));
  }
}
