package irvine.oeis.a397;

import irvine.math.graph.LabeledReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A397967 Number of reducible flow graphs on n labeled nodes with a global source at node 1 and global sink at node n.
 * @author Gregory Morse
 */
public class A397967 extends CachedSequence {

  /** Construct the sequence. */
  public A397967() {
    super(1, Integer.class, new LabeledReducibleDigraphs()::singleSourceSink);
  }
}
