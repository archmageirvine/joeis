package irvine.oeis.transform;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * This class implements a sequence that is derived from the coefficients
 * of a product of eta functions.
 * @author Georg Fischer
 */
public class EtaProductSequence extends AbstractSequence {

  private static int sDebug = 0;
  private EulerTransform mET; // the EulerTransform used to compute the sequence
  private final Z[] mPreTerms; // initial terms for a(n)
  private boolean mIsConfigured; // whether the period for the EulerTransform has already been computed
  private final String mEtaString; // a list of pairs (k=exponent of q, m=exponent of eta(q^k)) as a String of the form "[k0,m0;k1,m1;...]".
  private long[] mPeriod; // expanded list of numbers used for the Euler transform
  private final String mPQF; // power of leading q factor
  private int mPQFNum; // numerator of mPQF
  private int mPQFDen; // denominator of mPQF
  private int mN; // for skipping if mPQF != "-1/1"
  private Z mFactor; // optional factor to be multiplied on to the resulting terms

  /**
   * Construct an eta product sequence from String parameters.
   * @param offset first valid term has this index
   * @param etaString list of pairs (spread, factor) as a String of the form "[k0,m0;k1,m1;k2,m2]".
   * @param preTerms list of initial terms
   * @param pqf power of leading q factor
   */
  public EtaProductSequence(final int offset, final String etaString, final String pqf, final long... preTerms) {
    super(offset);
    mIsConfigured = false;
    mEtaString = etaString;
    mPreTerms = ZUtils.toZ(preTerms);
    mPQF = pqf;
    mFactor = null; // default: no factor
    mN = -1;
  }

  /**
   * Construct an eta product sequence from String parameters.
   * @param offset first valid term has this index
   * @param etaString list of pairs (spread, factor) as a String of the form "[k0,m0;k1,m1;k2,m2]".
   * @param preTerms list of initial terms
   */
  public EtaProductSequence(final int offset, final String etaString, final long... preTerms) {
    this(offset, etaString, "-1/1", preTerms);
  }

  /**
   * Construct an eta product sequence from String parameters.
   * @param offset first valid term has this index
   * @param etaString a list of pairs (spread, factor) as a String of the form "[k0,m0;k1,m1;k2,m2]".
   */
  public EtaProductSequence(final int offset, final String etaString) {
    this(offset, etaString, "-1/1", new long[0]);
  }

  /**
   * Construct an eta product sequence from String parameters.
   * @param offset first valid term has this index
   * @param etaString a list of pairs (spread, factor) as a String of the form "[k0,m0;k1,m1;k2,m2]".
   * @param preTerms list of initial terms as String
   * @param pqf pqf of leading q factor
   */
  public EtaProductSequence(final int offset, final String etaString, final String pqf, final String preTerms) {
    this(offset, etaString, pqf, LongUtils.toLong(preTerms));
  }

  /**
   * Configure the class by computing the period for the Euler transform.
   */
  protected void configure() {
    final int eta = -1;
    final String[] pairs = mEtaString.replaceAll("[\\[\\]]", "").split("[\\;\\/\\|]");
    final int noPairs = pairs.length;
    final int[] spreads = new int[noPairs];
    final int[] factors = new int[noPairs];
    int lcm = 1;
    for (int ip = 0; ip < noPairs; ++ip) {
      spreads[ip] = 1;
      factors[ip] = 1;
      final String[] pair = pairs[ip].split("\\,");
//  System.out.println("pairs[" + ip + "]: " + pair[0] +  "," + pair[1]);
      try {
        spreads[ip] = Integer.parseInt(pair[0]);
        factors[ip] = Integer.parseInt(pair[1]);
      } catch (final NumberFormatException exc) { // take default 1
      }
      lcm = IntegerUtils.lcm(lcm, spreads[ip]);
//  System.out.println("lcm: " + lcm);
    }
    mPeriod = new long[lcm];
    Arrays.fill(mPeriod, 0);
    for (int ip = 0; ip < noPairs; ++ip) {
      for (int j = spreads[ip]; j <= lcm; j += spreads[ip]) {
        mPeriod[j - 1] += eta * factors[ip];
      }
    }
    mET = new EulerTransform(new PeriodicSequence(mPeriod), mPreTerms);
    try {
      mPQFNum = -1;
      mPQFDen = 1;
      mPQFNum = Integer.parseInt(mPQF.substring(0, mPQF.indexOf('/')));
      mPQFDen = Integer.parseInt(mPQF.substring(mPQF.indexOf('/') + 1));
    } catch (final NumberFormatException exc) { // take default 1
    }
    mIsConfigured = true;
  }

