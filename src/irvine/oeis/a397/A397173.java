package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a399.A399995;

/**
 * A397173 Irregular triangle T(n,k) (n &gt;= 2, k&gt;=0) read by rows: T(n,k) = number of times the sum W(i)+W(j) is equal to k, for 1 &lt;= i &lt; j &lt;= n, where W is Weinstein's sequence A394611.
 * @author Sean A. Irvine
 */
public class A397173 extends A399995 {

  private long mM = 0;
  {
    setOffset(2);
    super.next();
  }

  @Override
  public Z next() {
    if (++mM >= mCounts.length()) {
      mM = 0;
      super.next();
    }
    return Z.valueOf(mCounts.get(mM));
  }
}
