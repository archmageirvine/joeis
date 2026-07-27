package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A398121 allocated for M\u00e1rcio Ven\u00edcio Pilar Alc\u00e2ntara.
 * @author Sean A. Irvine
 */
public class A398121 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    int d = 1;
    Z pow10 = Z.ONE;
    while (pow10.compareTo(Z.valueOf(9L * mN * d)) <= 0) {
      ++d;
      pow10 = pow10.multiply(10);
    }
    --d;

    final long bound = 9L * mN * d;
    int maxLength = 1;
    for (long x0 = 1; x0 <= bound; ++x0) {
      final HashMap<Z, Integer> seen = new HashMap<>();
      final ArrayList<Z> orbit = new ArrayList<>();
      Z x = Z.valueOf(x0);
      while (!seen.containsKey(x)) {
        seen.put(x, orbit.size());
        orbit.add(x);
        x = Functions.DIGIT_SUM.z(x.pow(mN));
      }
      final int cycleLength = orbit.size() - seen.get(x);
      if (cycleLength > maxLength) {
        maxLength = cycleLength;
      }
    }
    return Z.valueOf(maxLength);
  }
}
