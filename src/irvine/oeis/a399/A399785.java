package irvine.oeis.a399;

import irvine.oeis.Combiner;

/**
 * A399785 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A399785 extends Combiner {

  /** Construct the sequence. */
  public A399785() {
    super(7, new A399784().prepend(0, 0, 0, 0, 0, 0, 0, 0, 0, 0), new A399783(), ADD);
  }
}
