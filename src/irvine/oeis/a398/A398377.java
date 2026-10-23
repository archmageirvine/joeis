package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a339.A339558;

/**
 * A398377 Primes p for which pi_{24;7,11}(p) - pi_{24;1,5}(p) = -1, where pi_{m;a,b,...}(x) is the number of primes &lt;= x which are congruent to a or b or ... (mod m).
 * @author Sean A. Irvine
 */
public class A398377 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A398377() {
    super(1, 1, new A339558());
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
