package irvine.oeis.a398;

import java.util.Arrays;

import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A398476 Number of singular simple connected graphs on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A398326 extends ParallelGenerateGraphsSequence {

  /**
   * Determine the chromatic index of a cubic graph.
   * Note the chromatic index of such a graph is always 3 or 4.
   * @param graph cubic graph
   * @return 3 or 4
   */
  private static int chromaticIndex(final Graph graph) {
    final int n = graph.order();
    final int m = graph.size();

    // Edge endpoints.
    final int[] eu = new int[m];
    final int[] ev = new int[m];

    // Edge number at each pair of vertices.
    final int[][] edge = new int[n][n];
    for (int v = 0; v < n; ++v) {
      Arrays.fill(edge[v], -1);
    }

    int e = 0;
    for (int u = 0; u < n; ++u) {
      int v = -1;
      while ((v = graph.nextVertex(u, v)) >= 0) {
        if (u < v) {
          eu[e] = u;
          ev[e] = v;
          edge[u][v] = e;
          edge[v][u] = e;
          ++e;
        }
      }
    }

    // colour[e] = -1 if uncoloured, otherwise 0, 1 or 2.
    final int[] colour = new int[m];
    Arrays.fill(colour, -1);
    /*
     * used[v] is a 3-bit mask indicating the colours already
     * used on edges incident with v.
     */
    final int[] used = new int[n];
    return edgeColourable(graph, eu, ev, edge, colour, used) ? 3 : 4;
  }

  private static boolean edgeColourable(final Graph graph, final int[] eu, final int[] ev, final int[][] edge, final int[] colour, final int[] used) {
    /*
     * Propagate forced colours.
     * At a cubic vertex:
     *   - if 2 colours are present, the third edge is forced;
     *   - if all 3 are present, everything is fine;
     *   - if 0 or 1 colours are present, there is no forced edge.
     */
    boolean changed;
    do {
      changed = false;
      for (int v = 0; v < graph.order(); ++v) {
        if (Integer.bitCount(used[v]) != 2) {
          continue;
        }
        final int missing = (~used[v]) & 7;
        int w = -1;
        int ee = -1;
        int x = -1;
        while ((x = graph.nextVertex(v, x)) >= 0) {
          final int f = edge[v][x];
          if (colour[f] < 0) {
            ee = f;
            w = x;
            break;
          }
        }
        if (ee < 0) {
          // All three edges are already coloured.
          continue;
        }
        // The missing colour is forced at v.  It must also be available at the other endpoint.
        if ((used[w] & missing) != 0) {
          return false;
        }
        colour[ee] = Integer.numberOfTrailingZeros(missing);
        used[v] |= missing;
        used[w] |= missing;
        changed = true;
      }
    } while (changed);

    // Find an uncoloured edge.  Prefer one whose endpoints have the most colours already assigned.
    int best = -1;
    int bestScore = -1;
    for (int e = 0; e < colour.length; ++e) {
      if (colour[e] < 0) {
        final int score = Integer.bitCount(used[eu[e]])
          + Integer.bitCount(used[ev[e]]);
        if (score > bestScore) {
          bestScore = score;
          best = e;
        }
      }
    }

    // Everything is coloured.
    if (best < 0) {
      return true;
    }

    final int u = eu[best];
    final int v = ev[best];

    // Try each colour that is available at both endpoints.
    final int available = (~(used[u] | used[v])) & 7;
    for (int c = 0; c < 3; ++c) {
      final int bit = 1 << c;
      if ((available & bit) == 0) {
        continue;
      }

      /*
       * Save state.  Propagation below may colour many edges,
       * so the simplest safe approach is to copy the arrays.
       */
      final int[] savedColour = colour.clone();
      final int[] savedUsed = used.clone();
      colour[best] = c;
      used[u] |= bit;
      used[v] |= bit;
      if (edgeColourable(graph, eu, ev, edge, colour, used)) {
        return true;
      }
      System.arraycopy(savedColour, 0, colour, 0, colour.length);
      System.arraycopy(savedUsed, 0, used, 0, used.length);
    }

    return false;
  }

  /** Construct the sequence. */
  public A398326() {
    super(2, 0, 0, 0, () -> graph -> chromaticIndex(graph) == 3 ? 1 : 0);
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    final int n = 2 * mN + 2;
    gg.setVertices(n);
    gg.setMinEdges(n - 1);
    gg.setMaxEdges(n * (n - 1) / 2);
    gg.setMinDeg(3);
    gg.setMaxDeg(3);
    gg.setConnectionLevel(1);
  }
}
