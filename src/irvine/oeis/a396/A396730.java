package irvine.oeis.a396;

import irvine.oeis.Combiner;
import irvine.oeis.a058.A058399;
import irvine.oeis.a066.A066633;

/**
 * A396730 Triangle read by rows: T(n,k) = A058399(n,k) + A066633(n,k), 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A396730 extends Combiner {

  /** Construct the sequence. */
  public A396730() {
    super(1, new A058399(), new A066633(), ADD);
  }
}
