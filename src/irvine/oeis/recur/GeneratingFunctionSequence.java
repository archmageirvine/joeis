package irvine.oeis.recur;

import java.util.Arrays;

import irvine.math.polynomial.Polynomial;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * An ordinary generating function consisting of a fraction of two polynomials in "x".
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class GeneratingFunctionSequence extends AbstractSequence {

  private final Z[] mNum; // coefficients of the numerator polynomial
  private final Z[] mDen; // coefficients of the denominator polynomial
  private int mN; // index of previous term
  private final Series<Z> mSeries;

  /**
   * Construct a new rational integer polynomial generating function sequence.
   * @param offset first valid term has this index
   * @param num numerator
   * @param den denominator
   */
  public GeneratingFunctionSequence(final int offset, final Z[] num, final Z[] den) {
    super(offset);
    mNum = Arrays.copyOf(num, num.length); // copy because this class modifies num
    mDen = Arrays.copyOf(den, den.length);
    mSeries = SeriesRing.SZ.divide(Series.create(mNum), Series.create(mDen));
    mN = offset - 1;
  }

  /**
   * Construct a new rational integer polynomial generating function sequence.
   * @param offset the offset
   * @param nd numerator and denominator arrays
   */
  public GeneratingFunctionSequence(final int offset, final Z[][] nd) {
    this(offset, nd[0], nd[1]);
  }

  /**
   * Construct a new rational integer polynomial generating function sequence.
   * @param nd numerator and denominator arrays
   */
  public GeneratingFunctionSequence(final Z[][] nd) {
    this(0, nd[0], nd[1]);
  }

  /**
   * Construct a new rational integer polynomial generating function sequence.
   * @param num numerator
   * @param den denominator
   */
  public GeneratingFunctionSequence(final Z[] num, final Z[] den) {
    this(0, num, den);
  }

  /**
   * Construct the specified generating function.
   * @param num coefficients of the numerator   polynomial
   * @param den coefficients of the denominator polynomial
   */
  public GeneratingFunctionSequence(final long[] num, final long[] den) {
    this(0, ZUtils.toZ(num), ZUtils.toZ(den));
  }

  /**
   * Construct the specified generating function.
   * @param offset first valid term has this index
   * @param num coefficients of the numerator   polynomial
   * @param den coefficients of the denominator polynomial
   */
  public GeneratingFunctionSequence(final int offset, final long[] num, final long[] den) {
    this(offset, ZUtils.toZ(num), ZUtils.toZ(den));
  }

  /**
   * Construct a new rational integer polynomial generating function sequence.
   * @param offset the offset
   * @param num numerator
   * @param den denominator
   */
  public GeneratingFunctionSequence(final int offset, final Polynomial<Z> num, final Polynomial<Z> den) {
    this(offset, num.toArray(new Z[0]), den.toArray(new Z[0]));
  }

  /**
   * Construct a new rational integer polynomial generating function sequence.
   * @param num numerator
   * @param den denominator
   */
  public GeneratingFunctionSequence(final Polynomial<Z> num, final Polynomial<Z> den) {
    this(num.toArray(new Z[0]), den.toArray(new Z[0]));
  }

  /**
   * Construct a coefficient sequence from String parameters.
   * @param offset first valid term has this index
   * @param num coefficients of <code>x^i, i=0..m</code> for the numerator of the generating function
   * as a String vectors, for example "[0,1,2,17,0,18]".
   * @param den coefficients for the denominator.
   */
  public GeneratingFunctionSequence(final int offset, final String num, final String den) {
    this(offset, ZUtils.toZ(num), ZUtils.toZ(den));
  }

  // Only used by RecurrenceReflector
  /**
   * Gets the coefficients of the numerator polynomial.
   * This method must be called before any call of {@link #next()}.
   * @return an array starting with the coefficient for x^0.
   */
  public Z[] getNum() {
    return Arrays.copyOf(mNum, mNum.length);
  }

  // Only used by RecurrenceReflector
  /**
   * Gets the coefficients of the denominator polynomial.
   * This method must be called before any call of {@link #next()}.
   * @return an array starting with the coefficient for x^0.
   */
  public Z[] getDen() {
    return Arrays.copyOf(mDen, mDen.length);
  }

  @Override
  public Z next() {
    return mSeries.coeff(++mN);
  }
}
