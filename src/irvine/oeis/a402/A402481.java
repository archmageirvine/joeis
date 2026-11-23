package irvine.oeis.a402;

/**
 * A402282.
 * @author Sean A. Irvine
 */
public class A402481 extends A402468 {

  /** Construct the sequence. */
  public A402481() {
    super(0, 2, false, k -> k * (k + 1));
  }
}
