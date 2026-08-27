package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398181 allocated for Mats Granvik.
 * @author Sean A. Irvine
 */
public class A398181 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398181() {
    super(0, CR.LOG2.add(1).multiply(CR.PI).divide(32));
  }
}
