package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401763 Square array A(n,k), n &gt;= 1, k &gt;= 1, read by antidiagonals: A(n,k) = h_n(r,s), the complete homogeneous symmetric polynomial of degree n in r and s; (r,s) is the k-th integer pair in lexicographic order subject to 1 &lt;= s &lt;= r: (1,1), (2,1), (2,2), (3,1), (3,2), (3,3), ...
 * @author Sean A. Irvine
 */
public class A401763 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long k) {
    Z r = Functions.TRINV.z(k);
    if (Functions.TRIANGULAR.z(r).compareTo(k) < 0) {
      r = r.add(1);
    }
    final Z s = Z.valueOf(k).subtract(Functions.TRIANGULAR.z(r.subtract(1)));
    final Z rr = r;
    return Integers.SINGLETON.sum(0, n, i -> rr.pow(n - i).multiply(s.pow(i)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM + 1);
  }
}
