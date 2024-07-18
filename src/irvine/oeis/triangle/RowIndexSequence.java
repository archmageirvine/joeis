package irvine.oeis.triangle;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * For an underlying source triangle or array, the target sequence gives the row indexes of n in the source.
 * Apllied to dispersion arrays this gives a fractal sequence.
 * @author Georg Fischer
 */
public class RowIndexSequence extends AbstractSequence {

  private int mRow; // current row index n
  private int mCol; // current column index k
  private final int mRow0; // first row index
  private final int mCol0; // first columns index 
  private int mDir; // direction: +1 = ascending, -1 = descending
  private final Sequence mSeq; // the underlying sequence s
  private final HashMap<String, Z> mCache; // cache for terms that have a row index that is alredy known
  private int mN; // current index
  protected static boolean sDebug = "true".equals(System.getProperty("oeis.verbose"));

  /**
   * Constructor with offset, sequence, default corner (1,1) and direction (-1 = descending)
   * @param offset first index 
   * @param seq underlying sequence
   */
  public RowIndexSequence(final int offset, final Sequence seq) {
    this(offset, 1, 1, -1, seq);
  }

  /**
   * Constructor with corner indices and direction-
   * @param offset first index of the resulting sequence
   * @param row0 first row index
   * @param col0 first column index
   * @param dir direction: +1 = ascending, -1 = descending
   * @param seq underlying sequence
   */
  public RowIndexSequence(final int offset, final int row0, final int col0, final int dir, final Sequence seq) {
    super(offset); 
    mN = offset - 1;
    mRow0 = row0;
    mCol0 = col0;
    mDir = dir;
    mSeq = seq;
    mCache = new HashMap<>(64);
    mRow = 0; // compute 0-based; modify with corner only in result of next()
    mCol = 0;
  }

  @Override
  public Z next() {
    ++mN;
    Z result = mCache.get(String.valueOf(mN));
//* if (sDebug) {
//*   System.out.println("mN=" + mN + ", mCache.get=" + result);
//* }
    if (result == null) { // not yet in cache
      boolean busy = true;
      while (busy) {
        final Z term = mSeq.next();
//*     if (sDebug) {
//*       System.out.println("  mN=" + mN + ", mRow=" + mRow + ", mCol=" + mCol + ", term=" + term);
//*     }
        result = Z.valueOf(mDir < 0 
            ? mCol + mRow0
            : mRow + mRow0
            );
        if (term.subtract(Z.valueOf(mN)).isZero()) {
          busy = false;
        }
        mCache.put(String.valueOf(term), result); // remember it
//*     if (sDebug) {
//*       System.out.println("    mCache.put(" + String.valueOf(term) + "," + result + ") = " + mCache.get(String.valueOf(term)));
//*     }
        ++mCol;
        if (mCol > mRow) {
          mCol = 0;
          ++mRow;
        }
      }
    }
    return result;
  }

  /**
   * Main test method
   * @param args command line arguments:
   * <ul>
   * <li>-a A-number of the underlying triangle or arrays</li>
   * <li>-n number of terms (default 32)</li>
   * <li>-o offset, first index (default 1) </li>
   * </ul>
   */
  public static void main(final String[] args) {
    int debug = 0;
    String aSeqNo = "A248513"; // yields A248514
    int offset = 1;
    int noTerms = 32;
    int iarg = 0;
    while (iarg < args.length) { // consume all arguments
      final String opt = args[iarg++];
      try {
        if (opt.equals("-d")) {
          debug = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-a")) {
          aSeqNo = args[iarg++];
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

    final Sequence seq;
    try {
      seq = (Sequence) Class.forName("irvine.oeis.a" + aSeqNo.substring(1, 4) + '.' + aSeqNo).getDeclaredConstructor().newInstance();
    } catch (final Exception exc) {
      throw new UnsupportedOperationException("invalid A-number: " + aSeqNo);
    }

    final RowIndexSequence ris = new RowIndexSequence(offset, seq);
    ris.sDebug = debug > 0;
    for (int iterm = 0; iterm < noTerms; ++iterm) {
      if (iterm > 0) {
        System.out.print(",");
      }
      System.out.print(ris.next());
    }
    System.out.println();
  }
}
