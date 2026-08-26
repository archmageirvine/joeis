package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a395.A395718;

/**
 * A399144 allocated for Jake Foth.
 * @author Sean A. Irvine
 */
public class A399144 extends ComplementSequence {

  /** Construct the sequence. */
  public A399144() {
    super(1, Z.ONE, new A395718());
  }
}
