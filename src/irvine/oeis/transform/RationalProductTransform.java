package irvine.oeis.transform;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

import irvine.math.api.RationalSequence;
import irvine.math.q.Q;
import irvine.math.q.QUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * Apply the generalized Euler transform to two other sequences f and g, as defined in OEIS A266964:
 * From Seiichi Manyama, Nov 14 2017:
 * A generalized Euler transform.
 * Suppose given two sequences f(k) and g(k), n&gt;0, we define a new sequence a(n), n&gt;=0, <br />
 * by Product_{k&gt;0} (1 - g(k)*x^k)^(-f(k)) = b(0) + b(1)*x + b(2)*x^2 + ... = Sum{n&gt;=0} b(n)*x^n<br />
 * Since Product_{k&gt;=1} (1 - g(k)*x^k)^(-f(k)) = exp(Sum_{n&gt;=1} (Sum_{d|n} d*f(d)*g(d)^(n/d))*x^n/n),  <br />
 * we see that b(n) is given explicitly by b(n) = (1/n) * Sum_{k=1..n} c(k)*b(n-k) <br />
 * where c(n) = Sum_{d|n} d*f(d)*g(d)^(n/d). <br />
 * The algorithm here uses a monotone increasing function h(k) (default: h(k) := k) such that<br />
 * g(k) := 0 for k != h(k). <br />
 * Examples: <br />
 * 1. If we set g(k) := 1, we get the usual Euler transform. <br />
 * 2. If we set f(k) := - f1(k) and g(k) := -1, we get the weighout transform (cf. A026007). <br />
 * 3. If we set f(k) := - n (A001478) and g(k) := k (A000027), we get A266964. <br />
 * 4. With the default f(k) := g(k) := A000012 (all 1's), we get A000041 (number of partitions of n). <br />
 * @author Georg Fischer
 */
public class RationalProductTransform extends AbstractSequence implements RationalSequence {

  private static int sDebug = 0;
  private static final int ESTLEN = 1024; // estimated length of arrays
  private final ArrayList<Q> mFs = new ArrayList<>(ESTLEN); // first underlying sequence (Manyama's f(k))
  private final ArrayList<Q> mGs = new ArrayList<>(ESTLEN); // second underlying sequence (Manyama's g(k))
  private final ArrayList<Q> mBs = new ArrayList<>(ESTLEN); // resulting sequence (Manyama's a(n))
  private final ArrayList<Q> mCs = new ArrayList<>(ESTLEN); // auxiliary sequence (Manyama's b(n))
  private int mN; // index of resulting term
  private int mIn; // index for initial terms
  private int mK; // current index k >= 1 for f() and g()
  private int mH; // current index for h()
  private Z mNextH; // next term of the sequence h(k)
  private Z mFactorial; // = k!


  /* Caution, the following are bitmasks, c.f. usage at the end of <code>compute()</code>: */
  /** Bitmask indicating the numerators of an ordinary target generating function. */
  private static final int OGF = 0;
  /** Bitmask indicating the numerators of an exponential target or an exponential source generating function. */
  private static final int EGF = 1;
  /** Bitmask indicating the denominators of an ordinary target generating function. */
  private static final int DEN_OGF = 4;
  /** Bitmask indicating the denominators of an exponential target generating function. */
  private static final int DEN_EGF = 5;

  /** Function types for f(), g() and h(). */
  private enum FunctionType {
    TYPE_NULL         // parameter is absent, take the default (usually 1)
    , TYPE_CONST_L    // a constant long
    , TYPE_LAMBDA_L   // a lambda expression k -> Long
    , TYPE_LAMBDA_Z   // a lambda expression k -> Z
    , TYPE_LAMBDA_Q   // a lambda expression k -> Q
    , TYPE_SEQUENCE_Z // next,  successive terms of a Sequence
    , TYPE_SEQUENCE_Q // nextQ, successive terms of a RationalSequence
    , TYPE_LAMBDA2_Z  // function(k, t) of successive terms t of a Sequence
    , TYPE_LAMBDA2_Q  // function(k, t) of successive terms t of a RationalSequence
  }

  /** Encapsulate the parameters. */
  private final Builder mBuilder; //

  /**
   * Builder inner class for flexible parameter setup.
   */
  public static class Builder {

    private int mGfType; // type of the resulting generating function
    private Q[] mPreTerms; // initial terms to be prepended
    private int mMinK; // starting value for k
    private int mSkipNo; // how many leading terms to skip from the resulting sequence

    private FunctionType mFType; // type of function f()
    private long mFVal;
    private Function<Long, Long> mFLambdaL;
    private Function<Integer, Z> mFLambdaZ;
    private Function<Integer, Q> mFLambdaQ;
    private BiFunction<Integer, Z, Z> mFLambda2Z;
    private BiFunction<Integer, Q, Q> mFLambda2Q;
    private Sequence mFSequenceZ; // sequence for the exponent of the parenthesis: 1/(1-x^k)^f(k)
    private RationalSequence mFSequenceQ; // RationalSequence for the exponent of the parenthesis: 1/(1-x^k)^f(k)

    private FunctionType mGType; // type of function g()
    private long mGVal;
    private Function<Long, Long> mGLambdaL;
    private Function<Integer, Z> mGLambdaZ;
    private Function<Integer, Q> mGLambdaQ;
    private BiFunction<Integer, Z, Z> mGLambda2Z;
    private BiFunction<Integer, Q, Q> mGLambda2Q;
    private Sequence mGSequenceZ; // sequence for the factor of x^k: 1/(1-g(k)*x^k)^f(k)
    private RationalSequence mGSequenceQ; // RationalSequence for the factor of x^k: 1/(1-g(k)*x^k)^f(k)

    private FunctionType mHType; // type of function h()
    private long mHVal;
    private Function<Long, Long> mHLambdaL;
    private Function<Integer, Z> mHLambdaZ;
    private BiFunction<Integer, Z, Z> mHLambda2Z;
    private Sequence mHSequenceZ; // monontone increasing (!) sequence for the exponent of x: 1/(1-g(k)*x^h(k))^f(k)
    // no RationalSequence mHSequenceQ: rational exponents of x are not allowed

    /**
     * Empty constructor: set the defaults for all optional parameters.
     */
    public Builder() {
      mHLambdaL = k -> (long) k;     // default: h=k in prod(1/(1 - x^h))
      mFType = FunctionType.TYPE_NULL; // default: f=1 in prod(1/(1 - x^k)^f)
      mGType = FunctionType.TYPE_NULL; // default: g=1 in prod(1/(1 - g*x^k))
      mHType = FunctionType.TYPE_NULL; // default: h=k in prod(1/(1 - g*x^h))
      mGfType = OGF;
      mPreTerms = QUtils.toQ("1");
      mMinK = 1; // default: start with k >= 1
      mSkipNo = 0; // default: do not skip leading terms
    }

    /**
     * Set the denominator sequence flag.
     * @return this
     */
    public Builder den() {
      mGfType |= DEN_OGF;
      return this;
    }

    /**
     * The the <code>egf</code> flag
     * @return this
     */
    public Builder egf() {
      mGfType |= EGF;
      return this;
    }

    /**
     * Specify a constant f value
     * @param val value
     * @return this
     */
    public Builder f(final long val) {
      mFVal = val;
      mFType = FunctionType.TYPE_CONST_L;
      return this;
    }

    /**
     * Specify a lambda f value
     * @param lambda value
     * @return this
     */
    public Builder fl(final Function<Long, Long> lambda) {
      mFLambdaL = lambda;
      mFType = FunctionType.TYPE_LAMBDA_L;
      return this;
    }

    /**
     * Specify a lambda f value
     * @param lambda value
     * @return this
     */
    public Builder f(final Function<Integer, Z> lambda) {
      mFLambdaZ = lambda;
      mFType = FunctionType.TYPE_LAMBDA_Z;
      return this;
    }

    /**
     * Specify a sequence f value
     * @param seq value
     * @return this
     */
    public Builder f(final Sequence seq) {
      mFSequenceZ = seq.skip(mMinK - seq.getOffset());
      mFType = FunctionType.TYPE_SEQUENCE_Z;
      return this;
    }

    /**
     * Specify a lambda and sequence f value
     * @param lambda2 value
     * @param seq value
     * @return this
     */
    public Builder f(final BiFunction<Integer, Z, Z> lambda2, final Sequence seq) {
      mFLambda2Z = lambda2;
      mFSequenceZ = seq.skip(mMinK - seq.getOffset());
      mFType = FunctionType.TYPE_LAMBDA2_Z;
      return this;
    }

    /**
     * Specify a lambda f value
     * @param lambda value
     * @return this
     */
    public Builder fq(final Function<Integer, Q> lambda) {
      mFLambdaQ = lambda;
      mFType = FunctionType.TYPE_LAMBDA_Q;
      return this;
    }

    /**
     * Specify a sequence f value
     * @param seq value
     * @return this
     */
    public Builder fq(final RationalSequence seq) {
      mFSequenceQ = seq;
      for (int s = mMinK - seq.getOffset(); s > 0; --s) {
        seq.nextQ();
      }
      mFType = FunctionType.TYPE_SEQUENCE_Q;
      return this;
    }

    /**
     * Specify a lambda and sequence f value
     * @param lambda2 value
     * @param seq value
     * @return this
     */
    public Builder fq(final BiFunction<Integer, Q, Q> lambda2, final RationalSequence seq) {
      mFLambda2Q = lambda2;
      mFSequenceQ = seq;
      for (int s = mMinK - seq.getOffset(); s > 0; --s) {
        seq.nextQ();
      }
      mFType = FunctionType.TYPE_LAMBDA2_Q;
      return this;
    }

    /**
     * Specify a constant g value
     * @param val value
     * @return this
     */
    public Builder g(final long val) {
      mGVal = val;
      mGType = FunctionType.TYPE_CONST_L;
      return this;
    }

    /**
     * Specify a lambda g value
     * @param lambda value
     * @return this
     */
    public Builder gl(final Function<Long, Long> lambda) {
      mGLambdaL = lambda;
      mGType = FunctionType.TYPE_LAMBDA_L;
      return this;
    }

    /**
     * Specify a lambda g value
     * @param lambda value
     * @return this
     */
    public Builder g(final Function<Integer, Z> lambda) {
      mGLambdaZ = lambda;
      mGType = FunctionType.TYPE_LAMBDA_Z;
      return this;
    }

    /**
     * Specify a sequence g value
     * @param seq value
     * @return this
     */
    public Builder g(final Sequence seq) {
      mGSequenceZ = seq.skip(mMinK - seq.getOffset());
      mGType = FunctionType.TYPE_SEQUENCE_Z;
      return this;
    }

    /**
     * Specify a lambda and sequence g value
     * @param lambda2 value
     * @param seq value
     * @return this
     */
    public Builder g(final BiFunction<Integer, Z, Z> lambda2, final Sequence seq) {
      mGLambda2Z = lambda2;
      mGSequenceZ = seq.skip(mMinK - seq.getOffset());
      mGType = FunctionType.TYPE_LAMBDA2_Z;
      return this;
    }

    /**
     * Specify a lambda g value
     * @param lambda value
     * @return this
     */
    public Builder gq(final Function<Integer, Q> lambda) {
      mGLambdaQ = lambda;
      mGType = FunctionType.TYPE_LAMBDA_Q;
      return this;
    }

    /**
     * Specify a sequence g value
     * @param seq value
     * @return this
     */
    public Builder gq(final RationalSequence seq) {
      mGSequenceQ = seq;
      for (int s = mMinK - seq.getOffset(); s > 0; --s) {
        seq.nextQ();
      }
      mGType = FunctionType.TYPE_SEQUENCE_Q;
      return this;
    }

    /**
     * Specify a lambda and sequence g value
     * @param lambda2 value
     * @param seq value
     * @return this
     */
    public Builder gq(final BiFunction<Integer, Q, Q> lambda2, final RationalSequence seq) {
      mGLambda2Q = lambda2;
      mGSequenceQ = seq;
      for (int s = mMinK - seq.getOffset(); s > 0; --s) {
        seq.nextQ();
      }
      mGType = FunctionType.TYPE_LAMBDA2_Q;
      return this;
    }

    /**
     * Specify a constant g value
     * @param val value
     * @return this
     */
    public Builder h(final long val) {
      mHVal = val;
      mHType = FunctionType.TYPE_CONST_L;
      return this;
    }

    /**
     * Specify a lambda h value
     * @param lambda value
     * @return this
     */
    public Builder hl(final Function<Long, Long> lambda) {
      mHLambdaL = lambda;
      mHType = FunctionType.TYPE_LAMBDA_L;
      return this;
    }

    /**
     * Specify a lambda h value
     * @param lambda value
     * @return this
     */
    public Builder h(final Function<Integer, Z> lambda) {
      mHLambdaZ = lambda;
      mHType = FunctionType.TYPE_LAMBDA_Z;
      return this;
    }

    /**
     * Specify a sequence h value
     * @param seq value
     * @return this
     */
    public Builder h(final Sequence seq) {
      mHSequenceZ = seq.skip(mMinK - seq.getOffset());
      mHType = FunctionType.TYPE_SEQUENCE_Z;
      return this;
    }

    /**
     * Specify a lambda and sequence h value
     * @param lambda2 value
     * @param seq value
     * @return this
     */
    public Builder h(final BiFunction<Integer, Z, Z> lambda2, final Sequence seq) {
      mHLambda2Z = lambda2;
      mHSequenceZ = seq.skip(mMinK - seq.getOffset());
      mHType = FunctionType.TYPE_LAMBDA2_Z;
      return this;
    }

    /**
     * Prepend terms.
     * @param preTerms string of prepend terms
     * @return this
     */
    public Builder prepend(final String preTerms) {
      mPreTerms = QUtils.toQ(preTerms);
      return this;
    }

    /**
     * Specify a start value for k different from 1.
     * @param minK starting value for k in <code>prod_{k &gt;= </code>
     * @return this
     */
    public Builder kMin(final int minK) {
      mMinK = minK;
      return this;
    }

    /**
     * Specify how many leading terms of the resulting sequence should by skipped.
     * @param skipNo number of terms to be omitted
     * @return this
     */
    public Builder skip(final int skipNo) {
      mSkipNo = skipNo;
      return this;
    }

  } // inner class Builder

  /**
   * Get the next term of the function for the exponent of x.
   */
  private void advanceH() {
    switch (mBuilder.mHType) {
      case TYPE_CONST_L:
        mNextH = Z.valueOf(mBuilder.mHVal);
        break;
      case TYPE_LAMBDA_L:
        mNextH = Z.valueOf(mBuilder.mHLambdaL.apply((long) mH));
        break;
      case TYPE_LAMBDA_Z:
        mNextH = mBuilder.mHLambdaZ.apply(mH);
        break;
      case TYPE_SEQUENCE_Z:
        mNextH = mBuilder.mHSequenceZ.next(); // may not be a FiniteSequence
        break;
      case TYPE_LAMBDA2_Z:
        mNextH = mBuilder.mHLambda2Z.apply(mH, mBuilder.mHSequenceZ.next()); // may not be a FiniteSequence
        break;
      case TYPE_NULL:
      default:
        mNextH = Z.valueOf(mH);
        break;
    }
  }

  /**
   * Constructor with Builder.
   * @param offset first index
   * @param builder {@link RationalProductTransform.Builder} inner class for flexible parameter setup
   */
  public RationalProductTransform(final int offset, final Builder builder) {
    super(offset);
    mBuilder = builder;
    mN = offset - 1;
    mK = mBuilder.mMinK - 1;
    mIn = 0; // for prepending of initial terms
    mFactorial = Z.ONE;
    for (int k = 0; k < builder.mMinK; ++k) {
      mFs.add(Q.ZERO); // [0] not used
      mGs.add(Q.ZERO); // [0] not used
      mBs.add(Q.ZERO); // [0] is not returned
      mCs.add(Q.ZERO); // [0] starts the sum
    } // while < kStart
    mH = Math.min(mBuilder.mMinK, 1);
    advanceH();
    for (int sk = 0; sk < mBuilder.mSkipNo; ++sk) { // do skip
      nextQ();
    }
  }

  @Override
  public Q nextQ() {
    ++mN;
    if (mBuilder.mMinK > 0 && mIn < mBuilder.mPreTerms.length) { // during prepend phase
      return mBuilder.mPreTerms[mIn++];
    }
    ++mK; // starts with mMinK
    Q nextF = Q.ONE;
    Z tempF;
    switch (mBuilder.mFType) {
      case TYPE_CONST_L:
        nextF = Q.valueOf(mBuilder.mFVal);
        break;
      case TYPE_LAMBDA_L:
        nextF = Q.valueOf(mBuilder.mFLambdaL.apply((long) mK));
        break;
      case TYPE_LAMBDA_Z:
        nextF = Q.valueOf(mBuilder.mFLambdaZ.apply(mK));
        break;
      case TYPE_LAMBDA_Q:
        nextF = mBuilder.mFLambdaQ.apply(mK);
        break;
      case TYPE_SEQUENCE_Z:
        tempF = mBuilder.mFSequenceZ.next();
        if (tempF == null) { // maybe a FiniteSequence
          tempF = Z.ZERO;
        }
        nextF = Q.valueOf(tempF);
        break;
      case TYPE_SEQUENCE_Q:
        nextF = mBuilder.mFSequenceQ.nextQ();
        break;
      case TYPE_LAMBDA2_Z:
        tempF = mBuilder.mFSequenceZ.next();
        if (tempF == null) { // maybe a FiniteSequence
          tempF = Z.ZERO;
        }
        nextF = Q.valueOf(mBuilder.mFLambda2Z.apply(mK, tempF));
        break;
      case TYPE_LAMBDA2_Q:
        nextF = mBuilder.mFLambda2Q.apply(mK, mBuilder.mFSequenceQ.nextQ());
        break;
      case TYPE_NULL:
      default:
        break;
    }
    mFs.add(nextF);
    Q nextG = Q.ONE;
    Z tempG;
    switch (mBuilder.mGType) {
      case TYPE_CONST_L:
        nextG = Q.valueOf(mBuilder.mGVal);
        break;
      case TYPE_LAMBDA_L:
        nextG = Q.valueOf(mBuilder.mGLambdaL.apply((long) mK));
        break;
      case TYPE_LAMBDA_Z:
        nextG = Q.valueOf(mBuilder.mGLambdaZ.apply(mK));
        break;
      case TYPE_LAMBDA_Q:
        nextG = mBuilder.mGLambdaQ.apply(mK);
        break;
      case TYPE_SEQUENCE_Z:
        tempG = mBuilder.mGSequenceZ.next();
        if (tempG == null) { // maybe a FiniteSequence
          tempG = Z.ZERO;
        }
        nextG = Q.valueOf(tempG);
        break;
      case TYPE_SEQUENCE_Q:
        nextG = mBuilder.mGSequenceQ.nextQ();
        break;
      case TYPE_LAMBDA2_Z:
        tempG = mBuilder.mGSequenceZ.next();
        if (tempG == null) { // maybe a FiniteSequence
          tempG = Z.ZERO;
        }
        nextG = Q.valueOf(mBuilder.mGLambda2Z.apply(mK, tempG));
        break;
      case TYPE_LAMBDA2_Q:
        nextG = mBuilder.mGLambda2Q.apply(mK, mBuilder.mGSequenceQ.nextQ());
        break;
      case TYPE_NULL:
      default:
        break;
    }
    if (sDebug > 0) {
      System.out.println("before: mH=" + mH + ", mK=" + mK + ", mNextH=" + mNextH + ", nextG=" + nextG);
    }
    if (Z.valueOf(mK).compareTo(mNextH) < 0) { // exponent in x^h(k) not yet reached: invalidate this g(k)
      nextG = Q.ZERO; // invalidate this g(k)
    } else { // mK = mNextH : this g(k) is valid, pass nextG = g(k) unchanged
      ++mH;
      advanceH(); // and keep this g(k)
    }
    if (sDebug > 0) {
      System.out.println("after:  mH=" + mH + ", mK=" + mK + ", mNextH=" + mNextH + ", nextG=" + nextG);
    }
    mGs.add(nextG);
    Q cSum = Q.ZERO; // start sum
    final int kd2 = mK >> 1;
    for (int d = 1; d <= mK; ++d) { // compute c[k] = sum ...
      if (d == 1 || d == mK || (d <= kd2 && (mK % d == 0))) { // "did(mK,d)", "does it divide"
        // if (mK % d == 0) { // "did(mK,d)"
        final int idivd = mK / d;
        final Q fTerm = mFs.get(d);
        if (!fTerm.isZero()) { // ends in zero for all finite f(k)
          Q cTerm = fTerm.multiply(d);
          final Q gTerm = mGs.get(d);
          if (!gTerm.isZero()) { //---- start of the generalization
            if (!gTerm.equals(Q.ONE)) { // != 1
              if (gTerm.equals(Q.NEG_ONE)) {
                if ((idivd & 1) != 0) {
                  cTerm = cTerm.negate(); // *(-1)^odd
                } // (-1)^even: ignore
              } else { // != -1
                cTerm = cTerm.multiply(gTerm.pow(idivd));
              }
            } // else cTerm * 1^(...): ignore //---- end of generalization
            cSum = cSum.add(cTerm);
          } // else g(k) = 0: ignore
        } // else f(k) = 0: ignore
      } // else not "did(mK,d)"
    } // for d
    // mCs.set(mK, csum);
    mCs.add(cSum); // = c[k]
    Q result = mCs.get(mK); // bsum
    for (int d = 1; d < mK; ++d) {
      result = result.add(mCs.get(d).multiply(mBs.get(mK - d)));
    } // for d
    if (mK > 0) {
      result = result.divide(mK);
    }
    if (mBuilder.mMinK <= 0 && mIn < mBuilder.mPreTerms.length) { // during prepend phase
      result = mBuilder.mPreTerms[mIn++];
      mBs.add(result);
      return result;
    } else {
      mBs.add(result);
    }
    if ((mBuilder.mGfType & EGF) != 0) {
      if (mN > 0) {
        mFactorial = mFactorial.multiply(mN);
      }
      result = result.multiply(mFactorial);
      if (sDebug >= 1) {
        System.out.println("# mFactorial=" + mFactorial + ", mN=" + mN);
      }
    }
    return result;
  } // nextQ

  @Override
  public Z next() {
    final Q result = nextQ();
    return ((mBuilder.mGfType & DEN_OGF) == 0) ? result.num() : result.den();
  } // next

}
