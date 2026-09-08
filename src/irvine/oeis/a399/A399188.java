package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A399188 Numbers x such that recursion {x -&gt; A000005(x)+1} reaches a fixed-point of 4 rather than 3.
 * @author Sean A. Irvine
 */
public class A399188 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A399188() {
    super(1, 4, k -> {
      Z t = Z.valueOf(k);
      while (true) {
        final Z u = t;
        t = Functions.SIGMA0.z(t).add(1);
        if (t.equals(Z.FOUR)) {
          return true;
        }
        if (u.equals(t)) {
          return false;
        }
      }
    });
  }
}

