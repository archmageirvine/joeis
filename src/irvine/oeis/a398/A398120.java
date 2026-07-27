package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A398120 allocated for M\u00e1rcio Ven\u00edcio Pilar Alc\u00e2ntara.
 * @author Sean A. Irvine
 */
public class A398120 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    int d = 1;
    Z pow10 = Z.ONE;
    while (pow10.compareTo(Z.valueOf(9L * mN * d)) <= 0) {
      ++d;
      pow10 = pow10.multiply(10);
    }
    --d;

    final int bound = 9 * mN * d;
    // Precompute x -> digitSum(x^n)
    final int[] next = new int[bound + 1];
    for (int k = 1; k <= bound; ++k) {
      next[k] = Functions.DIGIT_SUM.i(Z.valueOf(k).pow(mN));
    }

    final HashSet<String> cycles = new HashSet<>();

    for (int x0 = 1; x0 <= bound; ++x0) {
      final HashMap<Integer, Integer> seen = new HashMap<>();
      final ArrayList<Integer> orbit = new ArrayList<>();

      int x = x0;
      while (!seen.containsKey(x)) {
        seen.put(x, orbit.size());
        orbit.add(x);
        x = next[x];
      }

      final int start = seen.get(x);
      final int len = orbit.size() - start;
      if (len > 1) {
        // Find minimum element of the cycle
        int min = orbit.get(start);
        int minPos = start;
        for (int k = start + 1; k < orbit.size(); ++k) {
          if (orbit.get(k) < min) {
            min = orbit.get(k);
            minPos = k;
          }
        }

        // Build canonical representation
        final StringBuilder sb = new StringBuilder();
        for (int k = 0; k < len; ++k) {
          if (k > 0) {
            sb.append(',');
          }
          sb.append(orbit.get(start + (minPos - start + k) % len));
        }
        cycles.add(sb.toString());
      }
    }

    return Z.valueOf(cycles.size());
  }
}
