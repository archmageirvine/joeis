package irvine.oeis.a399;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000225;
import irvine.oeis.a178.A178841;

/**
 * A399714 a(n) = -1 - A010815(n-1) - Sum_{k=1..n-2} A010815(k)*2^(n-2-k) for n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A399714 extends Combiner {

  /** Construct the sequence. */
  public A399714() {
    super(3, new A000225().skip(), new A178841().skip(2), SUBTRACT);
  }
}
