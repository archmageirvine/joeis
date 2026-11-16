package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.CyclotomicExtension;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400504 allocated for Adam Ra\u017aniewski.
 * @author Sean A. Irvine
 */
public class A400504 extends Sequence1 {

  private static final class Chord {
    private final int mP;
    private final int mQ;
    private final Polynomial<Q> mPValue;
    private final Polynomial<Q> mQValue;

    private Chord(final int p, final int q, final Polynomial<Q>[] vertices) {
      mP = p;
      mQ = q;
      mPValue = vertices[p];
      mQValue = vertices[q];
    }
  }

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }

    // Work in Q[zeta_n], where zeta_n is a primitive nth root of unity.
    final CyclotomicExtension field = new CyclotomicExtension(mN);
    final Polynomial<Q> z = field.x();

    // Compute all vertices as powers of zeta_n.
    @SuppressWarnings("unchecked") final Polynomial<Q>[] vertices = new Polynomial[mN];
    vertices[0] = field.one();
    for (int k = 1; k < mN; ++k) {
      vertices[k] = field.multiply(vertices[k - 1], z);
    }

    // Generate all chords.
    final Set<Long> chordSet = new HashSet<>();
    for (int k = 1; k < mN; ++k) {
      final int g = Functions.GCD.i(mN, k);
      final int m = mN / g;
      for (int j = 0; j < m; ++j) {
        final int p = (j * k) % mN;
        final int q = ((j + 1) * k) % mN;
        final int lo = Math.min(p, q);
        final int hi = Math.max(p, q);
        chordSet.add(((long) lo << 32) | hi);
      }
    }

    final List<Chord> chords = new ArrayList<>();
    for (final long edge : chordSet) {
      final int p = (int) (edge >>> 32);
      final int q = (int) edge;
      chords.add(new Chord(p, q, vertices));
    }

    // Sorting is not mathematically necessary, but makes execution deterministic.
    // chords.sort(Comparator.comparingInt((Chord a) -> a.mP).thenComparingInt(a -> a.mQ));

    // Map each exact intersection point to the chords passing through it.
    final Map<Polynomial<Q>, Set<Integer>> intersections = new HashMap<>();
    for (int i = 0; i < chords.size(); ++i) {
      final Chord ab = chords.get(i);
      final int p = ab.mP;
      final int q = ab.mQ;
      final Polynomial<Q> abProduct = field.multiply(ab.mPValue, ab.mQValue);
      final Polynomial<Q> abSum = field.add(ab.mPValue, ab.mQValue);

      for (int j = i + 1; j < chords.size(); ++j) {
        final Chord cd = chords.get(j);
        final int r = cd.mP;
        final int s = cd.mQ;

        // Chords must have four distinct endpoints and interlace.
        if (!(p < r && r < q && q < s) && !(r < p && p < s && s < q)) {
          continue;
        }

        final Polynomial<Q> cdProduct = field.multiply(cd.mPValue, cd.mQValue);
        final Polynomial<Q> cdSum = field.add(cd.mPValue, cd.mQValue);

        // Intersection:
        // (ab * (c+d) - cd * (a+b)) / (ab - cd)
        final Polynomial<Q> numerator = field.subtract(field.multiply(abProduct, cdSum), field.multiply(cdProduct, abSum));
        final Polynomial<Q> denominator = field.subtract(abProduct, cdProduct);
        final Polynomial<Q> point = field.divide(numerator, denominator);
        intersections.computeIfAbsent(point, k -> new HashSet<>()).add(i);
        intersections.get(point).add(j);
      }
    }

    // Euler's formula:
    // 1 + number of chords + sum over intersections (multiplicity - 1).
    long regions = 1L + chords.size();
    for (final Set<Integer> passing : intersections.values()) {
      regions += passing.size() - 1;
    }
    return Z.valueOf(regions);
  }
}
