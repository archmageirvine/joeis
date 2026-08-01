package irvine.oeis.a398;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a054.A054753;
import irvine.oeis.a072.A072357;

/**
 * A398316 allocated for Charles Kusniec.
 * @author Sean A. Irvine
 */
public class A398316 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A398316() {
    super(1, new A072357(), new A054753());
  }
}
