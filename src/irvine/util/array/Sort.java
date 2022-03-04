package irvine.util.array;

/**
 * Quick sort for pairs of dynamic arrays.
 * @author Jonathan Purvis
 * @author Sean A. Irvine
 * @author John G. Cleary
 */
public final class Sort {

  private Sort() {
  }

  /**
   * Define swap of elements.
   */
  public interface Swapper {
    /**
     * Swap the two elements a and b.
     * @param a first element.
     * @param b second element.
     */
    void swap(final int a, final int b);
  }

  private static class LongSwapper implements Swapper {
    LongSwapper(final long[] primary, final long[] secondary) {
      mPrimary = primary;
      mSecondary = secondary;
    }

    private final long[] mPrimary;
    private final long[] mSecondary;

    @Override
    public void swap(final int a, final int b) {
      final long t = mPrimary[a];
      mPrimary[a] = mPrimary[b];
      mPrimary[b] = t;
      final long u = mSecondary[a];
      mSecondary[a] = mSecondary[b];
      mSecondary[b] = u;
    }
  }

  private static class IntSwapper implements Swapper {
    IntSwapper(final long[] primary, final int[] secondary) {
      mPrimary = primary;
      mSecondary = secondary;
    }

    private final long[] mPrimary;
    private final int[] mSecondary;

    @Override
    public void swap(final int a, final int b) {
      final long t = mPrimary[a];
      mPrimary[a] = mPrimary[b];
      mPrimary[b] = t;
      final int u = mSecondary[a];
      mSecondary[a] = mSecondary[b];
      mSecondary[b] = u;
    }
  }

  private static class IntIntSwapper implements Swapper {
    IntIntSwapper(final int[] primary, final int[] secondary) {
      mPrimary = primary;
      mSecondary = secondary;
    }

    private final int[] mPrimary;
    private final int[] mSecondary;

    @Override
    public void swap(final int a, final int b) {
      final int t = mPrimary[a];
      mPrimary[a] = mPrimary[b];
      mPrimary[b] = t;
      final int u = mSecondary[a];
      mSecondary[a] = mSecondary[b];
      mSecondary[b] = u;
    }
  }

  private static class DoubleLongSwapper implements Swapper {
    DoubleLongSwapper(final double[] primary, final long[] secondary) {
      mPrimary = primary;
      mSecondary = secondary;
    }

    private final double[] mPrimary;
    private final long[] mSecondary;

    @Override
    public void swap(final int a, final int b) {
      final double t = mPrimary[a];
      mPrimary[a] = mPrimary[b];
      mPrimary[b] = t;
      final long u = mSecondary[a];
      mSecondary[a] = mSecondary[b];
      mSecondary[b] = u;
    }
  }


  private static class GenericSwapper<T> implements Swapper {
    private final long[] mPrimary;
    private final T[] mSecondary;

    GenericSwapper(final long[] primary, final T[] secondary) {
      mPrimary = primary;
      mSecondary = secondary;
    }

    @Override
    public void swap(final int a, final int b) {
      final long t = mPrimary[a];
      mPrimary[a] = mPrimary[b];
      mPrimary[b] = t;
      final T u = mSecondary[a];
      mSecondary[a] = mSecondary[b];
      mSecondary[b] = u;
    }
  }

  private static class GenericDoubleSwapper<T> implements Swapper {
    private final double[] mPrimary;
    private final T[] mSecondary;

    GenericDoubleSwapper(final double[] primary, final T[] secondary) {
      mPrimary = primary;
      mSecondary = secondary;
    }

    @Override
    public void swap(final int a, final int b) {
      final double t = mPrimary[a];
      mPrimary[a] = mPrimary[b];
      mPrimary[b] = t;
      final T u = mSecondary[a];
      mSecondary[a] = mSecondary[b];
      mSecondary[b] = u;
    }
  }

