package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * Multiply two triangles: <code>T = S1 * S2</code>.
 * The target elements are generated row by row,
 * where <code>T(n,k) = row(S1,n) * column(S2,k)</code>.
 * The offset of the target triangle defaults to 0.
 * @author Georg Fischer
 */
public class Product extends Triangle {

  protected Triangle mS1; // left source multiplicant
  protected Triangle mS2; // right source multiplicant

  /**
   * Constructor with offset and two triangles.
   * @param offset first index of target triangle
   * @param s1 sequence for left triangle
   * @param s2 sequence for right triangle
   */
  public Product(final int offset, final Triangle s1, final Triangle s2) {
    super(offset);
    mS1 = s1;
    mS2 = s2;
  }

  /**
   * Constructor with two triangles.
   * @param s1 sequence for left triangle
   * @param s2 sequence for right triangle
   */
  public Product(final Triangle s1, final Triangle s2) {
    this(0, s1, s2);
  }

  /**
   * Constructor with offset, a Triangle and a Sequence.
   * @param offset first index of target triangle
   * @param s1 sequence for left triangle
   * @param s2 sequence for right triangle
   */
  public Product(final int offset, final Triangle s1, final Sequence s2) {
    this(offset, s1, Triangle.asTriangle(s2));
  }

  /**
   * Constructor with a Triangle and a Sequence.
   * @param s1 sequence for left triangle
   * @param s2 sequence for right triangle
   */
  public Product(final Triangle s1, final Sequence s2) {
    this(0, s1, Triangle.asTriangle(s2));
  }

  /**
   * Constructor with offset, a Sequence and a Triangle.
   * @param offset first index of target triangle
   * @param s1 sequence for left triangle
   * @param s2 sequence for right triangle
   */
  public Product(final int offset, final Sequence s1, final Triangle s2) {
    this(offset, Triangle.asTriangle(s1), s2);
  }

  /**
   * Constructor with a Sequence and a Triangle.
   * @param s1 sequence for left triangle
   * @param s2 sequence for right triangle
   */
  public Product(final Sequence s1, final Triangle s2) {
    this(0, Triangle.asTriangle(s1), s2);
  }

  /**
   * Constructor with offset and two Sequences.
   * @param offset first index of target triangle
   * @param s1 sequence for left triangle
   * @param s2 sequence for right triangle
   */
  public Product(final int offset, final Sequence s1, final Sequence s2) {
    this(offset, Triangle.asTriangle(s1), Triangle.asTriangle(s2));
  }

  /**
   * Constructor with two Sequences.
   * @param s1 sequence for left triangle
   * @param s2 sequence for right triangle
   */
  public Product(final Sequence s1, final Sequence s2) {
    this(0, Triangle.asTriangle(s1), Triangle.asTriangle(s2));
  }

  /**
   * Increases <code>mRow</code>, adds a new, empty target row, resets the column index,
   * and advances both source sequences such that their <code>mRow</code> is completely filled.
   */
  protected void addRow() {
    super.addRow();
    for (int k = 0; k <= mRow; ++k) {
      mS1.next();
      mS2.next();
    }
  }

  /**
   * Computes an element of the resulting triangle.
   * <code>addRow()</code> has made sure that rows <code>n</code> of both source triangles are completely filled.
   * @param n row number
   * @param k column number
   * @return <code>T(n,k) = sum(S1(n,j) * S2(j,k), j=0..n)</code>
   */
  @Override
  protected Z compute(final int n, final int k) {
    Z result = Z.ZERO;
    for (int j = 0; j <= n; ++j) {
      result = result.add(mS1.get(n, j).multiply(mS2.get(j, k)));
    }
    return result;
  }

  /**
   * Main test method: compute the matrix product of two triangles
   * @param args command line arguments:
   * <ul>
   * <li>-a pair of A-numbers</li>
   * <li>-n number of terms (default 32)</li>
   * <li>-o offset, first index (default 0) </li>
   * </ul>
   */
  public static void main(final String[] args) {
    int debug = 0;
    String aSeqNos = "A177990 * A070909";
    int offset = 0;
    int noTerms = 32;
    int iarg = 0;
    while (iarg < args.length) { // consume all arguments
      final String opt = args[iarg++];
      try {
        if ("-d".equals(opt)) {
          debug = Integer.parseInt(args[iarg++]);
        } else if ("-a".equals(opt)) {
          aSeqNos = args[iarg++].replaceAll("[^A0-9\\-]+", ","); // allow for "A000012 * A000027" etc.
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
    Product tp = new Product(offset, ans[0], ans[1]);
    for (int iterm = 0; iterm < noTerms; ++iterm) {
      if (iterm > 0) {
        System.out.print(',');
      }
      System.out.print(tp.next());
    }
    System.out.println();
    ans = ConvolutionProduct.toArray(aSeqNos);
    tp = new Product(offset, ans[0], ans[1]);
    int iterm = 0;
    int n = 0;
    while (iterm < noTerms) {
      for (int k = 0; k <= n; ++k) {
        if (k > 0) {
          System.out.print(", ");
        }
        System.out.print(tp.next());
        ++iterm;
      }
      System.out.println();
      ++n;
    }
  }
}
