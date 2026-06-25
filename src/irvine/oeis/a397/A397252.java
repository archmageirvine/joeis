package irvine.oeis.a397;

import irvine.oeis.a000.A000720;
import irvine.oeis.transform.GilbreathTransformSequence;

/**
 * A397252 allocated for Jan Pelicon.
 * @author Sean A. Irvine
 */
public class A397252 extends GilbreathTransformSequence {

  /** Construct the sequence. */
  public A397252() {
    super(0, new A000720().prepend(0));
  }
}
