
package irvine.oeis.a401;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A401456 Smallest m such that the m-tuples ((x/p), ((x+1)/p), ..., ((x+m-1)/p)) of consecutive Legendre symbols are pairwise distinct for x = 0..p-1, where p = prime(n).
 * @author Sean A. Irvine
 */
public class A401456 extends Sequence2 {

  private int mP = 2;

  @Override
  public Z next() {
    mP = Functions.NEXT_PRIME.i(mP);
    final int[] legendre = new int[mP];
    for (int k = 1; k < mP; ++k) {
      legendre[k] = Functions.KRONECKER.i(k, mP);
    }
    // +1 to remove all negatives
    for (int k = 0; k < legendre.length; ++k) {
      ++legendre[k];
    }
    int m = 0;
    while (true) {
      ++m;
      final HashSet<Z> s = new HashSet<>();
      for (int k = 0; k < mP; ++k) {
        Z v = Z.ZERO;
        for (int j = 0; j < m; ++j) {
          v = v.shiftLeft(2).add(legendre[(k + j) % mP]);
        }
        if (!s.add(v)) {
          break; // not all are distinct
        }
      }
      if (s.size() == mP) {
        return Z.valueOf(m);
      }
    }
  }
}
