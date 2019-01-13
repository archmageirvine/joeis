package irvine.math;

import java.util.Random;

/**
 * Generate graphs appearing in documentation.
 *
 * @author Sean A. Irvine
 */
public final class BadShuffle {

  private BadShuffle() { }

  private static final Random RANDOM = new Random();

  /** Broken shuffle implementation. */
  private static void shuffle(final int[] x) {
    for (int i = 0; i < x.length; ++i) {
      final int r = RANDOM.nextInt(x.length);
      final int t = x[i];
      x[i] = x[r];
      x[r] = t;
    }
  }

  /** Identity permutation. */
  private static void id(final int[] x) {
    for (int i = 0; i < x.length; ++i) {
      x[i] = i;
    }
  }

  /**
   * Perform a million trials.
   *
   * @param args sides
   */
  public static void main(final String[] args) {
    final int[] x = new int[12];
    final long[] s = new long[x.length];
    final int limit = 5000000;
    for (int i = 0; i < limit; ++i) {
      id(x);
      shuffle(x);
      for (int j = 0; j < x.length; ++j) {
        s[j] += x[j];
      }
    }
    for (int i = 0; i < s.length; ++i) {
      System.out.println(i + " " + ((double) s[i]) / limit);
    }
  }
}
