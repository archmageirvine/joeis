package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001597;

/**
 * A396778 Perfect powers not representable as sums of two squares.
 * @author Sean A. Irvine
 */
public class A396778 extends FilterSequence {

  /** Construct the sequence. */
  public A396778() {
    super(1, new A001597(), k -> {
      final FactorSequence fs = Jaguar.factor(k);
      for (final Z p : fs.toZArray()) {
        if ((fs.getExponent(p) & 1) == 1 && p.mod(4) == 3) {
          return true;
        }
      }
      return false;
    });
  }
}
