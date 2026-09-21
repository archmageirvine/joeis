package irvine.oeis.a399;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A399852 allocated for Markus Sigg.
 * @author Sean A. Irvine
 */
public class A399852 extends Sequence1 {

  private final Sequence mS = new A399704();
  private final HashSet<Long> mA = new HashSet<>();
  private long mM = 0;
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      while (3 * mM < 4 * mN + 2) {
        ++mM;
        final Z t = mS.next();
        if (t.isEven()) {
          mA.add(t.longValueExact());
        }
      }
      if (!mA.remove(mN)) {
        return Z.valueOf(mN / 2);
      }
    }
  }
}
