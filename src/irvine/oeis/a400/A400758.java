package irvine.oeis.a400;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a005.A005217;

/**
 * A400758 Number of equivalence classes of Dyck paths of semilength n+1 up to permutation of primitive components, and permutations and reflection of nested primitive components.
 * @author Sean A. Irvine
 */
public class A400758 extends PartialSumSequence {

  /** Construct the sequence. */
  public A400758() {
    super(0, new A005217());
  }
}
