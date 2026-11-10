package irvine.oeis.a401;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401673 allocated for Dawid Ry\u0142ko.
 * @author Sean A. Irvine
 */
public class A401673 extends Sequence0 {

  // After Dawid Ry&#x142;ko

  private int mN = -1;
  private Z[] mCoefficients;
  private int mM;

  private static void add(final Map<Integer, Z[]> map, final int mask, final Z[] value) {
    final Z[] old = map.get(mask);
    if (old == null) {
      map.put(mask, value.clone());
    } else {
      if (old.length < value.length) {
        final Z[] temp = Arrays.copyOf(old, value.length);
        Arrays.fill(temp, old.length, temp.length, Z.ZERO);
        map.put(mask, temp);
        for (int k = 0; k < value.length; ++k) {
          temp[k] = temp[k].add(value[k]);
        }
      } else {
        for (int k = 0; k < value.length; ++k) {
          old[k] = old[k].add(value[k]);
        }
      }
    }
  }

  private Z[] compute(final int n) {
    if (n == 0) {
      return new Z[] {Z.ONE};
    }
    Map<Integer, Z[]> v = new HashMap<>();
    v.put(0, new Z[] {Z.ONE});
    for (int p = 0; p < n * n; ++p) {
      final int r = p / n;
      final int c = p % n;
      final int[] d = new int[4];
      final boolean[] diagonal = new boolean[4];
      int len = 0;
      if (c + 1 < n) {
        d[len] = 1;
        diagonal[len++] = false;
      }
      if (r + 1 < n) {
        if (c > 0) {
          d[len] = n - 1;
          diagonal[len++] = true;
        }
        d[len] = n;
        diagonal[len++] = false;
        if (c + 1 < n) {
          d[len] = n + 1;
          diagonal[len++] = true;
        }
      }

      final Map<Integer, Z[]> u = new HashMap<>();
      for (final Map.Entry<Integer, Z[]> entry : v.entrySet()) {
        final int s = entry.getKey();
        final Z[] y = entry.getValue();
        if ((s & 1) != 0) {
          add(u, s >> 1, y);
        } else {
          for (int i = 0; i < len; ++i) {
            final int bit = d[i];
            if ((s & (1 << bit)) == 0) {
              final int t = (s | (1 << bit)) >> 1;
              add(u, t, diagonal[i] ? shift(y) : y);
            }
          }
        }
      }
      v = u;
    }
    return v.get(0);
  }

  private static Z[] shift(final Z[] a) {
    final Z[] b = new Z[a.length + 1];
    Arrays.fill(b, Z.ZERO);
    System.arraycopy(a, 0, b, 1, a.length);
    return b;
  }

  @Override
  public Z next() {
    if (mCoefficients == null || mM > mN * mN) {
      ++mN;
      mCoefficients = compute(2 * mN);
      mM = 0;
    }
    return mCoefficients[2 * mM++];
  }
}