  /**
   * Paired sort of two arrays.
   *
   * @param primary array to sort
   * @param secondary array to keep in sync with <code>primary</code>
   * @exception IllegalArgumentException if the arrays have different lengths.
   */
  public static void sort(final long[] primary, final long[] secondary) {
    if (primary.length != secondary.length) {
      throw new IllegalArgumentException();
    }
    sort(primary, 0, primary.length, new LongSwapper(primary, secondary));
  }

  /**
   * Paired sort of two arrays.
   *
   * @param primary array to sort
   * @param secondary array to keep in sync with <code>primary</code>
   * @exception IllegalArgumentException if the arrays have different lengths.
   */
  public static void sort(final int[] primary, final int[] secondary) {
    if (primary.length != secondary.length) {
      throw new IllegalArgumentException();
    }
    sort(primary, 0, primary.length, new IntIntSwapper(primary, secondary));
  }

  /**
   * Paired sort of two arrays.
   *
   * @param primary array to sort
   * @param secondary array to keep in sync with <code>primary</code>
   * @exception IllegalArgumentException if the arrays have different lengths.
   */
  public static void sort(final long[] primary, final int[] secondary) {
    if (primary.length != secondary.length) {
      throw new IllegalArgumentException();
    }
    sort(primary, 0, primary.length, new IntSwapper(primary, secondary));
  }

  /**
   * Paired sort of two arrays.
   *
   * @param primary array to sort
   * @param secondary array to keep in sync with <code>primary</code>
   * @exception IllegalArgumentException if the arrays have different lengths.
   */
  public static void sort(final double[] primary, final long[] secondary) {
    if (primary.length != secondary.length) {
      throw new IllegalArgumentException();
    }
    sort(primary, 0, primary.length, new DoubleLongSwapper(primary, secondary));
  }

  /**
   * Paired sort of two arrays.
   *
   * @param primary array to sort
   * @param secondary array to keep in sync with <code>primary</code>
   * @param <T> type of array
   * @exception IllegalArgumentException if the arrays have different lengths.
   */
  public static <T> void sort(final long[] primary, final T[] secondary) {
    if (primary.length != secondary.length) {
      throw new IllegalArgumentException();
    }
    sort(primary, 0, primary.length, new GenericSwapper<>(primary, secondary));
  }

  /**
   * Paired sort of two arrays.
   *
   * @param primary array to sort
   * @param secondary array to keep in sync with <code>primary</code>
   * @param <T> type of array
   * @exception IllegalArgumentException if the arrays have different lengths.
   */
  public static <T> void sort(final double[] primary, final T[] secondary) {
    if (primary.length != secondary.length) {
      throw new IllegalArgumentException();
    }
    sort(primary, 0, primary.length, new GenericDoubleSwapper<>(primary, secondary));
  }

  /**
   * Sorts the specified sub-array of integers into ascending order. A
   * modified version of the JDK sort to handle three arrays.
   *
   * @param x The array to do comparisons on
   * @param off offset to start at
   * @param len length the sort
   * @param swapper interface to the swap method
   */
  public static void sort(final long[] x, final int off, final int len, final Swapper swapper) {
    // Insertion sort on smallest arrays
    if (len < 7) {
      for (int i = off; i < len + off; ++i) {
        for (int j = i; j > off && x[j - 1] > x[j]; --j) {
          swapper.swap(j, j - 1);
        }
      }
      return;
    }

    // Choose a partition element, v
    int m = off + (len >> 1); // Small arrays, middle element
    if (len != 7) {
      int l = off;
      int n = off + len - 1;
      if (len > 40) { // Big arrays, pseudomedian of 9
        final int s = len / 8;
        l = med3(x, l, l + s, l + 2 * s);
        m = med3(x, m - s, m, m + s);
        n = med3(x, n - 2 * s, n - s, n);
      }
      m = med3(x, l, m, n); // Mid-size, med of 3
    }
    final long v = x[m];

    // Establish Invariant: v* (<v)* (>v)* v*
    int a = off;

    // Establish Invariant: v* (<v)* (>v)* v*
    int b = a;

    // Establish Invariant: v* (<v)* (>v)* v*
    int c = off + len - 1;

    // Establish Invariant: v* (<v)* (>v)* v*
    int d = c;
    while (true) {
      while (b <= c && x[b] <= v) {
        if (x[b] == v) {
          swapper.swap(a++, b);
        }
        ++b;
      }
      while (c >= b && x[c] >= v) {
        if (x[c] == v) {
          swapper.swap(c, d--);
        }
        --c;
      }
      if (b > c) {
        break;
      }
      swapper.swap(b++, c--);
    }

    // Swap partition elements back to middle
    int s2;

    // Swap partition elements back to middle
    final int n2 = off + len;
    s2 = Math.min(a - off, b - a);
    vecswap(swapper, off, b - s2, s2);
    s2 = Math.min(d - c, n2 - d - 1);
    vecswap(swapper, b, n2 - s2, s2);

    // Recursively sort non-partition-elements
    if ((s2 = b - a) > 1) {
      sort(x, off, s2, swapper);
    }
    if ((s2 = d - c) > 1) {
      sort(x, n2 - s2, s2, swapper);
    }
  }

