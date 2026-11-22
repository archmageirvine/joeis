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
  // Five-state witnesses produced by the internal BusyBeaver enumeration.
  // Replay each machine before using it to prove the upper bound.
  private static final int WITNESS_LIMIT = 512;
  private static final String[] WITNESSES = {
    "1RB1RE1LC1RZ1RA1LD1LB1LD0RC1RA",
    "1RB1RZ1LC1LB1RD1LA0RA1RE0RC1RD",
    "1RB1LE1LC1RA0LD1LD1LA1RZ0LB0LA",
    "1RB1RA1LC1RE1LA0LD0LB1LD1RZ1RA",
    "1RB0RE1LC1LD1RZ1LD1RA1LB1RD1RE",
    "1RB1RA0LC1RE0LE1LD0LB1LC1LA1RZ",
    "1RB1RA1RC1LD1RD0RA1LE1LB1RZ1LB",
    "1RB1LD1RC1RE1RD1RA1LD0LA0RC1RZ",
    "1RB0RD1LC1LE1RZ0LD1RE1RD1RA1LB",
    "1RB0RA1LC1RE1RE1LD0LB1LD1RZ1RA",
    "1RB1LD0RC1RB1LC1LA0RE0RD0RB0RZ",
    "1RB1LD0RC1RB1LC1LA0RE0RD0RB1RZ",
    "1RB0RA1LC1RE1LA1LD0LB1LD1RZ1RA",
    "1RB1RA1LC1LE1RA0LD0LC1LB0RZ1LD",
    "1RB1RA1LC1LE1RA0LD0LC1LB1RZ1LD",
    "1RB0RD1RC1LB1RD1RE1LB1RD0RZ1RA",
    "1RB0RD1RC1LB1RD1RE1LB1RD1RZ1RA",
    "1RB1LC1LA1RB1LB1LD1RZ0LE1RB1LE",
    "1RB1LE1LC0RD1LA1LD1LB1LA0RZ0LC",
    "1RB1LE1LC0RD1LA1LD1LB1LA1RZ0LC",
    "1RB1RA1LC0RD1RZ1LD1LE1RB0RA1LB",
    "1RB1RD1LC0RA1LA0LB0RE0RZ1RA1RE",
    "1RB1RD1LC0RA1LA0LB0RE1RZ1RA1RE",
    "1RB0RC1LC1RE1RA1LD0LC0LA1RZ1RC"
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
