package irvine.oeis.a396;

import irvine.oeis.Combiner;
import irvine.oeis.a006.A006324;

/**
 * A396468 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A396468 extends Combiner {

  /** Construct the sequence. */
  public A396468() {
    super(1, new A396285(), new A006324().prepend(0), SUBTRACT);
  }
}
