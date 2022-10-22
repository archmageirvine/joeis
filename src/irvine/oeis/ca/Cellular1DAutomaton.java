package irvine.oeis.ca;

import java.util.Iterator;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Data structure and methods for the evaluation of an elementary, one-dimensional cellular automaton
 * with a fixed rule number between 0 and 255,
 * as described by Stephen Wolfram in the book "A New Kind Of Science" (ANKOS).
 * The computation of new generations proceeds in so-called <em>blocks</em>, that are bit arrays of size <code>BLOCK_LEN</code>,
 * stored in integer arrays.
 * For each new generation, the automaton scans over the row with the old blocks, and computes
 * the new row of new blocks. Thereafter, both rows are exchanged,
 * The rows grow by one bit on each side. If the arrays become too small, they are expanded.
 * @author Georg Fischer
 */
public class Cellular1DAutomaton extends AbstractSequence {

  /** Allocate rows in multiples of this number */
  protected static final int CHUNK_SIZE = 256;
  /** The bit length of the blocks that are computed respectively retrieved from the table. */
  protected static final int BLOCK_LEN = 27;
  /** The mask for all bits in a block. */
  protected int mBlockMask;
  /** The mask for the highest bit in a block. */
  protected int mHighMask;
  /** The mask for the lowest bit in a block. */
  protected int mLowMask;
  /** The mask for the bit in the center of the row. */
  protected int mCenterMask;
  /** Shift the center bit by so many positions. */
  protected int mCenterShift;
  /** Rule number 0..255, cf. ANKOS p. 53 */
  protected int mRule;
  /**
   * Number of the generation; <code>mGen</code> = 0 starts with a single BLACK cell
   * in the lowest bit position of <code>mOldRow[mCenter]</code>
   */
  protected int mGen;

  /** Debugging mode: 0=none, 1=some, 2=more. */
  static int sDebug;
  /** Buffer for the bits of generation n */
  protected int[] mOldRow;
  /** Buffer for the bits of generation n+1 */
  protected int[] mNewRow;
  /** Old block to be processed */
  protected int mOldBlock;
  /** Length of the two rows. */
  protected int mRowLen; //
  /** Index of the block that has the center of the triangle in its lowest bit position */
  protected int mCenter; //
  /** Cell values for the rest of the row to the left and to the right of the triangle */
  protected int mBackground; //

  /** Iterator for current row */
  protected RowIterator mIter;
  /** Summation term for several subtypes of sequences */
  protected Z mSum;
  /** Count of BLACK/ON cells in current row */
  protected int mBlackCount;

  /**
   * Creates a sequence derived from the cellular automaton with the given rule
   * and seed 1 (a single ON/BLACK cell).
   * @param rule rule number for this automaton (0-255).
   */
  public Cellular1DAutomaton(final int rule) {
    this(0, rule, 1);
  }

  /**
   * Creates a sequence derived from the cellular automaton with the given rule.
   * @param rule rule number for this automaton (0-255).
   * @param seed start value, the 1-bits define the initial ON/BLACK cells.
   * A value &gt; 1 works for even rules only and must not have more bits than <code>BLOCK_LEN</code>.
   * It is only used in and tested with A048711-14. 
   
   */
  public Cellular1DAutomaton(final int rule, final int seed) {
    this(0, rule, seed);
  }

