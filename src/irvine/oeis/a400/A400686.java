package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400686 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A400686 extends Sequence0 {

  // After Felix Huber

  private int mN = -1;

  private static int vertex(final int x, final int y, final int m, final int side) {
    if (m < x + y || (m == x + y && x < y)) {
      return (m - x) * side + m - y;
    }
    return x * side + y;
  }

  private static Z count(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    final int m = 2 * n;
    final int side = m + 1;
    final int h = side * side + 1;
    final int size = side * side;
    final int t = vertex(n, n, m, side);
    // Construct the quotient graph, identifying antipodal vertices.
    @SuppressWarnings("unchecked") final ArrayList<Integer>[] lists = new ArrayList[size];
    final boolean[] assigned = new boolean[size];
    for (int x = 0; x <= m; ++x) {
      for (int y = 0; y <= m; ++y) {
        final int v = vertex(x, y, m, side);
        if (!assigned[v]) {
          assigned[v] = true;
          lists[v] = new ArrayList<>(4);
          if (x < m) {
            lists[v].add(vertex(x + 1, y, m, side));
          }
          if (x > 0) {
            lists[v].add(vertex(x - 1, y, m, side));
          }
          if (y < m) {
            lists[v].add(vertex(x, y + 1, m, side));
          }
          if (y > 0) {
            lists[v].add(vertex(x, y - 1, m, side));
          }
        }
      }
    }
    final int[][] adj = new int[size][];
    for (int v = 0; v < size; ++v) {
      if (lists[v] != null) {
        adj[v] = lists[v].stream().mapToInt(Integer::intValue).toArray();
      } else {
        adj[v] = new int[0];
      }
    }

    // Distances from the central vertex, restricted to interior vertices.
    final int[] d = new int[size];
    Arrays.fill(d, -1);
    final int[] queue = new int[size];
    int head = 0;
    int tail = 0;
    d[t] = 0;
    queue[tail++] = t;
    while (head < tail) {
      final int v = queue[head++];
      for (final int w : adj[v]) {
        if (w / side % m != 0 && w % side % m != 0 && d[w] < 0) {
          d[w] = d[v] + 1;
          queue[tail++] = w;
        }
      }
    }

    // Map encoded sets of vertices to their multiplicities.
    Map<Z, Z> states = new HashMap<>();
    for (int s = 2; s <= n - 1; s += 2) {
      states.put(Z.valueOf(vertex(s, 0, m, side) + 1), Z.TWO);
    }
    if ((n & 1) == 0) {
      states.put(Z.valueOf(vertex(n, 0, m, side) + 1), Z.ONE);
    }

    final int[] k = new int[size];
    final int[] e = new int[size];
    final int[] o = new int[size];
    final int[] a = new int[size];
    Arrays.fill(e, -1);
    int g = 0;
    Z answer = Z.ZERO;
    for (int j = 1; j <= m; ++j) {
      final int l = m - j;
      final Map<Z, Z> r = new HashMap<>();
      for (final Map.Entry<Z, Z> entry : states.entrySet()) {
        final Z encoded = entry.getKey();
        final Z multiplicity = entry.getValue();
        final int b = ++g;
        Z p = encoded;
        final Z[] qr = p.divideAndRemainder(h);
        final int v = qr[1].intValue() - 1;
        k[v] = b;
        p = qr[0];
        while (!p.isZero()) {
          final Z[] qr0 = p.divideAndRemainder(h);
          final int y = qr0[1].intValue() - 1;
          k[y] = b;
          p = qr0[0];
        }
        for (final int w : adj[v]) {
          if (d[w] < 0 || k[w] == b) {
            continue;
          }
          if (l == 0) {
            if (w == t) {
              answer = answer.add(multiplicity);
            }
            continue;
          }
          if (w == t || l < d[w]) {
            continue;
          }
          final int search = ++g;
          int q = 0;
          e[w] = 0;
          o[0] = w;
          tail = 1;
          head = 0;
          while (head < tail) {
            final int y = o[head++];
            for (final int c : adj[y]) {
              if (k[c] == b) {
                k[c] = search;
                a[q++] = c;
              } else if (k[c] != search && d[c] >= 0 && e[c] < 0 && e[y] + 1 + d[c] <= l) {
                e[c] = e[y] + 1;
                o[tail++] = c;
              }
            }
          }
          final int distance = e[t];
          for (int i = 0; i < tail; ++i) {
            e[o[i]] = -1;
          }
          for (int i = 0; i < q; ++i) {
            k[a[i]] = b;
          }
          if (distance >= 0) {
            Arrays.sort(a, 0, q);
            Z key = Z.valueOf(w + 1L);
            Z power = Z.valueOf(h);
            for (int i = 0; i < q; ++i) {
              key = key.add(power.multiply(a[i] + 1L));
              power = power.multiply(h);
            }
            r.merge(key, multiplicity, Z::add);
          }
        }
      }
      states = r;
    }
    return answer.divide(Z.TWO);
  }

  @Override
  public Z next() {
    return count(++mN);
  }
}
