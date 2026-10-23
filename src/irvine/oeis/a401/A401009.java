package irvine.oeis.a401;

import irvine.oeis.Combiner;
import irvine.oeis.a004.A004526;
import irvine.oeis.a183.A183063;

/**
 * A401009 a(n) = the number of even non-divisors of n in 1..n.
 * @author Sean A. Irvine
 */
public class A401009 extends Combiner {

  /** Construct the sequence. */
  public A401009() {
    super(1, new A004526().skip(), new A183063(), SUBTRACT);
  }
}
