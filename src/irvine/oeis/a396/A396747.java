package irvine.oeis.a396;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.PeekSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a392.A392325;

/**
 * A396747 allocated for Guido Avagliano.
 * @author Sean A. Irvine
 */
public class A396747 extends Sequence1 {

  private long mN = 0;
  private final ArrayList<PeekSequence> mVampireGenerators = new ArrayList<>();
  {
    mVampireGenerators.add(null); // 0
    mVampireGenerators.add(null); // 1
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long s = mVampireGenerators.size();
      if (s * s * s < mN) {
        mVampireGenerators.add(new PeekSequence(new A392325((int) s, mN)));
      }
      // Allow for more than one vampire sequence it match
      boolean found = false;
      for (int k = 2; k < mVampireGenerators.size(); ++k) {
        final PeekSequence ps = mVampireGenerators.get(k);
        if (ps.peek().equals(mN)) {
          found = true;
          ps.next();
        }
      }
      if (found) {
        return Z.valueOf(mN);
      }
    }
  }
}
