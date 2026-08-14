package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A398618.
 * @author Sean A. Irvine
 */
public class A397607 extends A065091 {

  private final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p1 = p.subtract(1);
      if (Functions.CARMICHAEL_LAMBDA.z(mB.get(p1.longValueExact()).den().divide(p)).equals(p1)) {
        return p;
      }
    }
  }
}
