package irvine.oeis.ca;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Data structure and methods for the evaluation of a 2D 5-Neighbor Outer Totalistic Cellular Automaton
 * as described by Stephen Wolfram in the book "A New Kind Of Science" (ANKOS).
 * @author Georg Fischer
 * @see <a href="https://oeis.org/wiki/Index_to_2D_5-Neighbor_Cellular_Automata">https://oeis.org/wiki/Index_to_2D_5-Neighbor_Cellular_Automata</a>.
 * The square is always symmetrical on the vertical, horizontal and both diagonal axes, therefore
 * only the lower right half triangle of the south-west quadrant is computed,
 * and the other parts of the 4 quadrants can be completed by reflection and rotation of that triangle.
 * "5-Neighbor Outer Totalistic" means that the new value of a specific cell depends on the old value of that cell
 * and the number of black values in the 4 cells to the north, east, south, west of that cell.
 * For example Rule 614:
 * <pre>
 *     4433221100 neighbors
 *     scscscscsc current cell is c=clear, s=set
 *   0b1001100110 = decimal 614
 * </pre>
 * The current cell is set iff:
 * <ul>
 * <li>it was set  and no neighbor  was set</li>
 * <li>it was clear and 1 neighbor  was set</li>
 * <li>it was set   and 2 neighbors were set</li>
 * <li>it was clear and 3 neighbors were set</li>
 * <li>it was set   and 4 neighbors were set</li>
 * </ul>
 */
public class FiveNeighbor2DAutomaton implements Sequence {

  /** Allocate rows in multiples of this number */
  protected static final int CHUNK_SIZE = 8;
  /** Rule number 0..1023, cf. ANKOS pp. 170-179 */
  protected int mRule;
  /**
   * Number of the generation; <code>mGen</code> = 0 starts with a single BLACK cell
   * in the lowest bit position of <code>mOldRow[mCenter]</code>
   */
  protected int mGen;
  /** Buffer for the bits of generation n */
  protected Z[] mOldTri;
  /** Debugging mode: 0=none, 1=some, 2=more. */
  protected static int sDebug = 0;

  /**
   * Creates a sequence derived from the cellular automaton with the given rule
   * and seed 1 (a single ON/BLACK cell).
   * @param rule rule number for this automaton (0-1023).
   */
  public FiveNeighbor2DAutomaton(final int rule) {
    mGen = 0;
    mRule = rule;
    mOldTri = new Z[CHUNK_SIZE];
    mOldTri[0] = Z.ONE; // set origin to black
    mOldTri[1] = Z.ZERO; // initial background
  }

  /**
   * Set the debugging level.
   * @param level code for the debugging level: 0 = none, 1 = some, 2 = more.
   */
  public static void setDebug(final int level) {
    sDebug = level;
  }

