package irvine.oeis.a397;

import irvine.oeis.a390.A390737;
import irvine.oeis.a391.A391217;

/**
 * A397753 Number of decimal places which are known after using n terms of A391217 and treating them as the coefficients of a continued fraction.
 * @author Sean A. Irvine
 */
public class A397753 extends A390737 {

  /** Construct the sequence. */
  public A397753() {
    super(new A391217().prepend(0));
  }
}
