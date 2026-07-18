package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397794 a(n) is the decimal encoding of the unique snowball numeral &lt;d_k...d_1&gt; having value n.
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
      final long base = prev + 2;
      final long digit = n % base;
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
