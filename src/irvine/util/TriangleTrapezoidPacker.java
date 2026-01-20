package irvine.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Pack trapezoids into an equilateral triangle of side n on the triangular lattice.
 * Uses square board with inTriangle masking; coordinates doubled for trapezoids.
 */
public class TriangleTrapezoidPacker {

  // todo temporary

  /* ---------- trapezoid ---------- */
  protected static final class Trapezoid implements Comparable<Trapezoid> {
    private final int mBase;
    private final int mHeight;
    private final int mArea;

    public Trapezoid(final int base, final int height) {
      mBase = base;
      mHeight = height;
      mArea = base * base - (base - height) * (base - height);
    }

    public int getBase() {
      return mBase;
    }

    public int getHeight() {
      return mHeight;
    }

    public int getArea() {
      return mArea;
    }

    @Override
    public int compareTo(final Trapezoid other) {
      int c = Integer.compare(other.mArea, mArea);
      if (c != 0) {
        return c;
      }
      return Integer.compare(other.mBase, mBase);
    }

    @Override
    public String toString() {
      return "(" + mBase + "," + mHeight + ")";
    }
  }

  /* ---------- internal shape ---------- */
  private static final class Shape {
    final int[][] cells;

    Shape(List<int[]> pts) {
      cells = pts.toArray(new int[0][]);
    }
  }

  /* ---------- board ---------- */
  private final int n;
  private final boolean[][] board;
  private final int[][] boardId;
  private final int width;
  private final List<List<Shape>> shapes;

  public TriangleTrapezoidPacker(int n, List<Trapezoid> traps) {
    this.n = n;
    this.width = 2 * n;
    this.board = new boolean[width][width];
    this.boardId = new int[width][width];
    for (int[] row : boardId) {
      Arrays.fill(row, -1);
    }
    this.shapes = new ArrayList<>();

    for (Trapezoid t : traps) {
      shapes.add(generateOrientations(t));
    }
  }

  /* ---------- public API ---------- */
  public boolean canPack() {
    return backtrack(0);
  }

  /* ---------- backtracking ---------- */
  private boolean backtrack(int idx) {
    if (idx == shapes.size()) {
      System.out.println("Found a packing:");
      dumpPacking();
      return true;
    }

    int[] hole = findFirstEmpty();
    if (hole == null) {
      return false;
    }

    int hx = hole[0];
    int hy = hole[1];

    for (Shape s : shapes.get(idx)) {
      for (int[] anchor : s.cells) {
        int ox = hx - anchor[0];
        int oy = hy - anchor[1];

        if (canPlace(s, ox, oy)) {
          place(s, ox, oy, true, idx);
          if (backtrack(idx + 1)) {
            return true;
          }
          place(s, ox, oy, false, -1);
        }
      }
    }
    return false;
  }

  private int[] findFirstEmpty() {
    for (int y = 0; y < width; ++y) {
      for (int x = 0; x < width; ++x) {
        if (inTriangle(x, y) && !board[x][y]) {
          return new int[] {x, y};
        }
      }
    }
    return null;
  }

  private boolean canPlace(Shape s, int ox, int oy) {
    for (int[] c : s.cells) {
      int x = ox + c[0];
      int y = oy + c[1];
      if (!inTriangle(x, y) || board[x][y]) {
        return false;
      }
    }
    return true;
  }

  private void place(Shape s, int ox, int oy, boolean v, int id) {
    for (int[] c : s.cells) {
      int x = ox + c[0];
      int y = oy + c[1];
      board[x][y] = v;
      boardId[x][y] = v ? id : -1;
    }
  }

  /* ---------- geometry ---------- */
  private boolean inTriangle(int x, int y) {
    return x >= 0 && y >= 0 && x + y <= 2 * n - 2;
  }

  /* ---------- trapezoid generation ---------- */
  private List<Shape> generateOrientations(Trapezoid t) {
    List<int[]> base = buildCanonical(t);
    Set<String> seen = new HashSet<>();
    List<Shape> out = new ArrayList<>();

    for (int r = 0; r < 6; ++r) {
      List<int[]> cur = base;
      for (int k = 0; k < r; ++k) {
        cur = rotate60(cur);
      }
      for (int f = 0; f < 2; ++f) {
        List<int[]> pts = (f == 0) ? cur : reflect(cur);
        List<int[]> norm = normalize(pts);
        String key = keyOf(norm);
        if (seen.add(key)) {
          out.add(new Shape(norm));
        }
      }
    }
    return out;
  }

