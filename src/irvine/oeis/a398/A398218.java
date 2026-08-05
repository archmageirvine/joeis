package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398218 Decimal expansion of the dihedral angle, in radians, between any two adjacent faces in a canonical (dual-uniform) octagonal trapezohedron.
 * @author Sean A. Irvine
 */
public class A398218 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398218() {
    super(1, ComputableReals.SINGLETON.acos(CR.FIVE.subtract(CR.SQRT2.multiply(6)).subtract(CR.SQRT2.multiply(79).add(130).sqrt().multiply(2)).divide(47)));
  }
}

