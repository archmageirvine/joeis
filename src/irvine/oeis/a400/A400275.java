package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400275 Number of strongly connected components of a directed graph Gamma_{2,n}(Z) related to wild frieze patterns.
 * @author Sean A. Irvine
 */
public class A400275 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      Z t = Functions.CATALAN.z(mN + 1).multiply(3);
      if (mN % 3 == 0) {
        t = t.add(Functions.CATALAN.z(mN / 3).multiply(mN + 3).multiply2());
      }
      return t.divide(3 * (mN + 3)).add(mN / 2);
    } else {
      Z t = Functions.CATALAN.z(mN + 1).multiply(6).add(Functions.CATALAN.z((mN + 1) / 2).multiply(3 * (mN + 3)));
      if (mN % 3 == 0) {
        t = t.add(Functions.CATALAN.z(mN / 3).multiply(4 * (mN + 3)));
      }
      return t.divide(3 * (mN + 3)).add(mN / 2);
    }
  }
}
