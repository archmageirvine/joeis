package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A399306 Integers whose minimal Lucas representation (A130310) does not end in a 0 which if removed results in a valid minimal Lucas representation of another integer.
 * @author Sean A. Irvine
 */
public class A399306 extends ComplementSequence {

  /** Construct the sequence. */
  public A399306() {
    super(1, Z.ONE, new A399305());
  }
}