  /**
   * Creates a sequence derived from the cellular automaton with the given rule.
   * @param offset first index
   * @param rule rule number for this automaton (0-255).
   * @param seed start value, the 1-bits define the initial ON/BLACK cells.
   * A value &gt; 1 works for even rules only and must not have more bits than <code>BLOCK_LEN</code>.
   * It is only used in and tested with A048711-14. 
   
   */
  public Cellular1DAutomaton(final int offset, final int rule, final int seed) {
    super(offset);
    mBlockMask = (1 << BLOCK_LEN) - 1;
    mLowMask = 1;
    mHighMask = 1 << (BLOCK_LEN - 1);
    mCenterShift = (BLOCK_LEN - 1) / 2;
    mCenterMask = 1 << mCenterShift; // in the middle of the center block
    mGen = 0;
    if (seed > 1) {
      mGen = Integer.highestOneBit(seed) / 2;
    }
    mRule = rule;
    mRowLen = CHUNK_SIZE;
    mOldRow = new int[mRowLen]; // preset to zeroes
    mNewRow = new int[mRowLen];
    mCenter = mRowLen / 2 - 1; // this is the contract; left half in 0..31, right half in 32..63
    mOldRow[mCenter] = seed << (mCenterShift - (Integer.highestOneBit(seed) / 2)); // start with the seed (1 for a single BLACK/ON cell)
    mOldBlock = mOldRow[mCenter];
    mBackground = 0x0; // start with 00...0 to the left and to the right of the triangle
    mSum = Z.ZERO;
    mBlackCount = 1;
    mIter = new RowIterator();
  }

  /**
   * Set the debugging level.
   * @param level code for the debugging level: 0 = none, 1 = some, 2 = more.
   */
  public static void setDebug(final int level) {
    sDebug = level;
  }

  /**
   * Iterator over all cells in a row of the triangle.
   * The iterator scans over {@link #mOldRow} and returns bit positions,
   * while it maintains the current block {@link #mOldBlock}.
   * The iterator also extends the rows if necessary
   */
  protected class RowIterator implements Iterator<Integer> {
    /** Index of the current block in <code>mOldRow</code>*/
    protected int mIndex;
    /** Index of the first block behind the triangle in <code>mOldRow</code>*/
    protected int mEndIndex;
    /*
     * Position of the current cell in <code>mOldRow[index]</code>.
     * In <code>mOldRow[start]</code>, bitPos addresses the leftmost (first) cell belonging to the triangle.
     * In <code>mOldRow[last]</code>, <code>BLOCK_LEN - bitPos - 1</code> addresses the first cell <em>behind</em> the triangle.
     */
    protected int mBitPos;
    /** Number of cells processed so far (starting with 0). */
    protected int mCount;
    /** Number of cells belonging to the triangle in the current row. */
    protected int mEndCount;

    /**
     * Construct the iterator that runs over all cells in all blocks belonging or adjacent to the triangle.
     * Set the starting and ending indices and bit positions.
     * Maintain <code>mOldBlock</code> and the count of cells already processed.
     */
    protected RowIterator() {
      mCount = 0;
      mEndCount = 2 * mGen + 1;
      mBitPos = (mGen + (BLOCK_LEN - 1) / 2) % BLOCK_LEN;
      final int dist = (mGen + mCenterShift) / BLOCK_LEN;
      mIndex = mCenter - dist; // first block covered by the triangle
      if (mIndex <= 2) { // too close to the arrays' limit - expand them
        expandRows();
        mIndex = mCenter - dist;
      }
      mEndIndex = mCenter + dist + 1; // behind last block covered by the triangle
      mOldBlock = mOldRow[mIndex];
//      if (sDebug > 0) {
//        System.out.println("--------");
//        System.out.println("#   new RowIterator()"
//            + ", mGen="      + mGen
//            + ", dist="      + dist
//            + ", index="     + index
//            + ", endIndex="  + endIndex
//            + ", mOldBlock=" + Integer.toBinaryString(mOldBlock)
//            + ", bitPos="    + bitPos
//            + ", count="     + count
//            + ", endCount="  + endCount
//            );
//      }
    }

    /**
     * Get the index of the block behind the last block covered by triangle.
     * @return {@link #mEndIndex}
     */
    protected int getEndIndex() {
      return mEndIndex;
    }

    /**
     * Test whether there is a next cell in the row.
     * @return true (false) if there is (no) next cell.
     */
    public boolean hasNext() {
      return mCount < mEndCount;
    }

