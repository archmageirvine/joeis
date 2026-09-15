package irvine.oeis.a399;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000225;
import irvine.oeis.a178.A178841;

/**
 * A399714 allocated for Tam\u00e1s Sz\u0171cs.
 * @author Sean A. Irvine
 */
public class A399714 extends Combiner {

  /** Construct the sequence. */
  public A399714() {
    super(3, new A000225().skip(), new A178841().skip(2), SUBTRACT);
  }
}
