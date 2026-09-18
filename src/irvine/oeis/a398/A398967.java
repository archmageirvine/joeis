package irvine.oeis.a398;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A398967
 * @author Sean A. Irvine
 */
public class A398967 extends ParallelPermutationSequence {

  // After Stephen J. Pursey

  private final Set<String> mCanon = Collections.synchronizedSet(new HashSet<>());

  /** Construct the sequence. */
  public A398967() {
    super(1, 2, 2);
  }

  @Override
  protected long count(final int[] p) {
    if (valid(p)) {
      mCanon.add(canonical(p));
    }
    return 1;
  }

  /*
   * Test the alternating non-crossing condition.
   * s = (0,) + r + (0,)
   * arcs[k] = (s[k], s[k+1]).
   */
  private boolean valid(final int[] p) {
    final int size = p.length;
    // r[0] < r[-1]
    if (p[0] >= p[size - 1]) {
      return false;
    }

    // Each parity of arcs must be non-crossing.
    for (int parity = 0; parity < 2; ++parity) {
      for (int i = parity; i <= size; i += 2) {
        final int x1 = endpoint(p, i, size);
        final int x2 = endpoint(p, i + 1, size);

        for (int j = i + 2; j <= size; j += 2) {
          final int y1 = endpoint(p, j, size);
          final int y2 = endpoint(p, j + 1, size);

          if (cross(x1, x2, y1, y2)) {
            return false;
          }
        }
      }
    }

    return true;
  }

  /*
   * Return s[k], where
   * s = (0, r[0], ..., r[size-1], 0).
   */
  private int endpoint(final int[] p, final int k, final int size) {
    return k == 0 || k == size + 1 ? 0 : p[k - 1] + 1;
  }

  /*
   * Test whether two chords cross.
   */
  private static boolean cross(int a, int b, int c, int d) {
    if (a == b || a == c || a == d || b == c || b == d || c == d) {
      return false;
    }
    if (a > b) {
      final int t = a;
      a = b;
      b = t;
    }
    if (c > d) {
      final int t = c;
      c = d;
      d = t;
    }
    return (a < c && c < b && b < d) || (c < a && a < d && d < b);
  }

  /*
   * Canonical representative under rotations.
   * The word is
   *   0, 1, ..., size, 0, r[0], ..., r[size-1].
   */
  private String canonical(final int[] p) {
    final int size = p.length;
    final int len = 2 * size + 2;
    int[] best = null;

    for (int start = 0; start < len; ++start) {
      final int[] label = new int[size + 1];
      Arrays.fill(label, -1);
      final int[] out = new int[len];
      int nextLabel = 0;
      for (int i = 0; i < len; ++i) {
        final int v = word(p, start + i, size);
        if (label[v] == -1) {
          label[v] = nextLabel++;
        }
        out[i] = label[v];
      }
      if (best == null || lt(out, best)) {
        best = out;
      }
    }

    final StringBuilder sb = new StringBuilder(len);
    for (final int x : best) {
      sb.append((char) x);
    }
    return sb.toString();
  }

  /*
   * Element of
   *   0, 1, ..., size, 0, r[0], ..., r[size-1].
   */
  private int word(final int[] p, final int index, final int size) {
    final int len = 2 * size + 2;
    final int i = index % len;
    if (i == 0 || i == size + 1) {
      return 0;
    }
    if (i <= size) {
      return i;
    }
    return p[i - size - 2] + 1;
  }

  private static boolean lt(final int[] a, final int[] b) {
    for (int i = 0; i < a.length; ++i) {
      if (a[i] != b[i]) {
        return a[i] < b[i];
      }
    }
    return false;
  }

  @Override
  public Z next() {
    super.next();
    final Z res = Z.valueOf(mCanon.size());
    mCanon.clear();
    return res;
  }
}
