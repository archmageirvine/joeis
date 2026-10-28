package irvine.oeis.a399;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399432 Irregular triangle read by rows: integers from 1 to n that share no prime factor with any other integer from 1 to n.
 * @author Sean A. Irvine
 */
public class A399432 extends Sequence1 {

  private final Set<Long> mActive = new HashSet<>();
  private final Set<Long> mSeen = new HashSet<>();
  private final Set<Long> mSeenTwice = new HashSet<>();
  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 0;
  {
    mActive.add(1L);
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      for (final Z pp : Jaguar.factor(++mN).toZArray()) {
        final long p = pp.longValue();
        if (mSeen.add(p)) {
          mActive.add(p);
        } else if (mSeenTwice.add(p)) {
          mActive.remove(p);
        }
      }
      mA.addAll(mActive);
    }
    return Z.valueOf(mA.pollFirst());
  }
}

