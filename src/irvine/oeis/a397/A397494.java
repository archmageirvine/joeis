package irvine.oeis.a397;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001694;

/**
 * A397494 a(1) = 1, a(2) = 4, a(3) = 9; for n &gt; 2, a(n) is the smallest powerful k not already used that shares a factor with a(n-2), but none with a(n-1).
 * @author Sean A. Irvine
 */
public class A397494 extends Sequence1 {

  private final DirectSequence mPowerful = DirectSequence.create(new A001694());
  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        mUsed.add(Z.ONE);
        return Z.ONE;
      }
      mB = Z.FOUR;
      mUsed.add(Z.FOUR);
      return Z.FOUR;
    }
    if (mA.isOne()) {
      mA = mB;
      mB = Z.NINE;
      mUsed.add(Z.NINE);
      return Z.NINE;
    }
    long k = 1;
    while (true) {
      final Z p = mPowerful.a(++k);
      if (!mUsed.contains(p) && Functions.GCD.z(mB, p).isOne() && !Functions.GCD.z(mA, p).isOne()) {
        mA = mB;
        mB = p;
        mUsed.add(p);
        return p;
      }
    }
  }
}
