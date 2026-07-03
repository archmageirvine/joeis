package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397034 a(n) = floor(A(n)), where A(n) is the area enclosed between the line y = x and the curve y = exp(x*log(n+1)/n) - 1 for 0 &lt;= x &lt;= n (the constant log(n+1)/n makes the curve pass through (n,n)).
 * @author Sean A. Irvine
 */
public class A397034 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n2 = CR.valueOf(Z.valueOf(++mN).square());
    return n2.divide(2).subtract(n2.divide(CR.valueOf(mN + 1).log())).add(mN).floor();
  }
}
