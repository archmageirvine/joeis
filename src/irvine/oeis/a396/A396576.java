package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.List;

import irvine.math.MemoryFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A396576 Number of increasing mobiles with n nodes, refined by the leaf-lineage composition of n-1, read by rows.
 * @author Sean A. Irvine
 */
public class A396576 extends Sequence2 {

  // After Jonas Eschgf&auml;ller

  private final List<Integer> mRow = new ArrayList<>();
  private int mN = 0;
  private int mM = -1;
  private final MemoryFunction<List<Integer>, Integer> mT = new MemoryFunction<>() {
    @Override
    protected Integer compute(final List<Integer> p) {
      if (p.size() == 1) {
        return 1;
      }
      int sum = 0;
      for (final int x : p) {
        sum += x;
      }
      Z total = Z.ZERO;
      if (p.get(p.size() - 1) == 1) {
        total = total.add(Z.valueOf(getValue(p.subList(0, p.size() - 1))).multiply(sum - 1));
      }
      for (int j = 0; j < p.size(); ++j) {
        if (p.get(j) >= 2) {
          final ArrayList<Integer> q = new ArrayList<>(p);
          q.set(j, q.get(j) - 1);
          total = total.add(getValue(q));
        }
      }
      return total.intValueExact();
    }
  };

  private void compositions(final int rem, final int left, final List<Integer> prefix) {
    if (left == 1) {
      final ArrayList<Integer> p = new ArrayList<>(prefix);
      p.add(rem);
      mRow.add(mT.getValue(p));
      return;
    }

    for (int first = rem - (left - 1); first >= 1; --first) {
      prefix.add(first);
      compositions(rem - first, left - 1, prefix);
      prefix.remove(prefix.size() - 1);
    }
  }

  private void makeRow() {
    mRow.clear();
    for (int k = 1; k <= mN; ++k) {
      compositions(mN, k, new ArrayList<>());
    }
  }

  @Override
  public Z next() {
    if (++mM >= mRow.size()) {
      ++mN;
      mM = 0;
      makeRow();
    }
    return Z.valueOf(mRow.get(mM));
  }
}

