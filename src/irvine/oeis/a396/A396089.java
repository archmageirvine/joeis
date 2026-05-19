package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396089 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A396089 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396089() {
    super(0, CR.PI.inverse(), 5);
  }
}
