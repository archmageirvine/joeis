package irvine.oeis.a398;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398140 Numbers m such that the distinct prime factors of the product m*(m+1)*(m+2)*(m+3) are all consecutive primes beginning with 2 (that is, the product is a term of A055932).
 * @author Sean A. Irvine
 */
public class A398140 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final FactorSequence fs = new FactorSequence();
      fs.add(mN);
      fs.add(mN + 1);
      fs.add(mN + 2);
      fs.add(mN + 3);
      Jaguar.factor(fs);
      final Z[] p = fs.toZArray();
      if (p[p.length - 1].equals(Functions.PRIME.z(p.length))) {
        return Z.valueOf(mN);
      }
    }
  }
}
