package irvine.oeis.a400;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400974 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A400974 extends Sequence1 {

  private final ArrayList<Integer> mA = new ArrayList<>();
  private long mN = 0;

  private void step() {
    mA.clear();
    final Z[] d = Jaguar.factor(++mN).divisorsSorted();
    int c = 1;
    for (int k = 1; k < d.length; ++k) {
      if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
        mA.add(c);
        c = 1;
      } else {
        ++c;
      }
    }
    mA.add(c);
  }

  @Override
  public Z next() {
    step();
    return (mA.size() & 1) == 0 ? Z.ZERO : Z.valueOf(mA.get(mA.size() / 2));
  }
}
