package irvine.oeis.a398;

import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398733 allocated for Scott M. Foltz.
 * @author Sean A. Irvine
 */
public class A398733 extends Sequence0 {

  // After Scott M. Foltz

  private int mN = -1;

  @Override
  public Z next() {
    final int m = 2 * ++mN;
    Map<Z, Z> cur = new HashMap<>();
    cur.put(Z.ZERO, Z.ONE);
    for (int i = 0; i < m; ++i) {
      final Map<Z, Z> nxt = new HashMap<>();
      for (final Map.Entry<Z, Z> entry : cur.entrySet()) {
        final Z s = entry.getKey();
        final Z c = entry.getValue();
        if (s.testBit(0)) {
          // Current vertex is already matched
          final Z t = s.shiftRight(1);
          nxt.put(t, nxt.getOrDefault(t, Z.ZERO).add(c));
        } else {
          // Match current vertex with a future vertex
          int j = 1;
          while (true) {
            final int d = Functions.FIBONACCI.i(++j);
            if (i + d >= m) {
              break;
            }
            if (!s.testBit(d)) {
              final Z t = s.setBit(d).shiftRight(1);
              nxt.put(t, nxt.getOrDefault(t, Z.ZERO).add(c));
            }
          }
        }
      }
      cur = nxt;
    }
    return cur.getOrDefault(Z.ZERO, Z.ZERO);
  }
}
