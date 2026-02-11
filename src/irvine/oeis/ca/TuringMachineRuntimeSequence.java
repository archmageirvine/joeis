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
  private long mN;

  public TuringMachineRuntimeSequence(final int offset, final int machineNumber) {
    super(offset);
    mTuringMachine = new TuringMachine(machineNumber);
    mN = offset - 1;
  }

  @Override
  public Z next() {
    mTuringMachine.initialTape(++mN);
    long steps = 1;
    while (mTuringMachine.step() >= 0) {
      ++steps;
    }
    return Z.valueOf(steps);
  }
}