    /**
     * Get the bit position of the next cell in <code>mOldBlock</code>.
     * @return a position between 0 and <code>BLOCK_LEN - 1</code>.
     */
    public Integer next() {
      if (mBitPos < 0) {
        ++mIndex;
        mOldBlock = mOldRow[mIndex];
        mBitPos = BLOCK_LEN - 1;
      }
      final int result = mBitPos;
      --mBitPos;
      ++mCount;
      return result;
    }

    /**
     * Test whether there is a next block in the row.
     * @return true (false) if there is (no) next block.
     */
    public boolean hasNextBlock() {
      return mIndex < mEndIndex;
    }

    /**
     * Get the bit position of the next cell in <code>mOldBlock</code>.
     * @return a position between 0 and <code>BLOCK_LEN - 1</code>.
     */
    public Integer nextBlockIndex() {
      return mIndex++;
    }

    /**
     * Expand both rows by <code>CHUNK_SIZE</code>,
     * shift the contents of the old row up, and re-adjusts the center.
     * This method is called only when the old row is nearly completely filled.
     */
    private void expandRows() {
      final int newLen = mRowLen + CHUNK_SIZE;
      mNewRow = new int[newLen];
      System.arraycopy(mOldRow, 0, mNewRow, CHUNK_SIZE / 2, mRowLen); // first from [0..63] to [32..95]
      mRowLen = newLen;
      mOldRow = mNewRow; // exchange both rows
      mNewRow = new int[newLen];
      mCenter = mRowLen / 2 - 1; // contract
    }

    /**
     * Get the current index
     * @return <code>mOldRow[index]</code>}.
     */
    protected int getIndex() {
      return mIndex;
    }

    /**
     * Get the number of cells in the row, + 1
     * @return <code>endCount</code>}.
     */
    protected int getEndCount() {
      return mEndCount;
    }

    /**
     * Get the current bit position
     * @return <code>bitPos</code>}.
     */
    protected int getBitPosition() {
      return mBitPos;
    }
  }

  /**
   * Return the current row as a binary String encoded with decimal digits 0, 1.
   * @return "11001" for example.
   */
  public String toBinaryString() {
    final StringBuilder sb = new StringBuilder(1024);
    final RowIterator riter = new RowIterator();
    while (riter.hasNext()) {
      final int bitPos = riter.next();
      sb.append(((mOldBlock & (1 << bitPos)) == 0) ? '0' : '1');
    }
    return sb.toString();
  }
  /**
   * Compute the next generation for a block (an array of cells).
   * @param oldBlock some number of cells, highest bit is leftmost cell.
   * @param leftBit the bit to the left of the old block
   * @param rightBit the bit to the right of the old block
   * @return the new block
   */
  protected int transformBlock(final int oldBlock, final int leftBit, final int rightBit) {
    int wrappedBlock = ((oldBlock | (leftBit << BLOCK_LEN)) << 1) | rightBit; // attach boundary bits at both ends
    int newBlock = 0;
    int itar = 0; // fill to BLOCK_LEN - 1
    for (int isrc = 0; isrc < BLOCK_LEN; ++isrc) { // from left to right
      final int key3 = wrappedBlock & 7; // lowest 3 bits, values 0..7
      final int tarBit = ((mRule & (1 << key3)) != 0) ? 1 : 0;
      mBlackCount += tarBit;
      newBlock |= tarBit << itar;
//      if (sDebug >= 2) {
//        System.out.println("#     transformBlock("
//            + Integer.toBinaryString(oldBlock)
//            + ", " + Integer.toBinaryString(leftBit)
//            + ", " + Integer.toBinaryString(rightBit) + ")"
//            + ", isrc="         + isrc
//            + ", itar="         + itar
//            + ", wrappedBlock=" + Integer.toBinaryString(wrappedBlock)
//            + ", tarBit="       + Integer.toBinaryString(tarBit)
//            + ", newBlock="     + Integer.toBinaryString(newBlock)
//            );
//      }
      wrappedBlock >>= 1;
      ++itar;
    }
//    if (sDebug >= 1) {
//        System.out.println("#     transformBlock("
//            + Integer.toBinaryString(oldBlock)
//            + ", " + Integer.toBinaryString(leftBit)
//            + ", " + Integer.toBinaryString(rightBit) + ")"
//            + " -> newBlock=" + Integer.toBinaryString(newBlock)
//            );
//    }
    return newBlock;
  }

