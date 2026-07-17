package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397794 allocated for Philip Weiss.
 * @author Sean A. Irvine
 */
public class A397794 extends Sequence0 {

  // After R&eacute;my Sigrist

  private long mN = -1;

  private List<Long> snowball(long n) {
    if (n == 0) {
      return Collections.singletonList(0L);
    }
    final ArrayList<Long> digits = new ArrayList<>();
    long prev = 0;
    while (n > 0) {
      long base = prev + 2;
      long digit = n % base;
      n /= base;
      digits.add(digit);
      prev = digit;
    }
    Collections.reverse(digits);
    return digits;
  }

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    for (final long d : snowball(++mN)) {
      sb.append(d);
    }
    return new Z(sb);
  }
}
