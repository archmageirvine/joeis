/* Coxeter group sequences
 * @(#) $Id$
 * 2020-04-13: expand exponential g.f. with setGfType(1)
 * 2019-05-11: Georg Fischer, 3rd parameter offset
 * 2019-05-10: Sean Irvine, Z parameters
 * 2019-05-09: Georg Fischer
 */
package irvine.oeis.recur;

import java.util.Arrays;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * An ordinary generating function consisting of a fraction of two polynomials in "x".
 * @author Georg Fischer
 */
public class GeneratingFunctionSequence implements Sequence {

  protected Z[] mNum; // coefficients of the numerator   polynomial, index is the exponent
  protected Z[] mDen; // coefficients of the denominator polynomial
  protected int mIndex = 0; // index of next term to be generated
  protected final int mOffset; // type of the g.f.: 0 = ordinary, 1 = exponential, 2 = dirichlet ...
  protected int mGfType; // type of the g.f.: 0 = ordinary, 1 = exponential, 2 = dirichlet ...
  protected Z mFactorial; // accumulate n! here

  protected GeneratingFunctionSequence() {
    mOffset = 0;
    mIndex = 0;
  }

  /**
   * Construct a new rational integer polynomial generating function sequence.
   *
   * @param offset first valid term has this index
   * @param num    numerator
   * @param den    denominator
   */
  public GeneratingFunctionSequence(final int offset, final Z[] num, final Z[] den) {
    mOffset = offset;
    mIndex = 0;
    mNum = Arrays.copyOf(num, num.length); // copy because this class modifies num
    mDen = Arrays.copyOf(den, den.length);
  }

  /**
   * Construct a new rational integer polynomial generating function sequence.
   *
   * @param num numerator
   * @param den denominator
   */
  public GeneratingFunctionSequence(final Z[] num, final Z[] den) {
    this(0, num, den);
  }

  /**
   * Construct the specified generating function.
   *
   * @param num coefficients of the numerator   polynomial
   * @param den coefficients of the denominator polynomial
   */
  public GeneratingFunctionSequence(final long[] num, final long[] den) {
    this(0, ZUtils.toZ(num), ZUtils.toZ(den));
  }

  /**
   * Construct the specified generating function.
   *
   * @param offset first valid term has this index
   * @param num    coefficients of the numerator   polynomial
   * @param den    coefficients of the denominator polynomial
   */
  public GeneratingFunctionSequence(final int offset, final long[] num, final long[] den) {
    this(offset, ZUtils.toZ(num), ZUtils.toZ(den));
  }

  /**
   * Construct a new rational integer polynomial generating function sequence.
   *
   * @param num numerator
   * @param den denominator
   */
  public GeneratingFunctionSequence(final Polynomial<Z> num, final Polynomial<Z> den) {
    this(num.toArray(new Z[0]), den.toArray(new Z[0]));
  }

  /**
   * Construct a coefficient sequence from String parameters.
   *
   * @param offset first valid term has this index
   * @param num    coefficients of <code>x^i, i=0..m</code> for the numerator of the generating function
   *               as a String vectors, for example "[0,1,2,17,0,18]".
   * @param den    coefficients for the denominator.
   */
  public GeneratingFunctionSequence(final int offset, final String num, final String den) {
    mOffset = offset;
    mIndex = 0;
    mNum = ZUtils.toZ(num);
    mDen = ZUtils.toZ(den);
  }

  /**
   * Get the type of the generating function.
   *
   * @return code for the type: 0 = ordinary, 1 = exponential
   */
  public int getGfType() {
    return mGfType;
  }

  /**
   * Set the type of the generating function.
   * This method must be called before any call of {@link #next()}.
   *
   * @param gfType code for the type: 0 = ordinary, 1 = exponential
   */
  public void setGfType(final int gfType) {
    mGfType = gfType;
  }

  /**
   * Gets the offset
   *
   * @return the index where the sequence elements start
   */
  public int getOffset() {
    return mOffset;
  }

  /**
   * Gets the coefficients of the numerator polynomial.
   * This method must be called before any call of {@link #next()}.
   *
   * @return an array starting with the coefficient for x^0.
   */
  public Z[] getNum() {
    return Arrays.copyOf(mNum, mNum.length);
  }

  /**
   * Gets the coefficients of the denominator polynomial.
   * This method must be called before any call of {@link #next()}.
   *
   * @return an array starting with the coefficient for x^0.
   */
  public Z[] getDen() {
    return Arrays.copyOf(mDen, mDen.length);
  }

  @Override
  public Z next() {
    while (mIndex < mOffset) { // skip over leading coefficients
      iterate();
    } // while
    return iterate();
  }

  /**
   * Advance to next term
   *
   * @return next term
   */
  private Z iterate() {
    final Z divisor = mDen[0];
    if (divisor.isZero()) {
      throw new IllegalArgumentException("divisor is zero");
    }
    final Z[] quotRest = mNum[0].divideAndRemainder(divisor);
    Z result = quotRest[0];
    if (!quotRest[1].isZero()) {
      throw new IllegalArgumentException("no even division");
    }
    final Z quotient = result.negate();
    final int len1 = Math.max(mNum.length, mDen.length);
    final int len2 = mDen.length;
    final Z[] vect1 = new Z[len1 - 1]; // will replace 'mNum' in the end
    int iterm = 1; // the first term of vect1 becomes ZERO and is skipped
    while (iterm < len1) {
      Z term = Z.ZERO;
      if (iterm < len2) {
        term = mDen[iterm].multiply(quotient);
      }
      if (iterm < mNum.length) {
        term = term.add(mNum[iterm]);
      }
      vect1[iterm - 1] = term;
      ++iterm;
    } // while iterm
    mNum = vect1;
    if (mGfType == 1) { // e.g.f.
      if (mIndex >= 2) {
        mFactorial = mFactorial.multiply(Z.valueOf(mIndex));
        result = result.multiply(mFactorial);
      }
    } // e.g.f.
    ++mIndex;
    return result;
  }
}
