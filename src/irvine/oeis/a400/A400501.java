package irvine.oeis.a400;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.partition.FixedLengthPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400501 Number of partitions of n that can be reduced to a single part by repeatedly replacing two parts x and y with gcd(x,y) &gt; 1 by their sum x + y.
 * @author Sean A. Irvine
 */
public class A400501 extends Sequence1 {

  private int mN = 0;

  private boolean is(final HashSet<String> reducible, final int[] p) {
    for (int k = 0; k < p.length; ++k) {
      if (p[k] > 1 && (k == 0 || p[k] != p[k - 1])) {
        for (int j = k + 1; j < p.length; ++j) {
          if ((j == k + 1 || p[j] != p[j - 1]) && Functions.GCD.i(p[k], p[j]) > 1) {
            final int[] q = new int[p.length - 1];
            System.arraycopy(p, 0, q, 0, j);
            System.arraycopy(p, j + 1, q, j, q.length - j);
            q[k] = p[k] + p[j];
            Arrays.sort(q);
            if (reducible.contains(Arrays.toString(q))) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    final HashSet<String> reducible = new HashSet<>();
    reducible.add("[" + mN + "]");
    for (int parts = 2; parts <= mN; ++parts) {
      final FixedLengthPartition gen = new FixedLengthPartition(mN, parts);
      int[] p;
      while ((p = gen.next()) != null) {
        //System.out.println(Arrays.toString(p));
        if (is(reducible, p)) {
          Arrays.sort(p); // annoying by needed to fit convention above
          reducible.add(Arrays.toString(p));
        }
      }
    }
    return Z.valueOf(reducible.size());
  }
}
