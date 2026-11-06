package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.oeis.a058.A058009;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A401311 allocated for Justo Tapiador.
 * @author Sean A. Irvine
 */
public class A401311 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A401311() {
    super(1, new A058009(), Functions.PRIME::z);
  }
}
