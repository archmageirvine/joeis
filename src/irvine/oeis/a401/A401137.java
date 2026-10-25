package irvine.oeis.a401;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401137 Triangle read by rows: T(n,k) is the number of distinct equality patterns among compositions of n into exactly k parts, 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A401137 extends Sequence1 {

  private int mN = 1;
  private int mM = 0;

  private Z t(final int n, final int k) {
    final IntegerPartition part = new IntegerPartition(n);
    final int[] c = new int[n + 1];
    int[] p;
    Z sum = Z.ZERO;
    final HashSet<String> seen = new HashSet<>();
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      if (Functions.SUM.i(c) == k) {
        final int[] s = c.clone();
        Arrays.sort(s);
        if (seen.add(Arrays.toString(s))) {
          IntegerPartition.toCountForm(s, c);
          c[0] = 0;
          Z t = Functions.FACTORIAL.z(k);
          for (final int v : c) {
            t = t.divide(Functions.FACTORIAL.z(v));
          }
          for (final int v : s) {
            t = t.divide(Functions.FACTORIAL.z(v));
          }
          sum = sum.add(t);
        }
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
/*
T(n,k) = Sum_{m in M(n), Sum_i m_i = k} k! / (Product_i m_i! * Product_j c_j(m)!), where M(n) is the set of distinct nonincreasing sequences obtained by sorting the multiplicities of the distinct parts of each partition of n, and c_j(m) is the number of entries of m equal to j.
Triangle read by rows: T(n,k) is the number of distinct equality patterns among compositions of n into exactly k parts, 1 <= k <= n.
 */