  /**
   * Computes the new row of the next generation from the old row.
   */
  public void computeNextRow() {
    ++mGen;
    mBlackCount = 0;
    final RowIterator riter = new RowIterator(); // determine the indices at both ends
    final int index = riter.getIndex();
    final int endIndex = riter.getEndIndex();
    mOldRow[index - 1] = mBackground;
    mOldRow[endIndex] = mBackground;
//    if (sDebug >= 1) {
//      System.out.print("# old row @" + (index - 1) + ": ");
//      for (int irow = index - 1; irow <= endIndex; ++irow) {
//        System.out.print(" "  + String.format("%" + BLOCK_LEN + "s", Integer.toBinaryString(mOldRow[irow])).replace(' ', '0'));
//      }
//      System.out.println();
//    }
    while (riter.hasNextBlock()) {
      final int irow = riter.nextBlockIndex();
      final int leftBit = mOldRow[irow - 1] & mLowMask;
      final int rightBit = (mOldRow[irow + 1] & mHighMask) >> (BLOCK_LEN - 1);
      final int newBlock = transformBlock(mOldRow[irow], leftBit, rightBit);
//      if (sDebug >= 1) {
//          System.out.println("#   computeNextRow.loop"
//              + ", irow="    + irow
//              + ", oldBlock="  + Integer.toBinaryString(mOldRow[irow])
//              + ", leftBit="   + Integer.toBinaryString(leftBit)
//              + ", rightBit="  + Integer.toBinaryString(rightBit)
//              + " -> newBlock=" + Integer.toBinaryString(newBlock)
//              );
//      }
      mNewRow[irow] = newBlock;
    }
    if ((mRule & 0x1) == 1) { // odd rule
      if ((mRule & 0x80) == 0) { // odd, high bit 0: reverse the polarity
        mBackground ^= mBlockMask;
      } else { // odd, high bit 1: set 1
        mBackground |= mBlockMask;
      }
    }
    mOldRow = mNewRow;
    mOldRow[index - 1] = mBackground;
    mOldRow[endIndex] = mBackground;
//    if (sDebug >= 1) {
//      System.out.print("# new row @" + (index - 1) + ": ");
//      for (int irow = index - 1; irow <= endIndex; ++irow) {
//        System.out.print(" "  + String.format("%" + BLOCK_LEN + "s", Integer.toBinaryString(mOldRow[irow])).replace(' ', '0'));
//      }
//      System.out.println();
//    }
    mNewRow = new int[mRowLen];
  }

  /**
   * Get the number of ON/BLACK cells in the current row.
   * This method is the basis for the methods {@link #nextBlackCount}, {@link #nextBlackSum}, {@link #nextWhiteCount}, {@link #nextWhiteSum}.
   * @return 3 for generation 2 of rule 30 (11001).
   */
  public int getBlackCount() {
    final RowIterator riter = new RowIterator();
    int result = 0;
    while (riter.hasNext()) {
      final int bitPos = riter.next();
      if ((mOldBlock & (1 << bitPos)) != 0) {
        ++result;
      }
    }
    return result;
  }

  /**
   * Get the cell value in the middle of the row.
   * This method is the basis for the methods {@link #nextMiddle}, {@link #nextMiddleB}, {@link #nextMiddleD}.
   * @return 0 for generation 2 of rule 30 (11001).
   */
  public int getMiddle() {
    return (mOldRow[mCenter] & mCenterMask) >> mCenterShift;
  }

  /**
   * Get the next term of the sequence.
   * The default implementation here yields the single cell values (1 for ON/BLACK, 0 for OFF/WHITE) of the triangle row by row.
   * @return 0 or 1
   */
  @Override
  public Z next() {
    if (!mIter.hasNext()) {
      computeNextRow();
      mIter = new RowIterator();
    }
    final int bitPos = mIter.next();
    return ((mOldBlock & (1 << bitPos)) == 0) ? Z.ZERO : Z.ONE;
  }

