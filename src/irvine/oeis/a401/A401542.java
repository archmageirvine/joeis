package irvine.oeis.a401;

import irvine.oeis.FilterNumberSequence;

/**
 * A401542 allocated for Dimas Saputra.
 * @author Sean A. Irvine
 */
public class A401542 extends FilterNumberSequence {

  private static boolean is(final long v, final long start) {
    long s = start;
    long k = start;
    while (s < v) {
      s += ++k;
    }
    return s == v;
  }

  /** Construct the sequence. */
  public A401542() {
    super(1, k -> {
      long s = 1;
      long e = 1;
      long sum = 1;
      while (sum < k) {
        sum += ++e;
      }
      while (2 * s < k) {
        if (sum == k) {
          if (is(sum + 1, e + 1)) {
            return true;
          }
          sum -= s++;
        }
        while (sum > k) {
          sum -= s++;
        }
        while (sum < k) {
          sum += ++e;
        }
      }
      return false;
    });
  }
}
