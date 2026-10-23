package irvine.oeis.a400;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.PeekSequence;
import irvine.oeis.Sequence1;

/**
 * A400859 Numbers of the form k * d(k), where k is a refactorable number (A033950) satisfying d(k/d(k)) = d(d(k)), where d(x) is the divisor count of x.
 * @author Sean A. Irvine
 */
public class A400859 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final PeekSequence mS = new PeekSequence(new A400850());

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mS.peek().multiply2()) >= 0) {
      final Z k = mS.next();
      mA.add(k.multiply(Functions.SIGMA0.z(k)));
    }
    return mA.pollFirst();
  }
}
