package irvine.oeis.a395;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a151.A151950;

/**
 * A395936 allocated for Hugo Pfoertner.
 * @author Sean A. Irvine
 */
public class A395936 extends Sequence1 {

  private final Sequence mS = new A151950();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPrev = Z.NEG_ONE;

  @Override
  public Z next() {
    do {
      final Z t = mS.next();
      if (t.compareTo(mPrev) > 0) {
        mA.add(t);
      }
    } while (mA.isEmpty() || mA.first().multiply(10).compareTo(mA.last()) > 0);
    mPrev = mA.pollFirst();
    return mPrev;
  }
}
