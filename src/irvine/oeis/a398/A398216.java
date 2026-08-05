package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398216 Decimal expansion of the small face angle, in radians, of a canonical (dual-uniform) octagonal trapezohedron.
 * @author Sean A. Irvine
 */
public class A398216 extends DecimalExpansionSequence {

  private static final CR PI8 = CR.PI.divide(8);

  /** Construct the sequence. */
  public A398216() {
    super(0, ComputableReals.SINGLETON.acos(CR.TWO.add(CR.THREE.divide(CR.SQRT2)).subtract(PI8.cos().multiply(3)).subtract(PI8.sin())));
  }
}

