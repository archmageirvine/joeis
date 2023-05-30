package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * Compute the inverse of a triangle: S * T = Identity.
 * The target elements are generated row by row,
 * The offset of the target triangle defaults to 0.
 * @author Georg Fischer
 */
public class Inverse extends Triangle implements SequenceWithOffset {

  private int mOffset; // first index of target triangle
  protected Triangle mS; // source triangle

  /**
   * Constructor with offset and a Triangle.
   * @param offset first index of target triangle
   * @param s sequence for source triangle
   */
  public Inverse(final int offset, final Triangle s) {
    mOffset = offset;
    mS = s;
  }

  /**
   * Constructor with a Triangle.
   * @param s sequence for source triangle
   */
  public Inverse(final Triangle s) {
    this(0, s);
  }

  /**
   * Constructor with offset and a Sequence.
   * @param offset first index of target triangle
   * @param s sequence for source triangle
   */
  public Inverse(final int offset, final Sequence s) {
    this(offset, Triangle.asTriangle(s));
  }

  /**
   * Constructor with a Sequence.
   * @param s sequence for source triangle
   */
  public Inverse(final Sequence s) {
    this(0, Triangle.asTriangle(s));
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  /**
   * Increases <code>mRow</code>, adds a new, empty target row, resets the column index,
   * and advances the source sequence such that their <code>mRow</code> is completely filled.
   */
  protected void addRow() {
    super.addRow();
    for (int k = 0; k <= mRow; ++k) {
      mS.next();
    }
  }

  /**
   * Computes an element of the resulting triangle.
   * <code>addRow()</code> has made sure that rows <code>n</code> of both source triangles are completely filled.
   * @param n row number
   * @param k column number
   * @return <code>T(n,k) = (Identity(n,k) - sum(S(n,j) * T(j,k), j=0..n-1)) / S(n,k)</code>,
   * or <code>null</code> if the Triangle is not invertible.
   */
  @Override
  protected Z compute(final int n, final int k) {
    Z result = Z.ZERO;
    for (int j = 0; j < n; ++j) {
      result = result.add(mS.get(n, j).multiply(get(j, k)));
    }
  /*
    System.out.println("---- S ----");
    for (int j = 0; j <= n; ++j) {
      mS.printRow(j);
    }
    System.out.println("---- T ----");
    for (int j = 0; j <= n; ++j) {
      this.printRow(j);
    }
    System.out.println("---- result=" + result + ", S(" + n + ", " + k + ")=" + mS.get(n, k));
  */
    final Z[] fraction = (n == k ? Z.ONE : Z.ZERO).subtract(result).divideAndRemainder(mS.get(n, n));
    return fraction[1].isZero() ? fraction[0] : null;
  }

  /**
   * Main test method: compute the matrix product of two triangles
   * @param args command line arguments:
   * <ul>
   * <li>-a A-number of source triangle</li>
   * <li>-n number of terms (default 32)</li>
   * <li>-o offset, first index (default 0) </li>
   * </ul>
   */
  public static void main(final String[] args) {
    int debug = 0;
    String aSeqNos = "A124733";
    int offset = 0;
    int noTerms = 32;
    int iarg = 0;
    while (iarg < args.length) { // consume all arguments
      final String opt = args[iarg++];
      try {
        if (opt.equals("-d")) {
          debug = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-a")) {
          aSeqNos = args[iarg++];
        } else if (opt.equals("-n")) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-o")) {
          offset = Integer.parseInt(args[iarg++]);
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } catch (final Exception exc) { // take default
        System.err.println("wrong option: " + args[iarg - 1] + ", message: " + exc.getMessage());
      }
    }

    Sequence[] ans = ConvolutionProduct.toArray(aSeqNos);
    Inverse ti = new Inverse(offset, ans[0]);
    for (int iterm = 0; iterm < noTerms; ++iterm) {
      if (iterm > 0) {
        System.out.print(",");
      }
      System.out.print(ti.next());
    }
    System.out.println();
    ans = ConvolutionProduct.toArray(aSeqNos);
    ti = new Inverse(offset, ans[0]);
    int iterm = 0;
    int n = 0;
    while (iterm < noTerms) {
      for (int k = 0; k <= n; ++k) {
        if (k > 0) {
          System.out.print(", ");
        }
        System.out.print(ti.next());
        ++iterm;
      }
      System.out.println();
      ++n;
    }
  }
}
