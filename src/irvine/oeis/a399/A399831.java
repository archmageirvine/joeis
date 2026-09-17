package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A137526.
 * @author Sean A. Irvine
 */
public class A399831 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399831() {
    super(1, (p, e) -> (e & 3) == 0 ? Z.valueOf(e) : Z.valueOf(e + 1));
  }
}
