package irvine.oeis.a397;

import irvine.math.graph.LabeledReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A397655 Number of reducible flow graphs on n labeled nodes with entry node 1 and exit node n.
 * @author Gregory Morse
 */
public class A397655 extends CachedSequence {

  /** Construct the sequence. */
  public A397655() {
    super(1, Integer.class, new LabeledReducibleDigraphs()::rootedExit);
  }
}
