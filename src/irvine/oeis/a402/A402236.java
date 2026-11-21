package irvine.oeis.a402;

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a397.A397711;

/**
 * A402236 Number of weakly connected acyclic digraphs (or DAGs) on n labeled nodes in which every node has in-degree at most 2.
 * @author Gregory Morse
 */
public class A402236 extends PolynomialFieldSequence {
  /** Construct the sequence. */
  public A402236() {
    super(0, "[1]", "x,B,log", 0, 1, 1, 1, egf(new A397711()));
    skip();
    setOffset(1);
  }
}
