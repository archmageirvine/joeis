package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398209 allocated for Fr\u00e9d\u00e9ric D. W. Heidenthal-K\u00f6nig.
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
