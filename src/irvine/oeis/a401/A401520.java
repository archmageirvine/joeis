package irvine.oeis.a401;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401520:
 * @author Sean A. Irvine
 */
public class A401520 extends Sequence1 {

  // After Jeff Sponaugle

  private int mN = 0;
  private int mM = 0;
  private List<Integer> mRow = new ArrayList<>();

  /**
   * Generate all possible truncated subset-sum sets for a given m.
   * @param m maximum sum
   * @return all reachable bitsets
   */
  private List<Z> generate(final int m) {
    final Z full = Z.ONE.shiftLeft(m + 1).subtract(Z.ONE);
    final Set<Z> seen = new HashSet<>();
    final ArrayDeque<Z> stack = new ArrayDeque<>();
    seen.add(Z.ONE);
    stack.push(Z.ONE);
    while (!stack.isEmpty()) {
      final Z s = stack.pop();
      for (int x = 1; x <= m; ++x) {
        final Z t = s.or(s.shiftLeft(x)).and(full);
        if (seen.add(t)) {
          stack.push(t);
        }
      }
    }
    return new ArrayList<>(seen);
  }

  /**
   * Test whether Q is shattered.
   * @param q tuple
   * @param states reachable subset-sum sets
   * @return true if Q is shattered
   */
  private boolean shattered(final List<Integer> q, final List<Z> states) {
    Z qb = Z.ZERO;
    for (final int v : q) {
      qb = qb.setBit(v);
    }
    final Set<Z> projections = new HashSet<>();
    for (final Z c : states) {
      projections.add(c.and(qb));
    }
    return Z.valueOf(projections.size()).equals(Z.ONE.shiftLeft(q.size()));
  }

  /**
   * Find the lexicographically earliest suitable tuple.
   * @param q current tuple
   * @param n tuple length
   * @param states reachable subset-sum sets
   * @return solution, or null if none
   */
  private List<Integer> dfs(final List<Integer> q, final int n, final List<Z> states) {
    if (q.size() == n) {
      return new ArrayList<>(q);
    }
    final int last = q.get(q.size() - 1);
    for (int a = n - q.size(); a < last; ++a) {
      q.add(a);
      if (shattered(q, states)) {
        final List<Integer> result = dfs(q, n, states);
        if (result != null) {
          return result;
        }
      }
      q.remove(q.size() - 1);
    }
    return null;
  }

  /**
   * Compute row n.
   * @param n row number
   * @return row
   */
  private List<Integer> computeRow(final int n) {
    for (int m = n; ; ++m) {
      final List<Z> states = generate(m);
      final List<Integer> q = new ArrayList<>();
      q.add(m);
      final List<Integer> result = dfs(q, n, states);
      if (result != null) {
        return result;
      }
    }
  }

  @Override
  public Z next() {
    if (mM >= mRow.size()) {
      mRow = computeRow(++mN);
      mM = 0;
    }
    return Z.valueOf(mRow.get(mM++));
  }
}
