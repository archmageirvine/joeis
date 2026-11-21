package irvine.oeis.a399;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a262.A262307;

/**
 * A399043 Array read by antidiagonals: T(n,m) is the total number of connected components in all induced subgraphs of the rook graph K_n X K_m.
 * @author Gregory Morse
 */
public class A399043 extends A262307 {
  protected A399043(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A399043() {
    this(1);
  }

  @Override
  protected Z term(final int m, final int n) {
    Z sum = Z.ZERO;
    for (int i = 1; i <= m; ++i) {
      for (int j = 1; j <= n; ++j) {
        // The other occupied squares use only the remaining rows and columns.
        sum = sum.add(Binomial.binomial(m, i).multiply(Binomial.binomial(n, j)).multiply(get(i, j)).shiftLeft((long) (m - i) * (n - j)));
      }
    }
    return sum;
  }
}
