package irvine.oeis.a397;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085546.
 * @author Sean A. Irvine
 */
public class A397435 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A397435() {
    super(1, CR.TWO.exp().divide(2));
  }
}
