package irvine.oeis.ca;

import irvine.math.wolfram.TuringMachine;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Run a particular Wolfram Turing machine until it halts and return the resulting tape.
 * @author Sean A. Irvine
 */
public class TuringMachineSequence extends AbstractSequence {

  private final TuringMachine mTuringMachine;
  private final long mMaxSteps;
  private long mN;

  protected TuringMachineSequence(final int offset, final int machineNumber, final int states, final int symbols, final long max) {
    super(offset);
    mTuringMachine = new TuringMachine(machineNumber, states, symbols);
    mMaxSteps = max;
    mN = offset - 1;
  }

  protected TuringMachineSequence(final int offset, final int machineNumber, final int states, final int symbols) {
    this(offset, machineNumber, states, symbols, Long.MAX_VALUE);
  }

  protected TuringMachineSequence(final int offset, final int machineNumber) {
    this(offset, machineNumber, 2, 2);
  }

  @Override
  public Z next() {
    mTuringMachine.initialTape(++mN);
    long cnt = 0;
    while (mTuringMachine.step() >= 0 && ++cnt < mMaxSteps) {
      // do nothing
    }
    return cnt == mMaxSteps ? Z.NEG_ONE : mTuringMachine.readTape();
  }
}

