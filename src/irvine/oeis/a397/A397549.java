package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A085547.
 * @author Sean A. Irvine
 */
public class A397549 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A397549() {
    super(1, (p, e) -> Z.valueOf(e + 1).square().multiply(e + 2).divide2());
  }
}
