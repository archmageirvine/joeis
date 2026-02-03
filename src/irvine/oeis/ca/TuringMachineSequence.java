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
  private long mN;

  protected TuringMachineSequence(final int offset, final int machineNumber) {
    super(offset);
    mTuringMachine = new TuringMachine(machineNumber);
    mN = offset - 1;
  }

  @Override
  public Z next() {
    mTuringMachine.initialTape(++mN);
    while (mTuringMachine.step() >= 0) {
      // do nothing
    }
    return mTuringMachine.readTape();
  }
}

