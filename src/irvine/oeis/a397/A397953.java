package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A397953 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A397953 extends FiniteSequence {

  // After Michael S. Branicky

  static List<Z> polydivisible(final int base) {
    final List<Z> result = new ArrayList<>();
    result.add(Z.ZERO);
    List<Z> magic = new ArrayList<>();
    for (int k = 1; k < base; ++k) {
      magic.add(Z.valueOf(k));
    }
    int digits = 2;
    while (!magic.isEmpty()) {
      result.addAll(magic);
      final List<Z> biggerMagic = new ArrayList<>();
      for (final Z v : magic) {
        final Z t0 = v.multiply(base);
        for (int d = 0; d < base; ++d) {
          final Z t = t0.add(d);
          if (t.mod(digits) == 0) {
            biggerMagic.add(t);
          }
        }
      }
      magic = biggerMagic;
      ++digits;
    }
    return result;
  }

  /** Construct the sequence. */
  public A397953() {
    super(1, FINITE, polydivisible(3));
  }
}
