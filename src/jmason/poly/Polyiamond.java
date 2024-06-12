package jmason.poly;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.util.Point;

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

    if (((CoordSet2T) mCs).contains(x, y)) {
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

  private boolean up(final int x, final int y) {
    return ((x + (y + 1) / 2) & 1) == 0;
  }

  private boolean canEscape(final Set<Point> knownEscapes, final HashSet<Point> tried, final CoordSet2T coords, final int minX, final int maxX, final int minY, final int maxY, final int x, final int y) {
    if (x < minX || x > maxX || y < minY || y > maxY) {
      return true;
    }
    if (coords.contains(x, y)) {
      return false; // this point is part of the animal, search no further
    }
    final Point p = new Point(x, y);
    if (knownEscapes.contains(p)) {
      return true;
    }
    if (tried.add(p)) {
      // We are considering a new point
      if (canEscape(knownEscapes, tried, coords, minX, maxX, minY, maxY, x - 1, y)) {
        knownEscapes.addAll(tried);
        tried.remove(p);
        return true;
      }
      if (canEscape(knownEscapes, tried, coords, minX, maxX, minY, maxY, x + 1, y)) {
        knownEscapes.addAll(tried);
        tried.remove(p);
        return true;
      }
      if (canEscape(knownEscapes, tried, coords, minX, maxX, minY, maxY, x, y + (up(x, y) ? -2 : 2))) {
        knownEscapes.addAll(tried);
        tried.remove(p);
        return true;
      }
      tried.remove(p);
    }
    return false;
  }

  /**
   * Test if this polyiamond contains one or more holes.
   * @return true if the polyiamond contains a hole
   */
  public boolean isHoly() {
    if (mCs.mSize < 9) {
      return false;
    }
    final CoordSet2T coords = (CoordSet2T) mCs;
    final int minX = coords.mMinX;
    final int maxX = coords.mMaxX;
    final int minY = coords.mMinY;
    final int maxY = coords.mMaxY;
    final Set<Point> knownEscapes = new HashSet<>();
    for (int x = minX + 1; x < maxX; ++x) {
      for (int y = minY; y <= maxY; y += 2) {
        if (!coords.contains(x, y)) {
          // (x, y) is vacant, so test if we can escape to outside the animal
          if (!canEscape(knownEscapes, new HashSet<>(), coords, minX, maxX, minY, maxY, x, y)) {
            return true;
          }
        }
      }
    }
    return false;
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
