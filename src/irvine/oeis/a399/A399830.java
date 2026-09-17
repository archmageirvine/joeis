package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A137526.
 * @author Sean A. Irvine
 */
public class A399830 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399830() {
    super(1, (p, e) -> (e & 3) == 2 ? Z.valueOf(e) : Z.valueOf(e + 1));
  }
}
