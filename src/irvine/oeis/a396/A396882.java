package irvine.oeis.a396;

import irvine.oeis.Combiner;
import irvine.oeis.a006.A006325;

/**
 * A396882 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A396882 extends Combiner {

  /** Construct the sequence. */
  public A396882() {
    super(1, new A396761(), new A006325().skip(), SUBTRACT);
  }
}
