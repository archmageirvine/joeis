package irvine.oeis.a402;

/**
 * A402282.
 * @author Sean A. Irvine
 */
public class A402477 extends A402468 {

  /** Construct the sequence. */
  public A402477() {
    super(0, 3, true, k -> k * (k + 1) / 2);
  }
}
