package jmason.poly;

import java.util.ArrayList;

/**
 * An integral polyiamond.
 * @author jmason
 */
public class Polyiamond extends PolyGen<Triangle, CoordSet2T> {

  // build a polyomino cloning a coordinate set
  Polyiamond(final CoordSet2T c) {
    builder(c, true);
    ((CoordSet2T) mCs).calculate();
  }

  // build a polyomino from a corrdinate set, with or without cloning
  Polyiamond(final CoordSet2T c, final boolean copy) {
    builder(c, copy);
    ((CoordSet2T) mCs).calculate();
  }

  // build a polyomino from a coordinate set, with or without cloning

  // build a polyomino from a coordinate set adding one square
  Polyiamond(final CoordSet2T c, final int x, final int y) {
    mCs = c.copy(x, y);
    //size = c.size + 1;
    mUniq = mCs.makeUnique();
    ((CoordSet2T) mCs).calculate();
  }

  int getWidth() {
    return ((CoordSet2T) mCs).getWidth();
  }

  int getHeight() {
    return ((CoordSet2T) mCs).getHeight();
  }

  // build list of mirror polyominoes generable form current
  // No guarantee that not generable from previous
  // build a list (without duplicates) of polyominoes that may be generated from current
  ArrayList<Polyiamond> listSons(final int addOnlyToColour) {
    final ArrayList<Polyiamond> list = new ArrayList<>();
    final UTest h = new UTest();
    final UTest hc = new UTest();

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
  private void tryTriangle(final int i, final int dx, final int dy, final ArrayList<Polyiamond> list, final UTest h, final UTest hc) {
    final int x = mCs.getX(i) + dx;
    final int y = mCs.getY(i) + dy;

    if (((CoordSet2T) mCs).exists(x, y)) {
      return;
    }
    final String t = x + " " + y;
    if (!hc.put(t)) {
      return;
    }

    final Polyiamond p = new Polyiamond((CoordSet2T) mCs, x, y);
    if (!h.put(p.mUniq)) {
      return;
    }
    list.add(p);
  }
}
