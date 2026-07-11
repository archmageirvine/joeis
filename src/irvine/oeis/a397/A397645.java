package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A085547.
 * @author Sean A. Irvine
 */
public class A397645 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A397645() {
    super(1, (p, e) -> Z.valueOf(e + 1).multiply(e + 2).multiply(5L * e + 3).divide(6));
  }
}
