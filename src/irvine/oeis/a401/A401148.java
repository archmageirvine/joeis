package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A401148 allocated for Jacek Szymkowiak.
 * @author Sean A. Irvine
 */
public class A401148 extends FilterSequence {

  /** Construct the sequence. */
  public A401148() {
    super(1, new A000040(), p -> {
      long d = (Functions.CEIL_SQRT.l(p) + 1) & ~1;
      while (p.add(d).compareTo(d * d) >= 0) {
        d += 2;
      }
      if (p.add(2 * d).compareTo(d * d) <= 0) {
        return false;
      }
      return p.add(d).isProbablePrime() && p.add(2 * d).isProbablePrime() && p.add(3 * d).isProbablePrime();
    });
  }
}

