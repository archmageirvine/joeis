package irvine.oeis.a397;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a332.A332785;

/**
 * A397934 Numbers that are neither squarefree, powerful, nor in either A396594 or A397221.
 * @author Sean A. Irvine
 */
public class A397934 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A397934() {
    super(1, new A332785(), new UnionSequence(new A397932(), new A397933()));
  }
}
