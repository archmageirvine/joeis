package jmason.poly;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * An integral polyare.
 * @author Sean A. Irvine
 */
public class Polyare extends PolyGen<Square, CoordSet2> {

  private static final int[][][] DELTAS = {
    // For a top-left black cell (others handled by symmetry on this)
    {{1, 2, 1, 2}, {0, 0, -1, -1}, {1, 1, -1, -1}},
    {{1, 2, 1, 2}, {0, 0, -1, -1}, {1, -1, 1, -1}},
    {{0, 0, -1, -1}, {1, 2, 1, 2}, {1, 1, -1, -1}},
    {{0, 0, -1, -1}, {1, 2, 1, 2}, {1, -1, 1, -1}},
  };

  /**
   * Build a polyare from a coordinate set.
   * @param c coordinates
   *
   */
  public Polyare(final CoordSet2 c) {
    builder(c, true, true);
    ((CoordSet2) mCs).calculate();
  }

  /**
   * Build list (without duplicates) of polyares that can be generated from this polyares.
   * @return children
   */
  public List<Polyare> listSons(final boolean oneSided) {
    final ArrayList<Polyare> list = new ArrayList<>();
    final UniquenessTester h = new UniquenessTester();
    final UniquenessTester hc = new UniquenessTester();

    for (int i = 0; i < size(); ++i) {
      final Square t = mCs.mSet.mSet[i];
      if (t.getColour() == 1) {
        final int x = t.getX();
        final int y = t.getY();
        for (final int[][] delta : DELTAS) {
          tryShape(i, delta, (x & 1) == 0 ? -1 : 1, (y & 1) == 0 ? -1 : 1, list, h, hc, oneSided);
        }
      }
    }
    return list;
  }

  private void tryShape(final int i, final int[][] deltas, final int mx, final int my, final ArrayList<Polyare> list, final UniquenessTester h, final UniquenessTester hc, final boolean oneSided) {

    final int xi = mCs.getX(i);
    final int yi = mCs.getY(i);
    //System.out.println("Trying: (" + xi + "," + yi + ") " + Arrays.deepToString(deltas) + " mx=" + mx + " my=" + my);

    for (int k = 0; k < deltas[0].length; ++k) {
      final int x = xi + deltas[0][k] * mx;
      final int y = yi + deltas[1][k] * my;
      if (((CoordSet2) mCs).exists(x, y)) {
        return;
      }
    }

    final TreeSet<String> key = new TreeSet<>();
    for (int k = 0; k < deltas[0].length; ++k) {
      final int x = xi + deltas[0][k] * mx;
      final int y = yi + deltas[1][k] * my;
      key.add(x + " " + y + " " + deltas[2][k]);
    }
    if (!hc.add(key.toString())) {
      return;
    }

    final int size = mCs.mSize;
    final CoordSet2 cs = new CoordSet2(size + 4, true, false, oneSided); // todo these flags should come from elsewhere
    for (int k = 0; k < size; ++k) {
      cs.mSet.setElement(k, mCs.mSet.getElement(k).copy());
    }
    for (int k = 0; k < deltas[0].length; ++k) {
      final int x = xi + deltas[0][k] * mx;
      final int y = yi + deltas[1][k] * my;
      cs.setSquare(size + k, x, y, deltas[2][k]);
    }

    final Polyare p = new Polyare(cs);
    if (!h.add(p.mUniq)) {
      return;
    }
    list.add(p);
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
