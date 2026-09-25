package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a091.A091508;
import irvine.util.array.DynamicLongArray;

/**
 * A398786 allocated for Sam Chapman.
 * @author Sean A. Irvine
 */
public class A398786 extends Sequence1 {

  private final Sequence mS = new A091508();
  private final DynamicLongArray mCounts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mM < Functions.FACTORIAL.l(mN)) {
      mCounts.increment(mS.next().intValueExact());
      ++mM;
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
