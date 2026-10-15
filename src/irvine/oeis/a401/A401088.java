package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A396565.
 * @author Sean
 */
public class A401088 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A401088() {
    super(1, (p, e) -> Z.valueOf((e & 1) == 1 ? (e + 1) / 2 : 1));
  }
}
