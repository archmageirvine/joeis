package irvine.math.group;

import java.util.HashMap;

import irvine.math.api.Set;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CayleyTableTest extends TestCase {

  private static final String LS = System.lineSeparator();

  public void testCayleyTable() {
    final String s = CayleyTable.cayleyTable(new IntegersMod(3));
    assertEquals("\\begin{tabular}{r|ccc}" + LS + "&0&1&2\\\\\\hline" + LS + "0&0&1&2\\\\" + LS + "1&1&2&0\\\\" + LS + "2&2&0&1\\\\" + LS + "\\end{tabular}" + LS, s);
  }

  private static final String EXPECTED_32_3 = ""
    + "\\begin{tabular}{r|cccc}" + LS
    + "+&[[0]]&[[1]]&[[2]]&[[3]]\\\\\\hline" + LS
    + "{}[[0]]&[[0]]&[[1]]&[[2]]&[[3]]\\\\" + LS
    + "{}[[1]]&[[1]]&[[2]]&[[3]]&[[0]]\\\\" + LS
    + "{}[[2]]&[[2]]&[[3]]&[[0]]&[[1]]\\\\" + LS
    + "{}[[3]]&[[3]]&[[0]]&[[1]]&[[2]]\\\\" + LS
    + "\\end{tabular}" + LS;

  public void testDurbin32p3() {
    final IntegersMod z12 = new IntegersMod(12);
    final DefaultQuotientGroup<Z> group = z12.quotientGroup(z12.subgroup(Z.FOUR));
    final HashMap<Set<Z>, String> map = new HashMap<>();
    for (final Set<Z> e : group) {
      map.put(e, "[[" + e.iterator().next() + "]]");
    }
    final String s = CayleyTable.cayleyTable(group, "+", map, 'c');
    //System.out.println(s);
    assertEquals(EXPECTED_32_3, s);
  }

}
