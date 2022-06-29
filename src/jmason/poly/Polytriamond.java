package jmason.poly;

import java.util.ArrayList;
import java.util.List;

/**
 * An integral polytriamond.
 * @author Sean A. Irvine
 */
public class Polytriamond extends PolyGen<Triangle, CoordSet2T> {

  /**
   * Build a polytriamond from a coordinate set.
   * @param c coordinates
   */
  public Polytriamond(final CoordSet2T c) {
    builder(c, true);
    ((CoordSet2T) mCs).calculate();
  }

  // build a polyomino from a coordinate set adding one square
  Polytriamond(final CoordSet2T c, final int x, final int y) {
    mCs = c.copy(x, y);
    mUniq = mCs.makeUnique();
    ((CoordSet2T) mCs).calculate();
  }

  int getWidth() {
    return ((CoordSet2T) mCs).getWidth();
  }

  int getHeight() {
    return ((CoordSet2T) mCs).getHeight();
  }

  private static final int[][][] DELTAS = {
    {{1, 2, 3}, {0, 0, 0}},
    {{1, 2, 2}, {0, 0, -2}},
    {{1, 2, 1}, {0, 0, 2}},
    {{1, 1, 2}, {0, 2, 2}},
    {{1, 1, 0}, {0, 2, 2}},

    {{-1, -2, -3}, {0, 0, 0}},
    {{-1, -2, -2}, {0, 0, -2}},
    {{-1, -2, -1}, {0, 0, 2}},
    {{-1, -1, -2}, {0, 2, 2}},
    {{-1, -1, 0}, {0, 2, 2}},

    {{0, -1, -2}, {-2, -2, -2}},
    {{0, -1, 1}, {-2, -2, -2}},
    {{0, 1, 2}, {-2, -2, -2}},
    {{0, -1, -1}, {-2, -2, -4}},
    {{0, 1, 1}, {-2, -2, -4}},
  };

  /**
   * Build list (without duplicates) of polytriamonds that can be generated from
   * this polytriamond.
   * @param addOnlyToColour color
   * @return children
   */
  public List<Polytriamond> listSons(final int addOnlyToColour) {
    final ArrayList<Polytriamond> list = new ArrayList<>();
    final UniquenessTester h = new UniquenessTester();
    final UniquenessTester hc = new UniquenessTester();

    for (int i = 0; i < size(); ++i) {
      if (addOnlyToColour != 0 && mCs.getColour(i) != addOnlyToColour) {
        continue;
      }
      final Triangle t = mCs.mSet.mSet[i];
      if (t.up()) {
        for (final int[][] delta : DELTAS) {
          tryShape(i, delta[0], delta[1], 1, list, h, hc);
        }
      } else {
        for (final int[][] delta : DELTAS) {
          tryShape(i, delta[0], delta[1], -1, list, h, hc);
        }
      }
    }
    return list;
  }

  private void tryShape(final int i, final int[] dx, final int[] dy, final int d, final ArrayList<Polytriamond> list, final UniquenessTester h, final UniquenessTester hc) {

    for (int k = 0; k < dx.length; ++k) {
      final int x = mCs.getX(i) + dx[k];
      final int y = mCs.getY(i) + dy[k] * d;
      if (((CoordSet2T) mCs).exists(x, y)) {
        return;
      }
    }

    // todo make entire triple as key -- but sorted?
//    final String t = x + " " + y;
//    if (!hc.add(t)) {
//      return;
//    }

    final int size = mCs.mSize;
    final CoordSet2T cs = new CoordSet2T(size + 3, true, false, false); // todo these flags should come from elsewhere
    for (int k = 0; k < size; ++k) {
      cs.mSet.setElement(k, mCs.mSet.getElement(k).copy());
    }
    for (int k = 0; k < dx.length; ++k) {
      final int x = mCs.getX(i) + dx[k];
      final int y = mCs.getY(i) + dy[k] * d;
      cs.setTriangle(size + k, x, y, 0);
    }
    cs.placeInSextant();

//    CoordSet2T cs = (CoordSet2T) mCs;
//    for (int k = 0; k < dx.length; ++k) {
//      final int x = mCs.getX(i) + dx[k];
//      final int y = mCs.getY(i) + dy[k] * d;
//      cs = cs.copy(x, y); // todo is this doing canon and screwing it up
//    }
    final Polytriamond p = new Polytriamond(cs);
    if (!h.add(p.mUniq)) {
      return;
    }
    list.add(p);
  }

  /**
   * Test if this polyiamond is bilaterally symmetric.
   * @return true if bilaterally symmetric
   */
  public boolean isBilateralSymmetric() {
    final CoordSet2T coords = (CoordSet2T) mCs;
    final String cs = coords.makeString();
    if (coords.mirrorVert().makeString().equals(cs) || coords.mirrorHoriz().makeString().equals(cs)) {
      return true;
    }
    final CoordSet2T rot60 = coords.rotate60();
    final String c60s = rot60.makeString();
    if (rot60.mirrorVert().makeString().equals(c60s) || rot60.mirrorHoriz().makeString().equals(c60s)) {
      return true;
    }
    final CoordSet2T rot120 = rot60.rotate60();
    final String c120s = rot120.makeString();
    return rot120.mirrorVert().makeString().equals(c120s) || rot120.mirrorHoriz().makeString().equals(c120s);
  }

  /**
   * Compute the size of the perimeter of this polyomino.
   * @return the size of the perimeter
   */
  public int perimeterSize() {
    return ((CoordSet2T) mCs).perimeterSize();
  }

  /**
   * Compute the size of the edge perimeter of this polyomino.
   * @return the size of the edge perimeter
   */
  public int edgePerimeterSize() {
    return ((CoordSet2T) mCs).edgePerimeterSize();
  }
}
