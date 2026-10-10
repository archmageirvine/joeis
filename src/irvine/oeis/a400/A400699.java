package irvine.oeis.a400;

import java.util.HashSet;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400699 allocated for Aidan Markey.
 * @author Sean A. Irvine
 */
public class A400699 extends Sequence0 {

  // Note there is a simple g.f. for this

  private static final Lattice H = Lattices.HEXAGONAL;
  private final HashSet<Long> mSeen = new HashSet<>();

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(H.origin());
      final long u = H.neighbour(H.origin(), 0);
      mSeen.add(u);
      mSeen.add(H.neighbour(u, 0));
    } else {
      final HashSet<Long> s = new HashSet<>();
      for (final long pt : mSeen) {
        for (final long u : H.neighbours(pt)) {
          if (!mSeen.contains(u)) {
            for (final long v : H.neighbours(u)) {
              if (v != pt && mSeen.contains(v)) {
                s.add(u);
                break;
              }
            }
          }
        }
      }
      mSeen.addAll(s);
    }
    return Z.valueOf(mSeen.size());
  }
}

