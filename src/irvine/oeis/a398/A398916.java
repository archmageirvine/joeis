package irvine.oeis.a398;

import java.util.HashSet;
import java.util.Set;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A398916 allocated for Do Thanh Nhan.
 * @author Sean A. Irvine
 */
public class A398916 extends CachedSequence {

  /** Construct the sequence. */
  public A398916() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      final Set<Integer> set = new HashSet<>();
      final String bits = Long.toBinaryString(n);
      for (int i = 0; i < bits.length(); ++i) {
        final String s = bits.substring(0, i) + bits.substring(i + 1);
        if (s.isEmpty()) {
          set.add(0);
        } else {
          set.add(self.a(Long.parseLong(s, 2)).intValueExact());
        }
      }
      return Z.valueOf(IntegerUtils.mex(set));
    });
  }
}
