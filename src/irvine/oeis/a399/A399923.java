package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399923 allocated for Jishnu Babu Ranitha.
 * @author Sean A. Irvine
 */
public class A399923 extends Sequence1 {

  // After Jishnu Babu Ranitha

  private int mS = 1;
  private int mN = 0;

  private Z computeA(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    if (k == 1) {
      final Z[] dp = new Z[n + 1];
      for (int i = 0; i <= n; ++i) {
        dp[i] = Z.ZERO;
      }
      dp[0] = Z.ONE;

      for (int part = 2; part <= n; ++part) {
        for (int i = part; i <= n; ++i) {
          dp[i] = dp[i].add(dp[i - part]);
        }
      }
      return dp[n];
    }

    // k-dimensional DP flattened into a 1D array
    final int dimSize = n + 1;
    int totalSize = 1;
    for (int i = 0; i < k; ++i) {
      totalSize *= dimSize;
    }

    final int[] strides = new int[k];
    strides[k - 1] = 1;
    for (int i = k - 2; i >= 0; --i) {
      strides[i] = strides[i + 1] * dimSize;
    }

    final Z[] dp = new Z[totalSize];
    for (int i = 0; i < totalSize; ++i) {
      dp[i] = Z.ZERO;
    }
    dp[0] = Z.ONE;

    // Generate allowed parts with sum >= 2 recursively
    final int[] part = new int[k];
    generatePartsAndCompute(0, 0, part, k, n, dimSize, strides, dp);
    return dp[totalSize - 1];
  }

  private void generatePartsAndCompute(final int dim, final int currentSum, final int[] part, final int k, final int n, final int dimSize, final int[] strides, final Z[] dp) {
    if (dim == k) {
      if (currentSum >= 2) {
        int shift = 0;
        for (int i = 0; i < k; ++i) {
          shift += part[i] * strides[i];
        }
        applyPartShift(0, part, new int[k], shift, k, dimSize, strides, dp);
      }
      return;
    }
    for (int val = 0; val <= n; ++val) {
      part[dim] = val;
      generatePartsAndCompute(dim + 1, currentSum + val, part, k, n, dimSize, strides, dp);
    }
  }

  private void applyPartShift(final int dim, final int[] part, final int[] target, final int shift, final int k, final int dimSize, final int[] strides, final Z[] dp) {
    if (dim == k) {
      int idx = 0;
      for (int i = 0; i < k; ++i) {
        idx += target[i] * strides[i];
      }
      dp[idx] = dp[idx].add(dp[idx - shift]);
      return;
    }
    for (int val = part[dim]; val < dimSize; ++val) {
      target[dim] = val;
      applyPartShift(dim + 1, part, target, shift, k, dimSize, strides, dp);
    }
  }

  @Override
  public Z next() {
    if (mN >= mS) {
      ++mS;
      mN = 0;
    }
    final int k = mS - mN;
    return computeA(mN++, k);
  }
}
