package irvine.oeis.a401;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401698 Number of unordered partitions of n into distinct parts such that every 1 in the binary expansion of each part is also a 1 in the binary expansion of n.
 * @author Sean A. Irvine
 */
public class A401698 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z[] v = new Z[mN + 1];
    Arrays.fill(v, Z.ZERO);
    v[0] = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      if ((mN & k) == k) {
        for (int i = mN; i >= k; --i) {
          v[i] = v[i].add(v[i - k]);
        }
      }
    }
    return v[mN];
  }
}

