package irvine.oeis.a399;

import irvine.oeis.a033.A033323;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A399498 Number of equivalence classes under rotations and reflections of n-step self-avoiding walks on the square lattice that use both coordinate axes and have exactly 2 pairs of nonconsecutive vertices that are adjacent in the lattice.
 * @author Sean A. Irvine
 */
public class A399498 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A399498() {
    super(1, new A033323(), k -> k.divide(8));
  }
}

