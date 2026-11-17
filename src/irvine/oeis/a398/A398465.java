package irvine.oeis.a398;

import irvine.math.graph.LabeledReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A398465 Number of reducible flow graphs on n labeled nodes with entry node 1.
 * @author Gregory Morse
 */
public class A398465 extends CachedSequence {

  /** Construct the sequence. */
  public A398465() {
    super(1, Integer.class, new LabeledReducibleDigraphs()::rooted);
  }
}
