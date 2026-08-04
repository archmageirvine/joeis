package irvine.oeis.triangle;

import irvine.math.api.RationalSequence;
import irvine.math.q.Q;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceFactory;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * Compute the inverse of a rational triangle: S * T = Identity.
 * The target elements are generated row by row,
 * @author Georg Fischer
 */
public class RationalInverse extends RationalTriangle {

  protected RationalTriangle mS; // source triangle

  /**
   * Constructor with offset and a RationalTriangle.
   * @param offset first index of target triangle
   * @param s sequence for source triangle
   */
  public RationalInverse(final int offset, final RationalTriangle s) {
    super(offset);
    mS = s;
  }

  /**
   * Constructor with offset and a Triangle.
   * @param offset first index of target triangle
   * @param s sequence for source triangle
   */
  public RationalInverse(final int offset, final Triangle s) {
    super(offset);
    mS = RationalTriangle.asRationalTriangle(s);
  }

  /**
   * Constructor with offset and a Sequence.
   * @param offset first index of target triangle
   * @param s sequence for source triangle
   */
  public RationalInverse(final int offset, final Sequence s) {
    super(offset);
    mS = RationalTriangle.asRationalTriangle(s);
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
   * or <code>null</code> if the RationalTriangle is not invertible.
   */
  @Override
  protected Q compute(final int n, final int k) {
    Q result = Q.ZERO;
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
    final Q fraction = (n == k ? Q.ONE : Q.ZERO).subtract(result).divide(mS.get(n, n));
    return fraction;
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
        if ("-d".equals(opt)) {
          debug = Integer.parseInt(args[iarg++]);
        } else if ("-a".equals(opt)) {
          aSeqNos = args[iarg++];
        } else if ("-n".equals(opt)) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if ("-o".equals(opt)) {
          offset = Integer.parseInt(args[iarg++]);
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } catch (final Exception exc) { // take default
        System.err.println("wrong option: " + args[iarg - 1] + ", message: " + exc.getMessage());
      }
    }

    Sequence[] ans = ConvolutionProduct.toArray(aSeqNos);
    SequenceFactory.printTerms(new RationalInverse(offset, ans[0]), noTerms);
    ans = ConvolutionProduct.toArray(aSeqNos);
    final RationalSequence ti = new RationalInverse(offset, ans[0]);
    int iterm = 0;
    int n = 0;
    while (iterm < noTerms) {
      for (int k = 0; k <= n; ++k) {
        if (k > 0) {
          System.out.print(", ");
        }
        System.out.print(ti.nextQ());
        ++iterm;
      }
      System.out.println();
      ++n;
    }
  }
}
