package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398283 Decimal expansion of the volume of the solid of revolution of the Koch snowflake about an axis of symmetry of the initiating equilateral triangle of unit side.
 * @author Sean A. Irvine
 */
public class A398283 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398283() {
    super(0, CR.PI.multiply(CR.THREE.sqrt()).multiply(11).divide(135));
  }
}