  /**
   * Set the debugging level.
   * @param level code for the debugging level: 0 = none, 1 = some, 2 = more.
   */
  public static void setDebug(final int level) {
    sDebug = level;
  }

  /**
   * Set the factor.
   * @param factor multiply this on to the resulting terms
   */
  public void setFactor(final long factor) {
    mFactor = factor != 1 ? Z.valueOf(factor) : null;
  }

  /**
   * Set no factor.
   */
  public void setFactor() {
    mFactor = null;
  }

  /**
   * Get the String of factors defining the eta product.
   * @return a String of the form "[k0,m0;k1,m1;...]"
   */
  public String getEtaString() {
    return mEtaString;
  }

  /**
   * Get the period.
   * @return expanded list of numbers used for the Euler transform.
   */
  public long[] getPeriod() {
    if (!mIsConfigured) {
      configure();
    }
    return mPeriod;
  }

  /**
   * Get a String representation of the initial terms.
   * @return a list of terms of the form "[0,1,1,2,1]".
   */
  public String getInitString() {
    if (!mIsConfigured) {
      configure();
    }
    final StringBuilder result = new StringBuilder(256);
    for (int j = 0; j < mPreTerms.length; ++j) {
      if (j > 0) {
        result.append(',');
      }
      result.append(mPreTerms[j].toString());
    }
    return result.toString();
  }

  /**
   * Get the finite list of iitial terms.
   * @return array of terms
   */
  public Z[] getInitTerms() {
    return mPreTerms;
  }

  /**
   * Get the next term of the sequence.
   */
  @Override
  public Z next() {
    if (!mIsConfigured) {
      configure();
    }
    while (true) {
      ++mN;
      final Z result = mET.next();
      if (mN % mPQFDen == 0) {
        return mFactor == null ? result : result.multiply(mFactor);
      }
    }
  }

  /**
   * Main method: compute the period and show 16 terms
   * @param args command line arguments:
   * <ul>
   * <li>-p period list of terms (default: "[1,5;5,-5]")</li>
   * <li>-i list of initial terms, default "1"</li>
   * <li>-n number of terms to be generated (default: 32)</li>
   * <li>-q power of q factor as String fraction (default: "-1/1")</li>
   * </ul>
   */
  public static void main(final String[] args) {
    sDebug = 0;
    String etaString = "[1,5;5,-5]"; // A285932
    String initString = "1";
    String pqf = "-1/1";
    int noTerms = 32;
    int iarg = 0;
    while (iarg < args.length) { // consume all arguments
      final String opt = args[iarg++];
      try {
        if (opt.equals("-d")) {
          sDebug = 1;
          sDebug = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-i")) {
          initString = args[iarg++].replaceAll("\\s", ""); // remove whitespace
        } else if (opt.equals("-n")) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-p")) {
          etaString = args[iarg++].replaceAll("\\s", ""); // remove whitespace
        } else if (opt.equals("-q")) {
          pqf = args[iarg++].replaceAll("\\s", ""); // remove whitespace
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } catch (final NumberFormatException exc) { // take default
      }
    } // while args
    final EtaProductSequence eps = new EtaProductSequence(0, etaString, pqf, initString);
    final long[] period = eps.getPeriod();
    System.out.print("period: [");
    for (int i = 0; i < period.length; ++i) {
      if (i > 0) {
        System.out.print(",");
      }
      System.out.print(period[i]);
    }
    System.out.println("]");
    for (int iterm = 0; iterm < noTerms; ++iterm) {
      if (iterm > 0) {
        System.out.print(",");
      }
      System.out.print(eps.next());
    } // for iterm
    System.out.println();
  } // main
}
