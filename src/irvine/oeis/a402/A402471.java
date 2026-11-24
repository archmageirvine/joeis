package irvine.oeis.a402;

/**
 * A402471 G.f.: Sum_{k&gt;=1} x^(k^2) / Product_{j=1..4*k} (1 - x^j).
 * @author Sean A. Irvine
 */
public class A402471 extends A402468 {

  /** Construct the sequence. */
  public A402471() {
    super(0, 4, true, k -> k * k);
  }
}
