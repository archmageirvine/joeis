package irvine.oeis.recur;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence;

/**
 * Generates the power series of some root of a polynomial.
 * The r-th root of <code>sum(p(k)*x^k, k=0..d)</code> is computed by a holonomic recurrence
 * as described in <a href="https://www2.mpia-hd.mpg.de/~mathar/public/fischer20200119.pdf">here</a>,
 * Theorem 1, with the annihilator (r is positive here - the article treats 1/root(p)):
 * <code>sum((-r*n + r*k + k)*p(k)*a(n-k), k=0..d) = 0</code>.
 * @author Georg Fischer
 */
public class PolynomialRootSequence extends HolonomicRecurrence {

  /**
   * Empty constructor.
   */
  protected PolynomialRootSequence() {
    super();
  }

  /**
   * Construct a holonomic recurrence sequence from String parameters.
   * @param offset  first valid term has this index
   * @param root    the desired root, 2 = sqrt(p), 3 = cubic, -2 = 1/sqrt(p) etc.
   * @param pcoeffs list of the coefficients of the polynomial
   */
  public PolynomialRootSequence(final int offset, final int root, final String pcoeffs) {
    super();
    mOffset = offset;
    final String[] list = pcoeffs.replaceAll("\\A[^\\-\\d]+", "").replaceAll("[^\\-\\d]+\\Z", "") // remove outer delimiters
        .split("[^\\-\\d]+");
    final int len = list.length;
    final Z[] coeffs = new Z[len];
    for (int k = 0; k < len; ++k) {
      coeffs[k] = new Z(list[k]);
    }
    computeRecurrence(root, coeffs);
  }

  /**
   * Construct a holonomic recurrence sequence from a {@link FiniteSequence}.
   * @param offset  first valid term has this index
   * @param root    the desired root, 2 = sqrt(p), 3 = cubic, -2 = 1/sqrt(p) etc.
   * @param seq     finite sequence
   */
  public PolynomialRootSequence(final int offset, final int root, final FiniteSequence seq) {
    super();
    mOffset = offset;
    final ArrayList<Z> list = new ArrayList<>(16);
    Z term = seq.next();
    while (term != null) {
      list.add(term);
      term = seq.next();
    }
    final int len = list.size();
    final Z[] coeffs = new Z[len];
    for (int k = 0; k < len; ++k) {
      coeffs[k] = list.get(k);
    }
    computeRecurrence(root, coeffs);
  }

  /**
   * Construct a holonomic recurrence sequence from a {@link Sequence}.
   * @param offset  first valid term has this index
   * @param root    the desired root, 2 = sqrt(p), 3 = cubic, -2 = 1/sqrt(p) etc.
   * @param seq     Sequence (maybe with trailing zeroes)
   * @param len     number of terms to be used as polynomial coefficients p(k)
   */
  public PolynomialRootSequence(final int offset, final int root, final Sequence seq, final int len) {
    super();
    mOffset = offset;
    final Z[] coeffs = new Z[len];
    for (int k = 0; k < len; ++k) {
      coeffs[k] = seq.next();
    }
    computeRecurrence(root, coeffs);
  }

  /**
   * Computes the coefficients of the polynomials in n for the annihilator.
   * This code is common to all constructors.
   * @param root    the desired root, 2 = sqrt, 3 = cubic, -2 = 1/sqrt() etc.
   * @param coeffs  array of coefficients p(i).
   */
  private void computeRecurrence(final int root, final Z[] coeffs) {
    final int len = coeffs.length;
    final int ord = len - 1;
    Z ngcd = null;
    final Z[] npow0 = new Z[len];
    final Z[] npow1 = new Z[len];
    for (int k = ord; k >= 0; --k) {
      final Z n0 = coeffs[k].multiply(root * k + k); // factor of n^0
      final Z n1 = coeffs[k].multiply(-root); // factor of n^1
      npow0[ord - k] = n0;
      npow1[ord - k] = n1;
      if (ngcd == null) {
        ngcd = n0.gcd(n1);
      } else {
        ngcd = ngcd.gcd(n0.gcd(n1));
      }
    }
    if (!Z.ONE.equals(ngcd)) {
      for (int k = 0; k <= ord; ++k) {
        npow0[k] = npow0[k].divide(ngcd);
        npow1[k] = npow1[k].divide(ngcd);
      }
    }
    final ArrayList<Z[]> polyList = new ArrayList<>(16);
    polyList.add(new Z[] { Z.ZERO }); // constant term = [0]
    for (int k = 0; k <= ord; ++k) {
      polyList.add(new Z[] { npow0[k], npow1[k] });
    }
    mPolyList = polyList;
    // mInitTerms = new Z[] { Z.ONE }; // already done in empty HolonomicRecurrence()
    super.initialize();
    // System.out.println("make runholo MATRIX=\"" + getPolyString() + "\" INIT=\"" + getInitString() + "\"");
  } // computeRecurrence
}
