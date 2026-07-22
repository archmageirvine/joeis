package irvine.oeis.a396;

import irvine.oeis.a390.A390737;
import irvine.oeis.a390.A390946;

/**
 * A396908 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A396908 extends A390737 {

  /** Construct the sequence. */
  public A396908() {
    super(new A390946().prepend(0));
  }
}
