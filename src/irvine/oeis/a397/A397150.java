package irvine.oeis.a397;

import irvine.oeis.a072.A072193;
import irvine.oeis.a390.A390737;

/**
 * A397150 Number of decimal places which are known after using n terms of A072193 and treating them as the coefficients of a continued fraction.
 * @author Sean A. Irvine
 */
public class A397150 extends A390737 {

  /** Construct the sequence. */
  public A397150() {
    super(new A072193().prepend(0), 1);
  }
}
