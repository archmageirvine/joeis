package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.a007.A007662;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A397801 3-adic valuation of the quadruple factorial of n.
 * @author Sean A. Irvine
 */
public class A397801 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A397801() {
    super(0, new A007662(), k -> Functions.VALUATION.z(k, 3));
  }
}

