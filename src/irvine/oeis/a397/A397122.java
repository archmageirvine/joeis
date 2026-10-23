package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a401.A401006;

/**
 * A397122 Prime reached by iterating A401006 starting at n, or -1 if no prime is reached.
 * @author Sean A. Irvine
 */
public class A397122 extends Sequence1 {

  private final DirectSequence mS = new A401006();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.NEG_ONE;
    }
    Z t = Z.valueOf(mN);
    while (!t.isProbablePrime()) {
      t = mS.a(t);
    }
    return t;
  }
}

