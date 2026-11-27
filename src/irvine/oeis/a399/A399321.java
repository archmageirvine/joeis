package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A399321 allocated for Mats Granvik.
 * @author Sean A. Irvine
 */
public class A399321 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A399321() {
    super(0, CR.GAMMA.add(1).multiply(CR.PI).divide(32));
  }
}
