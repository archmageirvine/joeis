package irvine.oeis.a402;

/**
 * A402282.
 * @author Sean A. Irvine
 */
public class A402482 extends A402468 {

  /** Construct the sequence. */
  public A402482() {
    super(0, 4, true, k -> k * (k + 1));
  }
}