  /**
   * Compute the new square of the next generation from the old square.
   * All rows are computed from <code>2^0</code> to <code>2^mGen</code>.
   */
  public void computeNext() {
    ++mGen;
    Z background = mOldTri[mGen];
    if (background.isZero()) {
      mOldTri[mGen + 1] = background;
    } else {
      background = background.setBit(mGen + 1);
      mOldTri[mGen + 1] = background;
      background = background.setBit(mGen + 2);
    }
    mOldTri[mGen + 2] = background;
    int newLen = mOldTri.length;
    if (mGen + 4 >= newLen) {
      newLen += CHUNK_SIZE;
    }
    final Z[] newTri = new Z[newLen];
    // row 0 is special since first = last
    newTri[0] = Z.ZERO;
    int shift
      = (mOldTri[1].testBit(0) ? 8 : 0)  // south * 4
      + (mOldTri[0].testBit(0) ? 1 : 0); // self
    if ((mRule & (1 << shift)) != 0) {
      newTri[0] = newTri[0].setBit(0);
    }
//    if (sDebug >= 1) {
//        System.out.println("#   Row 0"
//            + ", mRule="      + mRule + "=0b" + Integer.toBinaryString(mRule)
//            + ", shift="      + shift
//            + ", newTri[0]="  +  newTri[0].toString(2)
//            + ", mOldTri[0]=" + mOldTri[0].toString(2)
//            + ", mOldTri[1]=" + mOldTri[1].toString(2)
//            );
//    }
    // compute rows >= 1
    for (int irow = 1; irow <= mGen + 1; ++irow) {
      newTri[irow] = Z.ZERO;
      // compute bit 2^0; icol = 0
      int icol = 0;
      shift
        = (mOldTri[irow - 1].testBit(icol) ? 2 : 0)  // north
        + (mOldTri[irow].testBit(icol + 1) ? 4 : 0)  // west = east
        + (mOldTri[irow + 1].testBit(icol) ? 2 : 0)  // south
        + (mOldTri[irow].testBit(icol) ? 1 : 0); // self
      if ((mRule & (1 << shift)) != 0) {
        newTri[irow] = newTri[irow].setBit(icol);
      }
//      if (sDebug >= 3) {
//         System.out.println("#   irow=" + irow + ", first col=" + icol 
//            + ", shift="           + shift
//            + ", newTri[" + irow        + "]=" +  newTri[irow    ].toString(2)
//            + ", mOldTri[" + (irow - 1) + "]=" + mOldTri[irow - 1].toString(2)
//            + ", mOldTri[" + irow       + "]=" + mOldTri[irow    ].toString(2)
//            + ", mOldTri[" + (irow + 1) + "]=" + mOldTri[irow + 1].toString(2)
//            );
//      }
      ++icol;
      // compute bits 2^1..2^(irow-1)
      while (icol < irow) {
        shift
          = (mOldTri[irow - 1].testBit(icol) ? 2 : 0)  // north
          + (mOldTri[irow].testBit(icol + 1) ? 2 : 0)  // west
          + (mOldTri[irow].testBit(icol - 1) ? 2 : 0)  // east
          + (mOldTri[irow + 1].testBit(icol) ? 2 : 0)  // south
          + (mOldTri[irow].testBit(icol) ? 1 : 0); // self
        if ((mRule & (1 << shift)) != 0) {
          newTri[irow] = newTri[irow].setBit(icol);
        }
//        if (sDebug >= 3) {
//          System.out.println("#   irow=" + irow + ", inner col=" + icol 
//            + ", shift="           + shift
//            + ", newTri[" + irow        + "]=" +  newTri[irow    ].toString(2)
//            + ", mOldTri[" + (irow - 1) + "]=" + mOldTri[irow - 1].toString(2)
//            + ", mOldTri[" + irow       + "]=" + mOldTri[irow    ].toString(2)
//            + ", mOldTri[" + (irow + 1) + "]=" + mOldTri[irow + 1].toString(2)
//            );
//        }
        ++icol;
      }
      // compute bit 2^irow; here: icol = irow
      shift
        = (mOldTri[irow].testBit(icol - 1) ? 4 : 0)  // east = north
        + (mOldTri[irow + 1].testBit(icol) ? 4 : 0)  // south = west, background in the last row
        + (mOldTri[irow].testBit(icol) ? 1 : 0); // self
      if ((mRule & (1 << shift)) != 0) {
        newTri[irow] = newTri[irow].setBit(icol);
      }
//      if (sDebug >= 2) {
//         System.out.println("#   irow=" + irow + ", last  col=" + icol 
//            + ", shift="           + shift
//            + ", newTri[" + irow        + "]=" +  newTri[irow    ].toString(2)
//            + ", mOldTri[" + (irow - 1) + "]=" + mOldTri[irow - 1].toString(2)
//            + ", mOldTri[" + irow       + "]=" + mOldTri[irow    ].toString(2)
//            + ", mOldTri[" + (irow + 1) + "]=" + mOldTri[irow + 1].toString(2)
//            );
//      }
    }
    mOldTri = newTri;
  }

  /**
   * Get the next term of the sequence.
   * Cf. interface {@link Sequence}.
   * @return total number of black cells in the next generation
   */
  @Override
  public Z next() {
    return nextOn();
  }

  /**
   * Get the next term of the sequence.
   * Cf. interface {@link Sequence}.
   * @return total number of black cells in the next generation
   */
  public Z nextOn() {
    final long org = mOldTri[0].testBit(0) ? 1 : 0;
    long lsum = 0L; // left border of the triangle
    long rsum = 0L; // right border
    long tsum = 0L; // whole triangle
    for (int irow = 0; irow <= mGen; ++irow) {
      final Z row = mOldTri[irow];
      if (row.testBit(irow)) {
        ++lsum;
      }
      if (row.testBit(0)) {
        ++rsum;
      }
      tsum += row.bitCount();
    }
    tsum = tsum - lsum - rsum + org; // org was counted twice (in lsum and rsum); now we have the count of the inner triangle
    tsum = 8 * tsum + 4 * lsum + 4 * rsum - 7 * org;
    computeNext();
    return Z.valueOf(tsum);
  }

  /**
   * Get the total number of black cells in the next generation with number 2^n - 1
   * @return 0 or 1
   */
  public Z nextOn2n1() {
    while (Integer.bitCount(mGen + 1) != 1) {
      computeNext();
    }
    return nextOn();
  }

  /**
   * Get the number whose bits represent the row segment from the left border to the origin.
   * The binary number is represented by decimal digits 0 and 1.
   * @return a number with bits set for black cells
   */
  public Z nextLeftOriginB() {
    Z result = Z.ZERO;
    for (int irow = mGen; irow >= 0; --irow) {
      if (mOldTri[irow].testBit(0)) {
        result = result.setBit(irow);
      }
    }
    computeNext();
    return new Z(result.toString(2));
  }

  /**
   * Get the number whose bits represent the row segment from the origin to the right border.
   * The binary number is represented by decimal digits 0 and 1.
   * @return a number with bits set for black cells
   */
  public Z nextOriginRightB() {
    Z result = Z.ZERO;
    for (int irow = mGen; irow >= 0; --irow) {
      if (mOldTri[irow].testBit(0)) {
        result = result.setBit(mGen - irow);
      }
    }
    computeNext();
    return new Z(result.toString(2));
  }

