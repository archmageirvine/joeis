package irvine.oeis.a396;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000695;

/**
 * A396454 Possible values of (A000695(k) XOR k) + 1, in ascending order.
 * @author Sean A. Irvine
 */
public class A396454 extends Sequence1 {

  private final Sequence mS = new A000695();
  private long mN = -1;
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN) > 0) {
      mA.add(mS.next().xor(++mN).add(1));
    }
    return mA.pollFirst();
  }
}

