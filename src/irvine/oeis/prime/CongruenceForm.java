package irvine.oeis.prime;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A sequence of primes that is defined by a list of residues (remainders) with respect to some modulus (divisor).
 * The algorithm tests one of the modulus conditions after the other for primeness,
 * and then steps by the modulus.
 * @author Georg Fischer
 */
public class CongruenceForm implements Sequence {

  protected int mModulus; // divisor
  protected int[] mResidues; // remainders
  protected int mResIndex; // current index in mResidues
  protected int mResStart; // first index of remainders, number of initial terms
  protected int mResSize; // mResidues.length
  protected Z mCandBase; // lowest candidate

  /**
   * Construct an instance from a list of remainders.
   * @param start number of initial terms, index of first residue
   * @param modulus divisor
   * @param residues list of initial terms followed by the residues
   */
  public CongruenceForm(final int modulus, final int start, final int... residues) {
    initialize(modulus, start, residues);
  }

  /**
   * Construct an instance from the property "p is a square mod m".
   * @param modulus divisor
   */
  public CongruenceForm(final int modulus) {
    initialize(modulus, 0, quadResidues(modulus));
  }

  /**
   * Initialze the internal data structure.
   */
  protected void initialize(final int modulus, final int start, final int... residues) {
    mModulus = modulus;
    mResStart = start;
    mResidues = residues;
    mResIndex = -1; // begin with the initial terms
    mCandBase = Z.ZERO;
    mResSize = mResidues.length;
  }

  /**
   * Compute the quadratic residues for some discriminant.
   * @param discr discriminant
   * @return array of unique residues in ascending order
   */
  public static int[] quadResidues(final int discr) {
    final TreeSet<Integer> ts = new TreeSet<>();
    for (int im = discr / 2 + 1; im >= 0; --im) {
      ts.add((im * im) % discr);
    }
    final int[] residues = new int[ts.size()];
    int ir = 0;
    Integer elem = ts.pollFirst();
    while (elem != null) {
      residues[ir++] = elem;
      elem = ts.pollFirst();
    }
    return residues;
  }

  @Override
  public Z next() {
    while (true) {
      ++mResIndex;
      if (mResIndex >= mResSize) {
        mCandBase = mCandBase.add(mModulus);
        mResIndex = mResStart; // continue behind the initial terms
      }
      final Z candidate = mCandBase.add(mResidues[mResIndex]);
      // System.out.println("mCandidate=" + mCandidate + ", mCandBase=" + mCandBase + ", mResIndex=" + mResIndex);
      if (candidate.isProbablePrime()) {
        return candidate;
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
//    int debug     = 0;
//    int noTerms   = 64;
//    int modulus   = 71;
//    int iarg = 0;
//    while (iarg < args.length) { // consume all arguments
//      final String opt = args[iarg ++];
//      try {
//        if (false) {
//        } else if (opt.equals    ("-b")     ) {
//          bFile   = true;
//        } else if (opt.equals    ("-d")     ) {
//          debug   = Integer.parseInt(args[iarg ++]);
//        } else if (opt.equals    ("-m")     ) {
//          modulus = Integer.parseInt(args[iarg ++]);
//        } else if (opt.equals    ("-n")     ) {
//          noTerms = Integer.parseInt(args[iarg ++]);
//        } else {
//          System.err.println("??? invalid option: \"" + opt + "\"");
//        }
//      } catch (Exception exc) { // take default
//      }
//    } // while args
//
//    final CongruenceForm cf = new CongruenceForm(modulus);
//    final int[] residues = cf.quadResidues(modulus);
//    System.out.print("modulus " + modulus);
//    for (int ir = 0; ir < residues.length; ++ir) {
//      System.out.print(", " + residues[ir]);
//    }
//    System.out.println();
//  } // main
}
