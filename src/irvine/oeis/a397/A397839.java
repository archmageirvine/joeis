package irvine.oeis.a397;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a123.A123753;
import irvine.oeis.a217.A217858;
import irvine.oeis.a398.A398928;

/**
 * A397839 a(n) = numerator of the average number of comparisons for sorting n elements by binary insertion.
 * @author Sean A. Irvine
 */
public class A397839 extends Sequence1 {

  private final Sequence mA = new A123753();
  private final Sequence mB = new A398928();
  private final Sequence mC = new A217858();

  @Override
  public Z next() {
    return new Q(mB.next(), mC.next()).negate().add(mA.next()).num();
  }
}