  /**
   * Get the number whose bits represent the diagonal segment from a corner to the origin.
   * The binary number is represented by decimal digits 0 and 1.
   * @return a number with bits set for black cells
   */
  public Z nextCornerOriginB() {
    Z result = Z.ZERO;
    for (int irow = mGen; irow >= 0; --irow) {
      if (mOldTri[irow].testBit(irow)) {
        result = result.setBit(irow);
      }
    }
    computeNext();
    return new Z(result.toString(2));
  }

  /**
   * Get the number whose bits represent the diagonal segment from the origin to a corner.
   * The binary number is represented by decimal digits 0 and 1.
   * @return a number with bits set for black cells
   */
  public Z nextOriginCornerB() {
    Z result = Z.ZERO;
    for (int irow = mGen; irow >= 0; --irow) {
      if (mOldTri[irow].testBit(irow)) {
        result = result.setBit(mGen - irow);
      }
    }
    computeNext();
    return new Z(result.toString(2));
  }

  /**
   * Get the number whose bits represent the row segment from the left border to the origin.
   * @return a number with bits set for black cells
   */
  public Z nextLeftOriginD() {
    Z result = Z.ZERO;
    for (int irow = mGen; irow >= 0; --irow) {
      if (mOldTri[irow].testBit(0)) {
        result = result.setBit(irow);
      }
    }
    computeNext();
    return result;
  }

  /**
   * Get the number whose bits represent the row segment from the origin to the right border.
   * @return a number with bits set for black cells
   */
  public Z nextOriginRightD() {
    Z result = Z.ZERO;
    for (int irow = mGen; irow >= 0; --irow) {
      if (mOldTri[irow].testBit(0)) {
        result = result.setBit(mGen - irow);
      }
    }
    computeNext();
    return result;
  }

  /**
   * Get the number whose bits represent the diagonal segment from a corner to the origin.
   * @return a number with bits set for black cells
   */
  public Z nextCornerOriginD() {
    Z result = Z.ZERO;
    for (int irow = mGen; irow >= 0; --irow) {
      if (mOldTri[irow].testBit(irow)) {
        result = result.setBit(irow);
      }
    }
    computeNext();
    return result;
  }

  /**
   * Get the number whose bits represent the diagonal segment from the origin to a corner.
   * @return a number with bits set for black cells
   */
  public Z nextOriginCornerD() {
    Z result = Z.ZERO;
    for (int irow = mGen; irow >= 0; --irow) {
      if (mOldTri[irow].testBit(irow)) {
        result = result.setBit(mGen - irow);
      }
    }
    computeNext();
    return result;
  }

//  /**
//   * Prints the old triangle by using "1" and "." for 0 bits, and " " outside the triangle.
//   * @param width width of the generated lines
//   * @param mode 2 = binary as decimal, block display otherwise
//   */
//  public void printTriangle(final int width, final int mode) {
//    System.out.println("Generation " + mGen);
//    for (int irow = 0; irow <= mGen; ++irow) {
//      final Z row = mOldTri[irow];
//      StringBuilder sb = new StringBuilder();
//      for (int icol = irow; icol >= 0; --icol) {
//        sb.append(row.testBit(icol) ? 'X' : '.');
//      }
//      System.out.println(String.format("%" + String.valueOf(width - irow) + "s", " ") + sb.toString());
//    }
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
//   * <li>-cc callcode: triangle</li>
//   * </ul>
//   */
//  public static void main(String[] args) {
//    boolean bfile = false;
//    String callCode = "triangle";
//    int debug    = 0;
//    int mode     = 1;
//    int numTerms = 8;
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
//    FiveNeighbor2DAutomaton ca = new FiveNeighbor2DAutomaton(ruleNo);
//    ca.setDebug(debug);
//    if (false) {
//    } else if (callCode.equals("triangle")){
//      for (int gen = 0; gen < numTerms; ++gen) {
//        ca.printTriangle(2 * numTerms + 4, mode);
//        ca.computeNext();
//      }
//    } else if (callCode.equals("on")){
//      for (int gen = 0; gen < numTerms; ++gen) {
//        System.out.println(gen + " " + ca.next());
//      }
//    } else if (callCode.equals("leftb")){
//      for (int gen = 0; gen < numTerms; ++gen) {
//        System.out.println(gen + " " + ca.nextLeftOriginB());
//      }
//    } else if (callCode.equals("rightb")){
//      for (int gen = 0; gen < numTerms; ++gen) {
//        System.out.println(gen + " " + ca.nextOriginRightB());
//      }
//    } else if (callCode.equals("inb")){
//      for (int gen = 0; gen < numTerms; ++gen) {
//        System.out.println(gen + " " + ca.nextCornerOriginB());
//      }
//    } else if (callCode.equals("outb")){
//      for (int gen = 0; gen < numTerms; ++gen) {
//        System.out.println(gen + " " + ca.nextOriginCornerB());
//      }
//    } else {
//      System.err.println("??? invalid callCode: \"" + callCode + "\"");
//    }
//  } // main
}
