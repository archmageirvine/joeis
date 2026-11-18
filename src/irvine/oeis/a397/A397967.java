package irvine.oeis.a397;

import irvine.math.graph.LabeledReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A397967 Number of reducible flow graphs on n labeled nodes whose entry node 1 is a global source and node n is a global sink (node 1 = node n when n = 1).
 * @author Gregory Morse
 */
public class A397967 extends CachedSequence {

  /** Construct the sequence. */
  public A397967() {
    super(1, Integer.class, new LabeledReducibleDigraphs()::singleSourceSink);
  }
}
