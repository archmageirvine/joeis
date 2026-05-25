package irvine.oeis.a396;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396031 allocated for Alex Evetts.
 * @author Sean A. Irvine
 */
public class A396031 extends Sequence0 {

  // Uses a local matrix over ints for speed.
  // Will detect when overflow occurs

  private final int mR;
  private final int mDim;
  private final int mNumGens;
  private final int[][][] mGens;
  private Set<Mat> mPrev = new HashSet<>();
  private Set<Mat> mSphere = new HashSet<>();
  private int mN = -1;

  protected A396031(final int r) {
    mR = r;
    mDim = r + 2;
    mNumGens = 4 * r;
    final Mat id = new Mat();
    mPrev.add(id);
    mSphere.add(id);
    mGens = buildGenerators();
  }

  /** Construct the sequence. */
  public A396031() {
    this(2);
  }

  private int[][][] buildGenerators() {
    final int[][][] gens = new int[mNumGens][mDim][mDim];
    int k = 0;

    // First family
    for (int i = 0; i < mR; ++i) {
      gens[k] = identity();
      gens[k][i + 1][mR + 1] = 1;
      ++k;

      gens[k] = identity();
      gens[k][i + 1][mR + 1] = -1;
      ++k;
    }

    // Second family
    for (int j = 0; j < mR; ++j) {
      gens[k] = identity();
      gens[k][0][j + 1] = 1;
      ++k;

      gens[k] = identity();
      gens[k][0][j + 1] = -1;
      ++k;
    }

    return gens;
  }

  private int[][] identity() {
    final int[][] m = new int[mDim][mDim];
    for (int k = 0; k < mDim; ++k) {
      m[k][k] = 1;
    }
    return m;
  }

  private final class Mat {
    private final int[][] mA;

    private Mat() {
      mA = identity();
    }

    private Mat(final int[][] a) {
      mA = a;
    }

    private Mat multiply(final int[][] b) {
      final int[][] c = new int[mDim][mDim];
      for (int i = 0; i < mDim; ++i) {
        for (int j = 0; j < mDim; ++j) {
          int s = 0;
          for (int k = 0; k < mDim; ++k) {
            s = Math.addExact(s, Math.multiplyExact(mA[i][k], b[k][j]));
          }
          c[i][j] = s;
        }
      }
      return new Mat(c);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Mat)) {
        return false;
      }
      final Mat other = (Mat) obj;
      for (int i = 0; i < mDim; ++i) {
        for (int j = 0; j < mDim; ++j) {
          if (mA[i][j] != other.mA[i][j]) {
            return false;
          }
        }
      }
      return true;
    }

    @Override
    public int hashCode() {
      int h = 0;
      for (int i = 0; i < mDim; ++i) {
        for (int j = 0; j < mDim; ++j) {
          h = 31 * h + mA[i][j];
        }
      }
      return h;
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }

    final Set<Mat> newSphere = new HashSet<>();

    for (final Mat g : mSphere) {
      for (final int[][] gen : mGens) {
        final Mat elt = g.multiply(gen);
        if (!mPrev.contains(elt)) {
          newSphere.add(elt);
        }
      }
    }

    mPrev = mSphere;
    mSphere = newSphere;

    return Z.valueOf(mSphere.size());
  }
}
