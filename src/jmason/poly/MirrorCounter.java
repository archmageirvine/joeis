package jmason.poly;

/**
 * Counts polyominoes that are mirror symmetrical on border.
 * @author jmason
 */
public class MirrorCounter extends Counter {

  /**
   * Construct a new mirror counter.
   * @param max maximum size
   * @param flagFree free
   * @param flagFixed fixed
   * @param flagOneSided one-sided
   */
  public MirrorCounter(final int max, final boolean flagFree, final boolean flagFixed, final boolean flagOneSided) {
    super("mirror aligned axis", max, null);
    final CoordSet2 cs = new CoordSet2(2, flagFree, flagFixed, flagOneSided);
    cs.initDomino();
    count(2, max, new Polyomino(cs));
  }

  private void count(final int c, final int max, final Polyomino p) {
    mAccum.add(new Countable(p, true));
    if (c + 2 <= max) {
      // no guarantee of uniqueness
      for (final Polyomino newP : p.listMirrorSons()) {
        if (!mAccum.mUt.contains(newP.mUniq)) {
          count(c + 2, max, newP);
        }
      }
      if (((CoordSet2) (p.mCs)).symParaXaxis()) {
        final CoordSet2 cs = (CoordSet2) (p.mCs.copySet());
        cs.rotate();
        final Polyomino turned = new Polyomino(cs);
        // no guarantee of uniqueness
        for (final Polyomino newP : turned.listMirrorSons()) {
          if (!mAccum.mUt.contains(newP.mUniq)) {
            count(c + 2, max, newP);
          }
        }
      }
    }
  }
}
