package irvine.oeis.a398;

import java.util.HashMap;

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
  private final HashMap<Long, Long> mForbidden = new HashMap<>();
  private long mN = 0;

  private void sanity(final long pos, final long k) {
    for (long j = k + 1; j < mNextPos.length(); ++j) {
      if (mNextPos.get(j) == pos) {
        System.out.println("Multiple values have claimed " + pos);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mForbidden.remove(mN);
    long k = 0;
    while (true) {
      final long pos = mNextPos.get(++k);
      if (pos == mN) {
        //sanity(pos, k);
        final long prev = mPrevPos.get(k);
        final Q next = new Q(mN * mN, prev);
        mPrevPos.set(k, pos);
        if (next.isInteger()) {
          final long v = next.toZ().longValueExact();
          mNextPos.set(k, v);
          final Long exists = mForbidden.get(v);
          if (exists == null || exists == k) {
            mForbidden.put(v, k);
          } else {
            mNextPos.set(k, TERMINATED);
          }
        } else {
          mNextPos.set(k, TERMINATED);
        }
        return Z.valueOf(k);
      } else if (pos == 0) {
        // This number is never used
        mPrevPos.set(k, mN);
        // Find a viable ratio
        long j = mN;
        while (true) {
          final Q ratio = new Q(++j, mN);
          final Q r = ratio.multiply(mN);
          if (r.isInteger()) {
            final long v = r.toZ().longValueExact();
            if (!mForbidden.containsKey(v)) {
              final Q s = ratio.multiply(v);
              if (s.isInteger()) {
                final long w = s.toZ().longValueExact();
                if (!mForbidden.containsKey(w)) {
                  mNextPos.set(k, v);
                  // Reserve next two positions in this progression to ensure overall length >= 3
                  mForbidden.put(v, k);
                  mForbidden.put(w, k);
                  if (!ratio.isInteger()) {
                    // Generate entire progression
                    long x = w;
                    while (true) {
                      final Q y = ratio.multiply(x);
                      if (!y.isInteger()) {
                        break;
                      }
                      x = y.toZ().longValueExact();
                      mForbidden.put(x, k);
                    }
                  }
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

