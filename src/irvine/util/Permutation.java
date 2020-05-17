package irvine.util;

import java.util.Arrays;

import irvine.math.IntegerUtils;

/**
 * Provides a mechanism for generating all the permutations of the integers
 * up to some specified bound.
 *
 * @author Sean A. Irvine
 */
public class Permutation {

  private final int[] mPermutation;
  private boolean mFirst = true;

  /**
   * Construct a new permutation on the specified elements.
   * Individual elements can appear multiple times.
   *
   * @param seq elements
   */
  public Permutation(final int[] seq) {
    mPermutation = Arrays.copyOf(seq, seq.length);
    Arrays.sort(mPermutation);
  }

  /**
   * Construct a permutation on specified number of elements.
   * @param n number of elements
   */
  public Permutation(final int n) {
    this(IntegerUtils.identity(new int[n]));
  }

  private void swap(final int j, final int l) {
    final int t = mPermutation[j];
    mPermutation[j] = mPermutation[l];
    mPermutation[l] = t;
  }

  private boolean step() {
    if (mFirst) {
      // Handle the initial identity permutation
      mFirst = false;
      return true;
    }
    if (mPermutation.length <= 1) {
      return false;
    }

    int j = mPermutation.length - 2;
    while (mPermutation[j] >= mPermutation[j + 1]) {
      if (--j < 0) {
        return false;
      }
    }
    int l = mPermutation.length - 1;
    while (mPermutation[j] >= mPermutation[l]) {
      --l;
    }
    swap(j, l);
    int k = j + 1;
    l = mPermutation.length - 1;
    while (k < l) {
      swap(k, l);
      ++k;
      --l;
    }
    return true;
  }

  /**
   * Step to the next element in the permutation sequence and return
   * a copy of the permutation in this position. If no further permutations
   * are available then null is returned.
   *
   * @return the permutation
   */
  public int[] next() {
    return step() ? mPermutation : null;
  }

  /**
   * Return the current permutation.
   * @return permutation
   */
  public int[] current() {
    return mPermutation;
  }

  /**
   * Print the current value of the permutation.
   *
   * @param s actual elements to print
   * @param permutation the permutation
   */
  public static void printPermutation(final String s, final int[] permutation) {
    int p = permutation.length;
    while (--p >= 0) {
      System.out.print(s.charAt(permutation[p]));
    }
  }

  /**
   * String representation of the permutation.
   *
   * @param s actual elements to print
   * @param permutation the permutation
   * @return string representation
   */
  public static String toString(final String s, final int[] permutation) {
    final StringBuilder sb = new StringBuilder();
    int p = permutation.length;
    while (--p >= 0) {
      sb.append(s.charAt(permutation[p]));
    }
    return sb.toString();
  }

  /**
   * Test if the supplied permutation is even.
   * @param pi permutation
   * @return true iff the permutation is even.
   */
  public static boolean isEven(final int[] pi) {
    boolean even = true;
    for (int y = 1; y < pi.length; ++y) {
      for (int x = 0; x < y; ++x) {
        if (pi[x] > pi[y]) {
          even = !even;
        }
      }
    }
    return even;
  }

  /**
   * Example use.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {
    final Permutation p = new Permutation(5);
    int[] r;
    long c = 0;
    while ((r = p.next()) != null) {
      printPermutation("12345", r);
      System.out.println();
      ++c;
    }
    System.out.println("Total permutations: " + c);
  }

}
