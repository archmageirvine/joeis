package irvine.oeis.a398;

import irvine.oeis.transform.RunLengthTransform;

/**
 * A398492 allocated for \u017diga Pirc.
 * @author Sean A. Irvine
 */
public class A398492 extends RunLengthTransform {

  /** Construct the sequence. */
  public A398492() {
    super(1, new A398297());
  }
}
