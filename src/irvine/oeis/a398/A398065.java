package irvine.oeis.a398;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a069.A069268;

/**
 * A398065 allocated for Scott M. Foltz.
 * @author Sean A. Irvine
 */
public class A398065 extends PartialSumSequence {

  /** Construct the sequence. */
  public A398065() {
    super(1, new A069268());
  }
}
