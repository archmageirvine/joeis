package jmason.poly;

import java.util.ArrayList;
import java.util.List;

/**
 * An integral polyiamond.
 * @author jmason
 */
public class Polyiamond extends PolyGen<Triangle, CoordSet2T> {

  /**
   * Build a polyiamond from a coordinate set.
   * @param c coordinates
   */
  public Polyiamond(final CoordSet2T c) {
    builder(c, true, false);
    ((CoordSet2T) mCs).calculate();
  }

  // build a polyomino from a coordinate set adding one cell
  Polyiamond(final CoordSet2T c, final int x, final int y) {
    mCs = c.copy(x, y);
    mUniq = mCs.makeUnique(false);
    ((CoordSet2T) mCs).calculate();
  }

  int getWidth() {
    return ((CoordSet2T) mCs).getWidth();
  }

  int getHeight() {
    return ((CoordSet2T) mCs).getHeight();
  }

  /**
   * Build list (without duplicates) of polyiamonds that can be generated from
   * this polyiamond.
   * @param addOnlyToColour color
   * @return children
   */
  public List<Polyiamond> listSons(final int addOnlyToColour) {
    final ArrayList<Polyiamond> list = new ArrayList<>();
    final UniquenessTester h = new UniquenessTester();
    final UniquenessTester hc = new UniquenessTester();

    for (int i = 0; i < size(); ++i) {
      if (addOnlyToColour != 0 && mCs.getColour(i) != addOnlyToColour) {
        continue;
      }
      final Triangle t = mCs.mSet.mSet[i];
      if (t.up()) {
        tryTriangle(i, 1, 0, list, h, hc);
        tryTriangle(i, -1, 0, list, h, hc);
        tryTriangle(i, 0, -2, list, h, hc);
      } else {
        tryTriangle(i, 1, 0, list, h, hc);
        tryTriangle(i, -1, 0, list, h, hc);
        tryTriangle(i, 0, 2, list, h, hc);
      }
    }
    return list;
  }

  // try to build a polyomino adding a specific triangle to current
  private void tryTriangle(final int i, final int dx, final int dy, final ArrayList<Polyiamond> list, final UniquenessTester h, final UniquenessTester hc) {
    final int x = mCs.getX(i) + dx;
    final int y = mCs.getY(i) + dy;

    if (((CoordSet2T) mCs).exists(x, y)) {
      return;
    }
    final String t = x + " " + y;
    if (!hc.add(t)) {
      return;
    }

    final Polyiamond p = new Polyiamond((CoordSet2T) mCs, x, y);
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
