package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a256.A256359;

/**
 * A400131 allocated for Guido Avagliano.
 * @author Sean A. Irvine
 */
public class A400131 extends ComplementSequence {

  /** Construct the sequence. */
  public A400131() {
    super(1, Z.ONE, new A256359());
  }
}
