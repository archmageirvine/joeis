package irvine.oeis.a400;

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005384;
import irvine.oeis.transform.Stirling2TransformSequence;

/**
 * A400567 Number of set partitions of an n-element set whose number of blocks is a Sophie Germain prime.
 * @author Sean A. Irvine
 */
public class A400567 extends Stirling2TransformSequence {

  /** Construct the sequence. */
  public A400567() {
    super(0, new PrependSequence(0, new CharacteristicFunction(new A005384()), 0), 0);
  }
}
