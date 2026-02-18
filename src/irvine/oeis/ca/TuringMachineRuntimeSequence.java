package irvine.oeis.ca;

import irvine.math.wolfram.TuringMachine;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Run a particular Wolfram Turing machine until it halts and report the number steps.
 * @author Sean A. Irvine
 */
public class TuringMachineRuntimeSequence extends AbstractSequence {

  private final TuringMachine mTuringMachine;
  private final long mMaxSteps;
  private long mN;

  protected TuringMachineRuntimeSequence(final int offset, final int machineNumber, final int states, final int symbols, final long max) {
    super(offset);
    mTuringMachine = new TuringMachine(machineNumber, states, symbols);
    mMaxSteps = max;
    mN = offset - 1;
  }

  protected TuringMachineRuntimeSequence(final int offset, final int machineNumber, final int states, final int symbols) {
    this(offset, machineNumber, states, symbols, Long.MAX_VALUE);
  }

  protected TuringMachineRuntimeSequence(final int offset, final int machineNumber) {
    this(offset, machineNumber, 2, 2);
  }

  @Override
  public Z next() {
    mTuringMachine.initialTape(++mN);
    long steps = 1;
    while (mTuringMachine.step() >= 0 && ++steps < mMaxSteps) {
      // do nothing
    }
    return steps == mMaxSteps ? Z.NEG_ONE : Z.valueOf(steps);
  }
}

