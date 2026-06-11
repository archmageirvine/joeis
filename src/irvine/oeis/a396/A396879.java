package irvine.oeis.a396;
// manually 2026-06-10/decexp at 2026-06-10 15:24

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A396879 Decimal expansion of (e-1)/e + exp(1/(e-1)).
 * @author Georg Fischer
 */
public class A396879 extends DecimalExpansionSequence {

  private static final CR E1 = CR.E.subtract(1);

  /** Construct the sequence */
  public A396879() {
    super(1, E1.divide(CR.E).add(E1.inverse().exp()));
  }
}
