package irvine.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Canonical trapezoid builder + display */
public class TrapezoidCanonicalXYZ {
  static class Tri {
    final int x, y, z;  // z = 0 (▲), 1 (▼)

    Tri(final int x, final int y, final int z) {
      this.x = x;
      this.y = y;
      this.z = z;
    }

    @Override
    public String toString() {
      return (z==0 ? "▲" : "▼") + "(" + x + "," + y + ")";
    }
  }


  static List<Tri> trapezoidXYZ(final int b, final int h) {
    List<Tri> cells = new ArrayList<>();
    int fullWidth = 2 * b - 1;

    for (int y = 0; y < h; ++y) {
      int rowWidth = fullWidth - 2 * (h - 1 - y); // number of columns in this row
      for (int i = 0; i < rowWidth; ++i) {
        int x = i; // first x is always 0
        cells.add(new Tri(x, y, 0)); // up triangle
        if (i != rowWidth - 1) {     // down triangle for all but last column
          cells.add(new Tri(x, y, 1));
        }
      }
    }
    return cells;
  }

  static void dumpXYZ(final List<Tri> cells) {
  System.out.println(cells);

  int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
  int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;

  for (Tri t : cells) {
    minX = Math.min(minX, t.x);
    maxX = Math.max(maxX, t.x);
    minY = Math.min(minY, t.y);
    maxY = Math.max(maxY, t.y);
  }

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

  for (Tri t : cells) {
    final int gx = t.x - minX;
    final int gy = t.y - minY;
    grid[gy][gx][t.z] = (t.z == 0 ? '▲' : '▼');
  }

  for (int y = 0; y < h; ++y) {
    final StringBuilder sb = new StringBuilder();
    for (int x = 0; x < w; ++x) {
      sb.append(grid[y][x][0]).append(grid[y][x][1]);
    }
    System.out.println(sb);
  }
}
//  static void dumpXYZ(final List<Tri> cells) {
//    System.out.println(cells);
//    int maxX = 0, maxY = 0;
//    for (final Tri t : cells) {
//      maxX = Math.max(maxX, t.x);
//      maxY = Math.max(maxY, t.y);
//    }
//
//    final char[][] g = new char[maxY + 1][maxX + 1];
//    for (final char[] r : g) {
//      Arrays.fill(r, '·');
//    }
//    for (final Tri t : cells) {
//      if (t.z == 0) {
//        g[t.y][t.x] = '▲';
//      } else {
//        g[t.y][t.x + 1] =  '▼';
//      }
//    }
//    for (final char[] r : g) {
//      System.out.println(new String(r));
//    }
//  }

  // demo
  public static void main(String[] args) {
    test(5, 3);
    test(5, 1);
    test(4, 2);

    List<Tri> shape = trapezoidXYZ(5, 3); // canonical shape
    System.out.println("Original:");
    dumpXYZ(shape);

    List<Tri> rotated = new ArrayList<>();
    for (Tri t : shape) {
      rotated.add(rotate60(t));
    }
    rotated = normalize(rotated);

    System.out.println("Rotated 60°:");
    dumpXYZ(rotated);

    System.out.println("Test normalize");
    dumpXYZ(normalize(Collections.singletonList(new Tri(0, 0, 0))));
    dumpXYZ(normalize(Collections.singletonList(new Tri(0, 0, 1))));
    dumpXYZ(normalize(Collections.singletonList(new Tri(-10, 3, 0))));
    dumpXYZ(normalize(Collections.singletonList(new Tri(7, -6, 1))));

    System.out.println("Test rotate and normalize");
    dumpXYZ(normalize(Collections.singletonList(rotate60(new Tri(0, 0, 0)))));
    dumpXYZ(normalize(Collections.singletonList(rotate60(new Tri(0, 0, 1)))));

    System.out.println("Point rotations");
    System.out.println(rotate60(new Tri(0, 0, 0)));
    System.out.println(rotate60(new Tri(0, 0, 1)));
    System.out.println(rotate60(new Tri(1, 0, 1)));
    System.out.println(rotate60(new Tri(1, 0, 0)));
    System.out.println(rotate60(new Tri(0, 1, 0)));
    System.out.println(rotate60(new Tri(0, 1, 1)));
    System.out.println(rotate60(new Tri(1, 1, 1)));
    System.out.println(rotate60(new Tri(2, 2, 0)));

    testCycle();
  }

  static Tri rotN(Tri t, int n) {
    Tri r = t;
    for (int i = 0; i < n; i++) r = rotate60(r);
    return r;
  }

  static void testCycle() {
    Tri t = new Tri(2,2,0);
    Tri r6 = rotN(t, 6);
    System.out.println(t.x+","+t.y+","+t.z+" -> "
      + r6.x+","+r6.y+","+r6.z);
  }


  private static void test(final int b, final int h) {
    System.out.println("Trapezoid (" + b + "," + h + ")");
    final List<Tri> s = trapezoidXYZ(b, h);
    dumpXYZ(s);
    System.out.println();
  }

  /** Rotate a single triangle 60° anticlockwise (your coordinate system). */
  static Tri rotate60(final Tri t) {
    int x = t.x;
    int y = t.y;
    int z = t.z;

    int nx = -y - 1;
    int ny = x + y + z;
    int nz = 1 - z;

    return new Tri(nx, ny, nz);
  }

  /** Normalize a list of triangles so that min x = min y = 0. z remains unchanged. */
  static List<Tri> normalize(List<Tri> tris) {
    int minX = Integer.MAX_VALUE;
    int minY = Integer.MAX_VALUE;

    for (Tri t : tris) {
      minX = Math.min(minX, t.x);
      minY = Math.min(minY, t.y);
    }

    List<Tri> out = new ArrayList<>();
    for (Tri t : tris) {
      out.add(new Tri(t.x - minX, t.y - minY, t.z));
    }
    return out;
  }
}
