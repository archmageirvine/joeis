package jmason.poly;

/**
 * A PolyGen may become a Polyomino or a PolyCube.
 * It is based in a CoordSetGen which may be a set of xy coordinates or xyz coordinates
 * @author jmason
 */
public abstract class PolyGen extends PolyBase {

  protected String mUniq;
  protected CoordSetGen mCs;

  public boolean odd() {
    return (size() & 1) == 1;
  }

  public int size() {
    return mCs.mSize;
  }

  protected void builder(final CoordSetGen c, final boolean copy) {
    if (copy) {
      mCs = c.cloneSet();
    } else {
      mCs = c;
    }
    mUniq = mCs.makeUnique();
  }

  // can a generated polyomino be built from one of the same mSize but lower value than current?
  @Override
  public String toString() {
    return mCs.toString() + mUniq;
  }
}
