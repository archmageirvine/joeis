package jmason.poly;

/**
 * A counter of polyominoes.
 * @author jmason
 */
public class PolyominoCounter {

  private final boolean mOnlyUnbiased;
  private final boolean mOnlyMaxBiased;
  private final boolean mWantSym;

  private final Cumulator mCu;
  private final Cumulator mOneAxis;
  private final Cumulator mTwoAxis;
  private final Cumulator mTwoTouch;
  private final Cumulator mUnbcu;
  private final Cumulator mAssymcu;
  private final Cumulator mMbcu;

  private final int mMax;
  private final UTest mUt;

  Cumulator getCu() {
    return mCu;
  }

  public Cumulator getUnbcu() {
    return mUnbcu;
  }

//  public Cumulator getAssymcu() {
//    return mAssymcu;
//  }

  public Cumulator getMbcu() {
    return mMbcu;
  }

  public PolyominoCounter(final int max, final boolean onlyUnbiased, final boolean onlyMaxBiased, final boolean wantSym) {
    mCu = new Cumulator("counters", max);
    mOneAxis = new Cumulator("oneAxis", max);
    mTwoAxis = new Cumulator("twoAxis", max);
    mTwoTouch = new Cumulator("twoTouch", max);

    mUnbcu = new Cumulator("unbiased counters", max);
    mAssymcu = new Cumulator("axis assym counters", max);
    mMbcu = new Cumulator("max-biased counters", max);

    mMax = max;
    mOnlyUnbiased = onlyUnbiased;
    mOnlyMaxBiased = onlyMaxBiased;
    mWantSym = wantSym;
    mUt = new UTest();
  }

  public void run(final boolean flagFree, final boolean flagFixed, final boolean flagOneSided) {
    final CoordSet2 cs = new CoordSet2(1, flagFree, flagFixed, flagOneSided);
    cs.initMonomino();
    count(1, mMax, new Polyomino(cs));
  }

  private void count(final int c, final int max, final Polyomino p) {
    int onlyIfColour = 0;
    p.mCs.verify();
    if (!mUt.put(p.mUniq)) {
      return;
    }

    if (mOnlyMaxBiased) {
      if (p.mCs.less() > CoordSetGen.minLess(max)) {
        return;
      }
    }

    // here count sideless
    final int axes = ((CoordSet2) (p.mCs)).hasSide(0) + ((CoordSet2) (p.mCs)).hasSide(1);
    if (axes >= 1) {
      mOneAxis.add(c);
    }
    if (axes == 2) {
      mTwoAxis.add(c);
    }
    if (((CoordSet2) (p.mCs)).twoTouch()) {
      mTwoTouch.add(c);
    }

    mCu.add(c);

    if (!p.mCs.biased()) {
      mUnbcu.add(c);
    }
    if (mWantSym) {
      if (!((CoordSet2) (p.mCs)).symReflect()) {
        mAssymcu.add(c);
      }
    }
    if (CoordSetGen.maxBias(c) == p.mCs.bias()) {
      mMbcu.add(c);
    }

    if (c < max) {
      if (mOnlyUnbiased && p.mCs.bias() > (max - c)) {
        return;
      }
      if (mOnlyMaxBiased) {
        if (p.mCs.less() == CoordSetGen.minLess(max)) {
          onlyIfColour = p.mCs.lessColour();
          if (((CoordSet2) (p.mCs)).freeLessEdge() < max - c) {
            return; // only last result is valid
          }
        }
      }
      for (final Polyomino son : p.listSons(onlyIfColour)) {
        count(c + 1, max, son);
      }
    }
  }
}
