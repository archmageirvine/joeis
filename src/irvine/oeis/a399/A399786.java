package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A399786 Power chains: Number of essentially different permutations of the numbers 1 to n such that the sum of any two consecutive numbers is a perfect power, with each circular permutation counted n times.
 * @author Sean A. Irvine
 */
public class A399786 extends AbstractSequence {

  private final Sequence mA = new A399784().prepend(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
  private final Sequence mB = new A399783();
  private long mN = 6;

  /** Construct the sequence. */
  public A399786() {
    super(7);
  }

  @Override
  public Z next() {
    return mA.next().multiply(++mN).add(mB.next());
  }
}
