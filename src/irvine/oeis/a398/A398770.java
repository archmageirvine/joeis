package irvine.oeis.a398;

import irvine.math.turing.AlphabetBusyBeaver;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A398770 Busy beaver number of BB(2,n): the maximal number of steps that an 2-state, n-symbol Turing machine can make on an initially blank tape before eventually halting.
 * @author Gregory Morse
 */
public class A398770 extends LambdaSequence {

  /** Construct the sequence. */
  public A398770() {
    super(1, n -> Z.valueOf(AlphabetBusyBeaver.compute(Math.toIntExact(n)).maximumSteps()));
  }
}
