package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a046.A046315;

/**
 * A397480 allocated for Michael Shmoish.
 * @author Sean A. Irvine
 */
public class A397480 extends Sequence1 {

  private final Sequence mS = new A046315();
  private Z mA = mS.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mS.next();
    final Z p = Functions.NEXT_PRIME.z(t);
    return p.compareTo(mA) < 0 ? p : Z.ZERO;
  }
}
