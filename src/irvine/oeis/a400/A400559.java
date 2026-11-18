package irvine.oeis.a400;

import irvine.math.graph.EverywhereReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A400559 Number of single-entry single-exit all-valid blocks on n labeled nodes.
 * @author Gregory Morse
 */
public class A400559 extends CachedSequence {

  /** Construct the sequence. */
  public A400559() {
    super(1, Integer.class, EverywhereReducibleDigraphs::block);
  }
}