  /**
   * Get the next term of the left half of each row (including the middle).
   * @return 0 or 1
   */
  public Z nextLeftHalf() {
    if (!mIter.hasNext()) {
      computeNextRow();
      mIter = new RowIterator();
      mIter.mEndCount = mGen + 1;
    }
    final int bitPos = mIter.next();
    return ((mOldBlock & (1 << bitPos)) == 0) ? Z.ZERO : Z.ONE;
  }

  /**
   * Get the next term of the right half of each row (including the middle).
   * @return 0 or 1
   */
  public Z nextRightHalf() {
    if (!mIter.hasNext()) {
      computeNextRow();
      mIter = new RowIterator();
      mIter.mCount = mGen;
      mIter.mIndex = mCenter;
      mIter.mBitPos = mCenterShift;
    }
    final int bitPos = mIter.next();
    return ((mOldBlock & (1 << bitPos)) == 0) ? Z.ZERO : Z.ONE;
  }

  /**
   * Get the next row as a binary number represented by decimal digits.
   * @return 11001 for generation 2 of rule 30.
   */
  public Z nextStageB() {
    mSum = new Z(toBinaryString(), 10); // read it as decimal
    computeNextRow();
    return mSum;
  }

  /**
   * Get the next row as a decimal number.
   * @return 25 for generation 2 of rule 30.
   */
  public Z nextStageD() {
    mSum = new Z(toBinaryString(), 2); // read it as binary
    computeNextRow();
    return mSum;
  }

  /**
   * Get the cell in the middle of the next row.
   * @return 0 for generation 2 of rule 30.
   */
  public Z nextMiddle() {
    mSum = Z.valueOf(getMiddle());
    computeNextRow();
    return mSum;
  }

  /**
   * Get the cell near the middle of the next row.
   * @param dist distance from the middle (negative for right), must be less than <code>BLOCK_LEN / 2</code>.
   * @return 0 for generation 2 of rule 30.
   */
  public Z nextMiddle(final int dist) {
    mSum = ((mOldRow[mCenter] & (dist < 0 ? (mCenterMask >> (-dist)) : (mCenterMask << dist))) != 0) ? Z.ONE : Z.ZERO;
    computeNextRow();
    return mSum;
  }

  /**
   * Get the center column of the triangle up to generation n as a binary number represented by decimal digits.
   * @return 110 for generation 2 of rule 30.
   */
  public Z nextMiddleB() {
    mSum = mSum.multiply(10).add(getMiddle());
    computeNextRow();
    return mSum;
  }

  /**
   * Get the center column of the triangle up to generation n as a decimal number.
   * @return 6 for generation 2 of rule 30.
   */
  public Z nextMiddleD() {
    mSum = mSum.shiftLeft(1).add(getMiddle());
    computeNextRow();
    return mSum;
  }

  /**
   * Get the number of ON/BLACK cells in the row.
   * @return 3 for generation 2 of rule 30 (11001).
   */
  public Z nextBlackCount() {
    mSum = Z.valueOf(getBlackCount());
    computeNextRow();
    return mSum;
  }

  /**
   * Get the partial sum of ON/BLACK cells up to row n.
   * @return 7 for generation 2 of rule 30 (1, 111, 11001).
   */
  public Z nextBlackSum() {
    mSum = mSum.add(getBlackCount());
    computeNextRow();
    return mSum;
  }

  /**
   * Get the number of OFF/WHITE cells in the current row.
   * @return 2 for generation 2 of rule 30 (11001).
   */
  public Z nextWhiteCount() {
    mSum = Z.valueOf(2L * mGen + 1).subtract(getBlackCount());
    computeNextRow();
    return mSum;
  }

