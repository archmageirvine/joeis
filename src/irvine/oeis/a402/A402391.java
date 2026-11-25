package irvine.oeis.a402;

import java.util.PriorityQueue;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402391 allocated for Carlos Alberto Terencio de Bastos.
 * @author Sean A. Irvine
 */
public class A402391 extends Sequence1 {

  private static final class State implements Comparable<State> {
    private final int mT;
    private final int mStep;
    private int mV;
    private Z mK;

    private State(final int t) {
      mT = t;
      mV = 1;
      for (int i = 1; i < t; ++i) {
        mV = Math.multiplyExact(mV, 3);
      }
      mStep = Math.multiplyExact(2, mV);
      update();
    }

    private void update() {
      final int exponent = Math.addExact(mT, mV);
      final Z numerator = Z.ONE.shiftLeft(exponent).subtract(Z.THREE.pow(mT)).add(Z.ONE.shiftLeft(mT));
      mK = numerator.divide(Z.THREE.pow(mT));
    }

    private void advance() {
      mV = Math.addExact(mV, mStep);
      update();
    }

    @Override
    public int compareTo(final State other) {
      return mK.compareTo(other.mK);
    }
  }

  private final PriorityQueue<State> mQueue = new PriorityQueue<>();
  private int mNextT = 1;

  /** Construct the sequence. */
  public A402391() {
    mQueue.add(new State(mNextT++));
  }

  @Override
  public Z next() {
    // Activate every t whose first term could precede the current minimum.
    while (true) {
      final State next = new State(mNextT);
      if (next.mK.compareTo(mQueue.peek().mK) > 0) {
        break;
      }
      mQueue.add(next);
      ++mNextT;
    }
    final State state = mQueue.poll();
    final Z result = state.mK;
    state.advance();
    mQueue.add(state);
    return result;
  }
}

