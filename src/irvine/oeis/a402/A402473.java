package irvine.oeis.a402;

/**
 * A402282.
 * @author Sean A. Irvine
 */
public class A402473 extends A402468 {

  /** Construct the sequence. */
  public A402473() {
    super(0, 4, false, k -> k * (k + 1) / 2);
  }
}
