package irvine.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Canonical trapezoid builder + display
 * @author Sean A. Irvine
 */
public final class ConcreteTrapezoid {

  private ConcreteTrapezoid() { }

  static class Triangle {
    final int mX, mY, mZ;  // z = 0 (▲), 1 (▼)

    Triangle(final int x, final int y, final int z) {
      mX = x;
      mY = y;
      mZ = z;
    }

    @Override
    public String toString() {
      return (mZ == 0 ? "▲" : "▼") + "(" + mX + "," + mY + ")";
    }
  }

  static List<Triangle> canonical(final int b, final int h) {
    final List<Triangle> cells = new ArrayList<>();
    for (int y = 0; y < h; ++y) {
      for (int x = 0; x < b - y; ++x) {
        cells.add(new Triangle(x, y, 0));
      }
      for (int x = 0; x < b - y - 1; ++x) {
        cells.add(new Triangle(x, y, 1));
      }
    }
    return cells;
  }

  /** Normalize a list of triangles so that min y = 0 and (0,0) is in the list. z remains unchanged. */
  static List<Triangle> normalize(final List<Triangle> triangles) {
    int minX = Integer.MAX_VALUE;
    int minY = Integer.MAX_VALUE;

    for (final Triangle t : triangles) {
      if (t.mY <= minY) {
        if (t.mY < minY) {
          minY = t.mY;
          minX = t.mX;
        } else {
          minX = Math.min(minX, t.mX);
        }
      }
    }

    final List<Triangle> out = new ArrayList<>();
    for (final Triangle t : triangles) {
      out.add(new Triangle(t.mX - minX, t.mY - minY, t.mZ));
    }
    return out;
  }

  static void dump(final List<Triangle> cells) {
    //System.out.println(cells);
    int minX = Integer.MAX_VALUE;
    int maxX = Integer.MIN_VALUE;
    int minY = Integer.MAX_VALUE;
    int maxY = Integer.MIN_VALUE;
    for (final Triangle t : cells) {
      minX = Math.min(minX, t.mX);
      maxX = Math.max(maxX, t.mX);
      minY = Math.min(minY, t.mY);
      maxY = Math.max(maxY, t.mY);
    }

    System.out.println("X: " + minX + "--" + maxX + " Y: " + minY + "--" + maxY);
    final int w = maxX - minX + 1;
    final int h = maxY - minY + 1;

    // two chars per cell
    final char[][][] grid = new char[h][w][2];
    for (int y = 0; y < h; ++y) {
      for (int x = 0; x < w; ++x) {
        grid[y][x][0] = '·';
        grid[y][x][1] = '·';
      }
    }

    for (final Triangle t : cells) {
      final int gx = t.mX - minX;
      final int gy = t.mY - minY;
      grid[gy][gx][t.mZ] = t.mZ == 0 ? '▲' : '▼';
    }

    for (int y = h - 1; y >= 0; --y) {
      final StringBuilder sb = new StringBuilder();
      sb.append("·".repeat(y));
      for (int x = 0; x < w; ++x) {
        sb.append(grid[y][x][0]).append(grid[y][x][1]);
      }
      System.out.println(sb);
    }
  }

  private static void demo(final int b, final int h) {
    final List<Triangle> shape = canonical(b, h); // canonical shape
    System.out.println("Original:");
    dump(shape);
    List<Triangle> rotated = shape;
    for (int r = 0; r < 6; ++r) {
      rotated = rotate60(rotated);
      System.out.println("Rotated 60°:");
      dump(rotated);
    }
  }

  /**
   * Demo.
   * @param args ignored
   */
  public static void main(final String[] args) {
    demo(5, 3);
    demo(5, 1);
    demo(4, 2);

//    System.out.println("Test normalize");
//    dumpXYZ(normalize(Collections.singletonList(new Tri(0, 0, 0))));
//    dumpXYZ(normalize(Collections.singletonList(new Tri(0, 0, 1))));
//    dumpXYZ(normalize(Collections.singletonList(new Tri(-10, 3, 0))));
//    dumpXYZ(normalize(Collections.singletonList(new Tri(7, -6, 1))));
//
//    System.out.println("Test rotate and normalize");
//    dumpXYZ(normalize(Collections.singletonList(rotate60(new Tri(0, 0, 0)))));
//    dumpXYZ(normalize(Collections.singletonList(rotate60(new Tri(0, 0, 1)))));
//
//    System.out.println("Point rotations");
//    System.out.println(rotate60(new Tri(0, 0, 0)));
//    System.out.println(rotate60(new Tri(0, 0, 1)));
//    System.out.println(rotate60(new Tri(1, 0, 1)));
//    System.out.println(rotate60(new Tri(1, 0, 0)));
//    System.out.println(rotate60(new Tri(0, 1, 0)));
//    System.out.println(rotate60(new Tri(0, 1, 1)));
//    System.out.println(rotate60(new Tri(1, 1, 1)));
//    System.out.println(rotate60(new Tri(2, 2, 0)));
//
//    testCycle();
  }

  /** Rotate a single triangle 60 degrees anticlockwise (your coordinate system). */
  static Triangle rotate60(final Triangle t) {
    final int x = t.mX;
    final int y = t.mY;
    final int z = t.mZ;
    final int nx = -y - 1;
    final int ny = x + y + z;
    final int nz = 1 - z;
    return new Triangle(nx, ny, nz);
  }

  static List<Triangle> rotate60(final List<Triangle> triangles) {
    final List<Triangle> rot = new ArrayList<>();
    for (final Triangle t : triangles) {
      rot.add(rotate60(t));
    }
    return normalize(rot);
  }

}
