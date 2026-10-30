package irvine.oeis.a401;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401163 Primes p such that, considering only splits containing at least one composite segment, the set of terminal primes reachable along shortest paths has cardinality at least 2.
 * @author Sean A. Irvine
 */
public class A401163 extends Sequence1 {

  // After Li Jingtao

  private Z mN = Z.valueOf(88);

  /*
   * Append the prime factors of n in increasing order, with multiplicity.
   */
  private static String factorString(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    final StringBuilder sb = new StringBuilder();
    for (final Z p : fs.toZArray()) {
      sb.append(String.valueOf(p).repeat(fs.getExponent(p)));
    }
    return sb.toString();
  }

  /*
   * Enumerate digit partitions, factoring composite pieces immediately.
   */
  private static void split(final String s, final int i, final StringBuilder parts, final boolean hasComposite, final Set<Z> results) {
    if (i == s.length()) {
      if (hasComposite) {
        results.add(new Z(parts.toString()));
      }
      return;
    }
    for (int j = i + 1; j <= s.length(); ++j) {
      if (s.charAt(i) == '0') {
        break;
      }
      final String seg = s.substring(i, j);
      if ("1".equals(seg)) {
        continue;
      }
      final Z value = new Z(seg);
      final int oldLength = parts.length();
      if (value.isProbablePrime()) {
        parts.append(seg);
        split(s, j, parts, hasComposite, results);
      } else {
        parts.append(factorString(value));
        split(s, j, parts, true, results);
      }
      parts.setLength(oldLength);
    }
  }

  /*
   * Find all one-step successors of n.
   */
  private static Set<Z> getNextStates(final Z n) {
    final Set<Z> results = new HashSet<>();
    split(n.toString(), 0, new StringBuilder(), false, results);
    return results;
  }

  /*
   * Determine whether n has at least two distinct prime terminals
   * at its minimum positive distance.
   */
  private static boolean ok(final Z n) {
    if (!n.isProbablePrime()) {
      return false;
    }
    final Queue<Z> queue = new ArrayDeque<>();
    final Map<Z, Integer> visited = new HashMap<>();
    final Set<Z> terminals = new HashSet<>();
    int bestDepth = Integer.MAX_VALUE;
    queue.add(n);
    visited.put(n, 0);
    while (!queue.isEmpty()) {
      final Z curr = queue.remove();
      final int d = visited.get(curr);
      if (d > bestDepth) {
        continue;
      }
      if (d > 0 && curr.isProbablePrime()) {
        if (d < bestDepth) {
          bestDepth = d;
          terminals.clear();
        }
        terminals.add(curr);
        continue;
      }
      for (final Z nxt : getNextStates(curr)) {
        final int nextDepth = d + 1;
        final Integer oldDepth = visited.get(nxt);
        if (oldDepth == null || oldDepth > nextDepth) {
          visited.put(nxt, nextDepth);
          queue.add(nxt);
        }
      }
    }
    return terminals.size() >= 2;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ok(mN)) {
        return new Z(mN.toString());
      }
    }
  }
}
