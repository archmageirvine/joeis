package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395653.
 * @author Sean A. Irvine
 */
public class A396022 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396022() {
    super(0, CR.SQRT2.add(2).divide(CR.TAU));
  }
}
