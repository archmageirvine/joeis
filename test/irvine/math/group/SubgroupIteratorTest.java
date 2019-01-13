package irvine.math.group;

import irvine.math.api.Group;
import junit.framework.TestCase;
import irvine.math.z.Z;
import irvine.math.set.FiniteSet;
import java.util.Iterator;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SubgroupIteratorTest extends TestCase {

  public void test() {
    final IntegersMod z6 = new IntegersMod(6);
    final Group<Z> s = new Subgroup<>(new FiniteSet<>(Z.ZERO, Z.TWO, Z.FOUR), z6);
    final Iterator<Z> it = new SubgroupIterator<>(s, z6.iterator());
    assertTrue(it.hasNext());
    assertEquals(Z.ZERO, it.next());
    assertTrue(it.hasNext());
    assertEquals(Z.TWO, it.next());
    assertTrue(it.hasNext());
    assertEquals(Z.FOUR, it.next());
    assertFalse(it.hasNext());
  }

}
