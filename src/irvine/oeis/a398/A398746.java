package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A398746 Even numbers k such that the Antihydra iteration starting from k halts (conjectural).
 * @author Sean A. Irvine
 */
public class A398746 extends FilterNumberSequence {

  private static final long HEURISTIC = 10000;

  /** Construct the sequence. */
  public A398746() {
    super(1, 0, 2, k -> {
      Z a = Z.valueOf(k);
      long b = 0;
      long t = 0;
      while (++t <= HEURISTIC) {
        if (a.isOdd()) {
          if (b == 0) {
            return true;
          }
          --b;
        } else {
          b += 2;
        }
        a = a.add(a.divide2());
      }
      return false;
    });
  }
}
