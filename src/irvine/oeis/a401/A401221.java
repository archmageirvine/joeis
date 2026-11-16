package irvine.oeis.a401;

import irvine.oeis.FilterSequence;
import irvine.oeis.a004.A004012;

/**
 * A401221 Sizes of the successive shells of the hexagonal close-packed (HCP) lattice, centered on a lattice point.
 * @author Sean A. Irvine
 */
public class A401221 extends FilterSequence {

  /** Construct the sequence. */
  public A401221() {
    super(0, new A004012(), NONZERO);
  }
}

