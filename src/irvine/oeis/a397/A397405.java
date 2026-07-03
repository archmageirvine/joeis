package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a014.A014551;

/**
 * A397405 Numbers that are not Jacobsthal-Lucas numbers.
 * @author Sean A. Irvine
 */
public class A397405 extends ComplementSequence {

  /** Construct the sequence. */
  public A397405() {
    super(1, Z.THREE, new A014551().skip());
  }
}
