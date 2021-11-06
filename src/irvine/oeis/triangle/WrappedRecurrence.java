package irvine.oeis.triangle;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * Generate the rows of a triangle <code>T(n,k)</code> depending on
 * the left and right border, and the terms in the previous rows.
 * This generalizes the rules for Pascal's triangle (A007318):
 * <code>T(n,0)</code> = <code>T(n,n)</code> = 1 and <code>T(n,k) = T(n-1,k-1) + T(n-1,k)</code> for <code>0 &lt; k &lt; n</code>.
 * @author Georg Fischer
 */
public class WrappedRecurrence extends Triangle {

  protected Sequence mSeqLeft; // sequence for the left border <code>T(n,0)</code>
  protected Sequence mSeqRight; // sequence for the right border <code>T(n,n)</code>; this overwrites <code>T(0,0)</code>; <code>null</code> if the right border is the same as the left border
  protected Sequence mSeqPlus; // a(n) of this optional sequence may be used to compute T(n,k) for 0 &lt; k &lt; n.
  protected Z mPlus; // term of mSeqPlus, additive constant per row

  /**
   * A simple version of <code>PaddingSequence</code>:
   * Return a few terms and repeat the last one forever.
   */
  protected static class BorderSequence implements Sequence {

    private final Z[] mTerms;
    private int mN;
    private final int mLen;

    /** Construct the sequence. */
    protected BorderSequence(final String terms) {
      mTerms = ZUtils.toZ(terms);
      mLen = mTerms.length - 1;
      mN = -1;
    }

    @Override
    public Z next() {
      if (mN < mLen) {
        ++mN;
      }
      return mTerms[mN];
    }
  }

  /**
   * Empty constructor.
   * Generates an ordinary Pascal triangle with borders 1.
   */
  public WrappedRecurrence() {
    mSeqLeft = new BorderSequence("1");
    mSeqRight = null;
    initialize();
  }

  /**
   * Triangle with the same sequence for both borders.
   * @param seqLeft sequence for both borders <code>T(n,0)</code>
   */
  public WrappedRecurrence(final Sequence seqLeft) {
    mSeqLeft = seqLeft;
    mSeqRight = null;
    initialize();
  }

  /**
   * Triangle with a value for both borders.
   * @param constLeft constant for both borders <code>T(n,0)</code> and <code>T(n,n)</code>
   */
  public WrappedRecurrence(final String constLeft) {
    mSeqLeft = new BorderSequence(constLeft);
    mSeqRight = null;
    initialize();
  }

  /**
   * Triangle with two sequences for the borders.
   * @param seqLeft sequence for the left border <code>T(n,0)</code>
   * @param seqRight sequence for the right border <code>T(n,n)</code>; this overwrites <code>T(0,0)</code>
   */
  public WrappedRecurrence(final Sequence seqLeft, final Sequence seqRight) {
    mSeqLeft = seqLeft;
    mSeqRight = seqRight;
    initialize();
  }

  /**
   * Triangle with a sequence and a value for the borders.
   * @param seqLeft sequence for the left border <code>T(n,0)</code>
   * @param constRight constant right border <code>T(n,n)</code>; this overwrites <code>T(0,0)</code>;
   */
  public WrappedRecurrence(final Sequence seqLeft, final String constRight) {
    mSeqLeft = seqLeft;
    mSeqRight = new BorderSequence(constRight);
    initialize();
  }

  /**
   * Triangle with a value and a sequence for the borders.
   * @param constLeft constant left border <code>T(n,0)</code>
   * @param seqRight sequence for the right border <code>T(n,n)</code>; this overwrites <code>T(0,0)</code>
   */
  public WrappedRecurrence(final String constLeft, final Sequence seqRight) {
    mSeqLeft = new BorderSequence(constLeft);
    mSeqRight = seqRight;
    initialize();
  }

  /**
   * Triangle with two values for the borders.
   * @param constLeft constant left border <code>T(n,0)</code>
   * @param constRight constant right border <code>T(n,n)</code>; this overwrites <code>T(0,0)</code>
   */
  public WrappedRecurrence(final String constLeft, final String constRight) {
    mSeqLeft = new BorderSequence(constLeft);
    mSeqRight = new BorderSequence(constRight);
    initialize();
  }

  /**
   * Initializes the data structure.
   * Collects the code that is common to all constructors.
   * Assumes that there is no additional term.
   */
  protected void initialize() {
    mSeqPlus = null;
    mPlus = Z.ZERO;  // for safety
  }

