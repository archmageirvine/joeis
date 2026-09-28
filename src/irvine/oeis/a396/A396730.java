package irvine.oeis.a396;

import irvine.oeis.Combiner;
import irvine.oeis.a058.A058399;
import irvine.oeis.a066.A066633;

/**
 * A396730 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A396730 extends Combiner {

  /** Construct the sequence. */
  public A396730() {
    super(1, new A058399(), new A066633(), ADD);
  }
}
