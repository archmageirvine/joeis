package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400291 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A400291 extends Sequence1 {

  private final Map<Z, List<Z>> mMap = new HashMap<>();
  private long mPrimeIndex = 0;
  protected List<Z> mRow = new ArrayList<>();
  private int mM = -1;
  private int mN = 0;

  protected void step() {
    ++mN;
    while (true) {
      final Z p = Functions.PRIME.z(++mPrimeIndex);
      if (p.equals(Z.TWO) || p.equals(Z.FIVE)) {
        continue;
      }
      final Z order = Functions.ORDER.z(p, 10);
      final List<Z> list = mMap.computeIfAbsent(order, k -> new ArrayList<>());
      list.add(p);
      if (list.size() == mN) {
        mRow = new ArrayList<>(list);
        return;
      }
    }
  }

  @Override
  public Z next() {
    if (++mM >= mRow.size()) {
      step();
      mM = 0;
    }
    return mRow.get(mM);
  }
}

