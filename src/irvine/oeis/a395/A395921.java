package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.a037.A037077;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395921 Decimal expansion of Sum_{n&gt;=0} (-1)^n*eta^(n)(n)/n!, where eta^(n) denotes the n-th derivative of the Dirichlet eta function.
 * @author Sean A. Irvine
 */
public class A395921 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395921() {
    super(0, CR.HALF.subtract(new A037077().getCR()));
  }
}
