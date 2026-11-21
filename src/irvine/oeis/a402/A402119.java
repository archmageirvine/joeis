package irvine.oeis.a402;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A402119 Decimal expansion of Sum_{k &gt;= 1} coth(Pi*k)/k^11 = (1453/425675250)*Pi^11.
 * @author Sean A. Irvine
 */
public class A402119 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A402119() {
    super(1, CR.PI.pow(11).multiply(1453).divide(425675250));
  }
}

