package irvine.oeis.a397;

import irvine.oeis.Combiner;
import irvine.oeis.a011.A011371;

/**
 * A397639 a(n) = 2-adic valuation of n! minus the 2-adic valuation of the permanent of the n X n matrix with entries gcd(i,j).
 * @author Sean A. Irvine
 */
public class A397639 extends Combiner {

  /** Construct the sequence. */
  public A397639() {
    super(1, new A011371().skip(), new A397298(), SUBTRACT);
  }
}
