package irvine.oeis.transform;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
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
  private Z[] mPreTerms; // initial terms for a(n)
  private boolean mIsConfigured; // whether the period for the EulerTransform has already been computed
  private final String mEPSig; // a list of pairs (k=exponent of q, m=exponent of eta(q^k)) as a String of the form "[k0,m0;k1,m1;...]".
  private long[] mPeriod; // expanded list of numbers used for the Euler transform
  protected int[] mQpowers; // powers of q
  protected int[] mEpowers; // powers of the eta functions
  private Q mPqfSpec; // specified pqf = mPqfParm
  private Q mPqfCalc; // power of leading q factor computed from the sum of qi * ei
  private int mSqueezeIndex; // for squeezing out zeros if mPqfParm != -mPqfCalc
  private int mSqueeze; // (number of zeros to be squeezed out) - 1; take every mSqueeze'th term if > 1

  /**
   * Construct an eta product sequence from String parameters.
   * @param offset first valid term has this index
   * @param epsig list of pairs (q, e) as a String of the form <code>"[q0,e0;q1,e1;q2,e2]"</code>.
   * Since the leading power of q factor is not specified, it is assumed to be "-1/1",
   * that is there is no shifting or zero insertion.
   */
  public EtaProductSequence(final int offset, final String epsig) {
    super(offset);
    mIsConfigured = false;
    mEPSig = epsig;
    mPqfSpec = null;
  }

  /**
   * Construct an eta product sequence from String parameters.
   * @param offset first valid term has this index
   * @param epsig list of pairs (q, e) as a String of the form <code>"[q0,e0;q1,e1;q2,e2]"</code>.
   * @param pqf leading power of q factor
   * Since there is an explicit leading power of q factor, that may result 
   * in a shift and/or insertion of zeros.
   */
  public EtaProductSequence(final int offset, final String epsig, final String pqf) {
    this(offset, epsig);
    int pqfNum = -1; // defaults
    int pqfDen = 1;
    final int slashPos = pqf.indexOf('/');
    try {
      pqfNum = Integer.parseInt(slashPos < 0 ? pqf : pqf.substring(0, slashPos));
      pqfDen = slashPos < 0 ? 1 : Integer.parseInt(pqf.substring(slashPos + 1));
    } catch (final NumberFormatException exc) {
      // take default 1
    }
    mPqfSpec = new Q(pqfNum, pqfDen);
  }

  /**
   * Configure the class by computing the period for the Euler transform.
   */
  protected void configure() {
    final String[] pairs = mEPSig.replaceAll("[\\[\\] ]", "").split("[;/|]"); // pair separator may be ";", "/" or "|"
    final int noPairs = pairs.length;
    mQpowers = new int[noPairs];
    mEpowers = new int[noPairs];
    long lcm = 1;
    for (int ip = 0; ip < noPairs; ++ip) {
      mQpowers[ip] = 1;
      mEpowers[ip] = 1;
      final String[] pair = pairs[ip].split(",");
      try {
        mQpowers[ip] = Integer.parseInt(pair[0]);
        mEpowers[ip] = Integer.parseInt(pair[1]);
      } catch (final NumberFormatException exc) { // take default 1
      }
      lcm = Functions.LCM.l(lcm, mQpowers[ip]);
    }
    lcm = lcm > 0x80000 ? 0x80000 : lcm; // limit it to 19 bits = 524288
    mPeriod = new long[(int) lcm];
    Arrays.fill(mPeriod, 0);
    for (int ip = 0; ip < noPairs; ++ip) {
      for (int j = mQpowers[ip]; j <= lcm; j += mQpowers[ip]) {
        mPeriod[j - 1] -= mEpowers[ip]; // eta = period[-1]
      }
    }
    int innerProd = 0;
    for (int ip = 0; ip < noPairs; ++ip) {
      innerProd += mQpowers[ip] * mEpowers[ip];
    }
    mPqfCalc = new Q(innerProd, 24);
    int shift = 0;
    mSqueeze = 1;
    if (mPqfSpec != null) { // believe specified shift and squeeze
      shift = mPqfSpec.add(mPqfCalc).floor().intValue() - (getOffset() - (-1)) + 1;
      mSqueeze = mPqfCalc.den().divide(mPqfSpec.den()).intValue();
    }
    mSqueezeIndex = mSqueeze - 2;
    if (shift < 0) {
      if (sDebug >= 1) {
        System.err.println("# shift was negative: " + shift);
      }
      shift = 0;
    }
    if (sDebug >= 1) {
      System.err.println("# pqs specified: " + mPqfSpec + ", calculated: " + mPqfCalc
        + ", innerProd=" + innerProd + ", shift=" + shift + ", offset=" + getOffset()
        + ", mSqueeze=" + mSqueeze + ", mSqueezeIndex=" + mSqueezeIndex);
    }
    mPreTerms = new Z[shift + 1];
    int ipre = mPreTerms.length;
    mPreTerms[--ipre] = Z.ONE;
    while (ipre >= 1) {
      mPreTerms[--ipre] = Z.ZERO;
    }
    mET = new EulerTransform(new PeriodicSequence(mPeriod), mPreTerms);
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
   * Get the eta product signature.
   * @return a String of the form <code>"[q0,e0;q1,e1;q2,e2]"</code>
   */
  public String getEPSig() {
    if (!mIsConfigured) {
      configure();
    }
    final StringBuilder sb = new StringBuilder();
    for (int ip = 0; ip < mQpowers.length; ++ip) {
      sb.append(';');
      sb.append(mQpowers[ip]);
      sb.append(',');
      sb.append(mEpowers[ip]);
    }
    sb.append(']');
    sb.setCharAt(0, '[');
    return sb.toString();
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
  public String getPreTerms() {
    if (!mIsConfigured) {
      configure();
    }
    final StringBuilder result = new StringBuilder(256);
    for (int j = 0; j < mPreTerms.length; ++j) {
      if (j > 0) {
        result.append(',');
      }
      result.append(mPreTerms[j]);
    }
    return result.toString();
  }

  /**
   * Get the specified leading power of q factor
   * @return a string of the form "n/d"
   */
  public String getPqfSpec() {
    return mPqfSpec.toString();
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
      ++mSqueezeIndex;
      final Z result = mET.next();
      if (mSqueezeIndex % mSqueeze == 0) {
        return result;
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
    int debug = 0;
    String epsig = "[1,5;5,-5]"; // A285932
    String pqf = "-1/1";
    int factor = 1;
    int noTerms = 32;
    int iarg = 0;
    while (iarg < args.length) { // consume all arguments
      final String opt = args[iarg++];
      try {
        if ("-d".equals(opt)) {
          debug = Integer.parseInt(args[iarg++]);
        } else if ("-f".equals(opt)) {
          factor = Integer.parseInt(args[iarg++]);
        } else if ("-n".equals(opt)) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if ("-p".equals(opt)) {
          epsig = args[iarg++].replaceAll("\\s", ""); // remove whitespace
        } else if ("-q".equals(opt)) {
          pqf = args[iarg++].replaceAll("\\s", ""); // remove whitespace
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } catch (final NumberFormatException exc) { // take default
      }
    } // while args
    final EtaProductSequence eps = new EtaProductSequence(0, epsig, pqf);
    setDebug(debug);
    System.out.println("EPSIG=" + eps.getEPSig() + ", PreTerms=" + eps.getPreTerms());
    System.out.println("pqs specified: " + eps.getPqfSpec() + ", calculated: " + eps.mPqfCalc);
    final long[] period = eps.getPeriod();
    final int plen = Math.min(period.length, 0x100); // show the first 256 only
    System.out.print("period of length " + period.length + ": [");
    for (int i = 0; i < plen; ++i) {
      if (i > 0) {
        System.out.print(',');
      }
      System.out.print(period[i]);
    }
    if (plen < period.length) {
      System.out.print(" ...");
    }
    System.out.println(']');
    for (int iterm = 0; iterm < noTerms; ++iterm) {
      if (iterm > 0) {
        System.out.print(',');
      }
      System.out.print(eps.next().multiply(factor));
    } // for iterm
    System.out.println();
  } // main
}
