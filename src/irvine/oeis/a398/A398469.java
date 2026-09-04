package irvine.oeis.a398;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A398469 allocated for Neal Gersh Tolunsky.
 * @author Sean A. Irvine
 */
public class A398469 extends Sequence1 {

  // todo doesn't match from n=399 onward

  private static final long TERMINATED = -1;
  private final LongDynamicLongArray mPrevPos = new LongDynamicLongArray();
  private final LongDynamicLongArray mNextPos = new LongDynamicLongArray();
  private final HashSet<Long> mForbidden = new HashSet<>();
  private long mN = 0;

  private boolean isClaimed(final long v) {
    return mForbidden.contains(v);
//    for (long k = 0; k < mNextPos.length(); ++k) {
//      if (mNextPos.get(k) == v) {
//        return true;
//      }
//    }
//    return false;
  }

  @Override
  public Z next() {
    ++mN;
    mForbidden.remove(mN);
    long k = 0;
    while (true) {
      final long pos = mNextPos.get(++k);
      if (pos == mN) {
        final long prev = mPrevPos.get(k);
        final Q next = new Q(mN * mN, prev);
        mPrevPos.set(k, pos);
        if (next.isInteger()) {
          final long v = next.toZ().longValueExact();
          mNextPos.set(k, v);
          mForbidden.add(v);
//          final Q s = new Q(mN * v, prev);
//          if (s.isInteger()) {
//            mForbidden.add(s.toZ().longValueExact());
//          }
//          long x = v;
//          for (long h = 0; h < 10; ++h) {
//            mForbidden.add(x);
//            final Q g = new Q(mN * x, prev);
//            if (!g.isInteger()) {
//              break;
//            }
//            x = g.toZ().longValueExact();
//          }
        } else {
          mNextPos.set(k, TERMINATED);
        }
        // todo I think this next loop is pointless
        for (long m = k + 1; m < mNextPos.length(); ++m) {
          if (mNextPos.get(m) == mN) {
            mNextPos.set(m, TERMINATED);
          }
        }
        return Z.valueOf(k);
      } else if (pos == 0) {
        // This number is never used
        mPrevPos.set(k, mN);
        // Find a viable ratio
        long j = mN;
        while (true) {
          final Q r = new Q(++j * mN, mN);
          if (r.isInteger()) {
            final long v = r.toZ().longValueExact();
            if (!isClaimed(v)) {
              final Q s = new Q(j * v, mN);
              if (s.isInteger()) {
                final long w = s.toZ().longValueExact();
                if (!isClaimed(w)) {
                  mNextPos.set(k, v);
                  if (mForbidden.add(v) && mForbidden.add(w)) {

//                  long x = w;
//                  for (long h = 0; h < 10; ++h) {
//                    mForbidden.add(x);
//                    final Q g = new Q(j * x, mN);
//                    if (!g.isInteger()) {
//                      break;
//                    }
//                    x = g.toZ().longValueExact();
//                  }
                    return Z.valueOf(k);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}

