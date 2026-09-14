package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A399780 allocated for Hugo Pfoertner.
 * @author Sean A. Irvine
 */
public class A399780 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A399780() {
    super(1, CR.PI.add(2).square().divide(CR.PI.multiply(4)));
  }
}

