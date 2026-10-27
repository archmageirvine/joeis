package irvine.oeis.a400;

import java.util.HashSet;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400975 allocated for Aidan Markey.
 * @author Sean A. Irvine
 */
public class A400975 extends Sequence0 {

  private static final Lattice H = Lattices.HEXAGONAL;
  private final HashSet<Long> mSeen = new HashSet<>();

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(H.origin());
      final long u = H.neighbour(H.origin(), 0);
      mSeen.add(u);
      final long v = H.neighbour(u, 0);
      mSeen.add(v);
      final long w = H.neighbour(v, 0);
      mSeen.add(w);
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

