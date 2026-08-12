package irvine.oeis.a398;

import irvine.oeis.transform.RunLengthTransform;

/**
 * A398492 Run length transform of A398297.
 * @author Sean A. Irvine
 */
public class A398492 extends RunLengthTransform {

  /** Construct the sequence. */
  public A398492() {
    super(1, new A398297());
  }
}
