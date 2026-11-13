package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401697 Number of unordered factorizations of n into its distinct infinitary divisors.
 * @author Sean A. Irvine
 */
public class A401697 extends Sequence1 {

  private int mN = 0;

  private void update(final Z[] dp, final int[] exponents, final int[] strides, final int[] d) {
    final int delta = IntStream.range(0, d.length).map(i -> d[i] * strides[i]).sum();

    final int size = dp.length;
    for (int s = size - 1; s >= 0; --s) {
      if (dp[s] == null) {
        continue;
      }
      boolean valid = true;
      for (int i = 0; i < d.length; ++i) {
        if ((s / strides[i]) % (exponents[i] + 1) + d[i] > exponents[i]) {
          valid = false;
          break;
        }
      }
      if (valid) {
        final int t = s + delta;
        dp[t] = dp[t] == null ? dp[s] : dp[t].add(dp[s]);
      }
    }
  }

  private void enumerate(final Z[] dp, final int[] exponents, final int[] strides, final int[] d, final int[][] choices, final int pos) {
    if (pos == d.length) {
      boolean zero = true;
      for (final int v : d) {
        if (v != 0) {
          zero = false;
          break;
        }
      }
      if (!zero) {
        update(dp, exponents, strides, d);
      }
      return;
    }

    for (final int v : choices[pos]) {
      d[pos] = v;
      enumerate(dp, exponents, strides, d, choices, pos + 1);
    }
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final List<Integer> exp = new ArrayList<>();
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      exp.add(e);
    }

    final int k = exp.size();
    if (k == 0) {
      return Z.ONE;
    }

    final int[] exponents = exp.stream().mapToInt(Integer::intValue).toArray();
    final int[] strides = new int[k];
    final int[][] choices = new int[k][];

    int size = 1;
    for (int i = 0; i < k; ++i) {
      strides[i] = size;
      size *= exponents[i] + 1;
      final List<Integer> submasks = new ArrayList<>();
      for (int j = 0; j <= exponents[i]; ++j) {
        if ((j & exponents[i]) == j) {
          submasks.add(j);
        }
      }
      choices[i] = submasks.stream().mapToInt(Integer::intValue).toArray();
    }
    final Z[] dp = new Z[size];
    dp[0] = Z.ONE;
    enumerate(dp, exponents, strides, new int[k], choices, 0);
    return dp[size - 1] == null ? Z.ZERO : dp[size - 1];
  }
}

