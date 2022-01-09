package irvine.oeis.prime;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A sequence of nonnegative numbers represented by a binary quadratic form <code>a*x^2 + b*x*y + c*y^2</code>.
 * <code>x</code> and <code>y</code> may be &gt=; 0 or any integer, and the numbers may be primes only.
 *
 * The algorithm operates on a matrix with rows for <code>-max &lt;= x &lt;= max</code> and columns for <code>0 &lt;= y &lt;= max</code>.
 * The matrix elements to be investigated are stored in a {@link TreeMap}.
 *
 * For the minimum TreeMap entry <code>f(x0,y0) -&gt; (x0, y0)</code>:
 * <ul>
 * <li>determine and store the so-called "stopping element", a minimal element (x1, y1) in the next column <code>y1 = y0 + 1</code> by <code>x1 = - b * (y1 + a) / (2*a)</code> (partial d/dx of the form, rounded)</li>
 * <li>extend and store the ranges in all columns <code>yi &lt;= y0</code> up to <code>min/max(xi)</code> such that <code>f(xi, yi) &gt;= f(x1,y1)</code></li>
 * <li>find next minimal element <code>f(x0,y0) -&gt; (x0, y0)</code> and repeat</li>
 * </ul>
 * <code>mColMix[y], mColMax[y]</code> give the lower and upper <code>x</code> indexes for the entries that have already been stored in the TreeMap.
 * @author Georg Fischer
 */
public class BinaryQuadraticForm extends TreeMap<Z, Pair<Integer, Integer>> implements Sequence {

  protected int mA; // factor of x^2
  protected int mB; // factor of x*y, maybe 0 or negative
  protected int mC; // factor of y^2
  protected boolean mAnyInteger;
  protected boolean mPrimesOnly;
  protected Z mOldTerm; // previous term
  private final ArrayList<Integer> mColMix; // lower x index of the range that was stored
  private final ArrayList<Integer> mColMax; // upper x index
  protected static int sDebug = 0;

  /**
   * Construct an instance for primes
   * @param a factor of <code>x^2</code>
   * @param b factor of <code>x*y</code>
   * @param c factor of <code>y^2</code>
   * @param intMode 1 for nonnegative x and y, 2 for all integers
   */
  public BinaryQuadraticForm(final int a, final int b, final int c, final int intMode) {
    this(a, b, c, intMode == 2 || !(intMode == 1 || b != 0), true);
  }

  /**
   * Construct an instance for the general case.
   * @param a factor of <code>x^2</code>
   * @param b factor of <code>x*y</code>
   * @param c factor of <code>y^2</code>
   * @param anyInteger integer mode
   * @param primesOnly restrict to primes
   */
  public BinaryQuadraticForm(final int a, final int b, final int c, final boolean anyInteger, final boolean primesOnly) {
    mA = a;
    mB = b;
    mC = c;
    mAnyInteger = anyInteger;
    mPrimesOnly = primesOnly;
    mColMix = new ArrayList<>();
    mColMax = new ArrayList<>();
    final int x = 0;
    final int y = 0;
    mColMix.add(x); // for column iy
    mColMax.add(x);
    mOldTerm = addEntry(x, y).subtract(1);
//    if (sDebug >= 1) {
//      System.out.println("# BinaryQuadraticForm(" + a + ", " + b + ", " + c + ", anyInteger=" + anyInteger + ", primesOnly=" + primesOnly);
//    }
  }

  /**
   * Compute the value of the form
   * @param x variable x
   * @param y variable y
   * @return <code>a*x^2 + b*x*y + c*y^2</code>
   */
  protected Z addEntry(final int x, final int y) {
    final Z result = Z.valueOf(mA).multiply(x * (long) x).add(mB * (long) x * y).add(mC * (long) y * y);
    final Pair<Integer, Integer> pair = get(result);
    if (pair == null) { // new key
      put(result, new Pair<>(x, y));
//      if (sDebug >= 3) {
//        System.out.println("# add new @[" + x + "," + y + "]\t" + result);
//      }
    } else { // key exists
      //final int x0 = pair.left();
      final int y0 = pair.right();
      if (y > y0) { // replace by the new one that is more to the right
        put(result, new Pair<>(x, y));
      }
//      if (sDebug >= 3) {
//        System.out.println("# modify @[" + x + "," + y + "]\t" + result);
//      }
    }
    return result;
  }

