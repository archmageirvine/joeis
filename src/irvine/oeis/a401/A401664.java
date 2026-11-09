package irvine.oeis.a401;

import irvine.oeis.a020.A020861;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;

/**
 * A401664 allocated for Miquel Cerda.
 * @author Sean A. Irvine
 */
public class A401664 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A401664() {
    super(1, new A020861());
  }
}

