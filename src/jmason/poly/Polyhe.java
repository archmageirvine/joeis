package jmason.poly;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * An integral polyhe.
 * @author Sean A. Irvine
 */
public class Polyhe extends PolyGen<Triangle, CoordSet2T> {

  /**
   * Build a polyhe from a coordinate set.
   * @param c coordinates
   */
  public Polyhe(final CoordSet2T c) {
    builder(c, true, true);
    ((CoordSet2T) mCs).calculate();
  }

  private static final int[][][] DELTAS = {
    {{1, 2, 3, 1, 2, 3}, {0, 0, 0, 2, 2, 2}, {1, 1, 1, -1, -1, -1}},
    {{1, 2, 1, 3, 3, 2}, {0, 0, 2, 0, 2, 2}, {1, 1, 1, -1, -1, -1}},
    {{1, 1, 2, 2, 3, 3}, {0, 2, 2, 0, 0, 2}, {1, 1, 1, -1, -1, -1}},

    {{-1, -2, -3, -1, -2, -3}, {0, 0, 0, 2, 2, 2}, {1, 1, 1, -1, -1, -1}},
    {{-1, -2, -1, -3, -3, -2}, {0, 0, 2, 0, 2, 2}, {1, 1, 1, -1, -1, -1}},
    {{-1, -1, -2, -2, -3, -3}, {0, 2, 2, 0, 0, 2}, {1, 1, 1, -1, -1, -1}},

    {{-1, 0, 1, -1, 0, 1}, {-2, -2, -2, -4, -4, -4}, {1, 1, 1, -1, -1, -1}},
    {{0, -1, -1, 1, 1, 0}, {-2, -2, -4, -2, -4, -4}, {1, 1, 1, -1, -1, -1}},
    {{0, 1, 1, -1, -1, 0}, {-2, -2, -4, -2, -4, -4}, {1, 1, 1, -1, -1, -1}},
  };

  /**
   * Build list (without duplicates) of polyhe that can be generated from this polyhe.
   * @return children
   */
  public List<Polyhe> listSons() {
    final ArrayList<Polyhe> list = new ArrayList<>();
    final UniquenessTester h = new UniquenessTester();
    final UniquenessTester hc = new UniquenessTester();

    for (int i = 0; i < size(); ++i) {
      final Triangle t = mCs.mSet.mSet[i];
      if (t.getColour() == 1) {
        if (t.up()) {
          for (final int[][] delta : DELTAS) {
            tryShape(i, delta, 1, list, h, hc);
          }
        } else {
          for (final int[][] delta : DELTAS) {
            tryShape(i, delta, -1, list, h, hc);
          }
        }
      }
    }
    return list;
  }

  private void tryShape(final int i, final int[][] deltas, final int d, final ArrayList<Polyhe> list, final UniquenessTester h, final UniquenessTester hc) {

    //System.out.println("Trying: " + Arrays.deepToString(deltas) + " d=" + d + " on " + this + " at " + mCs.getX(i) + "," + mCs.getY(i));

    final int xi = mCs.getX(i);
    final int yi = mCs.getY(i);
    for (int k = 0; k < deltas[0].length; ++k) {
      final int x = xi + deltas[0][k];
      final int y = yi + deltas[1][k] * d;
      if (((CoordSet2T) mCs).contains(x, y)) {
        //System.out.println("Failed on collision");
        return;
      }
    }

    final TreeSet<String> key = new TreeSet<>();
    for (int k = 0; k < deltas[0].length; ++k) {
      final int x = xi + deltas[0][k];
      final int y = yi + deltas[1][k] * d;
      key.add(x + " " + y + " " + deltas[2][k]);
    }
    if (!hc.add(key.toString())) {
      return;
    }

    final int size = mCs.mSize;
    final CoordSet2T cs = new CoordSet2T(size + 6, true, false, false); // todo these flags should come from elsewhere
    for (int k = 0; k < size; ++k) {
      cs.mSet.setElement(k, mCs.mSet.getElement(k).copy());
    }
    for (int k = 0; k < deltas[0].length; ++k) {
      final int x = xi + deltas[0][k];
      final int y = yi + deltas[1][k] * d;
      cs.setTriangle(size + k, x, y, deltas[2][k]);
    }
    cs.placeInSextant();

    final Polyhe p = new Polyhe(cs);
    if (!h.add(p.mUniq)) {
      //System.out.println("Already present");
      return;
    }
    //System.out.println("Accepted");
    list.add(p);
  }

  /**
   * Compute the size of the perimeter of this polyhe.
   * @return the size of the perimeter
   */
  public int perimeterSize() {
    return ((CoordSet2T) mCs).perimeterSize();
  }

  /**
   * Compute the size of the edge perimeter of this polyhe.
   * @return the size of the edge perimeter
   */
  public int edgePerimeterSize() {
    return ((CoordSet2T) mCs).edgePerimeterSize();
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append('{');
    for (int k = 0; k < mCs.mSize; ++k) {
      if (k > 0) {
        sb.append(", ");
      }
      sb.append('(')
        .append(mCs.getX(k))
        .append(',')
        .append(mCs.getY(k))
        .append(',')
        .append(mCs.getColour(k) > 0 ? 'B' : 'W')
        .append(')');
    }
    sb.append('}');
    return sb.toString();
  }
}
