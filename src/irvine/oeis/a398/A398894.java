package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a081.A081528;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A398894 allocated for Nadav Mizrahi.
 * @author Sean A. Irvine
 */
public class A398894 extends PrependSequence {

  /** Construct the sequence. */
  public A398894() {
    super(1, new SimpleTransformSequence(new A081528().skip(), Z.ONE::add), 1, 3);
  }
}
