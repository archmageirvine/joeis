package irvine.oeis.a396;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396824 Numbers with no initial substring divisible by 3.
 * @author Sean A. Irvine
 */
public class A396824 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ONE);
    mA.add(Z.TWO);
    mA.add(Z.FOUR);
    mA.add(Z.FIVE);
    mA.add(Z.SEVEN);
    mA.add(Z.EIGHT);
  }

  @Override
  public Z next() {
    final Z t = mA.pollFirst();
    final Z u = t.multiply(10);
    for (long k = 0; k < 10; ++k) {
      final Z v = u.add(k);
      if (v.mod(3) != 0) {
        mA.add(v);
      }
    }
    return t;
  }
}

