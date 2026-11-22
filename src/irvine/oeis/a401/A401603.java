package irvine.oeis.a401;

import irvine.math.turing.MinskyBusyBeaver;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A401603 Maximum number of instructions executed before executing the halting instruction at the end of a halting computation of an n-instruction register Minsky machine.
 * @author Gregory Morse
 */
public class A401603 extends LambdaSequence {

  /** Construct the sequence. */
  public A401603() {
    super(1, n -> Z.valueOf(MinskyBusyBeaver.compute(Math.toIntExact(n)).maximumSteps()));
  }
}
