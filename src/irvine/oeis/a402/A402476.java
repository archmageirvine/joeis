package irvine.oeis.a402;

/**
 * A402282.
 * @author Sean A. Irvine
 */
public class A402476 extends A402468 {

  /** Construct the sequence. */
  public A402476() {
    super(0, 4, true, k -> k * (k + 1) / 2);
  }
}
