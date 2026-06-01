package irvine.oeis.a396;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000196;
import irvine.oeis.a048.A048656;

/**
 * A396253 Sum of Sum_{k=1..n} S(k) over all completely multiplicative sign sequences S of length n.
 * @author Sean A. Irvine
 */
public class A396253 extends Combiner {

  /** Construct the sequence. */
  public A396253() {
    super(1, new A000196().skip(), new A048656(), MULTIPLY);
  }
}
