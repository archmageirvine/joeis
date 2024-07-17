package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * Multiply a triangle and a column vector: <code>T = S1 * V2</code>.
 * @author Georg Fischer
 */
public class VectorProduct extends Triangle {

  protected Triangle mS1; // left source multiplicant
  protected MemorySequence mV2; // right source multiplicant

  /**
   * Constructor with offset, a Triangle and a Sequence.
   * @param offset first index of target triangle
   * @param s1 sequence for left triangle
   * @param v2 sequence for right vector
   */
  public VectorProduct(final int offset, final Triangle s1, final Sequence v2) {
    super(offset);
    mS1 = s1;
    mV2 = MemorySequence.cachedSequence(v2);
  }

  /**
   * Constructor with offset and two sequences.
   * @param offset first index of target triangle
   * @param s1 sequence for left triangle
   * @param v2 sequence for right vector
   */
  public VectorProduct(final int offset, final Sequence s1, final Sequence v2) {
    this(offset, Triangle.asTriangle(s1), v2);
  }

  /**
   * Computes an element of the resulting triangle.
   * Make sure that row <code>n</code> of the source triangle is completely filled.
   * @return the next term of the sequence
   */
  @Override
  protected Z compute(final int n, final int k) {
    return mS1.get(n, k).multiply(mV2.a(k));
  }

  /**
   * Main test method: compute the matrix product of a triangle and a vector
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
    VectorProduct tp = new VectorProduct(offset, ans[0], ans[1]);
    for (int iterm = 0; iterm < noTerms; ++iterm) {
      if (iterm > 0) {
        System.out.print(",");
      }
      System.out.print(tp.next());
    }
    System.out.println();
    ans = ConvolutionProduct.toArray(aSeqNos);
    tp = new VectorProduct(offset, ans[0], ans[1]);
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
