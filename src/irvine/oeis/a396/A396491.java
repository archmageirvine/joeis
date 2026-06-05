package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396491 Number of unsatisfiable 3-SAT formulas with n variables and 5 clauses in the multiset clause model.
 * @author Sean A. Irvine
 */
public class A396491 extends Sequence1 {

  // After Ramin Mohammadi Masoudi

  private int mN = 0;

  private static long pack(final int a, final int b, final int c) {
    return (a & 0xFFFFL)
      | ((b & 0xFFFFL) << 16)
      | ((c & 0xFFFFL) << 32);
  }

  private static boolean eval(final long clause, final long assignment) {
    int lit = (short) clause;
    int v = Math.abs(lit) - 1;
    boolean val = ((assignment >>> v) & 1) != 0;
    if ((lit > 0) == val) {
      return true;
    }

    lit = (short) (clause >>> 16);
    v = Math.abs(lit) - 1;
    val = ((assignment >>> v) & 1) != 0;
    if ((lit > 0) == val) {
      return true;
    }

    lit = (short) (clause >>> 32);
    v = Math.abs(lit) - 1;
    val = ((assignment >>> v) & 1) != 0;
    return (lit > 0) == val;
  }

  private static List<Long> clauses(final int n) {
    final int[] lits = new int[2 * n];
    int k = 0;
    for (int j = -n; j < 0; ++j) {
      lits[k++] = j;
    }
    for (int j = 1; j <= n; ++j) {
      lits[k++] = j;
    }

    final ArrayList<Long> res = new ArrayList<>();
    for (int a = 0; a < lits.length; ++a) {
      for (int b = a; b < lits.length; ++b) {
        for (int c = b; c < lits.length; ++c) {
          res.add(pack(lits[a], lits[b], lits[c]));
        }
      }
    }
    return res;
  }

  private static boolean unsat(final int n, final long[] formula) {
    final long lim = 1L << n;
    for (long assignment = 0; assignment < lim; ++assignment) {
      boolean ok = true;
      for (final long clause : formula) {
        if (!eval(clause, assignment)) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final List<Long> clauses = clauses(mN);
    final int m = clauses.size();
    final long[] formula = new long[5];
    Z count = Z.ZERO;
    for (int i1 = 0; i1 < m; ++i1) {
      formula[0] = clauses.get(i1);
      for (int i2 = i1; i2 < m; ++i2) {
        formula[1] = clauses.get(i2);
        for (int i3 = i2; i3 < m; ++i3) {
          formula[2] = clauses.get(i3);
          for (int i4 = i3; i4 < m; ++i4) {
            formula[3] = clauses.get(i4);
            for (int i5 = i4; i5 < m; ++i5) {
              formula[4] = clauses.get(i5);
              if (unsat(mN, formula)) {
                count = count.add(1);
              }
            }
          }
        }
      }
    }
    return count;
  }
}
