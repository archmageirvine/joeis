package irvine.oeis.a401;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401129 a(n) is the number of points (x, y) of the square lattice Z^2 connected to the origin by a path of unit horizontal and vertical steps through points satisfying digitsum(|x|) + digitsum(|y|) &lt;= n.
 * @author Sean A. Irvine
 */
public class A401129 extends Sequence0 {

  // After Adam Benzan

  private static final int B = 9;
  private static final int BASE = B + 1;
  private int mN = -1;

  private Z a(final int n) {
    final int k = n / B + 1;
    final int[] w = new int[2 * BASE - 1];

    for (int i = 0; i < BASE; ++i) {
      for (int j = 0; j < BASE; ++j) {
        ++w[i + j];
      }
    }
    Map<Integer, Z> current = new HashMap<>();
    current.put(B * k - n, Z.ONE);
    for (int s = 0; s < k; ++s) {
      final int cap = s < k - 1 ? 1 : 0;
      final Map<Integer, Z> next = new HashMap<>();
      for (final Map.Entry<Integer, Z> entry : current.entrySet()) {
        final int d = entry.getKey();
        final Z c = entry.getValue();
        for (int m = 0; m < w.length; ++m) {
          if (w[m] != 0 && d + m - B <= cap) {
            final int nd = d + m - B;
            final Z contribution = c.multiply(w[m]);
            next.merge(nd, contribution, Z::add);
          }
        }
      }
      current = next;
    }
    Z q = Z.ZERO;
    for (final Z c : current.values()) {
      q = q.add(c);
    }
    final int r = n % B + 1;
    final Z wall = Z.valueOf(r + 1).multiply(Z.valueOf(BASE).pow((n + 1 - r) / B)).subtract(Z.ONE);
    return q.multiply(4).subtract(wall.multiply(4)).add(Z.ONE);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
