package irvine.oeis.a397;

import irvine.math.graph.LabeledReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A397470 Number of strongly connected digraphs on n labeled nodes that are reducible as a flow graph with entry node 1.
 * @author Gregory Morse
 */
public class A397470 extends CachedSequence {

  /** Construct the sequence. */
  public A397470() {
    super(1, Integer.class, new LabeledReducibleDigraphs()::strong);
  }
}