  /**
   * Get the partial sum of OFF/WHITE cells up to row n.
   * @return 2 for generation 2 of rule 30 (1, 111, 11001).
   */
  public Z nextWhiteSum() {
    mSum = mSum.add(Z.valueOf(2L * mGen + 1).subtract(getBlackCount()));
    computeNextRow();
    return mSum;
  }

//  /**
//   * Displays the old row by using "1" and "." for 0 bits, and " " outside the triangle.
//   * @param width total width of the generated line
//   * @param mode 2 = binary as decimal, block display otherwise
//   */
//  public void displayRow(final int width, final int mode) {
//    final StringBuilder sb = new StringBuilder(width);
//    final RowIterator riter = new RowIterator();
//    while (riter.hasNext()) {
//      final int bitPos = riter.next();
//      if (mode != 2) {
//        sb.append(((mOldBlock & (1 << bitPos)) == 0) ? '\u2588' : '\u2591');
//      } else {
//        sb.append(((mOldBlock & (1 << bitPos)) == 0) ? '0' : '1');
//      }
//    }
//    System.out.println(String.format("%3d: %" + String.valueOf(width / 2 - mGen) + "s", mGen, " ")
//        + (mBackground == 0 ? "-" : "+") + sb.toString() + (mBackground == 0 ? "-" : "+"));
//  }
//
//  /*
//   * Main method for debugging.
//   * @param args command line arguments:
//   * <ul>
//   * <li>-b  print in b-file format instead of comma separated list</li>
//   * <li>-d  level debugging level (default 0=none, 1=some, 2=more)</li>
//   * <li>-r  rule number</li>
//   * <li>-n  numTerms number of terms to be computed (default: 16)</li>
//   * <li>-cc callcode</li>
//   * </ul>
//   */
//  public static void main(String[] args) {
//    boolean bfile = false;
//    String callCode = "rows";
//    int debug    = 0;
//    int mode     = 1;
//    int numTerms = 32;
//    int ruleNo   = 30;
//    int iarg = 0;
//    while (iarg < args.length) { // consume all arguments
//      String opt = args[iarg ++];
//      try {
//        if (false) {
//        } else if (opt.equals    ("-b")     ) {
//          bfile    = true;
//        } else if (opt.equals    ("-cc")     ) {
//          callCode = args[iarg ++];
//        } else if (opt.equals    ("-d")     ) {
//          debug    = Integer.parseInt(args[iarg ++]);
//        } else if (opt.equals    ("-m")     ) {
//          mode     = Integer.parseInt(args[iarg ++]);
//        } else if (opt.equals    ("-n")     ) {
//          numTerms = Integer.parseInt(args[iarg ++]);
//        } else if (opt.equals    ("-r")     ) {
//          ruleNo   = Integer.parseInt(args[iarg ++]);
//        } else {
//          System.err.println("??? invalid option: \"" + opt + "\"");
//        }
//      } catch (Exception exc) { // take default
//      }
//    } // while args
//
//    Cellular1DAutomaton ca = new Cellular1DAutomaton(ruleNo);
//    ca.setDebug(debug);
//    if (false) {
//    } else if (callCode.equals("bfile")){
//      for (int gen = 0; gen < numTerms; ++gen) {
//        ca.mGen = gen;
//        System.out.println(gen + " " + ca.toBinaryString());
//        ca.computeNextRow();
//      }
//    } else if (callCode.equals("block")){
//      int block = 0x010;
//      for (int gen = 0; gen < numTerms; ++gen) {
//        System.out.println(Integer.toBinaryString(block));
//        block = ca.transformBlock(block, 0, 0);
//      }
//    } else if (callCode.equals("rows")){
//      for (int gen = 0; gen < numTerms; ++gen) {
//        ca.displayRow(2 * numTerms + 4, mode);
//        ca.computeNextRow();
//      }
//    } else if (callCode.equals("next")){
//      for (int n = 0; n < numTerms; ++n) {
//        if (bfile) {
//          System.out.println(n + " " + ca.next());
//        } else {
//          System.out.print((n == 0 ? "" : ",") + ca.next());
//        }
//      }
//    } else {
//      System.err.println("??? invalid callCode: \"" + callCode + "\"");
//    }
//  } // main

}
