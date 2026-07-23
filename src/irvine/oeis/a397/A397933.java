package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a332.A332785;

/**
 * A397933 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A397933 extends FilterSequence {

  /** Construct the sequence. */
  public A397933() {
    super(1, new A332785(), k -> Functions.RAD.z(k).multiply(Functions.BIG_OMEGA.l(k)).equals(k));
  }
}
