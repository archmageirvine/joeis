package irvine.oeis.a401;

import irvine.math.graph.LabeledReducibleElections;
import irvine.oeis.CachedSequence;

/**
 * A401522 Number of digraphs on n labeled nodes that are reducible for every election of source-SCC headers.
 * @author Gregory Morse
 */
public class A401522 extends CachedSequence {

  /** Construct the sequence. */
  public A401522() {
    super(1, Integer.class, new LabeledReducibleElections(true)::count);
  }
}
