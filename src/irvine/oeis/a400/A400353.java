package irvine.oeis.a400;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400353.
 * @author Sean A. Irvine
 */
public class A400353 extends Sequence0 {

  // After Eric Fox

  private static final Z TEN = Z.TEN;
  private final Set<Z> mUsed = new HashSet<>();
  private final Map<Integer, SearchState> mStates = new HashMap<>();
  private Z mRoot = Z.FOUR;
  private Z mLast = null;
  private int mDigit;

  private static final class SearchState {
    private final int mLength;
    private final Z mRoot;
    private final Z mEnd;

    private SearchState(final int length, final Z root, final Z end) {
      mLength = length;
      mRoot = root;
      mEnd = end;
    }
  }

  private Z[] nextTerm(final int p, final int d) {
    final int key = 10 * p + d;
    final SearchState state = mStates.get(key);
    int length = state == null ? 1 : state.mLength;
    Z r = state == null ? null : state.mRoot;
    Z end = state == null ? null : state.mEnd;

    while (true) {
      if (r == null) {
        final Z pow10 = TEN.pow(length);
        final int prefix = p == 0 ? d : 10 * p + d;
        final Z lo = Z.valueOf(prefix).multiply(pow10);
        final Z hi = lo.add(pow10).subtract(Z.ONE);
        r = Functions.CEIL_SQRT.z(lo);
        end = Functions.SQRT.z(hi);
      }

      while (r.compareTo(end) <= 0) {
        final Z square = r.multiply(r);
        r = r.add(Z.ONE);
        final int e = square.mod(TEN).intValue();
        final Z x = square.divide(TEN);
        final Z candidate = p == 0 ? x : x.mod(TEN.pow(length));
        if (e != 0 && !mUsed.contains(candidate)) {
          mStates.put(key, new SearchState(length, r, end));
          return new Z[] {candidate, Z.valueOf(e)};
        }
      }

      ++length;
      r = null;
      end = null;
    }
  }

  @Override
  public Z next() {
    if (mLast == null) {
      while (true) {
        final Z square = mRoot.multiply(mRoot);
        mRoot = mRoot.add(Z.ONE);
        mDigit = square.mod(TEN).intValue();
        if (mDigit != 0) {
          mLast = square.divide(TEN);
          break;
        }
      }
    } else {
      final int p = mLast.mod(TEN).intValue();
      final Z[] result = nextTerm(p, mDigit);
      mLast = result[0];
      mDigit = result[1].intValue();
    }
    mUsed.add(mLast);
    return mLast;
  }
}

