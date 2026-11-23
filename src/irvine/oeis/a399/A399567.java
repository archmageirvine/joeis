package irvine.oeis.a399;

import irvine.math.turing.AlphabetBusyBeaver;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A399567 Busy Beaver sequence, or Rado's sigma function for 2-state, n-symbol Turing machines: maximal number of nonzero numbers that can be printed on an initially blank tape before halting.
 * @author Gregory Morse
 */
public class A399567 extends LambdaSequence {

  /** Construct the sequence. */
  public A399567() {
    super(1, n -> Z.valueOf(AlphabetBusyBeaver.compute(Math.toIntExact(n)).maximumScore()));
  }
}
