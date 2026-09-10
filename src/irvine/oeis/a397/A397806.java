package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.List;

import irvine.math.MutableInteger;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397806 Maximum number of permutations giving the same list under Gaston's algorithm.
 * @author Sean A. Irvine
 */
public class A397806 extends Sequence0 {

  // After Romain Mal&eacute;cot

  /*
   * A representative value is stored as an exact rational num/den.
   * Only floor(num * i / den) is needed by Gaston's algorithm.
   */
  private static class Rational implements Comparable<Rational> {
    private final long mNum;
    private final long mDen;

    private Rational(final long num, final long den) {
      if (den < 0) {
        mNum = -num;
        mDen = -den;
      } else {
        mNum = num;
        mDen = den;
      }
    }

    @Override
    public int compareTo(final Rational other) {
      return Long.compare(mNum * other.mDen, other.mNum * mDen);
    }

    private int floorMultiply(final int k) {
      return (int) ((mNum * k) / mDen);
    }
  }

  /*
   * An element of a list, together with its original number.
   */
  private static class Element {
    private final Rational mValue;
    private final int mId;

    Element(final Rational value, final int id) {
      mValue = value;
      mId = id;
    }
  }

  private int mN = -1;

  /*
   * Construct the representative values used by create_values(n).
   */
  private static Rational[] createValues(final int n) {
    final List<Rational> fractions = new ArrayList<>();
    for (int q = 1; q <= n; ++q) {
      for (int p = 0; p <= q; ++p) {
        final Rational r = new Rational(p, q);
        boolean found = false;
        for (final Rational s : fractions) {
          if (r.compareTo(s) == 0) {
            found = true;
            break;
          }
        }
        if (!found) {
          fractions.add(r);
        }
      }
    }
    fractions.sort(Rational::compareTo);
    final Rational[] values = new Rational[fractions.size() - 1];
    for (int i = 0; i < values.length; ++i) {
      final Rational a = fractions.get(i);
      final Rational b = fractions.get(i + 1);
      // (a.num/a.den + b.num/b.den) / 2
      values[i] = new Rational(
        a.mNum * b.mDen + b.mNum * a.mDen,
        2L * a.mDen * b.mDen);
    }
    return values;
  }

  /*
   * Generate all sorted lists of length n, allowing repetitions.
   */
  private static void generateLists(final int n, final Rational[] values, final int start, final Rational[] list, final int pos, final MutableInteger holder) {
    if (pos == n) {
      final int v = maxAmongPermutations(list);
      if (v > holder.get()) {
        holder.set(v);
      }
      return;
    }
    for (int i = start; i < values.length; ++i) {
      list[pos] = values[i];
      generateLists(n, values, i, list, pos + 1, holder);
    }
  }

  private static int maxNL(final int n) {
    if (n == 0) {
      return 1;
    }
    final Rational[] values = createValues(n);
    final Rational[] list = new Rational[n];
    final MutableInteger holder = new MutableInteger();
    generateLists(n, values, 0, list, 0, holder);
    return holder.get();
  }

  /*
   * The elements are numbered before the permutations are generated,
   * so equal values still represent distinct elements.
   */
  private static int maxAmongPermutations(final Rational[] list) {
    final int n = list.length;
    if (n == 0) {
      return 0;
    }
    final Element[] elements = new Element[n];
    for (int i = 0; i < n; ++i) {
      elements[i] = new Element(list[i], i + 1);
    }
    final int factorial = Functions.FACTORIAL.i(n);
    final int[] counts = new int[factorial];
    final boolean[] used = new boolean[n];
    final Element[] permutation = new Element[n];
    final MutableInteger holder = new MutableInteger();
    generatePermutations(elements, used, permutation, 0, counts, holder);
    return holder.get();
  }

  /*
   * Generate permutations of the numbered elements.
   */
  private static void generatePermutations(final Element[] elements, final boolean[] used, final Element[] permutation, final int pos, final int[] counts, final MutableInteger holder) {
    if (pos == elements.length) {
      final Element[] image = gaston(permutation);
      final int id = permutationId(image);
      final int count = ++counts[id];
      if (count > holder.get()) {
        holder.set(count);
      }
      return;
    }
    for (int i = 0; i < elements.length; ++i) {
      if (!used[i]) {
        used[i] = true;
        permutation[pos] = elements[i];
        generatePermutations(elements, used, permutation, pos + 1, counts, holder);
        used[i] = false;
      }
    }
  }

  private static Element[] gaston(final Element[] list) {
    final Element[] result = new Element[list.length];
    int size = 0;
    for (int i = 0; i < list.length; ++i) {
      final Element e = list[i];
      final int k = e.mValue.floorMultiply(i + 1);
      // Shift result[k..size-1] one position to the right.
      if (k < size) {
        System.arraycopy(result, k, result, k + 1, size - k);
      }
      result[k] = e;
      ++size;
    }
    return result;
  }

  private static int permutationId(final Element[] list) {
    final int n = list.length;
    final int[] order = new int[n];
    for (int i = 0; i < n; ++i) {
      order[i] = list[i].mId - 1;
    }
    int id = 0;
    for (int i = 0; i < n - 1; ++i) {
      id += order[i];
      for (int j = i; j < n; ++j) {
        if (order[j] > order[i]) {
          --order[j];
        }
      }
      id *= n - i - 1;
    }
    return id;
  }

  @Override
  public Z next() {
    return Z.valueOf(maxNL(++mN));
  }
}
