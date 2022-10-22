package irvine.oeis.cons;

import java.util.ArrayList;
import java.util.function.Function;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A sequence generating a folded continued fraction.
 * This class implements the theorem in the paper:
 * Jeffrey O. Shallit, "Simple Continued Fractions for Some Irrational Numbers II", J. Number Theory 14 (1982), 228-231,
 * together with its application to Liouville's number in section III.
 * The constant that is expanded into a continued fraction is Sum_{k&gt;=0} u^(-c(k)).
 * The continued fraction has peaks terms at u(d(k)), where d(k) = c(k + 1) - 2*c(k).
 * @author Georg Fischer
 */
public class FoldedContinuedFraction extends ArrayList<Z> implements SequenceWithOffset {

  protected boolean mCompress;
  protected int mN;
  private final int mOffset;
  protected final Function<Integer, Z> mLambda; // lambda expression k -&gt; u(d(k))
  protected int mNy; // number of folds
  protected int mCfType; // type of the c.f.: 0 = Shallit's theorem, 1 = folded only

  /**
   * Construct the sequence for a Liouville constant.
   * @param offset first index
   * @param m Liouville's constant base number (see section III of the paper)
   * @param inits initial terms
   */
  public FoldedContinuedFraction(final int offset, final int m) {
    this(offset, k -> Z.valueOf(m).pow(MemoryFactorial.SINGLETON.factorial(k + 1).multiply(k)), 0, m - 1, m + 1);
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param lambda expression that maps k (originally: ny): k -&gt; u(d(k))
   * @param inits initial terms
   */
  public FoldedContinuedFraction(int offset, final Function<Integer, Z> lambda, final long... inits) {
    mNy = 0; // (inits.length - 1) / 2; // initial terms must contain folding #0 and #1
    mCfType = 0;
    mCompress = true;
    mOffset = offset;
    mLambda = lambda;
    mN = offset - 1;
    while (--offset >= 0) { // prefix with zeros that are not used
      add(Z.ZERO);
    }
    for (final long init : inits) {
      add(Z.valueOf(init));
    }
  }

  /**
   * Set the type of the continued fraction.
   * @param cfType code for the type: 0 = Shallit's theorem, 1 = folding only
   */
  public void setCfType(final int cfType) {
    mCfType = cfType;
  }

  /**
   * Set the start of index for the record values
   * @param start 0 for Shallit's theorem
   */
  public void setStart(final int start) {
    mNy = start;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    ++mN;
    int n = size() - 1;
    if (mN > n) { // fold
      if (mCfType != 1 && (n & 1) == 1) { // n odd, make it even
        final Z an = get(n);
        if (! an.equals(Z.ONE)) { // [a(0),a(1),...,a(n-1), a(n)] = [a(0),a(1),...,a(n-1), a(n) - 1, 1]
          set(n, an.subtract(1));
          add(Z.ONE);
        } else { //                  [a(0),a(1),...,a(n-1),    1] = [a(0),a(1),...,a(n-1) + 1]
          remove(n);
          set(n - 1, get(n - 1).add(1));
        }
        n = size() - 1;
      } // n = is even now

      ++mNy;
      Z ins1 = mLambda.apply(mNy); // u(d(ny)) - 1
      final Z an = get(n);
      if (mCfType == 1) {
        add(ins1);
        for (int k = n; k >= 0; --k) {
          add(get(k));
        }
      } else {
        // Shallit's theorem: [a(0),a(1),...,a(n-1), a(n)] -> [a(0),a(1),...,a(n), u(d(ny)) - 1, 1, a(n) - 1, a(n-1),...,a(2),a(1)]
        // Zero elimination: [a(0),a(1),...,a(k),0,a(k+1),a(k+2),...,a(n)] = [a(0),a(1),...,a(k)+a(k+1),a(k+2),...,a(n)]
        ins1 = ins1.subtract(1);
        final Z ins2 = an.subtract(1); // a(n) - 1
        if (ins1.isZero()) {
          set(n, an.add(1));
          if (ins2.isZero()) {
            add(get(n).add(get(n - 1)));
          } else {
            add(ins2);
            add(get(n - 1));
          }
        } else {
          add(ins1);
          if (mCompress && ins2.isZero()) {
            add(get(n - 1).add(Z.ONE));
          } else {
            add(Z.ONE);
            add(ins2);
            add(get(n - 1));
          }
        }
        for (int k = n - 2; k >= 1; --k) {
          add(get(k));
        }
      }
    } // fold
    return get(mN);
  }


  /**
   * Test program.
   * @param argv command line arguments: m
   */
  public static void main(final String[] argv) {
    int m = 10;
    try {
      if (argv.length > 0) {
        m = Integer.parseInt(argv[0]);
      }
    } catch (final RuntimeException exc) {
      // ignored
    }
    final FoldedContinuedFraction fcf = new FoldedContinuedFraction(0, m); // A058304 = Liouville's constant
    for (int it = 0; it <= 62; ++it) {
      System.out.println(it + " " + fcf.next());
    }
  }
}
