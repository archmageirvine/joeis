package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a164.A164937;
import irvine.util.Permutation;

/**
 * A397848 allocated for Dieter Renz.
 * @author Sean A. Irvine
 */
public class A397848 extends FilterSequence {

  /** Construct the sequence. */
  public A397848() {
    super(1, new A164937(), k -> {
      final Permutation perm = Permutation.permuter(k);
      int[] p;
      while ((p = perm.next()) != null) {
        if (p[0] != 0) {
          final Z t = Permutation.permToZ(p);
          if (!t.equals(k) && t.isProbablePrime()) {
            return false;
          }
        }
      }
      return true;
    });
  }
}
