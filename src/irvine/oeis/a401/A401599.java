package irvine.oeis.a401;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A087295:
 * @author Sean A. Irvine
 */
public class A401599 extends Sequence1 {

  private final TreeSet<Pair<Z, Z>> mA = new TreeSet<>(Comparator.comparing((Function<Pair<Z, Z>, Z>) Pair::left).thenComparing(Pair::right));
  private Z mS = Z.valueOf(16);

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().left().multiply(3).compareTo(mS) >= 0) {
      if (mS.mod(3) == 1) {
        mA.add(new Pair<>(mS.divide(3), mS));
      }
      mS = mS.shiftLeft(2);
    }
    final Pair<Z, Z> e = mA.pollFirst();
    final Z r = e.left();
    final Z s = e.right();
    final Z t = r.multiply(s);
    if (t.mod(3) == 1) {
      mA.add(new Pair<>(t.divide(3), s));
    }
    return r;
  }
}
