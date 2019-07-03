package jmason.poly;

/**
 * A PolyGen may become a Polyomino or a PolyCube.
 * It is based in a CoordSetGen which may be a set of xy coordinates or xyz coordinates
 * @author jmason
 * @param <T> type of coordinates
 */
public abstract class PolyGen<T extends CoordSetGen> extends PolyBase {

  protected String mUniq;
  protected CoordSetGen mCs;

  boolean odd() {
    return (size() & 1) == 1;
  }

  int size() {
    return mCs.mSize;
  }

  protected void builder(final T c, final boolean copy) {
    mCs = copy ? c.copySet() : c;
    mUniq = mCs.makeUnique();
  }

  // can a generated polyomino be built from one of the same mSize but lower value than current?
  @Override
  public String toString() {
    return mCs.toString() + mUniq;
  }
}
