package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002144;
import irvine.oeis.a002.A002365;
import irvine.oeis.a002.A002366;

/**
 * A401741 Sum of the squares of the semiperimeter s and inradius r of the primitive Pythagorean triangle with hypotenuse A002144(n): a(n) = s^2 + r^2.
 * @author Sean A. Irvine
 */
public class A401741 extends Sequence1 {

  private final Sequence mA = new A002144();
  private final Sequence mB = new A002365();
  private final Sequence mC = new A002366();

  @Override
  public Z next() {
    return mA.next().square().add(mB.next().multiply(mC.next()));
  }
}

