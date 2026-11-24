package irvine.oeis.a402;

/**
 * A402470 G.f.: Sum_{k&gt;=1} x^(k^2) * Product_{j=1..2*k} (1 + x^j).
 * @author Sean A. Irvine
 */
public class A402470 extends A402468 {

  /** Construct the sequence. */
  public A402470() {
    super(0, 2, false, k -> k * k);
  }
}
