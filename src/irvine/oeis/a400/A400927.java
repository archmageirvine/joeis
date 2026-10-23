package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400927 Number of distinct time intervals measurable by burning n non-uniform ropes, each burning for 1 unit of time, extinguishing allowed, as measured from the initial state to any transition.
 * @author Sean A. Irvine
 */
public class A400927 extends Sequence1 {

  // After Alex Tori

  private int mN = 0;

  private static final class State {
    private final int[] mLengths;

    private State(final int[] lengths) {
      mLengths = lengths;
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mLengths);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof State && Arrays.equals(mLengths, ((State) obj).mLengths);
    }
  }

  private static List<int[]> choices(final int count) {
    final List<int[]> result = new ArrayList<>();
    for (int i = 0; i <= count; ++i) {
      for (int j = 0; j <= count - i; ++j) {
        final int[] rates = new int[count];
        int p = 0;
        for (int k = 0; k < i; ++k) {
          rates[p++] = 0;
        }
        for (int k = 0; k < j; ++k) {
          rates[p++] = 1;
        }
        while (p < count) {
          rates[p++] = 2;
        }
        result.add(rates);
      }
    }
    return result;
  }

  private static void combine(final int group, final List<int[]> lengthsByGroup, final List<List<int[]>> options, final int[] lengths, final int[] rates, final Map<State, Z> nextStates, final Z bits, final Z[] times) {
    if (group == options.size()) {
      int dt = Integer.MAX_VALUE;
      for (int i = 0; i < lengths.length; ++i) {
        if (rates[i] != 0) {
          dt = Math.min(dt, lengths[i] / rates[i]);
        }
      }
      if (dt == Integer.MAX_VALUE) {
        return;
      }

      final int[] remaining = new int[lengths.length];
      int size = 0;
      for (int i = 0; i < lengths.length; ++i) {
        final int r = lengths[i] - rates[i] * dt;
        if (r > 0) {
          remaining[size++] = r;
        }
      }
      final int[] sorted = Arrays.copyOf(remaining, size);
      Arrays.sort(sorted);
      final Z shifted = bits.shiftLeft(dt);
      times[0] = times[0].or(shifted);
      if (size > 0) {
        nextStates.merge(new State(sorted), shifted, Z::or);
      }
      return;
    }

    final int[] positions = lengthsByGroup.get(group);
    for (final int[] option : options.get(group)) {
      for (int i = 0; i < positions.length; ++i) {
        rates[positions[i]] = option[i];
      }
      combine(group + 1, lengthsByGroup, options, lengths, rates, nextStates, bits, times);
    }
  }

  @Override
  public Z next() {
    if (++mN >= Integer.SIZE) {
      throw new UnsupportedOperationException();
    }
    if (mN == 0) {
      return Z.ONE;
    }
    final int initialLength = 1 << mN;
    final int[] initial = new int[mN];
    Arrays.fill(initial, initialLength);
    Map<State, Z> states = new HashMap<>();
    states.put(new State(initial), Z.ONE);
    final Z[] times = {Z.ZERO};
    while (!states.isEmpty()) {
      final Map<State, Z> nextStates = new HashMap<>();
      for (final Map.Entry<State, Z> entry : states.entrySet()) {
        final int[] lengths = entry.getKey().mLengths;
        final Map<Integer, List<Integer>> positionsByLength = new HashMap<>();
        for (int i = 0; i < lengths.length; ++i) {
          positionsByLength.computeIfAbsent(lengths[i], k -> new ArrayList<>()).add(i);
        }
        final List<int[]> lengthsByGroup = new ArrayList<>();
        final List<List<int[]>> options = new ArrayList<>();
        for (final Map.Entry<Integer, List<Integer>> e : positionsByLength.entrySet()) {
          final List<Integer> positions = e.getValue();
          final int[] indices = new int[positions.size()];
          for (int i = 0; i < indices.length; ++i) {
            indices[i] = positions.get(i);
          }
          lengthsByGroup.add(indices);
          options.add(choices(indices.length));
        }
        combine(0, lengthsByGroup, options, lengths, new int[lengths.length], nextStates, entry.getValue(), times);
      }
      states = nextStates;
    }
    return Z.valueOf(times[0].bitCount());
  }
}
