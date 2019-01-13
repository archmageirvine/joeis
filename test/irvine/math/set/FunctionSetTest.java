package irvine.math.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import irvine.math.api.Function;
import irvine.math.api.Set;
import irvine.math.z.Z;
import irvine.util.Pair;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class FunctionSetTest extends TestCase {

  public void testDurbin4p2() {
    final FiniteSet<String> s = new FiniteSet<>("a", "b", "c");
    final Set<Function<String, String>> fn = new FunctionSet<>(s, s);
    assertTrue(fn.toString().contains("\\}\\rightarrow \\{"));
    final Function<String, String> alpha = new FiniteFunction<>(s, s, Arrays.asList(new Pair<>("a", "a"), new Pair<>("b", "b"), new Pair<>("c", "c")));
    final Function<String, String> beta = new FiniteFunction<>(s, s, Arrays.asList(new Pair<>("a", "b"), new Pair<>("b", "a"), new Pair<>("c", "c")));
    final Function<String, String> gamma = new FiniteFunction<>(s, s, Arrays.asList(new Pair<>("a", "a"), new Pair<>("b", "a"), new Pair<>("c", "a")));
    final Function<String, String> delta = new FiniteFunction<>(s, s, Arrays.asList(new Pair<>("a", "b"), new Pair<>("b", "b"), new Pair<>("c", "b")));
    assertTrue(fn.contains(alpha));
    assertTrue(fn.contains(beta));
    assertTrue(fn.contains(gamma));
    assertTrue(fn.contains(delta));
    assertFalse(fn.contains(null));
    final List<Function<String, String>> fns = Arrays.asList(alpha, beta, gamma, delta);
    final Set<Function<String, String>> set = new FiniteSet<>(fns);
    final CompositionsOperation<String> o = new CompositionsOperation<>(set, true, false);
    // Construct an entire Cayley table, see Problem 4p2(a) in Durbin
    final String[][] names = new String[4][4];
    int j = 0;
    for (final Function<String, String> a : fns) {
      int k = 0;
      for (final Function<String, String> b : fns) {
        final Function<String, String> c = Composition.compose(a, b);
        final Function<String, String> d = o.op(a, b);
        assertEquals(c, d);
        if (c.equals(alpha)) {
          names[k][j] = "alpha";
        } else if (c.equals(beta)) {
          names[k][j] = "beta";
        } else if (c.equals(gamma)) {
          names[k][j] = "gamma";
        } else if (c.equals(delta)) {
          names[k][j] = "delta";
        } else {
          fail();
        }
        ++k;
      }
      ++j;
    }
    assertEquals("[alpha, beta, gamma, delta]", Arrays.toString(names[0]));
    assertEquals("[beta, alpha, delta, gamma]", Arrays.toString(names[1]));
    assertEquals("[gamma, gamma, gamma, gamma]", Arrays.toString(names[2]));
    assertEquals("[delta, delta, delta, delta]", Arrays.toString(names[3]));
    assertFalse(o.isCommutative());
    assertTrue(o.isAssociative());
    assertTrue(o.isIdentity(alpha));
    assertFalse(o.isIdentity(beta));
  }

  public void testIteratorEmpty() {
    final FiniteSet<String> s = new FiniteSet<>();
    final Set<Function<String, String>> fn = new FunctionSet<>(s, s);
    final Iterator<Function<String, String>> it = fn.iterator();
    assertFalse(it.hasNext());
  }

  public void testIterator() {
    final FiniteSet<String> s = new FiniteSet<>("a");
    final Set<Function<String, String>> fn = new FunctionSet<>(s, s);
    final Iterator<Function<String, String>> it = fn.iterator();
    assertTrue(it.hasNext());
    final Function<String, String> g = it.next();
    assertEquals("a", g.image("a"));
    assertFalse(it.hasNext());
  }

  public void testIterator2() {
    final FiniteSet<String> s = new FiniteSet<>("a");
    final FiniteSet<String> t = new FiniteSet<>("u", "v");
    final Set<Function<String, String>> fn = new FunctionSet<>(s, t);
    final Iterator<Function<String, String>> it = fn.iterator();
    assertTrue(it.hasNext());
    assertEquals("u", it.next().image("a"));
    assertEquals("v", it.next().image("a"));
    assertFalse(it.hasNext());
  }

  public void testIterator2b() {
    final FiniteSet<String> t = new FiniteSet<>("u", "v");
    final Set<Function<String, String>> fn = new FunctionSet<>(t, t);
    long c = 0;
    for (final Function<String, String> g : fn) {
      final String i = g.image("u");
      assertTrue("u".equals(i) || "v".equals(i));
      ++c;
    }
    assertEquals(4, c);
  }

  private static final class FakeSizeSet extends FiniteSet<String> {
    private FakeSizeSet() {
      super("a");
    }

    @Override
    public Z size() {
      return Z.valueOf((1L << 31) + 1);
    }
  }

  public void testIterator3() {
    final FiniteSet<String> s = new FakeSizeSet();
    final FiniteSet<String> t = new FiniteSet<>("u");
    try {
      new FunctionSet<>(s, t).iterator();
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
    try {
      new FunctionSet<>(t, s).iterator();
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }
}
