package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a007.A007661;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A397779 2-adic valuation of the triple factorial of n.
 * @author Sean A. Irvine
 */
public class A397779 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A397779() {
    super(0, new A007661(), k -> Z.valueOf(k.makeOdd().auxiliary()));
  }
}

