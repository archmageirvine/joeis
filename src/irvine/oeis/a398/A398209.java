package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398209 Triangle read by rows: For n &gt;= 1, T(n,k) is the number of distinct entries q of the n X n multiplication table such that floor(q/n) = k, for 0 &lt;= k &lt;= n, with T(0,0) = 0.
 * @author Sean A. Irvine
 */
public class A398209 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private List<Set<Integer>> mRow = Collections.emptyList();

  @Override
  public Z next() {
    if (++mM >= mRow.size()) {
      mM = 0;
      if (++mN == 0) {
        return Z.ZERO;
      }
      mRow = new ArrayList<>();
      for (int k = 0; k < mN + 1; ++k) {
        mRow.add(new HashSet<>());
      }
      for (int j = 1; j <= mN; ++j) {
        for (int k = 1; k <= mN; ++k) {
          mRow.get((j * k) / mN).add(j * k);
        }
      }
    }
    return Z.valueOf(mRow.get(mM).size());
  }
}
