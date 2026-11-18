package irvine.oeis.a397;

import irvine.math.graph.LabeledReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A397965 Number of pairs (D, h) where D is a digraph on n labeled nodes and h elects one node in each source SCC of D (an SCC receiving no external edge) such that attaching a virtual root joined to the elected nodes yields a reducible flow graph.
 * @author Gregory Morse
 */
public class A397965 extends CachedSequence {

  /** Construct the sequence. */
  public A397965() {
    super(1, Integer.class, new LabeledReducibleDigraphs()::elections);
  }
}