  /**
   * Sorts the specified sub-array of integers into ascending order. A
   * modified version of the JDK sort to handle three arrays.
   *
   * @param x The array to do comparisons on
   * @param off offset to start at
   * @param len length the sort
   * @param swapper interface to the swap method
   */
  public static void sort(final int[] x, final int off, final int len, final Swapper swapper) {
    // Insertion sort on smallest arrays
    if (len < 7) {
      for (int i = off; i < len + off; ++i) {
        for (int j = i; j > off && x[j - 1] > x[j]; --j) {
          swapper.swap(j, j - 1);
        }
      }
      return;
    }

    // Choose a partition element, v
    int m = off + (len >> 1); // Small arrays, middle element
    if (len != 7) {
      int l = off;
      int n = off + len - 1;
      if (len > 40) { // Big arrays, pseudomedian of 9
        final int s = len / 8;
        l = med3(x, l, l + s, l + 2 * s);
        m = med3(x, m - s, m, m + s);
        n = med3(x, n - 2 * s, n - s, n);
      }
      m = med3(x, l, m, n); // Mid-size, med of 3
    }
    final int v = x[m];

    // Establish Invariant: v* (<v)* (>v)* v*
    int a = off;

    // Establish Invariant: v* (<v)* (>v)* v*
    int b = a;

    // Establish Invariant: v* (<v)* (>v)* v*
    int c = off + len - 1;

    // Establish Invariant: v* (<v)* (>v)* v*
    int d = c;
    while (true) {
      while (b <= c && x[b] <= v) {
        if (x[b] == v) {
          swapper.swap(a++, b);
        }
        ++b;
      }
      while (c >= b && x[c] >= v) {
        if (x[c] == v) {
          swapper.swap(c, d--);
        }
        --c;
      }
      if (b > c) {
        break;
      }
      swapper.swap(b++, c--);
    }

    // Swap partition elements back to middle
    int s2;

    // Swap partition elements back to middle
    final int n2 = off + len;
    s2 = Math.min(a - off, b - a);
    vecswap(swapper, off, b - s2, s2);
    s2 = Math.min(d - c, n2 - d - 1);
    vecswap(swapper, b, n2 - s2, s2);

    // Recursively sort non-partition-elements
    if ((s2 = b - a) > 1) {
      sort(x, off, s2, swapper);
    }
    if ((s2 = d - c) > 1) {
      sort(x, n2 - s2, s2, swapper);
    }
  }

