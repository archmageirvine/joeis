package irvine.oeis.a397;

import irvine.oeis.Combiner;
import irvine.oeis.a011.A011371;

/**
 * A397639 allocated for Vico Bonfioli.
 * @author Sean A. Irvine
 */
public class A397639 extends Combiner {

  /** Construct the sequence. */
  public A397639() {
    super(1, new A011371().skip(), new A397298(), SUBTRACT);
  }
}
