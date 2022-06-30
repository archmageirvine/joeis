package jmason.poly;

/**
 * May become a <code>Polyomino</code> or a <code>PolyCube</code>.
 * It is based in a <code>CoordSetGen</code> which may be a set of <code>xy</code> coordinates or <code>xyz</code> coordinates.
 * @author jmason
 * @param <T> type of coordinates
 * @param <U> element type
 */
public abstract class PolyGen<U extends Element<U>, T extends CoordSetGen<U>> extends PolyBase {

  protected String mUniq;
  protected CoordSetGen<U> mCs;

  boolean odd() {
    return (size() & 1) == 1;
  }

  int size() {
    return mCs.mSize;
  }

  protected void builder(final T c, final boolean copy, final boolean withColor) {
    mCs = copy ? c.copySet() : c;
    mUniq = mCs.makeUnique(withColor);
  }

  public String getUniq() {
    return mUniq;
  }

  @Override
  public String toString() {
    return mCs.toString() + mUniq;
  }
}
