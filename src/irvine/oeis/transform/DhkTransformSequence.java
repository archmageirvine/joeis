package irvine.oeis.transform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.ReaderSequence;
import irvine.oeis.Sequence;

/**
 * DHK transform.
 * @author Sean A. Irvine
 */
public class DhkTransformSequence extends AbstractSequence {

  private static final int DEFOFF = 1;
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  /**
   * Compute the DHK transform of the given polynomial.
   * @param p polynomial
   * @param n maximum degree
   * @return DHK transform
   */
  public static Polynomial<Q> dhk(final Polynomial<Q> p, final int n) {
    final Polynomial<Q> px2 = p.substitutePower(2, n);
    final Polynomial<Q> q = RING.divide(RING.subtract(
      RING.series(RING.pow(RING.add(RING.one(), p), 2, n),
        RING.subtract(RING.one(), px2), n),
      RING.one()), Q.TWO);
    Polynomial<Q> sum = RING.subtract(RING.pow(p, 2, n), px2);
    for (int d = 1; d <= n; ++d) {
      final int m = Functions.MOBIUS.i((long) d);
      if (m != 0) {
        final Polynomial<Q> s = RING.series(RING.one(), RING.subtract(RING.one(), p), n / d).substitutePower(d, n);
        final Polynomial<Q> log = RING.log(s, n);
        final Polynomial<Q> a = RING.divide(log, new Q(d));
        final Polynomial<Q> b = RING.subtract(a, q.substitutePower(d, n));
        sum = RING.signedAdd(m == 1, sum, b);
      }
    }
    return RING.add(p, RING.divide(sum, Q.TWO));
  }
  /*
  DHK(p, n)={my(q=((1+p)^2/(1-subst(p, x, x^2))-1)/2); p + (p^2-subst(p, x, x^2))/2 + sum(d=1, n, moebius(d)*(log(subst(1/(1+O(x*x^(n\d))-p), x, x^d))/d - subst(q + O(x*x^(n\d)), x, x^d)))/2}
   */

  private final Sequence mSeq;
  private final Polynomial<Q> mA = RING.create(Collections.emptyList());
  private int mN = -1;

  /**
   * Construct a new DHK transform sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence.
   */
  public DhkTransformSequence(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
    mA.add(Q.ZERO);
    mA.add(new Q(mSeq.next()));
  }

  /**
   * Construct a new DHK transform sequence.
   * @param seq underlying sequence.
   */
  public DhkTransformSequence(final Sequence seq) {
    this(DEFOFF, seq);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mA.add(new Q(mSeq.next()));
    return dhk(mA, mN).coeff(mN).toZ();
  }

  /**
   * Apply the Euler transform to the sequence supplied on standard input.
   * @param args ignored
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final DhkTransformSequence seq = new DhkTransformSequence(new ReaderSequence(r));
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
