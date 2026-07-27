package irvine.oeis.a396;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396733 Decimal expansion of Sum_{k&gt;=1} H(k)/((k+1)^3*2^k), where H(k) = A001008(k)/A002805(k) is the k-th harmonic number.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A396733 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A396733() {
    super(0, Zeta.zeta(4).subtract(CR.TWO.log().multiply(Zeta.zeta(3))).add(CR.TWO.log().pow(4).divide(CR.THREE)).divide(CR.FOUR));
  }
}
