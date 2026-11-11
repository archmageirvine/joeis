package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002144;
import irvine.oeis.a002.A002365;
import irvine.oeis.a002.A002366;

/**
 * A401742 allocated for Edward Schmidt.
 * @author Sean A. Irvine
 */
public class A401742 extends Sequence1 {

  private final Sequence mA = new A002144();
  private final Sequence mB = new A002365();
  private final Sequence mC = new A002366();

  @Override
  public Z next() {
    final Z t = mA.next();
    return t.square().add(mB.next().multiply(mC.next())).multiply(t);
  }
}

