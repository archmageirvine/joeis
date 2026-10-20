package irvine.oeis.a401;

import irvine.oeis.Combiner;
import irvine.oeis.a001.A001227;
import irvine.oeis.a065.A065033;

/**
 * A401008 allocated for Jaroslav Krizek.
 * @author Sean A. Irvine
 */
public class A401008 extends Combiner {

  /** Construct the sequence. */
  public A401008() {
    super(1, new A065033().skip(), new A001227(), SUBTRACT);
  }
}
