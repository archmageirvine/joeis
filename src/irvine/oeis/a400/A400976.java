package irvine.oeis.a400;

import java.util.HashSet;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400976 Start with a set of two adjacent points in a hexagonal lattice. At each iteration, add to the set the lattice points which are adjacent to exactly two points already in the set, but only if those two points are adjacent to each other. The sequence gives the number of points in the set after n iterations.
 * @author Sean A. Irvine
 */
public class A400976 extends Sequence0 {

  private static final Lattice H = Lattices.HEXAGONAL;
  private final HashSet<Long> mSeen = new HashSet<>();

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(H.origin());
      final long u = H.neighbour(H.origin(), 0);
      mSeen.add(u);
    } else {
      final HashSet<Long> s = new HashSet<>();
      for (final long pt : mSeen) {
        for (final long u : H.neighbours(pt)) {
          if (!mSeen.contains(u)) {
            int adj = 0;
            for (final long v : H.neighbours(u)) {
              if (mSeen.contains(v)) {
                if (++adj > 2) {
                  break;
                }
                if (v != pt && !H.isAdjacent(v, pt)) {
                  adj = 0;
                  break;
                }
              }
            }
            if (adj == 2) {
              s.add(u);
            }
          }
        }
      }
      mSeen.addAll(s);
    }
    return Z.valueOf(mSeen.size());
  }
}

