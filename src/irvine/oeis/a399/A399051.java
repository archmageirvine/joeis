package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a070.A070826;

/**
 * A399051 a(n) is the least even number c such that (prime(n)#/2) - c is a prime greater than prime(n).
 * @author Sean A. Irvine
 */
public class A399051 extends Sequence3 {

  private final Sequence mA = new A070826().skip(2);

  @Override
  public Z next() {
    final Z t = mA.next();
    return t.subtract(Functions.PREV_PRIME.z(t));
  }
}
