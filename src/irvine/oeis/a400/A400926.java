package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400926 allocated for Alex Tori.
 * @author Sean A. Irvine
 */
public class A400926 extends Sequence1 {

  // After Alex Tori

  private int mN = 0;

  private static final class State {
    private final int[] mLengths;
    private final int mHash;

    private State(final int[] lengths) {
      mLengths = lengths;
      mHash = Arrays.hashCode(lengths);
    }

    @Override
    public int hashCode() {
      return mHash;
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State && Arrays.equals(mLengths, ((State) obj).mLengths);
    }
  }

  private final Map<State, Z> mStates = new HashMap<>();

  private Z mTimes;

  private void enumerate(final List<Integer> groups, final int index, final int[] rates, final Z bits, final Map<State, Z> nextStates) {
    if (index == groups.size()) {
      int dt = Integer.MAX_VALUE;
      for (int k = 0; k < rates.length; ++k) {
        if (rates[k] != 0) {
          dt = Math.min(dt, mGroupsLength[k] / rates[k]);
        }
      }
      if (dt == Integer.MAX_VALUE) {
        return;
      }

      final int[] remaining = new int[rates.length];
      int count = 0;
      for (int k = 0; k < rates.length; ++k) {
        final int r = mGroupsLength[k] - rates[k] * dt;
        if (r > 0) {
          remaining[count++] = r;
        }
      }

      Arrays.sort(remaining, 0, count);
      final int[] key = Arrays.copyOf(remaining, count);
      final Z newBits = bits.shiftLeft(dt);
      mTimes = mTimes.or(newBits);
      if (count > 0) {
        final State state = new State(key);
        nextStates.merge(state, newBits, Z::or);
      }
      return;
    }

    final Integer group = groups.get(index);
    final int offset = mGroupOffset[index];
    for (int i = 0; i <= group; ++i) {
      for (int j = 0; j <= group - i; ++j) {
        for (int k = 0; k < i; ++k) {
          rates[offset + k] = 0;
        }
        for (int k = 0; k < j; ++k) {
          rates[offset + i + k] = 1;
        }
        for (int k = 0; k < group - i - j; ++k) {
          rates[offset + i + j + k] = 2;
        }
        enumerate(groups, index + 1, rates, bits, nextStates);
      }
    }
  }

  private int[] mGroupsLength;
  private int[] mGroupOffset;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final int length = 1 << mN;
    final int[] initial = new int[mN];
    Arrays.fill(initial, length);
    mStates.clear();
    mStates.put(new State(initial), Z.ONE);
    mTimes = Z.ZERO;
    while (!mStates.isEmpty()) {
      final Map<State, Z> nextStates = new HashMap<>();
      for (final Map.Entry<State, Z> entry : mStates.entrySet()) {
        final int[] lengths = entry.getKey().mLengths;
        final Z bits = entry.getValue().or(Z.ONE);
        final List<Integer> groups = new ArrayList<>();
        for (int k = 0; k < lengths.length; ) {
          int j = k + 1;
          while (j < lengths.length && lengths[j] == lengths[k]) {
            ++j;
          }
          groups.add(j - k);
          k = j;
        }
        mGroupsLength = lengths;
        mGroupOffset = new int[groups.size()];
        int offset = 0;
        for (int k = 0; k < groups.size(); ++k) {
          mGroupOffset[k] = offset;
          offset += groups.get(k);
        }
        enumerate(groups, 0, new int[lengths.length], bits, nextStates);
      }
      mStates.clear();
      mStates.putAll(nextStates);
    }
    return Z.valueOf(mTimes.bitCount());
  }
}
