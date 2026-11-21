package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.graph.Edges;
import irvine.math.group.IntegerField;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A401210 Triangle read by rows: T(n,k) is the number of simple graphs on n unlabeled vertices rooted at a k-clique.
 * @author Gregory Morse
 */
public class A401210 extends Triangle {
  // After Andrew Howroyd.
  protected final Z colored(final int n, final int k, final boolean freeBlack, final boolean requireNeighbor) {
    Z sum = Z.ZERO;
    final IntegerPartition black = new IntegerPartition(k);
    int[] p;
    while ((p = black.next()) != null) {
      final IntegerPartition white = new IntegerPartition(n - k);
      final Z blackWeight = IntegerPartition.permCount(p).multiply(freeBlack ? fixedGraphs(p) : Z.ONE);
      int[] q;
      while ((q = white.next()) != null) {
        Z cross = Z.ONE;
        for (final int j : q) {
          int orbits = 0;
          for (final int i : p) {
            orbits += Functions.GCD.i(i, j);
          }
          final Z choices = Z.ONE.shiftLeft(orbits);
          cross = cross.multiply(requireNeighbor ? choices.subtract(1) : choices);
        }
        sum = sum.add(blackWeight.multiply(IntegerPartition.permCount(q)).multiply(fixedGraphs(q)).multiply(cross));
      }
    }
    return sum.divide(Functions.FACTORIAL.z(k).multiply(Functions.FACTORIAL.z(n - k)));
  }

  private static Z fixedGraphs(final int[] p) {
    return Edges.GRAPH_EDGES.edges(p, IntegerField.SINGLETON, Z.ONE::shiftLeft);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return colored(n, k, false, false);
  }
}
