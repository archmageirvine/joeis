package irvine.oeis.a398;

import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398116 allocated for Marco Rip\u00e0.
 * @author Sean A. Irvine
 */
public class A398116 extends Sequence1 {

  // After Marco Rip&agrave;

  private int mN = 0;

  /**
   * Memoization key: visited set and current vertex.
   */
  private static final class State {
    private final Z mVisited;
    private final int mVertex;

    State(final Z visited, final int vertex) {
      mVisited = visited;
      mVertex = vertex;
    }

    @Override
    public int hashCode() {
      return 31 * mVisited.hashCode() + mVertex;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mVertex == other.mVertex && mVisited.equals(other.mVisited);
    }
  }

  private Z[][] mBetween;
  private Map<State, Z> mCache;
  private int mSize;

  /**
   * Construct the visibility masks.
   */
  private void buildBetween() {
    mSize = mN * mN;
    mBetween = new Z[mSize][mSize];
    for (int u = 0; u < mSize; ++u) {
      final int x = u / mN;
      final int y = u % mN;
      for (int v = 0; v < mSize; ++v) {
        Z mask = Z.ZERO;
        if (u != v) {
          final int bigX = v / mN;
          final int bigY = v % mN;
          final int dx = bigX - x;
          final int dy = bigY - y;
          final int g = Functions.GCD.i(Math.abs(dx), Math.abs(dy));
          for (int k = 1; k < g; ++k) {
            final int w = (x + k * (dx / g)) * mN + y + k * (dy / g);
            mask = mask.setBit(w);
          }
        }
        mBetween[u][v] = mask;
      }
    }
  }

  /*
   * Count all continuations from the current state, including the option to stop.
   */
  private Z f(final Z visited, final int u) {
    final State state = new State(visited, u);
    final Z cached = mCache.get(state);
    if (cached != null) {
      return cached;
    }
    Z result = Z.ONE;
    for (int v = 0; v < mSize; ++v) {
      if (!visited.testBit(v)
        && mBetween[u][v].andNot(visited).signum() == 0) {
        result = result.add(f(visited.setBit(v), v));
      }
    }
    mCache.put(state, result);
    return result;
  }

  @Override
  public Z next() {
    ++mN;
    buildBetween();
    mCache = new HashMap<>();
    Z total = Z.ZERO;
    for (int u = 0; u < mSize; ++u) {
      total = total.add(f(Z.ZERO.setBit(u), u).subtract(Z.ONE));
    }
    return total;
  }
}
