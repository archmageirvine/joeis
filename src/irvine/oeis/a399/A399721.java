package irvine.oeis.a399;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a130.A130310;

/**
 * A399721 allocated for Geoffrey Caveney.
 * @author Sean A. Irvine
 */
public class A399721 extends Sequence1 {

  /*
  The map of the "Lucas-Collatz" function: if n is Lucas-odd (A399306), then a(n)=2*n; if n is Lucas-even (A399305), then a(n) is the integer whose minimal Lucas representation (A130310) results from removing the final 0 of A130310(n).
   */

  private final Sequence mOdd = new A399306();
  private final Sequence mA = new A130310().skip();
  private final Sequence mB = new A130310().skip();
  private final HashMap<Z, Long> mInverse = new HashMap<>();
  private Z mO = mOdd.next();
  private Z mN = Z.ZERO;
  private long mM = 0;

  @Override
  public Z next() {
    final Z t = mA.next();
    mN = mN.add(1);
    if (mN.equals(mO)) {
      mO = mOdd.next();
      return mN.multiply2();
    }
    final Z u = t.divide(10);
    while (!mInverse.containsKey(u)) {
      mInverse.put(mB.next(), ++mM);
    }
    return Z.valueOf(mInverse.get(u));
  }
}