  /**
   * Sorts the specified sub-array of integers into ascending order. A
   * modified version of the JDK sort to handle multiple arrays.
   *
   * @param x The array to do comparisons on
   * @param off offset to start at
   * @param len length the sort
   * @param swapper interface to the swap method
   */
  public static void sort(final double[] x, final int off, final int len, final Swapper swapper) {
    // Insertion sort on smallest arrays
    if (len < 7) {
      for (int i = off; i < len + off; ++i) {
        for (int j = i; j > off && x[j - 1] > x[j]; --j) {
          swapper.swap(j, j - 1);
        }
      }
     return;
    }

    // Choose a partition element, v
    int m = off + (len >> 1); // Small arrays, middle element
    if (len != 7) {
      int l = off;
      int n = off + len - 1;
      if (len > 40) { // Big arrays, pseudomedian of 9
        final int s = len / 8;
        l = med3(x, l, l + s, l + 2 * s);
        m = med3(x, m - s, m, m + s);
        n = med3(x, n - 2 * s, n - s, n);
      }
      m = med3(x, l, m, n); // Mid-size, med of 3
    }
    final double v = x[m];

    // Establish Invariant: v* (<v)* (>v)* v*
    int a = off;

    // Establish Invariant: v* (<v)* (>v)* v*
    int b = a;

    // Establish Invariant: v* (<v)* (>v)* v*
    int c = off + len - 1;

    // Establish Invariant: v* (<v)* (>v)* v*
    int d = c;
    while (true) {
      while (b <= c && x[b] <= v) {
        if (x[b] >= v) {
          swapper.swap(a++, b);
        }
        ++b;
      }
      while (c >= b && x[c] >= v) {
        if (x[c] <= v) {
          swapper.swap(c, d--);
        }
        --c;
      }
      if (b > c) {
        break;
      }
      swapper.swap(b++, c--);
    }

    // Swap partition elements back to middle
    int s2;

    // Swap partition elements back to middle
    final int n2 = off + len;
    s2 = Math.min(a - off, b - a);
    vecswap(swapper, off, b - s2, s2);
    s2 = Math.min(d - c, n2 - d - 1);
    vecswap(swapper, b, n2 - s2, s2);

    // Recursively sort non-partition-elements
    if ((s2 = b - a) > 1) {
      sort(x, off, s2, swapper);
    }
    if ((s2 = d - c) > 1) {
      sort(x, n2 - s2, s2, swapper);
    }
  }


  /**
   * Swaps vector of elements.
   *
   * @param aa first starting point
   * @param bb second starting point
   * @param n length
   */
  private static void vecswap(final Swapper s, final int aa, final int bb, final int n) {
    for (int i = 0, a = aa, b = bb; i < n; ++i, ++a, ++b) {
      s.swap(a, b);
    }
  }

  /**
   * Returns the index of the median of the three indexed integers.
   *
   * @param x the array
   * @param a first index
   * @param b second index
   * @param c third index
   * @return the median
   */
  static int med3(final int[] x, final int a, final int b, final int c) {
    final int xa = x[a];
    final int xb = x[b];
    final int xc = x[c];
    return xa < xb
      ? (xb < xc ? b : xa < xc ? c : a)
      : (xb > xc ? b : xa > xc ? c : a);
  }

  /**
   * Returns the index of the median of the three indexed integers.
   *
   * @param x the array
   * @param a first index
   * @param b second index
   * @param c third index
   * @return the median
   */
  static int med3(final long[] x, final int a, final int b, final int c) {
    final long xa = x[a];
    final long xb = x[b];
    final long xc = x[c];
    return xa < xb
      ? (xb < xc ? b : xa < xc ? c : a)
      : (xb > xc ? b : xa > xc ? c : a);
  }

  /**
   * Returns the index of the median of the three indexed doubles.
   *
   * @param x the array
   * @param a first index
   * @param b second index
   * @param c third index
   * @return the median
   */
  static int med3(final double[] x, final int a, final int b, final int c) {
    final double xa = x[a];
    final double xb = x[b];
    final double xc = x[c];
    return xa < xb
      ? (xb < xc ? b : xa < xc ? c : a)
      : (xb > xc ? b : xa > xc ? c : a);
  }
}
