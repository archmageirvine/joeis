package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396351 Square array read by antidiagonals: A(n,m) is the number of unsatisfiable 3-SAT formulas with n variables and m clauses in the multiset clause model, n &gt;= 1, m &gt;= 1.
 * @author Sean A. Irvine
 */
public class A396351 extends Sequence1 {

  // After Ramin Mohammadi Masoudi

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunction1<List<BitSet>> mClauses = new MemoryFunction1<>() {
    @Override
    protected List<BitSet> compute(final int n) {
      final List<BitSet> clauses = new ArrayList<>();
      final int[] lits = new int[2 * n];
      int p = 0;
      for (int k = -n; k < 0; ++k) {
        lits[p++] = k;
      }
      for (int k = 1; k <= n; ++k) {
        lits[p++] = k;
      }
      final int assignments = 1 << n;
      for (int i = 0; i < lits.length; ++i) {
        for (int j = i; j < lits.length; ++j) {
          for (int k = j; k < lits.length; ++k) {
            final BitSet sat = new BitSet(assignments);
            for (int a = 0; a < assignments; ++a) {
              if (litValue(lits[i], a) || litValue(lits[j], a) || litValue(lits[k], a)) {
                sat.set(a);
              }
            }
            clauses.add(sat);
          }
        }
      }
      return clauses;
    }
  };

  /**
   * Literal value under assignment.
   * Variables are numbered 1..n, negatives denote negation.
   */
  private static boolean litValue(final int lit, final int assignment) {
    final int v = Math.abs(lit) - 1;
    final boolean val = ((assignment >>> v) & 1) == 1;
    return (lit > 0) == val;
  }

  /**
   * Count unsatisfiable formulas recursively.
   * @param start smallest clause index allowed
   * @param remaining clauses still to choose
   * @param sat assignments satisfying all chosen clauses so far
   * @return count
   */
  private Z search(final List<BitSet> clauses, final int start, final int remaining, final BitSet sat) {
    if (sat.isEmpty()) {
      // Any completion remains unsatisfiable.
      final int t = clauses.size() - start;
      return Binomial.binomial(t + remaining - 1L, remaining);
    }

    if (remaining == 0) {
      return Z.ZERO;
    }

    Z sum = Z.ZERO;
    for (int k = start; k < clauses.size(); ++k) {
      final BitSet next = (BitSet) sat.clone();
      next.and(clauses.get(k));
      sum = sum.add(search(clauses, k, remaining - 1, next));
    }
    return sum;
  }

  protected Z t(final int n, final int m) {
    if (m == 0) {
      return Z.ZERO;
    }
    final List<BitSet> clauses = mClauses.get(n);
    final BitSet all = new BitSet(1 << n);
    all.set(0, 1 << n);
    return search(clauses, 0, m, all);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM + 1);
  }
}
