package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A137526.
 * @author Sean A. Irvine
 */
public class A399828 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399828() {
    super(1, (p, e) -> e <= 2 ? Z.valueOf(e + 1) : Z.valueOf(e + (e & 1)));
  }
}

