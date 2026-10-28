package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000040;

/**
 * A401304 a(n) is the least prime p such that (p^m + q^m)/(p+q) is also prime where m=prime(n), where q is the next prime after p, or -1 if no such p exists.
 * @author Sean A. Irvine
 */
public class A401304 extends Sequence2 {

  private final Sequence mPrimes = new A000040().skip();

  @Override
  public Z next() {
    final Z m = mPrimes.next();
    Z p;
    Z q = Z.TWO;
    while (true) {
      p = q;
      q = Functions.NEXT_PRIME.z(q);
      final Z t = p.pow(m).add(q.pow(m)).divide(p.add(q));
      if (t.isProbablePrime()) {
        return p;
      }
    }
  }
}
