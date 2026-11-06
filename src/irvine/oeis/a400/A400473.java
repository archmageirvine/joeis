package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A400433 a(n) is the smallest divisor d of the n-th primorial such that prime(n)#/d + d or prime(n)#/d - d is prime.
 * @author Sean A. Irvine
 */
public class A400473 extends Sequence1 {

  private final Sequence mPrimorial = new A002110().skip();

  @Override
  public Z next() {
    final Z p = mPrimorial.next();
    for (final Z d : Jaguar.factor(p).divisorsSorted()) {
      final Z pd = p.divide(d);
      if (pd.subtract(d).isProbablePrime() || pd.add(d).isProbablePrime()) {
        return d;
      }
    }
    throw new RuntimeException();
  }
}
