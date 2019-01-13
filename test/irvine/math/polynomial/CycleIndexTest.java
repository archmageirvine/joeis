package irvine.math.polynomial;

import java.util.Arrays;

import irvine.math.group.CyclicGroup;
import irvine.math.group.SymmetricGroup;
import irvine.math.q.Q;
import irvine.math.z.Z;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CycleIndexTest extends TestCase {

  public void testKnownCases() {
    Assert.assertEquals("Z(S1) = x_1", SymmetricGroup.create(1).cycleIndex().toString());
    assertEquals("Z(S2) = (1/2)x_2 + (1/2)x_1^2", SymmetricGroup.create(2).cycleIndex().toString());
    final CycleIndex c4 = new CyclicGroup(4).cycleIndex();
    assertEquals("Z(C4) = (1/2)x_4 + (1/4)x_2^2 + (1/4)x_1^4", c4.toString());
    assertEquals(new Q(16), c4.apply(1, 2, 3, 4));
    assertEquals(Z.valueOf(20), c4.deBruijn(c4));
    assertEquals(Z.THREE, c4.invertible(c4));
    assertEquals("1+x+2x^2+x^3", c4.apply(new Polynomial<>(Q.ZERO, Q.ONE, Arrays.asList(Q.ONE, Q.ONE)), 3).toString());
    assertEquals("1+x+2x^2+x^3+x^4", c4.applyOnePlusXToTheN().toString());
    assertEquals("Z(C4)", c4.getName());
  }

  public void testWreath() {
    final CycleIndex s2 = SymmetricGroup.create(2).cycleIndex();
    assertEquals("Z(S2)[Z(S2)] = (1/4)x_4 + (3/8)x_2^2 + (1/4)x_1^2x_2 + (1/8)x_1^4", s2.wreath(s2).toString());
  }
}
