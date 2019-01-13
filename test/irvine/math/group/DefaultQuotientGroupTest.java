package irvine.math.group;

import irvine.math.api.Group;
import irvine.math.api.QuotientGroup;
import irvine.math.api.Set;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.util.Pair;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DefaultQuotientGroupTest extends TestCase {

  public void testDurbin32p1() {
    final IntegersMod z8 = new IntegersMod(8);
    final Group<Z> n4 = z8.subgroup(Z.FOUR);
    assertTrue(z8.isNormalSubgroup(n4));
    final QuotientGroup<Z> q = z8.quotientGroup(n4);
    assertEquals("\\Z(8)/<4>", q.toString());
    assertEquals(Z.FOUR, q.size());
    assertEquals(Z.TWO, z8.quotientGroup(z8.subgroup(Z.TWO)).size());
    assertEquals(Z.ONE, z8.quotientGroup(z8.subgroup(Z.THREE)).size());
    final Group<Z> z3 = Integers.SINGLETON.subgroup(Z.THREE);
    final QuotientGroup<Z> q2 = z3.quotientGroup(new IntegerMultiples(6));
    assertEquals(Z.TWO, q2.size());
  }

  public void testDurbin32p2() {
    final IntegersMod z12 = new IntegersMod(12);
    final IntegersMod z4 = new IntegersMod(4);
    final Group<Pair<Z, Z>> g = new DirectProduct<>(z12, z4);
    final Group<Pair<Z, Z>> n = g.subgroup(new Pair<>(Z.THREE, Z.TWO));
    final QuotientGroup<Pair<Z, Z>> q = g.quotientGroup(n);
    assertEquals(Z.valueOf(12), q.size());
    assertNotNull(q.naturalHomomorphism());
    final Iterator<Set<Pair<Z, Z>>> it = q.iterator();
    assertTrue(it.hasNext());
    assertTrue(it.next().contains(new Pair<>(Z.ZERO, Z.ZERO)));
    for (int k = 1; k < 12; ++k) {
      assertTrue(it.hasNext());
      assertFalse(it.next().contains(new Pair<>(Z.ZERO, Z.ZERO)));
    }
    assertFalse(it.hasNext());
  }

  private static final String LS = System.lineSeparator();

  public void testDurbin32p4() {
    final IntegersMod z12 = new IntegersMod(12);
    final IntegersMod z4 = new IntegersMod(4);
    final Group<Pair<Z, Z>> g = new DirectProduct<>(z12, z4);
    final Group<Z> n3 = z12.subgroup(Z.THREE);
    final Group<Z> n2 = z4.subgroup(Z.TWO);
    final Group<Pair<Z, Z>> n = new DirectProduct<>(n3, n2);
    final QuotientGroup<Pair<Z, Z>> q = g.quotientGroup(n);
    final String s = CayleyTable.cayleyTable(q);
    //System.out.println(s);
    assertEquals("\\begin{tabular}{r|cccccc}" + LS
+ "&<3>\\times<2>&<3>\\times<2>(0,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(1,0) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(1,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,0) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,1) in \\Z(12)\\times\\Z(4)\\\\\\hline" + LS
+ "<3>\\times<2>&<3>\\times<2>&<3>\\times<2>(0,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(1,0) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(1,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,0) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,1) in \\Z(12)\\times\\Z(4)\\\\" + LS
+ "<3>\\times<2>(0,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(0,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(0,2) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(1,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(1,2) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,2) in \\Z(12)\\times\\Z(4)\\\\" + LS
+ "<3>\\times<2>(1,0) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(1,0) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(1,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,0) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(3,0) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(3,1) in \\Z(12)\\times\\Z(4)\\\\" + LS
+ "<3>\\times<2>(1,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(1,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(1,2) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,2) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(3,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(3,2) in \\Z(12)\\times\\Z(4)\\\\" + LS
+ "<3>\\times<2>(2,0) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,0) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(3,0) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(3,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(4,0) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(4,1) in \\Z(12)\\times\\Z(4)\\\\" + LS
+ "<3>\\times<2>(2,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(2,2) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(3,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(3,2) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(4,1) in \\Z(12)\\times\\Z(4)&<3>\\times<2>(4,2) in \\Z(12)\\times\\Z(4)\\\\" + LS
+ "\\end{tabular}" + LS, s);
  }
}
