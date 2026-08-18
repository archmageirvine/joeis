package irvine.oeis.a395;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395911 allocated for Aryan Singh Bawa.
 * @author Sean A. Irvine
 */
public class A395911 extends Sequence1 {

  // todo this is tool slow

  private int mN = 1;
  private int mR;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }

    mR = mN - 1;

    for (;;) {
      ++mR;
      if (exists(mN, mR)) {
        return Z.valueOf(mR);
      }
    }
  }

  /**
   * Is there a suitable partition of r into n parts?
   */
  private static boolean exists(final int n, final int r) {
    final int[] p = new int[n];
    return generate(p, 0, 1, r, r);
  }

  /**
   * Generate partitions in nondecreasing order.
   */
  private static boolean generate(final int[] p,
                                  final int pos,
                                  final int min,
                                  final int remaining,
                                  final int total) {
    final int left = p.length - pos;

    if (left == 0) {
      if (remaining != 0) {
        return false;
      }

      if (!subsetProperty(p, total / 2)) {
        return false;
      }

      return minimal(p);
    }

    /*
     * The remaining parts are all >= x and are nondecreasing.
     */
    final int max = remaining / left;

    for (int x = min; x <= max; ++x) {
      if (x == 2) {
        continue;
      }

      p[pos] = x;

      if (generate(p, pos + 1, x, remaining - x, total)) {
        return true;
      }
    }

    return false;
  }

  /**
   * Test whether the subset sums contain 1 and all integers
   * from 3 through half.
   */
  private static boolean subsetProperty(final int[] p, final int half) {
    Z sums = Z.ONE;

    for (final int x : p) {
      sums = sums.or(sums.shiftLeft(x));
    }

    if (!sums.testBit(1)) {
      return false;
    }

    for (int k = 3; k <= half; ++k) {
      if (!sums.testBit(k)) {
        return false;
      }
    }

    return true;
  }

  /**
   * Test that there is no proper admissible coarsening having the
   * required subset-sum property.
   */
  private static boolean minimal(final int[] original) {
    final int r = Functions.SUM.i(original);
    final int half = r / 2;
    final int n = original.length;

    /*
     * States are sorted multisets of parts.
     *
     * We deliberately continue through inadmissible states.  This is
     * essential: for example
     *
     *       1,1,1 -> 1,2,1 -> 3,1
     *
     * contains an inadmissible intermediate state, but the final
     * coarsening is admissible.
     */
    final Set<String> seen = new HashSet<>();
    final Set<String> current = new HashSet<>();

    final int[] start = original.clone();
    Arrays.sort(start);

    final String startKey = key(start);
    seen.add(startKey);
    current.add(startKey);

    while (!current.isEmpty()) {
      final Set<String> next = new HashSet<>();

      for (final String stateKey : current) {
        final int[] state = decode(stateKey);

        /*
         * A state with fewer than n parts is a proper coarsening.
         * Test it if it is admissible.
         */
        if (state.length < n && admissible(state)
          && subsetProperty(state, half)) {
          return false;
        }

        /*
         * If there is only one part, there is nothing more to merge.
         */
        if (state.length <= 1) {
          continue;
        }

        /*
         * Generate every possible pairwise merge.
         *
         * Repeated pairwise merging generates every set partition of
         * the original parts, hence every coarsening.
         */
        for (int i = 0; i < state.length; ++i) {
          for (int j = i + 1; j < state.length; ++j) {
            final int[] merged = merge(state, i, j);
            final String k = key(merged);

            if (seen.add(k)) {
              next.add(k);
            }
          }
        }
      }

      current.clear();
      current.addAll(next);
    }

    return true;
  }

  /**
   * A coarsening is admissible iff no resulting part is 2.
   */
  private static boolean admissible(final int[] a) {
    for (final int x : a) {
      if (x == 2) {
        return false;
      }
    }
    return true;
  }

  /**
   * Merge entries i and j, returning a sorted multiset.
   */
  private static int[] merge(final int[] a, final int i, final int j) {
    final int[] b = new int[a.length - 1];
    int k = 0;

    for (int t = 0; t < a.length; ++t) {
      if (t != i && t != j) {
        b[k++] = a[t];
      }
    }

    b[k] = a[i] + a[j];
    Arrays.sort(b);
    return b;
  }

  /**
   * Canonical representation of a sorted multiset.
   */
  private static String key(final int[] a) {
    final StringBuilder sb = new StringBuilder();
    for (final int x : a) {
      sb.append(x).append(',');
    }
    return sb.toString();
  }

  /**
   * Decode a canonical key.
   */
  private static int[] decode(final String s) {
    int n = 0;
    for (int i = 0; i < s.length(); ++i) {
      if (s.charAt(i) == ',') {
        ++n;
      }
    }

    final int[] a = new int[n];
    int k = 0;
    int x = 0;

    for (int i = 0; i < s.length(); ++i) {
      final char c = s.charAt(i);
      if (c == ',') {
        a[k++] = x;
        x = 0;
      } else {
        x = 10 * x + c - '0';
      }
    }

    return a;
  }

}
