package irvine.oeis.a400;

import irvine.math.turing.CompressedRegisterMachineCensus;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400878 Number of halting compressed register-machine programs of total length 7*n bits.
 * @author Gregory Morse
 */
public class A400878 extends Sequence1 {

  /** Number of bits in the reconstructed finite halting sum. */
  public static final int SUM_BITS = 84;
  private static final int VERIFIED_WIDTH = 11;

  private static final class Census {
    private static final long[] COUNTS = CompressedRegisterMachineCensus.count(SUM_BITS / 7);
  }

  private int mN;

  @Override
  public Z next() {
    if (mN == VERIFIED_WIDTH) {
      // The same enumeration at 84 bits yields 2559787, not the reported 2559837.
      throw new UnsupportedOperationException("The published 84-bit count has not been reproduced");
    }
    return Z.valueOf(Census.COUNTS[++mN]);
  }

  /**
   * Return the reconstructed finite halting sum numerator with denominator 2^84.
   * The 64 binary and 19 decimal prefix digits are unchanged by the 84-bit discrepancy.
   * @return the numerator
   */
  public static Z haltingSumNumerator() {
    Z sum = Z.ZERO;
    for (int k = 1; k < Census.COUNTS.length; ++k) {
      sum = sum.shiftLeft(7).add(Census.COUNTS[k]);
    }
    return sum;
  }
}
