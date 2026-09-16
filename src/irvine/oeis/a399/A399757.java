package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A399757 allocated for Zhao Hui Du.
 * @author Sean A. Irvine
 */
public class A399757 extends Sequence2 {

  // todo too memory intensive, only suitable for 2 terms

  private int mN = 1;

  private boolean is(final Z s, final long k, final boolean side) {
    long b = 1;
    long bn = 1;
    while (bn <= k) {
      bn = LongUtils.pow(++b, mN);
    }
    for (long j = 1; j < k; ++j) {
      if (j + k > bn) {
        bn = LongUtils.pow(++b, mN);
      }
      if (j + k == bn && s.testBit((int) j) == side) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    List<Z> lst = Collections.singletonList(Z.TWO); // Break symmetry by putting 1 in the set (i.e. set bit 1)
    long k = 1;
    while (true) {
      ++k;
      final List<Z> next = new ArrayList<>();
      for (final Z s : lst) {
        if (is(s, k, false)) {
          next.add(s); // i.e., do not include k in the set
        }
        if (is(s, k, true)) {
          next.add(s.setBit((int) k)); // include k in the set
        }
      }
      if (next.isEmpty()) {
        return Z.valueOf(k - 1);
      }
      lst = next;
    }
  }
}
