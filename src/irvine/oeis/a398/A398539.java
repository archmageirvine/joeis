package irvine.oeis.a398;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002997;
import irvine.oeis.a050.A050990;

/**
 * A398539 allocated for Jens Ahlstr\u00f6m.
 * @author Sean A. Irvine
 */
public class A398539 extends Sequence1 {

  private final ArrayList<Sequence> mGenerators = new ArrayList<>();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mGenerators.add(mN == 0 ? new A002997() : new A050990(mN + 1));
      mM = 0;
    }
    return mGenerators.get(mM).next();
  }
}
