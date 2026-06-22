package irvine.oeis.a396;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a332.A332785;

/**
 * A396968 Numbers that are neither squarefree, powerful, nor in A396324.
 * @author Sean A. Irvine
 */
public class A396968 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A396968() {
    super(1, new A332785(), new A396324());
  }
}
