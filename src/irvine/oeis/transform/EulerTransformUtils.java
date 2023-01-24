package irvine.oeis.transform;

import java.util.List;

import irvine.math.api.Field;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * Provides some support for computing Euler transforms over non-integer fields, or
 * in situations where the <code>EulerTransform</code> class cannot be used.
 * @author Sean A. Irvine
 */
public class EulerTransformUtils {

  private EulerTransformUtils() { }

  static <T> Polynomial<T> product(final PolynomialRingField<T> ring, final List<T> seq, final int degreeLimit) {
    Polynomial<T> prod = ring.one();
    for (int k = 0; k < seq.size(); ++k) {
      prod = ring.multiply(prod, ring.pow(ring.oneMinusXToTheN(k + 1), seq.get(k), degreeLimit), degreeLimit);
    }
    return prod;
  }

  /**
   * The next term in an Euler transform.
   * @param fld underlying field
   * @param seq current sequence terms
   * @param n term number
   * @param <T> type of field
   * @return next term of Euler transform
   */
  public static <T> T eulerTransform(final Field<T> fld, final List<T> seq, final int n) {
    final PolynomialRingField<T> pf = new PolynomialRingField<>(fld);
    return pf.coeff(pf.one(), product(pf, seq, n), n);
  }

  /**
   * The next term in an Euler transform.
   * @param seq current sequence terms
   * @param n term number
   * @return next term of Euler transform
   */
  public static Z eulerTransform(final List<Z> seq, final int n) {
    return eulerTransform(IntegerField.SINGLETON, seq, n);
  }
}
