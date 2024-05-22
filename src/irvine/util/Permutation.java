package irvine.util;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Provides a mechanism for generating all the permutations of the integers
 * up to some specified bound.
 * @author Sean A. Irvine
 */
public class Permutation {

  private final int[] mPermutation;
  private boolean mFirst = true;

  /**
   * Construct a new permutation on the specified elements.
   * Individual elements can appear multiple times.
   * @param seq elements
   * @param sort should the array be sorted
   */
  public Permutation(final int[] seq, final boolean sort) {
    mPermutation = Arrays.copyOf(seq, seq.length);
    if (sort) {
      Arrays.sort(mPermutation);
    }
  }

  /**
   * Construct a new permutation on the specified elements.
   * Individual elements can appear multiple times.
   * @param seq elements
   */
  public Permutation(final int[] seq) {
    this(seq, true);
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
   * the permutation in this position. If no further permutations
   * are available then null is returned.  Note this returns the
   * internal representation that should not be modified by callers.
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
   * String representation of the permutation.
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
   * Construct a permutation object that runs over all the permutations of the digits
   * in an integer.
   * @param n integer
   * @return permutation object
   */
  public static Permutation permuter(final Z n) {
    final int[] cnts = ZUtils.digitCounts(n);
    final int sum = Functions.SUM.i(cnts);
    final int[] digits = new int[sum];
    for (int k = 0, i = 0; k < cnts.length; ++k) {
      for (int j = 0; j < cnts[k]; ++j) {
        digits[i++] = k;
      }
    }
    return new Permutation(digits);
  }

  /**
   * Convert a permutation into an integer.
   * @param p permutation
   * @return integer
   */
  public static Z permToZ(final int[] p) {
    Z t = Z.ZERO;
    for (final int v : p) {
      t = t.multiply(10).add(v);
    }
    return t;
  }

  /**
   * Compute the order of the given permutation.
   * @param p permutation
   * @return order
   */
  public static Z order(final int[] p) {
    final boolean[] seen = new boolean[p.length];
    Z lcm = Z.ONE;
    for (int k = 0; k < p.length; ++k) {
      if (!seen[k]) {
        int j = k;
        int len = 0;
        do {
          ++len;
          seen[j] = true;
          j = p[j];
        } while (!seen[j]);
        lcm = lcm.lcm(Z.valueOf(len));
      }
    }
    return lcm;
  }

  /**
   * Example use.
   * @param args ignored
   */
  public static void main(final String[] args) {
    final int n = Integer.parseInt(args[0]);
    final Permutation p = new Permutation(n);
    int[] r;
    long c = 0;
    while ((r = p.next()) != null) {
      System.out.println(Arrays.toString(r));
      ++c;
    }
    System.out.println("Total permutations: " + c);
  }

}
