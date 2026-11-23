package irvine.oeis.a402;

/**
 * A402282.
 * @author Sean A. Irvine
 */
public class A402474 extends A402468 {

  /** Construct the sequence. */
  public A402474() {
    super(0, 3, false, k -> k * (k + 1) / 2);
  }
}
