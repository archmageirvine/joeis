package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a120.A120944;

/**
 * A397739 Squarefree composite numbers k whose second smallest distinct prime factor is smaller than the square of the least prime factor.
 * @author Sean A. Irvine
 */
public class A397739 extends FilterSequence {

  /** Construct the sequence. */
  public A397739() {
    super(1, new A120944(), k -> {
      final Z lpf = Functions.LPF.z(k);
      final Z spf = Functions.LPF.z(k.divide(lpf));
      return spf.compareTo(lpf.square()) < 0;
    });
  }
}
