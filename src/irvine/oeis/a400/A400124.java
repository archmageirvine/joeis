package irvine.oeis.a400;

import irvine.math.graph.EverywhereReducibleDigraphs;
import irvine.oeis.CachedSequence;

/**
 * A400124 Number of flat everywhere-reducible digraphs with a marked return vertex on n labeled atoms.
 * @author Gregory Morse
 */
public class A400124 extends CachedSequence {

  /** Construct the sequence. */
  public A400124() {
    super(0, Integer.class, EverywhereReducibleDigraphs::flatReturn);
  }
}
