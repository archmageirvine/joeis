package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398217 Decimal expansion of the large face angle, in radians, of a canonical (dual-uniform) octagonal trapezohedron.
 * @author Sean A. Irvine
 */
public class A398217 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398217() {
    super(1, ComputableReals.SINGLETON.acos(CR.HALF.subtract(CR.PI.divide(8).cos())));
  }
}
