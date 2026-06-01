package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.a060.A060604;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396470 Sum of the distinct prime divisors of C(prime(n), n).
 * @author Sean A. Irvine
 */
public class A396470 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396470() {
    super(1, new A060604(), Functions.SOPF::z);
  }
}

