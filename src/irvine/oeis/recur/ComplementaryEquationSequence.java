/* Complementary equations, similiar to holonomic recurrences
 * @(#) $Id$
 * 2020-09-27, Georg Fischer
 */
package irvine.oeis.recur;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A complementary equation system has a recurrence equation for sequence <code>a</code> coupled with
 * one or more sequences <code>b, c</code> and so on that are built with the elements <strong>not yet</strong>
 * existing in any one of the sequences involved.
 * A value of <code>sMex</code> indicates that the sequence element must be determined
 * by the <code>mex</code> operator.
 * <code>Long</code> values are sufficient for the terms of the complementary sequences
 * <code>b, c</code> and so on since the union of the sequences involved
 * always is the set of the positive integers.
 * These values are assumed to be not greater than {@link #MEX_LIMIT}.
 * The values of sequence <code>a</code> are unbounded, of type {@link Z}.
 * @author Georg Fischer
 */
public class ComplementaryEquationSequence extends HolonomicRecurrence {
  
  static int sDebug = 0; // 0 = no debugging, 1 = some, 2 = more
  /** Some value lower than all possible sequence terms. */
  public static final long MEX = Long.MIN_VALUE;
  private static final Z MEX_LIMIT = Z.valueOf(1 << 20); // ensure <code>mex()</code> up to 16*65536 only
  protected final TreeSet<Long> mUnion; // the set of added terms
  protected long mFree; // guess for the numerically first, free (not yet added) element in mUnion
  protected ArrayList<ArrayList<Long>> mSeqs; // Long arrays for the sequences a, b, c and so on.
  protected ArrayList<Z> mSeqA; // Z array for the sequence a 
  protected int mHereSeqNo; // number of the sequence to be computed (0 = a, 1 = b and so on).

  /**
   * Empty constructor.
   */
  public ComplementaryEquationSequence() {
    this(0, "[[0],[1]]", new String[]{"[1]"});
  }

  /**
   * Convenience constructor for sequence <code>a</code>.
   * @param matrix polynomials as coefficients of <code>n^i, i=0..m</code>,
   * as an array of String vectors, for example "[[0,1,2],[0],[17,0,18]]"
   * in the holonomic case, or a simple vector "[0,1,2]" in the linear case.
   * The brackets must be specified accordingly.
   * @param initTerms initial values of a[0..k], b[0..k], c[0..k] and so on,
   * as an array of String vectors, k is the order of the recurrence, that is the number of elements
   * a[n-1], a[n-2], a[n-k] used to compute a[n]. If the arrays b, c and so on are shorter than k,
   * they are filled up with {@link #MEX}.
   */
  public ComplementaryEquationSequence(final String matrix, final String[] initTerms) {
    this(0, matrix, initTerms);
  }

  /**
   * Construct a holonomic recurrence sequence from String parameters.
   * @param hereSeqNo number of the sequence to be computed (0 = a, 1 = b, 2 = c and so on)
   * @param matrix polynomials as coefficients of <code>n^i, i=0..m</code>,
   * as an array of String vectors, for example "[[0,1,2],[0],[17,0,18]]"
   * in the holonomic case, or a simple vector "[0,1,2]" in the linear case.
   * The brackets must be specified accordingly.
   * @param initTerms initial values of a[0..k], b[0..k], c[0..k] and so on,
   * as an array of String vectors, k is the order of the recurrence, that is the number of elements
   * a[n-1], a[n-2], a[n-k] used to compute a[n]. If the arrays b, c and so on are shorter than k,
   * they are filled up with {@link #MEX}.
   */
  public ComplementaryEquationSequence(final int hereSeqNo, final String matrix, final String[] initTerms) {
    super(0, matrix, initTerms[0], 0); // all such sequences have offset 0 and distance 0
    // sets super.mOrder
    if (initTerms[0] == null || initTerms[0].isEmpty() || "[]".equals(initTerms[0])) {
      super.mInitTerms = new Z[0]; // overwrite the implied new Z[] { Z.ONE }
    }
    setGfType(2);
    mHereSeqNo = hereSeqNo;
    mUnion = new TreeSet<>();
    mUnion.add(0L); // zero should never be returned  by mex()
    mFree = 1; // start looking for mex() at 1
    super.mN = -1; // incremented by next() to give the offset of the result of next().
    mSeqs = new ArrayList<>(5); // usually sequences a-e
    mSeqA = new ArrayList<>(1024); // copy of mSeqs.get(0)
    for (int i = 0; i < initTerms.length; ++i) {
      mSeqs.add(new ArrayList<>(256));
      final ArrayList<Long> list = mSeqs.get(i);
      final String termList = initTerms[i].replaceAll("[^\\d\\-,]", "");
      final String[] elems = termList.isEmpty() ? new String[0] : termList.split(",");
    /*
      if (sDebug >= 2) {
        System.out.println(" # termList=\"" + termList + "\", elems[" + i + "] = ");
        for (int il = 0; il < elems.length; ++il) {
          System.out.print("\"" + elems[il] + "\" ");
        }
      }
    */
      for (final String s : elems) {
        long elem = 0L;
        try {
          elem = Long.parseLong(s);
        } catch (final NumberFormatException exc) { // ignore errors
        }
        list.add(elem);
        if (i == 0) {
          mSeqA.add(Z.valueOf(elem));
        }
        mUnion.add(elem);
      } // for j
    } // for i
    // next(); // skip 1st term; why ???
  }

  @Override
  public Z next() {
    Z result = super.next();
    if (mN >= mSeqA.size()) {
      mSeqA.add(result);
    }
    if (result.compareTo(MEX_LIMIT) < 0) {
      final long an = result.longValue();
      mUnion.add(an);
      mSeqs.get(0).add(mN, an); // sequence <code>a</code> never uses mex()
    }
    if (mHereSeqNo > 0) { // one of the sequences b, c, d ...
      result = Z.valueOf(getTerm(mHereSeqNo, mN));
    }
    return result;
  }

  /**
   * Add some arbitrary value to the constant term in the recurrence equation.
   * This method is called in {@link HolonomicRecurrence} when <code>gfType = 2</code> is set.
   * @param n index of the term a(n) in the holonomic recurrence currently computed
   * @return value to be added to the constant term
   */
  @Override
  public Z adjunct(final int n) {
    return Z.valueOf(b(n - 2));
  }

  /**
   * Return the least element not yet added to the set {@link #mUnion}.
   * @return mex ("minimum excluded") value: the least value not yet in the set of non-negative terms
   */
  protected long mex() {
    while (mUnion.contains(mFree)) {
      ++mFree;
    }
    mUnion.add(mFree);
    return mFree++;
  }

  /**
   * Return a term of one of the complementary sequences.
   * If the element is not yet defined,
   * it becomes the least element not yet contained in {@link #mUnion} (mex function).
   * @param complSeqNo number of the sequence: 0 = a, 1 = b, 2 = c and so on-
   * @param index index of the term in the sequence
   * @return <code>mSeqs.get(complSeqNo).get(index)</code>
   */
  protected long getTerm(final int complSeqNo, final int index) {
    final ArrayList<Long> list = mSeqs.get(complSeqNo);
  /*
    if (sDebug >= 2) {
      System.out.print(" # list " + (new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' })[complSeqNo] 
          + " = ");
      for (int il = 0; il < list.size(); ++il) {
        System.out.print(list.get(il) + " ");
      }
    }
  */
    long result;
    if (index >= list.size()) {
      result = mex();
      list.add(result);
    } else {
      result = list.get(index);
      if (result == MEX) {
        result = mex();
        list.set(index, result);
      }
    }
    if (sDebug >= 1) {
      System.out.println(" # getTerm " + (new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'})[complSeqNo]
        + "(" + index + ")=" + result + " # ");
    }
    return result;
  }

  /**
   * Convenience access to Z values of sequence <code>a</code>
   * @param index index of the term in the sequence
   * @return the indexed element
   */
  protected Z aZ(final int index) {
    return mSeqA.get(index);
  }

  /**
   * Convenience access to sequence <code>a</code>
   * @param index index of the term in the sequence
   * @return the indexed element, possibly determined by the <code>mex()</code> function
   */
  protected long a(final int index) {
    return getTerm(0, index);
  }

  /**
   * Convenience access to sequence <code>b</code>
   * @param index index of the term in the sequence
   * @return the indexed element, possibly determined by the <code>mex()</code> function
   */
  protected long b(final int index) {
    return getTerm(1, index);
  }

  /**
   * Convenience access to sequence <code>c</code>
   * @param index index of the term in the sequence
   * @return the indexed element, possibly determined by the <code>mex()</code> function
   */
  protected long c(final int index) {
    return getTerm(2, index);
  }

  /**
   * Convenience access to sequence <code>d</code>
   * @param index index of the term in the sequence
   * @return the indexed element, possibly determined by the <code>mex()</code> function
   */
  protected long d(final int index) {
    return getTerm(3, index);
  }

  /**
   * Convenience access to sequence <code>e</code>
   * @param index index of the term in the sequence
   * @return the indexed element, possibly determined by the <code>mex()</code> function
   */
  protected long e(final int index) {
    return getTerm(4, index);
  }

  /**
   * Test method
   * @param args command line arguments:
   * <code>[-d debug] [-i initerms] [-m maxterms] [-p matrix]</code>
   */
  public static void main(final String[] args) {
    int maxTerms = 16;
    String matrix = "[[0],[1],[1],[-1]]"; // Fibonacci 
    String[] initTerms = new String[]{"[1,2]"};
    final ComplementaryEquationSequence complet;
    if (args.length == 0) {
      complet = new ComplementaryEquationSequence(matrix, initTerms);
      System.out.println("1, 3, 11, 53, 345, 2947, 31411, 400437, 5927921, 99816515, 1882741659, 39310397557"); // A081367
    } else {
      sDebug = 0;
      int iarg = 0;
      while (iarg < args.length) {
        try {
          switch (args[iarg++]) {
            case "-d":
              sDebug = Integer.parseInt(args[iarg++]);
              break;
            case "-i":
              initTerms = new String[]{args[iarg++], ""};
              break;
            case "-n":
              maxTerms = Integer.parseInt(args[iarg++]);
              break;
            case "-p":
              matrix = args[iarg++];
              break;
            default:
              break;
          }
        } catch (final RuntimeException exc) {
          // ignored
        }
      } // while
      complet = new ComplementaryEquationSequence(matrix, initTerms);
    }
    int n = 0;
    while (n < maxTerms) {
      System.out.print(complet.next().toString() + ",");
      ++n;
    } // while n
    System.out.println();
  } // main

}
