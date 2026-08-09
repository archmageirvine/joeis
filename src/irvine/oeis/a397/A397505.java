package irvine.oeis.a397;

import irvine.oeis.a089.A089618;
import irvine.oeis.a390.A390737;

/**
 * A397505 Number of decimal places which are known after using n terms of A089618 and treating them as the coefficients of a continued fraction.
 * @author Sean A. Irvine
 */
public class A397505 extends A390737 {

  /** Construct the sequence. */
  public A397505() {
    super(new A089618().prepend(0), 1);
  }
}
