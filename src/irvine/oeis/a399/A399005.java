package irvine.oeis.a399;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399005 allocated for Firdous Ahmad Mala.
 * element is involved in at most 3 ordered pairs of R, where a loop
 * (x,x) counts once.
 *
 * @author Sean A. Irvine
 */
public class A399005 extends Sequence0 {

  private int mN = -1;

  // Values p_n: admissible relations all of whose SCCs are singletons.
  private Z[] mP = new Z[0];

  private int mSize;
  private long[] mReach;
  private long[] mIncomparable;
  private int[] mDegree;

  /**
   * Ensure p_0,...,p_n have been computed.
   *
   * @param n required index
   */
  private void ensureP(final int n) {
    if (mP.length > n) {
      return;
    }

    final Z[] p = Arrays.copyOf(mP, n + 1);

    for (int k = mP.length; k <= n; ++k) {
      p[k] = computeP(k);
    }

    mP = p;
  }

  /**
   * Counts transitive antisymmetric relations, with loops subsequently
   * allowed whenever the vertex has at most two other comparable vertices.
   * @param n number of vertices
   * @return p_n
   */
  private Z computeP(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    mSize = n;
    mReach = new long[n];
    mIncomparable = new long[n];
    mDegree = new int[n];
    return search();
  }

  /**
   * Find the first unordered pair whose relation is not yet decided.
   *
   * @return encoded pair, or -1 if every pair is decided
   */
  private int firstUndecided() {
    for (int i = 0; i < mSize; ++i) {
      final long ri = mReach[i];
      final long ii = mIncomparable[i];
      for (int j = i + 1; j < mSize; ++j) {
        final long bit = 1L << j;
        if ((ri & bit) == 0
          && (mReach[j] & (1L << i)) == 0
          && (ii & bit) == 0) {
          return i * mSize + j;
        }
      }
    }
    return -1;
  }

  /**
   * Recursive enumeration.
   *
   * @return contribution of all completions
   */
  private Z search() {
    final int pair = firstUndecided();

    if (pair < 0) {
      // All comparabilities/incomparabilities have been decided.
      int freeLoops = 0;
      for (int k = 0; k < mSize; ++k) {
        if (mDegree[k] <= 2) {
          ++freeLoops;
        }
      }
      return Z.ONE.shiftLeft(freeLoops);
    }

    final int u = pair / mSize;
    final int v = pair % mSize;

    Z sum = Z.ZERO;

    // Branch 1: u and v are incomparable
    final long[] oldIncomparable = mIncomparable.clone();
    mIncomparable[u] |= 1L << v;
    mIncomparable[v] |= 1L << u;
    sum = sum.add(search());
    mIncomparable = oldIncomparable;

    // Branch 2: u < v
    final long[] oldReach2 = mReach.clone();
    final int[] oldDegree2 = mDegree.clone();
    if (add(u, v)) {
      sum = sum.add(search());
    }
    mReach = oldReach2;
    mDegree = oldDegree2;

    // Branch 3: v < u
    final long[] oldReach3 = mReach.clone();
    final int[] oldDegree3 = mDegree.clone();
    if (add(v, u)) {
      sum = sum.add(search());
    }
    mReach = oldReach3;
    mDegree = oldDegree3;
    return sum;
  }

  /**
   * Insert x < y and every relation forced by transitivity.
   * @param x smaller vertex
   * @param y larger vertex
   * @return true if the insertion is consistent with all decisions
   */
  private boolean add(final int x, final int y) {
    // x < y would create a cycle
    if ((mReach[y] & (1L << x)) != 0) {
      return false;
    }
    // Every predecessor of x becomes less than every successor of y
    final long predecessors = predecessors(x) | (1L << x);
    final long successors = mReach[y] | (1L << y);

    long p = predecessors;
    while (p != 0) {
      final int u = Long.numberOfTrailingZeros(p);
      p &= p - 1;
      long s = successors;
      while (s != 0) {
        final int v = Long.numberOfTrailingZeros(s);
        s &= s - 1;
        if (u == v) {
          return false;
        }
        final long vBit = 1L << v;
        if ((mReach[v] & (1L << u)) != 0) {
          return false;
        }
        // This pair was previously declared incomparable.
        if ((mIncomparable[u] & vBit) != 0) {
          return false;
        }
        if ((mReach[u] & vBit) == 0) {
          mReach[u] |= vBit;
          if (++mDegree[u] > 3 || ++mDegree[v] > 3) {
            return false;
          }
        }
      }
    }
    return true;
  }

  /**
   * Return all predecessors of v.
   * @param v vertex
   * @return bit set of predecessors
   */
  private long predecessors(final int v) {
    final long bit = 1L << v;
    long r = 0;
    for (int k = 0; k < mSize; ++k) {
      if ((mReach[k] & bit) != 0) {
        r |= 1L << k;
      }
    }
    return r;
  }

  /**
   * Number of ways to choose k disjoint unordered pairs from n labelled vertices:
   * n! / ((n-2k)! 2^k k!).
   * @param n number of vertices
   * @param k number of pairs
   * @return number of matchings
   */
  private Z matchingCount(final int n, final int k) {
    Z r = Z.ONE;
    for (int j = 0; j < k; ++j) {
      r = r.multiply(n - 2L * j).multiply(n - 2L * j - 1).divide(2L * (j + 1));
    }
    return r;
  }

  @Override
  public Z next() {
    ++mN;
    ensureP(mN);
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.add(matchingCount(mN, k).multiply(mP[mN - 2 * k]));
    }
    return sum;
  }
}
