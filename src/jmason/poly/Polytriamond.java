package jmason.poly;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

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
    builder(c, true, false);
    ((CoordSet2T) mCs).calculate();
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
   * @return children
   */
  public List<Polytriamond> listSons() {
    final ArrayList<Polytriamond> list = new ArrayList<>();
    final UniquenessTester h = new UniquenessTester();
    final UniquenessTester hc = new UniquenessTester();

    for (int i = 0; i < size(); ++i) {
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
      if (((CoordSet2T) mCs).contains(x, y)) {
        return;
      }
    }

    final TreeSet<String> key = new TreeSet<>();
    for (int k = 0; k < dx.length; ++k) {
      final int x = mCs.getX(i) + dx[k];
      final int y = mCs.getY(i) + dy[k] * d;
      key.add(x + " " + y);
    }
    if (!hc.add(key.toString())) {
      return;
    }

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

    final Polytriamond p = new Polytriamond(cs);
    if (!h.add(p.mUniq)) {
      return;
    }
    list.add(p);
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
