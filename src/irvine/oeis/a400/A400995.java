package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A400995 allocated for Martin Sims.
 * @author Sean A. Irvine
 */
public class A400995 extends FilterSequence {

  /** Construct the sequence. */
  public A400995() {
    super(1, new A000040(), p -> {
      final Z p4 = p.pow(4);
      return Functions.PREV_PRIME.z(p4).add(Functions.NEXT_PRIME.z(p4)).equals(p4.multiply2());
    });
  }
}

