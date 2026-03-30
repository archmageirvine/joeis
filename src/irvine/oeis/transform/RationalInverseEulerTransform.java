package irvine.oeis.transform;

import irvine.math.api.RationalSequence;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Apply the inverse Euler transform to another sequences f, as defined in OEIS A358451
 * @author Georg Fischer
 */
public class RationalInverseEulerTransform extends RationalProductTransform implements RationalSequence {

  /**
   * Constructor with Builder.
   * @param offset first index
   * @param builder {@link RationalInverseEulerTransform.Builder} inner class for flexible parameter setup
   */
  public RationalInverseEulerTransform(final int offset, final Builder builder) {
    super(offset, builder); 
    mN = offset - 1;
  }

  @Override
  public Q nextQ() {
    final Builder builder = getBuilder();
    if (mIn < builder.mPreTerms.length) { // during prepend phase
      return builder.mPreTerms[mIn++];
    }
    ++mN;
    ++mK; // starts with mMinK
    Q nextF = Q.ONE;
    Z tempF;
    switch (builder.getFType()) {
      case TYPE_CONST_L:
        nextF = Q.valueOf(builder.mFVal);
        break;
      case TYPE_LAMBDA_L:
        nextF = Q.valueOf(builder.mFLambdaL.apply((long) mK));
        break;
      case TYPE_LAMBDA_Z:
        nextF = Q.valueOf(builder.mFLambdaZ.apply(mK));
        break;
      case TYPE_LAMBDA_Q:
        nextF = builder.mFLambdaQ.apply(mK);
        break;
      case TYPE_SEQUENCE_Z:
        tempF = builder.mFSequenceZ.next();
        if (tempF == null) { // maybe a FiniteSequence
          tempF = Z.ZERO;
        }
        nextF = Q.valueOf(tempF);
        break;
      case TYPE_SEQUENCE_Q:
        nextF = builder.mFSequenceQ.nextQ();
        break;
      case TYPE_LAMBDA2_Z:
        tempF = builder.mFSequenceZ.next();
        if (tempF == null) { // maybe a FiniteSequence
          tempF = Z.ZERO;
        }
        nextF = Q.valueOf(builder.mFLambda2Z.apply(mK, tempF));
        break;
      case TYPE_LAMBDA2_Q:
        nextF = builder.mFLambda2Q.apply(mK, builder.mFSequenceQ.nextQ());
        break;
      case TYPE_NULL:
      default:
        break;
    }
    mBs.add(nextF == null ? Q.ZERO : nextF);
    mCs.add(Q.ZERO); // allocate c[n]
    final int i = mN;

    Q cSum = Q.valueOf(i).multiply(mBs.get(i));
    for (int d = 1; d < i; ++d) {
      cSum = cSum.subtract(mCs.get(d).multiply(mBs.get(i - d)));
    } // for d
    mCs.set(i, cSum);

    Q aSum = Q.ZERO;
    final int idiv2 = i >> 1;
    for (int d = 1; d <= i; ++d) { // compute c[k] = sum ...
      if (d == 1 || d == i || (d <= idiv2 && (i % d == 0))) {
        aSum = aSum.add(mCs.get(d).multiply(Functions.MOBIUS.i(i / d))); // "mob(i,d)"
      }
    } // for d
    Q result = aSum.divide(i);
    //mAs.add(aSum);
    
    if ((builder.mGfType & EGF) != 0) {
      if (mN > 0) {
        mFactorial = mFactorial.multiply(mN);
      }
      result = result.multiply(mFactorial);
    }
    return result;
  } // nextQ
/*
  @Override
  public Z next() {
    if (mIn < mPreTerms.length) { // during prepend phase
      return mPreTerms[mIn++];
    }
    // normal, transform terms
    ++mN; // starts with 1
    final Z bNext = mSeq.next();
    mBs.add(bNext == null ? Z.ZERO : bNext); // get next b(n)
    mCs.add(Z.ZERO); // allocate c[n]
    final int i = mN;

    Z cSum = Z.valueOf(i).multiply(mBs.get(i));
    for (int d = 1; d < i; ++d) {
      cSum = cSum.subtract(mCs.get(d).multiply(mBs.get(i - d)));
    } // for d
    mCs.set(i, cSum);

    Z aSum = Z.ZERO;
    final int idiv2 = i >> 1;
    for (int d = 1; d <= i; ++d) { // compute c[k] = sum ...
      if (d == 1 || d == i || (d <= idiv2 && (i % d == 0))) {
        aSum = aSum.add(mCs.get(d).multiply(Functions.MOBIUS.i(i / d))); // "mob(i,d)"
      }
    } // for d
    return aSum.divide(Z.valueOf(i));
    //mAs.add(aSum);
  }

*/
}
