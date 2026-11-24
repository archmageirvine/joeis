package irvine.oeis.a402;

/**
 * A402479 G.f.: Sum_{k&gt;=1} x^(k*(k+1)) * Product_{j=1..4*k} (1 + x^j).
 * @author Sean A. Irvine
 */
public class A402479 extends A402468 {

  /** Construct the sequence. */
  public A402479() {
    super(0, 4, false, k -> k * (k + 1));
  }
}
