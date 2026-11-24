package irvine.oeis.a402;

/**
 * A402476 G.f.: Sum_{k&gt;=1} x^(k*(k+1)/2) / Product_{j=1..4*k} (1 - x^j).
 * @author Sean A. Irvine
 */
public class A402476 extends A402468 {

  /** Construct the sequence. */
  public A402476() {
    super(0, 4, true, k -> k * (k + 1) / 2);
  }
}
