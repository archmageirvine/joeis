package irvine.oeis.a402;

import irvine.math.q.Q;
import irvine.oeis.a005.A005596;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A402373 Decimal expansion of 27*A/38, where A is Artin's constant (A005596): the conjectured relative density of the primes having a Fibonacci primitive root.
 * @author Sean A. Irvine
 */
public class A402373 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A402373() {
    super(0, new A005596().getCR().multiply(new Q(27, 38)));
  }
}
