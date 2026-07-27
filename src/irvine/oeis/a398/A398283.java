package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398283 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A398283 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398283() {
    super(0, CR.PI.multiply(CR.THREE.sqrt()).multiply(11).divide(135));
  }
}
