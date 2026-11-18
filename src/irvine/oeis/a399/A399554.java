package irvine.oeis.a399;

import irvine.math.graph.LabeledReducibleElections;
import irvine.oeis.CachedSequence;

/**
 * A399554 Number of digraphs on n labeled nodes that are reducible for some election of source-SCC headers: some choice of one node per source SCC makes the virtual-rooted flow graph reducible.
 * @author Gregory Morse
 */
public class A399554 extends CachedSequence {

  /** Construct the sequence. */
  public A399554() {
    super(1, Integer.class, new LabeledReducibleElections(false)::count);
  }
}
