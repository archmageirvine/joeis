package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a161.A161601;

/**
 * A397430 Primes in A161601 whose binary reversal is composite.
 * @author Sean A. Irvine
 */
public class A397430 extends FilterSequence {

  /** Construct the sequence. */
  public A397430() {
    super(1, new A161601(), k -> k.isProbablePrime() && !Functions.REVERSE.z(2, k).isProbablePrime());
  }
}
