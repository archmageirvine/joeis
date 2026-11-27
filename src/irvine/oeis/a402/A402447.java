package irvine.oeis.a402;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A402447 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A402447 extends DecimalExpansionSequence {

  // After Alper Ferudun

  private static final int GUARD = 40;
  private static final int INITIAL_DIGITS = 32;

  /** Construct the sequence. */
  public A402447() {
    super(0, constant());
  }

  private static CR constant() {
    return new CR() {
      @Override
      protected Z approximate(final int precision) {
        int digits = Math.max(INITIAL_DIGITS, decimalDigits(precision) + 16);

        while (true) {
          // Fixed-point scale, with additional guard digits.
          final Z decimalScale = Z.TEN.pow(digits);
          final Z q = decimalScale.multiply(Z.TEN.pow(GUARD));
          // Increase the iteration count as the precision increases.
          final int iterations = Math.max(499, 10 * (digits + GUARD));
          // Initial interval: 0.635 <= constant <= 0.638.
          Z lo = Z.valueOf(635).multiply(q).divide(Z.valueOf(1000));
          Z hi = Z.valueOf(638).multiply(q).divide(Z.valueOf(1000));
          final Z[] lowBounds = bounds(lo, q, iterations);
          final Z[] highBounds = bounds(hi, q, iterations);
          // Check that the initial interval brackets the root.
          if (lowBounds[1].multiply(Z.TWO).compareTo(q) >= 0 || highBounds[0].multiply(Z.TWO).compareTo(q) <= 0) {
            digits += 32;
            continue;
          }

          final Z factor;
          final Z denominator;
          // Convert the decimal fixed-point interval to the requested
          // binary precision.
          if (precision < 0) {
            factor = Z.ONE.shiftLeft(-(long) precision > Integer.MAX_VALUE ? Integer.MAX_VALUE : -precision);
            denominator = q;
          } else {
            factor = Z.ONE;
            denominator = q.shiftLeft(precision);
          }

          boolean settled = false;
          while (lo.compareTo(hi) < 0) {
            // If both endpoints round to the same integer, the answer
            // is determined to the requested CR precision.
            final Z a = roundedRatio(lo.multiply(factor), denominator);
            final Z b = roundedRatio(hi.multiply(factor), denominator);
            if (a.equals(b)) {
              return a;
            }
            final Z mid = lo.add(hi).divide(Z.TWO);
            if (mid.equals(lo) || mid.equals(hi)) {
              break;
            }

            final Z[] bounds = bounds(mid, q, iterations);
            final int lowerCmp = bounds[0].multiply(Z.TWO).compareTo(q);
            final int upperCmp = bounds[1].multiply(Z.TWO).compareTo(q);
            if (upperCmp < 0) {
              // The root is to the right.
              lo = mid;
            } else if (lowerCmp > 0) {
              // The root is to the left.
              hi = mid;
            } else {
              // The bounds are not sufficiently sharp. Increase precision.
              break;
            }
          }
          // Recalculate using a finer scale and more iterations.
          digits += 32;
        }
      }
    };
  }

  private static int decimalDigits(final int precision) {
    if (precision >= 0) {
      return 0;
    }
    final long bits = -(long) precision;
    return (int) ((bits * 30103L + 99999L) / 100000L);
  }

  /*
   * Calculate certified lower and upper bounds at x/q.
   * @return {lower, upper}
   */
  private static Z[] bounds(final Z x, final Z q, final int iterations) {
    Z b0 = x.divide(Z.TWO);
    Z h0 = b0;
    Z b1 = x.add(Z.ONE).divide(Z.TWO);
    Z h1 = b1;
    for (int i = 0; i < iterations; ++i) {
      final Z nb0 = b0.multiply(h0).divide(q);
      final Z nb1 = ceilDivide(b1.multiply(h1), q);
      final Z nh0 = h0.add(nb0);
      final Z nh1 = h1.add(nb1);
      b0 = nb0;
      b1 = nb1;
      h0 = nh0;
      h1 = nh1;
    }
    final Z upper = h1.add(ceilDivide(b1.multiply(h1), q).multiply(Z.valueOf(4)));
    return new Z[] {h0, upper};
  }

  private static Z ceilDivide(final Z a, final Z b) {
    return a.add(b).subtract(Z.ONE).divide(b);
  }

  private static Z roundedRatio(final Z numerator, final Z denominator) {
    return numerator.multiply(Z.TWO).add(denominator).divide(denominator.multiply(Z.TWO));
  }
}
