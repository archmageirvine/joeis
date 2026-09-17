package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A137526.
 * @author Sean A. Irvine
 */
public class A399829 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399829() {
    super(1, (p, e) -> e == 2 ? Z.TWO : Z.valueOf(e + 1));
  }
}

