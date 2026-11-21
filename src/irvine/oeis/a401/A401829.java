package irvine.oeis.a401;

import irvine.oeis.DifferenceSequence;

/**
 * A401829 Net change in the firing population from generation n to generation n+1 of a four-state cellular automaton on the infinite square lattice (rule B2/S34/C4, see Comments), starting with two horizontally adjacent firing cells and all other cells ready.
 * @author Sean A. Irvine
 */
public class A401829 extends DifferenceSequence {

  /** Construct the sequence. */
  public A401829() {
    super(0, new A401828());
  }
}