  private List<int[]> buildCanonical(Trapezoid t) {
    int b = t.getBase();
    int h = t.getHeight();
    int maxWidth = 2 * b - 1;
    List<int[]> pts = new ArrayList<>();
    for (int i = 0; i < h; ++i) {
      int len = 2 * (b - h + i) + 1;
      int startX = (maxWidth - len) / 2;
      for (int k = 0; k < len; ++k) {
        pts.add(new int[] {(startX + k) * 2, i * 2});
      }
    }
    if (pts.size() != t.getArea()) {
      throw new IllegalStateException("Area mismatch for " + t + " got " + pts.size());
    }
    return normalize(pts);
  }

  private List<int[]> rotate60(List<int[]> in) {
    List<int[]> out = new ArrayList<>();
    for (int[] p : in) {
      int x = p[0], y = p[1];
      int nx = (x - 3 * y) / 2;
      int ny = (x + y) / 2;
      out.add(new int[] {nx, ny});
    }
    return normalize(out);
  }

  private List<int[]> reflect(List<int[]> in) {
    List<int[]> out = new ArrayList<>();
    for (int[] p : in) {
      out.add(new int[] {-p[0], p[1]});
    }
    return out;
  }

  private List<int[]> normalize(List<int[]> in) {
    int minx = Integer.MAX_VALUE, miny = Integer.MAX_VALUE;
    for (int[] p : in) {
      minx = Math.min(minx, p[0]);
      miny = Math.min(miny, p[1]);
    }
    List<int[]> out = new ArrayList<>();
    for (int[] p : in) {
      out.add(new int[] {p[0] - minx, p[1] - miny});
    }
    return out;
  }

  private String keyOf(List<int[]> pts) {
    pts.sort((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
    StringBuilder sb = new StringBuilder();
    for (int[] p : pts) {
      sb.append(p[0]).append(',').append(p[1]).append(';');
    }
    return sb.toString();
  }

  /* ---------- packing dump ---------- */
  private void dumpPacking() {
    for (int y = 0; y < width; ++y) {
      StringBuilder sb = new StringBuilder();
      for (int x = 0; x < width; ++x) {
        if (!inTriangle(x, y)) {
          sb.append("· ");
        } else {
          sb.append(boardId[x][y] >= 0 ? boardId[x][y] : "·").append(" ");
        }
      }
      System.out.println(sb);
    }
    System.out.println();
  }

  private static void dumpShape(Shape s) {
    int minx = Integer.MAX_VALUE, miny = Integer.MAX_VALUE;
    int maxx = Integer.MIN_VALUE, maxy = Integer.MIN_VALUE;
    Set<Long> set = new HashSet<>();
    for (int[] p : s.cells) {
      minx = Math.min(minx, p[0]);
      miny = Math.min(miny, p[1]);
      maxx = Math.max(maxx, p[0]);
      maxy = Math.max(maxy, p[1]);
      set.add((((long) p[0]) << 32) ^ (p[1] & 0xffffffffL));
    }
    for (int y = miny; y <= maxy; y += 2) {
      StringBuilder sb = new StringBuilder();
      for (int x = minx; x <= maxx; x += 2) {
        long key = (((long) x) << 32) ^ y;
        sb.append(set.contains(key) ? "#" : "·");
        sb.append(" ");
      }
      System.out.println(sb);
    }
  }


  private void dumpOrientations(Trapezoid t) {
    List<Shape> list = generateOrientations(t);
    int k = 0;
    for (Shape s : list) {
      System.out.println("Orientation " + (k++));
      dumpShape(s);
      System.out.println();
    }
  }


  /* ---------- demo ---------- */
  public static void main(String[] args) {
    test(4, List.of(new Trapezoid(3, 2), new Trapezoid(3, 1), new Trapezoid(2, 1)));
    test(6, List.of(new Trapezoid(4, 2), new Trapezoid(5, 1), new Trapezoid(4, 1), new Trapezoid(3, 1), new Trapezoid(2, 1)));
    test(7, List.of(new Trapezoid(5, 3), new Trapezoid(7, 1), new Trapezoid(4, 1), new Trapezoid(3, 1), new Trapezoid(2, 1)));

    // Debug: dump orientations
    TriangleTrapezoidPacker p = new TriangleTrapezoidPacker(7, List.of());
    p.dumpOrientations(new Trapezoid(5, 3));
    p.dumpOrientations(new Trapezoid(5, 1));

  }

  private static void test(int n, List<Trapezoid> t) {
    List<Trapezoid> list = new ArrayList<>(t);
    Collections.sort(list);
    TriangleTrapezoidPacker p = new TriangleTrapezoidPacker(n, list);
    System.out.println("n=" + n + " " + list + " -> " + p.canPack());
  }
}
