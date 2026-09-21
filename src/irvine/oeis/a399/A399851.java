package irvine.oeis.a399;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000009;
import irvine.oeis.a219.A219560;

/**
 * A399851 allocated for Jishnu Babu Ranitha.
 * @author Sean A. Irvine
 */
public class A399851 extends Combiner {

  /** Construct the sequence. */
  public A399851() {
    super(0, new A219560(), new A000009(), (a, b) -> a.subtract(b.pow(3)));
  }
}
