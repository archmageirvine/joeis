package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A397574 allocated for Vincenzo Manto.
 * @author Sean A. Irvine
 */
public class A397574 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397574() {
    super(1, k -> Functions.RAD.z(k).pow(Functions.OMEGA.i(k)).equals(Z.valueOf(k)));
  }
}
