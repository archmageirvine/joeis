package irvine.oeis.a402;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402036 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A402036 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = -1;
    Z t = Z.valueOf(++mN);
    final HashMap<Z, Long> seen = new HashMap<>();
    while (seen.putIfAbsent(t, ++cnt) == null) {
      t = Functions.CHOWLA.z(t);
    }
    return Z.valueOf(seen.get(t));
  }
}
