package irvine.oeis.a401;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401905 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A401905 extends Sequence0 {

  // After Alper Ferudun (not competitive for larger terms)

  private int mN = -1;

  private static int lowerBound(final int[] a, final int length, final int value) {
    int lo = 0;
    int hi = length;
    while (lo < hi) {
      final int mid = (lo + hi) >>> 1;
      if (a[mid] < value) {
        lo = mid + 1;
      } else {
        hi = mid;
      }
    }
    return lo;
  }

  private Z compute(final int n) {
    if (n == 0) {
      return Z.ZERO;
    }
    final long h = 1L << (n - 1);
    if (h > Integer.MAX_VALUE) {
      throw new ArithmeticException("Array indexing limit exceeded for n=" + n);
    }
    final int half = (int) h;

    byte[] f = new byte[Math.max(16, 3 * half / 2)];
    int length = 1;
    f[0] = 1;

    int[] members = new int[Math.max(16, half / 2)];
    int memberCount = 1;
    members[0] = 0;

    int streak = 1;

    while (streak < half) {
      final int k = length;

      boolean p = k >= half && f[k - half] != 0;

      if (!p && k >= half) {
        final int start = (int) Math.max(0L, (long) k - 2L * half + 1);
        int i = lowerBound(members, memberCount, start);
        while (i < memberCount && members[i] <= k - half) {
          final int index = (int) (2L * k - 2L * half - members[i]);
          if (f[index] != 0) {
            p = true;
            break;
          }
          ++i;
        }
      }

      // Extend the binary array.
      if (length == f.length) {
        f = Arrays.copyOf(f, Math.min(Integer.MAX_VALUE - 8, Math.max(length + 1, length * 2)));
      }
      f[length++] = (byte) (p ? 1 : 0);
      if (p) {
        if (memberCount == members.length) {
          members = Arrays.copyOf(members, members.length * 2);
        }
        members[memberCount++] = k;
      }
      streak = p ? streak + 1 : 0;
    }
    return Z.valueOf((long) length - half);
  }

  @Override
  public Z next() {
    return compute(++mN);
  }
}
