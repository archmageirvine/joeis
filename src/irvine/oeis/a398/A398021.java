package irvine.oeis.a398;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007504;

/**
 * A398021 allocated for Vincenzo Manto.
 * @author Sean A. Irvine
 */
public class A398021 extends Sequence1 {

  private final Sequence mS = new A007504();
  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 0;
  {
    mA.add(mS.next());
  }

  @Override
  public Z next() {
    while (true) {
      final Z sopf = Functions.SOPF.z(++mN);
      while (sopf.compareTo(mA.last()) > 0) {
        mA.add(mS.next());
      }
      if (mA.contains(sopf)) {
        return Z.valueOf(mN);
      }
    }
  }
}
