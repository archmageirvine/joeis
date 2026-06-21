package irvine.oeis.a396;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085475.
 * @author Sean A. Irvine
 */
public class A396247 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A396247() {
    super(1, Zeta.zeta(26));
  }
}
