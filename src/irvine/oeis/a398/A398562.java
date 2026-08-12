package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000849;
import irvine.oeis.a005.A005867;

/**
 * A398562 Number of composite numbers less than the n-th primorial that are relatively prime to the (n-1)-th primorial.
 * @author Sean A. Irvine
 */
public class A398562 extends Sequence1 {

  private long mN = -2;
  private final Sequence mA = new A005867();
  private final Sequence mB = new A000849().skip();
  private final Sequence mP = new A000040();

  @Override
  public Z next() {
    return mA.next().multiply(mP.next()).subtract(mB.next()).add(++mN);
  }
}

