package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.a026.A026351;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A397627 a(n) = prime(A026351(n)).
 * @author Sean A. Irvine
 */
public class A397627 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A397627() {
    super(1, new A026351(), Functions.PRIME::z);
  }
}
