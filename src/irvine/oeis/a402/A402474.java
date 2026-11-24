package irvine.oeis.a402;

/**
 * A402474 G.f.: Sum_{k&gt;=1} x^(k*(k+1)/2) * Product_{j=1..3*k} (1 + x^j).
 * @author Sean A. Irvine
 */
public class A402474 extends A402468 {

  /** Construct the sequence. */
  public A402474() {
    super(0, 3, false, k -> k * (k + 1) / 2);
  }
}
