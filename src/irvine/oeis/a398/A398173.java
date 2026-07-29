package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;
import irvine.util.Combination;

/**
 * A398173 a(n) is the minimum size of a subset of Z/pZ with at least 2 elements and no unique sum, where p is the n-th odd prime.
 * @author Sean A. Irvine
 */
public class A398173 extends A065091 {

  @Override
  public Z next() {
    // In the following we assume an implicit element 0 in the array and increase all other elements by 1
    final int p = super.next().intValueExact();
    for (int k = 2; k <= p; ++k) {
      final Combination comb = new Combination(p - 1, k - 1);
      int[] c;
      while ((c = comb.next()) != null) {
        final int[] cnt = new int[p];
        cnt[0] = 1; // (0,0)
        // (0,x) and (x,0)
        for (final int a : c) {
          final int x = a + 1;
          cnt[x] += 2;
        }
        // (x,y)
        for (final int a : c) {
          final int x = a + 1;
          for (final int b : c) {
            ++cnt[(x + b + 1) % p];
          }
        }
        boolean ok = true;
        for (final int v : cnt) {
          if (v != 0 && v < 3) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return Z.valueOf(k);
        }
      }
    }
    throw new IllegalStateException();
  }
}
