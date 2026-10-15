package irvine.oeis.a400;

import irvine.oeis.FilterPositionSequence;
import irvine.util.string.StringUtils;

/**
 * A400793 Positions of primes in A400792.
 * @author Sean A. Irvine
 */
public class A400793 extends FilterPositionSequence {

  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));

  /** Construct the sequence. */
  public A400793() {
    super(1, 0, new A400792(), k -> {
      if (k.isProbablePrime()) {
        if (VERBOSE) {
          StringUtils.message("Found prime " + k);
        }
        return true;
      }
      return false;
    });
  }
}

