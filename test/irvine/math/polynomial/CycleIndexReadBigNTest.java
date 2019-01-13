package irvine.math.polynomial;

import irvine.math.group.SymmetricGroup;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CycleIndexReadBigNTest extends TestCase {

  public void test() {
    final CycleIndex c = SymmetricGroup.create(8).cycleIndex().wreath(SymmetricGroup.create(2).cycleIndex());
    final CycleIndex e = new CycleIndex("E", MultivariateMonomial.create(1, 4)).wreath(SymmetricGroup.create(4).cycleIndex());
    assertEquals(new Q(138), CycleIndexReadBigN.bigN(e, c));
  }
}
