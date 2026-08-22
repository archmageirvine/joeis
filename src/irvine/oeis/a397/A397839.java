package irvine.oeis.a397;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a123.A123753;
import irvine.oeis.a217.A217858;
import irvine.oeis.a398.A398928;

/**
 * A397839 allocated for Alexander Krivilev.
 * @author Sean A. Irvine
 */
public class A397839 extends Sequence1 {

  // todo formula is wrong?

  private final Sequence mA = new A123753().skip();
  private final Sequence mB = new A398928();
  private final Sequence mC = new A217858();

  @Override
  public Z next() {
    return new Q(mB.next(), mC.next()).negate().add(mA.next()).num();
  }
}
// a(n) is the numerator of n*ceiling(log_2(n)) - 2^ceiling(log_2(n)) + 1 + n - Sum_{k=1..n} 2^ceiling(log_2(n))/k = A123753(n) - A398928(n)/A217858(n).
