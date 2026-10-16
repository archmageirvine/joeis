package irvine.oeis.a400;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A400692 allocated for Alex Ratushnyak.
 * @author Sean A. Irvine
 */
public class A400692 extends FilterNumberSequence {

  private static final Z Z12 = Z.valueOf(12);

  /** Construct the sequence. */
  public A400692() {
    super(1, k -> {
      Z m = Z.valueOf(k);
      final HashSet<Z> seen = new HashSet<>();
      while (seen.add(m)) {
        if (Z12.equals(m)) {
          return true;
        }
        m = Functions.SIGMA0.z(m).multiply2();
      }
      return false;
    });
  }
}
