package irvine.oeis.a397;

import irvine.oeis.a072.A072193;
import irvine.oeis.a390.A390737;

/**
 * A397150 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A397150 extends A390737 {

  /** Construct the sequence. */
  public A397150() {
    super(new A072193().prepend(0), 1);
  }
}
