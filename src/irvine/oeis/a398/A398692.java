package irvine.oeis.a398;

import java.util.HashSet;
import java.util.LinkedList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398692 Sequence obtained by iteratively appending the reversed Collatz trajectory (excluding terms already present) of the smallest positive integer not included in the sequence, starting from a(1)=1.
 * @author Sean A. Irvine
 */
public class A398692 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mUsed.add(Z.ONE);
      ++mN;
      return Z.ONE;
    }
    if (mA.isEmpty()) {
      while (mUsed.contains(Z.valueOf(++mN))) {
        // do nothing
      }
      Z t = Z.valueOf(mN);
      while (mUsed.add(t)) {
        mA.push(t);
        t = Functions.COLLATZ.z(t);
      }
    }
    return mA.pollFirst();
  }
}
