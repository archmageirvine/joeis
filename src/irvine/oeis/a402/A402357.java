package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402357 Number of strongly connected digraphs on n unlabeled nodes such that for every node h, every strongly connected component of D - h receives exactly one edge from outside.
 * @author Gregory Morse
 */
public class A402357 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mRooted = RING.one();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> b = mRooted.shift(1);
    final Polynomial<Q> seq = RING.series(b, RING.subtract(RING.one(), b), mN);
    // Vertex-rooted directed cacti are multisets of nonempty lists of rooted cacti.
    Polynomial<Q> exponent = RING.zero();
    Polynomial<Q> cycles = RING.zero();
    final Polynomial<Q> log = RING.negate(RING.log(RING.subtract(RING.one(), b), mN));
    for (int k = 1; k <= mN; ++k) {
      exponent = RING.add(exponent, RING.multiply(seq.substitutePower(k, mN), new Q(1, k)));
      cycles = RING.add(cycles, RING.multiply(log.substitutePower(k, mN), new Q(Functions.PHI.z(k), Z.valueOf(k))));
    }
    mRooted = RING.exp(exponent, mN);
    // Cycle-rooted objects minus those with a marked incidence.
    return cycles.coeff(mN).subtract(RING.multiply(b, seq, mN).coeff(mN)).toZ();
  }
}
