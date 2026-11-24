package irvine.oeis.a402;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a173.A173107;

/**
 * A402265 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A402265 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A402265() {
    super(1, 1, new A173107(), Predicates.ABUNDANT::is);
  }
}
