package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399139 Maximum size of a subset of {1,...,n} in which no prime divides more than 3 elements.
 * @author Sean A. Irvine
 */
public class A399139 extends Sequence1 {

  // After Hassan Sadeghi

  private long mN = 0;

  /**
   * Recursive search.
   */
  private static class Search {

    private final int[] mEdgeA;
    private final int[] mEdgeB;
    private final int[] mCap;
    private final int[] mUsed;
    private int mBest;

    Search(final int[] edgeA, final int[] edgeB, final int[] cap, final int[] used) {
      mEdgeA = edgeA;
      mEdgeB = edgeB;
      mCap = cap;
      mUsed = used;
    }

    int search(final int k, final int total) {
      if (k == mEdgeA.length) {
        if (total > mBest) {
          mBest = total;
        }
        return mBest;
      }
      // First branch: do not take this edge
      search(k + 1, total);
      // Second branch: take this edge if both endpoints have remaining capacity
      final int a = mEdgeA[k];
      final int b = mEdgeB[k];
      if (mUsed[a] < mCap[a] && mUsed[b] < mCap[b]) {
        ++mUsed[a];
        ++mUsed[b];
        search(k + 1, total + 1);
        --mUsed[a];
        --mUsed[b];
      }
      return mBest;
    }
  }

  // Returns true iff p^3 <= n, without risking long overflow.
  private static boolean cubeLe(final long p, final long n) {
    final long pp = p * p;
    return pp <= n / p;
  }

  private Z a(final long n) {
    if (n < 2) {
      return Z.ONE;
    }
    // v = primes p for which p > cbrt(n)
    final List<Long> v = new ArrayList<>();
    for (long p = 2; p <= n; p = Functions.NEXT_PRIME.l(p)) {
      if (!cubeLe(p, n)) {
        v.add(p);
      }
    }
    // Construct the edge list: {p,q}, p < q, p*q <= n
    final int maxEdges = v.size() * (v.size() - 1) / 2;
    final long[] edgeA = new long[maxEdges];
    final long[] edgeB = new long[maxEdges];
    int edges = 0;
    for (int k = 0; k < v.size() - 1; ++k) {
      final long p = v.get(k);
      for (int j = k + 1; j < v.size(); ++j) {
        final long q = v.get(j);
        if (p <= n / q) {
          edgeA[edges] = p;
          edgeB[edges] = q;
          ++edges;
        }
      }
    }

    // Map each vertex in V to a small integer index
    final int nv = v.size();
    final int[] cap = new int[nv];
    final int[] used = new int[nv];
    for (int i = 0; i < nv; i++) {
      final long p = v.get(i);
      cap[i] = p * p <= n ? 1 : 2;
    }
    // Convert edge endpoints to indices
    final int[] ea = new int[edges];
    final int[] eb = new int[edges];
    for (int k = 0; k < edges; k++) {
      ea[k] = indexOf(v, edgeA[k]);
      eb[k] = indexOf(v, edgeB[k]);
    }

    // Maximum number of edges satisfying the vertex capacities
    final Search search = new Search(ea, eb, cap, used);
    final int best = search.search(0, 0);
    int c0 = 1; // total primes + 1
    int c1 = 0; // number of primes <= sqrt(n)
    int c2 = 0; // number of primes <= cbrt(n)
    for (long p = 2; p <= n; p = Functions.NEXT_PRIME.l(p)) {
      ++c0;
      if (p * p <= n) {
        c1++;
      }
      if (cubeLe(p, n)) {
        c2++;
      }
    }
    return Z.valueOf(c0 + c1 + c2 + best);
  }

  private static int indexOf(final List<Long> v, final long p) {
    // v is sorted, so binary search is appropriate
    int lo = 0;
    int hi = v.size() - 1;
    while (lo <= hi) {
      final int mid = (lo + hi) >>> 1;
      final long x = v.get(mid);
      if (x < p) {
        lo = mid + 1;
      } else if (x > p) {
        hi = mid - 1;
      } else {
        return mid;
      }
    }
    throw new IllegalStateException();
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
