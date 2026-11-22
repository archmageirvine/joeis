package irvine.oeis.a399;

import java.util.BitSet;

import irvine.math.turing.BlankTapeHalting;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a028.A028444;
import irvine.oeis.a060.A060843;

/**
 * A399346 Placid Platypus function PP(n): Minimal number of states of all 2-symbol Turing machines that print exactly n ones then halt.
 * @author Gregory Morse
 */
public class A399346 extends Sequence1 {
  // Five-state witnesses; the first two are from the Placid Platypus wiki.
  private static final int WITNESS_LIMIT = 2048;
  private static final String[] WITNESSES = {
    "1RB0LB0LC1RZ1LE0RD1RC0RA1LD0LB",
    "1RB0LD1LC0LB1RD0RC1LA0RE1RA1RZ",
    "1RB1LC1RC1RB1RD1LE1LA0RB1RZ1LA"
  };

  private final A028444 mSigma = new A028444();
  private final A060843 mTime = new A060843();
  private final BitSet[] mScores = new BitSet[5];
  private int mN = 0;

  private static int score(final String machine) {
    final boolean[] tape = new boolean[2 * WITNESS_LIMIT + 1];
    int position = WITNESS_LIMIT;
    int state = 0;
    int ones = 0;
    for (int time = 0; time < WITNESS_LIMIT; ++time) {
      final boolean symbol = tape[position];
      final int rule = 6 * state + (symbol ? 3 : 0);
      final boolean write = machine.charAt(rule) == '1';
      if (write != symbol) {
        tape[position] = write;
        ones += write ? 1 : -1;
      }
      final char next = machine.charAt(rule + 2);
      if (next == 'Z') {
        return ones;
      }
      state = next - 'A';
      position += machine.charAt(rule + 1) == 'R' ? 1 : -1;
    }
    throw new IllegalStateException("Invalid witness");
  }

  @Override
  public Z next() {
    ++mN;
    for (int states = 1; states < mN; ++states) {
      if (states <= 5 && mSigma.a(states).compareTo(mN) < 0) {
        continue;
      }
      if (states < mScores.length) {
        if (mScores[states] == null) {
          mScores[states] = BlankTapeHalting.scores(states, mTime.a(states).intValueExact());
        }
        if (mScores[states].get(mN)) {
          return Z.valueOf(states);
        }
      } else {
        if (states == 5 && mN >= 14 && mN < 14 + WITNESSES.length) {
          if (score(WITNESSES[mN - 14]) != mN) {
            throw new IllegalStateException("Witness leaves the wrong score");
          }
          return Z.FIVE;
        }
        // Search for a witness. Failure to find one cannot exclude this size.
        for (int limit = 32; limit <= 512; limit *= 2) {
          if (BlankTapeHalting.attainableScore(states, limit, mN)) {
            return Z.valueOf(states);
          }
        }
        throw new UnsupportedOperationException("Smallest possible machine size unresolved");
      }
    }
    // A chain of mN states can write one more 1 in each successive state.
    return Z.valueOf(mN);
  }
}
