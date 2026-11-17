package irvine.oeis.a397;

import irvine.math.graph.LabeledReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A397965 Number of pairs of a digraph on n labeled nodes and a reducible election of source-SCC headers.
 * @author Gregory Morse
 */
public class A397965 extends CachedSequence {

  /** Construct the sequence. */
  public A397965() {
    super(1, Integer.class, new LabeledReducibleDigraphs()::elections);
  }
}
