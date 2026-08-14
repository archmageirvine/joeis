package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A398618 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A398618 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398618() {
    super(1, ComputableReals.SINGLETON.acos(new PolynomialRootExpansionSequence(0, Polynomial.create(3, -9, -3, 17), CR.NEG_ONE, CR.HALF.negate()).getCR()));
  }
}

