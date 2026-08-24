package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a081.A081528;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A398894 Minimum value of k such that there exists a subset S of {1, ..., k} of size n for which the average of every nonempty subset of S is an integer.
 * @author Sean A. Irvine
 */
public class A398894 extends PrependSequence {

  /** Construct the sequence. */
  public A398894() {
    super(1, new SimpleTransformSequence(new A081528().skip(), Z.ONE::add), 1, 3);
  }
}
