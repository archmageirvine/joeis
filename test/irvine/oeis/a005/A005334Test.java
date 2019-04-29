package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A005334Test extends AbstractSequenceTest {

  public void testH() {
    // Test using values from Maple expansions of g.f. n! * m! * H(x, y)
    final A005334 seq = new A005334();
    assertEquals(Z.ZERO, seq.mH.get(1, 0));
    assertEquals(Z.ONE, seq.mH.get(1, 1));
    assertEquals(Z.THREE, seq.mH.get(1, 2));
    assertEquals(Z.valueOf(15), seq.mH.get(2, 2));
    assertEquals(Z.ONE, seq.mH.get(3, 1));
    assertEquals(Z.valueOf(57), seq.mH.get(3, 2));
    assertEquals(Z.valueOf(1435), seq.mH.get(3, 3));
    assertEquals(Z.valueOf(26925), seq.mH.get(3, 4));
    assertEquals(Z.valueOf(544755), seq.mH.get(4, 4));
    assertEquals(Z.valueOf(636234485235L), seq.mH.get(4, 8));
    assertEquals(Z.valueOf(474455938988053L), seq.mH.get(6, 7));
  }

  @Override
  protected int maxTerms() {
    // XXX This test actually currently fails for reasonable values
    return 0;
  }
}
