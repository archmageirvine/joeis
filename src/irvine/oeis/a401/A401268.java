package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a001.A001359;

/**
 * A401268 allocated for Francisco Torres Gonzalez.
 * @author Sean A. Irvine
 */
public class A401268 extends Sequence2 {

  private final Sequence mA = new A001359().skip();

  @Override
  public Z next() {
    final Z p = mA.next();
    final Z start = p.multiply(7).add(4).divide(3);
    Z q = start.subtract(1);
    while (true) {
      q = Functions.NEXT_PRIME.z(q);
      if (q.add(2).isProbablePrime()) {
        return q.subtract(start);
      }
    }
  }
}

