package irvine.oeis.a402;

/**
 * A402282.
 * @author Sean A. Irvine
 */
public class A402478 extends A402468 {

  /** Construct the sequence. */
  public A402478() {
    super(0, 2, true, k -> k * (k + 1) / 2);
  }
}
