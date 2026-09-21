package irvine.oeis.a399;

import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a398.A398414;

/**
 * A399712 a(n) = the index m such that A398414(m) = prime(n). If prime(n) never occurs in A398414, then a(n) = -1.
 * @author Sean A. Irvine
 */
public class A399712 extends Sequence1 {

  private final TreeMap<Z, Long> mA = new TreeMap<>();
  private final Sequence mS = new A398414();
  private long mM = 0;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = Functions.NEXT_PRIME.z(mP);
    while (!mA.containsKey(mP)) {
      mA.put(mS.next(), ++mM);
    }
    return Z.valueOf(mA.remove(mP));
  }
}
