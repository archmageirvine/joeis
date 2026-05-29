package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a075.A075254;

/**
 * A396408 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A396408 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A396408() {
    super(1, new A075254(), k -> {
      final Z[] s = k.sqrtAndRemainder();
      return s[1].isZero() && s[0].isProbablePrime();
    });
  }
}

