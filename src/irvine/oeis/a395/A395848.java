package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395605 allocated for Simone Cammarasana.
 * @author Sean A. Irvine
 */
public class A395848 extends DecimalExpansionSequence {


  /** Construct the sequence. */
  public A395848() {
    super(0, CR.THREE.log().multiply(3).add(4).divide(8));
  }
}
