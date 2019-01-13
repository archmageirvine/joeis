package irvine.math.group;

import junit.framework.TestCase;
import irvine.math.z.Z;
import irvine.math.api.Ring;
import irvine.math.api.Set;


/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class FiniteIdealTest extends TestCase {

  private static final String LS = System.lineSeparator();

  public void testDurbin46p1d() {
    final IntegersMod z12 = new IntegersMod(12);
    final Ring<Set<Z>> r = z12.quotientRing(z12.ideal(Z.FOUR));
    final String s = CayleyTable.cayleyTable(r, "+");
    //System.out.println(s);
    assertEquals("\\begin{tabular}{r|cccc}"
      + LS + "+&(4)&(4)1 in \\Z(12)&(4)2 in \\Z(12)&(4)3 in \\Z(12)\\\\\\hline"
      + LS + "(4)&(4)&(4)1 in \\Z(12)&(4)2 in \\Z(12)&(4)3 in \\Z(12)\\\\"
      + LS + "(4)1 in \\Z(12)&(4)1 in \\Z(12)&(4)2 in \\Z(12)&(4)3 in \\Z(12)&(4)4 in \\Z(12)\\\\"
      + LS + "(4)2 in \\Z(12)&(4)2 in \\Z(12)&(4)3 in \\Z(12)&(4)4 in \\Z(12)&(4)5 in \\Z(12)\\\\"
      + LS + "(4)3 in \\Z(12)&(4)3 in \\Z(12)&(4)4 in \\Z(12)&(4)5 in \\Z(12)&(4)6 in \\Z(12)\\\\"
      + LS + "\\end{tabular}" + LS, s);
    final String t = CayleyTable.cayleyTable(r.multiplicativeOperation(), "+");
    //System.out.println(t);
    assertEquals("\\begin{tabular}{r|ccc}"
      + LS + "+&(4)1 in \\Z(12)&(4)2 in \\Z(12)&(4)3 in \\Z(12)\\\\\\hline"
      + LS + "(4)1 in \\Z(12)&(4)1 in \\Z(12)&(4)2 in \\Z(12)&(4)3 in \\Z(12)\\\\"
      + LS + "(4)2 in \\Z(12)&(4)2 in \\Z(12)&(4)4 in \\Z(12)&(4)6 in \\Z(12)\\\\"
      + LS + "(4)3 in \\Z(12)&(4)3 in \\Z(12)&(4)6 in \\Z(12)&(4)9 in \\Z(12)\\\\"
      + LS + "\\end{tabular}" + LS, t);
  }

}