  /**
   * Sets the sequence for the additive term
   * @param terms the constant value to be added to each element.
   */
  protected void setPlus(final String terms) {
    mSeqPlus = new BorderSequence(terms);
  }

  /**
   * Sets the sequence for the additive term
   * @param seqPlus sequence that returns the constant value to be added to each element.
   */
  protected void setPlus(final Sequence seqPlus) {
    mSeqPlus = seqPlus;
  }

  /**
   * Gets the additive term from <code>mSeqPlus</code> for the current row
   * @return plus
   */
  protected Z getPlus() {
    return mPlus;
  }

  /**
   * Advances the sequence for the leftmost column.
   * @param skip number of elements to skip
   */
  protected void skipLeft(int skip) {
    while (skip > 0) {
      mSeqLeft.next();
      --skip;
    }
  }

  /**
   * Advances the sequence for the rightmost column.
   * @param skip number of elements to skip
   */
  protected void skipRight(int skip) {
    if (mSeqRight != null) {
      while (skip > 0) {
        mSeqRight.next();
        --skip;
      }
    }
  }

  /**
   * Advances the sequence for the additive term.
   * @param skip number of elements to skip
   */
  protected void skipPlus(int skip) {
    while (skip > 0) {
      mSeqPlus.next();
      --skip;
    }
  }

  /**
   * Increases the row index, adds a new, empty row and resets the column index.
   */
  protected void addRow() {
    super.addRow();
    final Z leftTerm = mSeqLeft.next();
    set(0, leftTerm);
    set(mRow, mSeqRight == null ? leftTerm : mSeqRight.next());
    if (mSeqPlus != null && mRow >= 2) {
      mPlus = mSeqPlus.next();
    }
  }

  /**
   * Computes an element of the triangle.
   * The default implementation here is Pascal's rule.
   * @param n row number
   * @param k column number
   * @return <code>T(n,k)</code>
   */
  @Override
  protected Z compute(final int n, final int k) {
    Z result;
    if (k < 0 || k > n) { // outside, for safety only
      result = Z.ZERO;
    } else if (k == 0 || k == n) { 
      result = get(n, k); // borders were already set in addRow
    } else {
      result = get(n - 1, k - 1).add(get(n - 1, k)); // Pascal's rule
      if (mSeqPlus != null) {
        result = result.add(mPlus);
      }
    }
    return result;
  }

  /*
   * Main method: debugging output of a triangle.
   * @param args command line arguments:
   * <ul>
   * <li>left constant or sequence</li>
   * <li>right constant or sequence</li>
   * <li>additional constant or sequence (optional)</li>
   * <li>number of rows to be printed (optional)</li>
   * </ul>
   */
/*
  public static void main(String[] args) {
    Sequence seqLeft = null;
    Sequence seqRight = null;
    Sequence seqPlus = null;
    String constLeft = "1";
    String constRight = "1";
    String valPlus = null;
    int noRows = 8;
    for (int iarg = 0; iarg < args.length; ++iarg) {
      switch (iarg) {
        default:
        case 0:
          constLeft = args[iarg];
          break;
        case 1:
          constRight = args[iarg];
          break;
        case 2:
          valPlus = args[iarg];
          break;
        case 3:
          try {
            noRows = Integer.parseInt(args[iarg]);
          } catch (Exception exc) { // take default
          }
          break;
      }
    }
    WrappedRecurrence wtr = null;
    if (constLeft.startsWith("A")) {
      seqLeft = irvine.test.SequenceTest.sequence(constLeft);
      if (constRight.startsWith("A")) {
        seqRight = irvine.test.SequenceTest.sequence(constRight);
        wtr = new WrappedRecurrence(seqLeft, seqRight);
      } else {
        wtr = new WrappedRecurrence(seqLeft, constRight);
      }
    } else {
      if (constRight.startsWith("A")) {
        seqRight = irvine.test.SequenceTest.sequence(constRight);
        wtr = new WrappedRecurrence(constLeft, seqRight);
      } else {
        wtr = new WrappedRecurrence(constLeft, constRight);
      }
    }
    if (valPlus != null) {
      if (valPlus.startsWith("A")) {
        seqPlus = irvine.test.SequenceTest.sequence(constLeft);
        wtr.setPlus(seqPlus);
      } else {
        wtr.setPlus(valPlus);
      }
    }
    for (int n = 0; n < noRows; ++n) {
      for (int k = 0; k <= n; ++k) {
        final Z term = wtr.next();
      }
      wtr.printRow(n);
    }
  }
*/
}