  @Override
  public Z next() {
    while (true) {
      // find next result and its coordinates
      final Map.Entry<Z, Pair<Integer, Integer>> entry = pollFirstEntry();
      final Z result = entry.getKey();
      final Pair<Integer, Integer> pair = entry.getValue();
      final int x0 = pair.left();
      final int y0 = pair.right();

      final int y1 = 1 + y0;
      if (y1 >= mColMix.size()) { // new column
        // determine the stopping element
        int x1 = (-mB * y1 + (mB > 0 ? -mA : mA)) / (2 * mA);
        if (!mAnyInteger && x1 < 0) {
          x1 = 0;
        }
        mColMix.add(x1);
        mColMax.add(x1);
        final Z f1 = addEntry(x1, y1);
//        if (sDebug >= 1) {
//          System.out.println("# stopping element @[" + x1 + "," + y1 + "]\t" + f1);
//        }
        // extend the ranges
        int yi = 0;
        while (yi <= y0) {
          int xl = mColMix.get(yi);
          int xh = mColMax.get(yi);
//          if (sDebug >= 3) {
//            System.out.println("# col. " + yi + "\t old range   [" + xl + ".." + xh + "]");
//          }
          if (mAnyInteger || xl >= 1) {
            while (addEntry(--xl, yi).compareTo(f1) <= 0) { // extend -> -x
            }
            mColMix.set(yi, xl);
          }
          while (addEntry(++xh, yi).compareTo(f1) <= 0) { // extend -> +x
          }
          mColMax.set(yi, xh);
//          if (sDebug >= 2) {
//            System.out.println("# col. " + yi + "\t extended to [" + xl + ".." + xh + "]");
//          }
          ++yi;
        }
      }
      //--------
      if (mAnyInteger || x0 >= 0) {
//        if (sDebug >= 1) {
//          System.out.println("# candidate @[" + x0 + "," + y0 + "]\t" + result);
//        }
        if (mOldTerm.compareTo(result) < 0) { // sequence must be strictly increasing
          mOldTerm = result;
          if (!mPrimesOnly || result.isProbablePrime()) {
            return result;
          }
        }
      } else {
//        if (sDebug >= 1) {
//          System.out.println("# candidate @[" + x0 + "," + y0 + "]\t" + result + " skipped");
//        }
      }
    }
  }

//  /**
//   * Main method for testing
//   * @param args command line arguments:
//   * <ul>
//   * <li>-b   output is b-file format (default: comma separated data line)</li>
//   * <li>-d   debugging level (default 0=none; 1=some, 2=more)</li>
//   * <li>-m   modulus (default 71)</li>
//   * <li>-n   number of terms to be computed (default 64)</li>
//   * </ul>
//   */
//  public static void main(String[] args) {
//    boolean bFile = false;
//    int noTerms   = 32;
//    int a = 2;
//    int b = 0;
//    int c = 7;
//    boolean primesOnly = false;
//    boolean anyInteger = false; // x, y nonnegative
//    int iarg = 0;
//    while (iarg < args.length) { // consume all arguments
//      final String opt = args[iarg ++];
//      try {
//        if (false) {
//        } else if (opt.equals    ("-a")     ) {
//          a       = Integer.parseInt(args[iarg++]);
//        } else if (opt.equals    ("-bf")    ) {
//          bFile   = true;
//        } else if (opt.equals    ("-b")     ) {
//          b       = Integer.parseInt(args[iarg++]);
//        } else if (opt.equals    ("-c")     ) {
//          c       = Integer.parseInt(args[iarg++]);
//        } else if (opt.equals    ("-d")     ) {
//          sDebug  = Integer.parseInt(args[iarg++]);
//        } else if (opt.equals    ("-i")     ) {
//          anyInteger = true; // x, y element of Z
//        } else if (opt.equals    ("-n")     ) {
//          noTerms = Integer.parseInt(args[iarg++]);
//        } else if (opt.equals    ("-p")     ) {
//          primesOnly = true;
//        } else {
//          System.err.println("??? invalid option: \"" + opt + "\"");
//        }
//      } catch (Exception exc) { // take default
//      }
//    } // while args
//
//    final BinaryQuadraticForm bqf = new BinaryQuadraticForm(a, b, c, anyInteger, primesOnly);
//    for (int it = 1; it <= noTerms; ++it) {
//      final Z term = bqf.next();
//      if (bFile) {
//        System.out.println(it + " " + term);
//      } else {
//        System.out.print((it == 1 ? "" : ", ") + " " + term);
//      }
//    }
//    System.out.println();
//  } // main
}
