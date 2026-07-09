package irvine.oeis.a396;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396632 Number of fixed-content bracelets of length 2*n, summed over all integer partitions of 2*n, whose mirror image is a non-identity rotation, with no palindromic rotation and no nontrivial rotational symmetry.
 * @author Sean A. Irvine
 */
public class A396632 extends Sequence1 {

  // After Andrea Cutri, cf. A396630

  private int mN = 0;
  private long mCount;
  private int[] mWord;
  private int[] mRemaining;

  private boolean reversalInOrbit(final int n) {
    for (int shift = 0; shift < n; ++shift) {
      boolean ok = true;
      for (int k = 0; k < n; ++k) {
        if (mWord[((k + shift) % n) + 1] != mWord[n - k]) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return true;
      }
    }
    return false;
  }

  private boolean isPalindromicRotation(final int n, final int shift) {
    for (int k = 0; k < n / 2; ++k) {
      if (mWord[((k + shift) % n) + 1] != mWord[((n - 1 - k + shift) % n) + 1]) {
        return false;
      }
    }
    return true;
  }

  private boolean hasPalindromicRotations(final int n) {
    for (int shift = 0; shift < n; ++shift) {
      if (isPalindromicRotation(n, shift)) {
        return true;
      }
    }
    return false;
  }

  private void classify(final int n, final int period) {
    if (period >= n && reversalInOrbit(n) && !hasPalindromicRotations(n)) {
      ++mCount;
    }
  }

  private void generate(final int n, final int symbols, final int t, final int period) {
    if (t > n) {
      if (n % period == 0) {
        classify(n, period);
      }
      return;
    }

    final int j = mWord[t - period];
    if (mRemaining[j] > 0) {
      mWord[t] = j;
      --mRemaining[j];
      generate(n, symbols, t + 1, period);
      ++mRemaining[j];
    }
    for (int next = j + 1; next < symbols; ++next) {
      if (mRemaining[next] > 0) {
        mWord[t] = next;
        --mRemaining[next];
        generate(n, symbols, t + 1, t);
        ++mRemaining[next];
      }
    }
  }

  private void countForPartition(final int[] partition) {
    final int symbols = partition.length;
    mRemaining = partition.clone();
    int total = 0;
    for (final int v : partition) {
      total += v;
    }
    mWord = new int[total + 1];
    for (int j = 0; j < symbols; ++j) {
      if (mRemaining[j] > 0) {
        mWord[1] = j;
        --mRemaining[j];
        generate(total, symbols, 2, 1);
        ++mRemaining[j];
        break;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    final IntegerPartition part = new IntegerPartition(2 * mN);
    int[] p;
    while ((p = part.next()) != null) {
      countForPartition(p);
    }
    return Z.valueOf(mCount);
  }
}
