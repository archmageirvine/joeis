package irvine.oeis.a395;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395895 allocated for John Tyler Rascoe.
 * @author Sean A. Irvine
 */
public class A395895 extends Sequence1 {

  // After Python

  private int mN = 0;

  private static final class Npac {
    private final int[] mV;

    private Npac(final int[] v) {
      mV = v;
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mV);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Npac && Arrays.equals(mV, ((Npac) obj).mV);
    }
  }

  private final HashSet<Npac> mSeen = new HashSet<>();

  private void search(final int[] a, final int[] c, final int pos) {
    final int n = a.length;
    if (pos == n) {
      for (int k = 0; k < n; ++k) {
        final int cmp = Integer.compare(a[k], a[n - 1 - k]);
        if (cmp < 0) {
          return;
        } else if (cmp > 0) {
          break;
        }
      }
      mSeen.add(new Npac(Arrays.copyOf(c, n - 1)));
      return;
    }
    for (int v = -1; v <= 1; ++v) {
      a[pos] = v;
      // incremental update
      for (int j = 0; j < pos; ++j) {
        c[pos - j - 1] += a[j] * v;
      }
      search(a, c, pos + 1);
      // undo updates
      for (int j = 0; j < pos; ++j) {
        c[pos - j - 1] -= a[j] * v;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mSeen.clear();
    search(new int[mN], new int[Math.max(0, mN - 1)], 0);
    return Z.valueOf(mSeen.size());
  }
}
