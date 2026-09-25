package irvine.oeis.a397;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a393.A393538;

/**
 * A397827 Triangle read by rows: T(n,k) is the denominator of R(n,k), where R(n,0) = R(n,n) = 1 and R(n+1,k) = 1/R(n,k-1) + 1/R(n,k).
 * @author Sean A. Irvine
 */
public class A397827 extends A393538 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

