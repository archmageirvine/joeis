package irvine.oeis.a397;

import irvine.oeis.Combiner;

/**
 * A397448 a(n) is the number of distinct primitive noncyclic integer-sided quadrilaterals with integral diagonals and integer area, having semiperimeter n.
 * @author Sean A. Irvine
 */
public class A397448 extends Combiner {

  /** Construct the sequence. */
  public A397448() {
    super(1, new A397446(), new A397447(), SUBTRACT);
  }
}
