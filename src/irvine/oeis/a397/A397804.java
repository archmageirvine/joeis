package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397804 allocated for Jishnu Babu Ranitha.
 * @author Sean A. Irvine
 */
public class A397804 extends Sequence1 {

  // After Jishnu Babu Ranitha

  private int mS = 1;
  private int mN = 0;

  /*
   * Compute A_strict(n, k) using multi-dimensional DP over Z with distinct parts.
   */
  private Z computeAStrict(final int n, final int k) {
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
        // Iterate backwards to enforce distinct parts (0/1 knapsack pattern)
        for (int i = n; i >= part; --i) {
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

    // Generate allowed parts with component sum >= 2 recursively
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
        applyPartShiftStrict(0, part, new int[k], shift, k, dimSize, strides, dp);
      }
      return;
    }
    for (int val = 0; val <= n; ++val) {
      part[dim] = val;
      generatePartsAndCompute(dim + 1, currentSum + val, part, k, n, dimSize, strides, dp);
    }
  }

  private void applyPartShiftStrict(final int dim, final int[] part, final int[] target, final int shift, final int k, final int dimSize, final int[] strides, final Z[] dp) {
    if (dim == k) {
      int idx = 0;
      for (int i = 0; i < k; ++i) {
        idx += target[i] * strides[i];
      }
      dp[idx] = dp[idx].add(dp[idx - shift]);
      return;
    }

    // Traverse downwards in each dimension to prevent reusing the same part multiple times
    for (int val = dimSize - 1; val >= part[dim]; --val) {
      target[dim] = val;
      applyPartShiftStrict(dim + 1, part, target, shift, k, dimSize, strides, dp);
    }
  }

  @Override
  public Z next() {
    if (mN >= mS) {
      ++mS;
      mN = 0;
    }
    final int k = mS - mN;
    return computeAStrict(mN++, k);
  }
}
