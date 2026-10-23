package irvine.oeis.a401;

import irvine.math.cr.CR;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A401027 Decimal expansion of 3*Pi^2/(16*G), where G = A006752.
 * @author Sean A. Irvine
 */
public class A401027 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A401027() {
    super(1, CR.PI.square().multiply(3).divide(new A006752().getCR()).divide(16));
  }
}
