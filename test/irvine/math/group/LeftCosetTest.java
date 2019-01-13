package irvine.math.group;

import irvine.math.api.Group;
import irvine.math.z.Z;
import junit.framework.TestCase;
import java.util.HashSet;


/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class LeftCosetTest extends TestCase {

  public void testDurbin16p2() {
    final IntegersMod z12 = new IntegersMod(12);
    final Group<Z> g3 = z12.subgroup(Z.THREE);
    final LeftCoset<Z> r0 = new LeftCoset<>(z12, Z.ZERO, g3);
    assertEquals(Z.FOUR, r0.size());
    assertTrue(r0.contains(Z.ZERO));
    assertTrue(r0.contains(Z.THREE));
    assertTrue(r0.contains(Z.SIX));
    assertTrue(r0.contains(Z.NINE));
    final LeftCoset<Z> r1 = new LeftCoset<>(z12, Z.ONE, g3);
    assertEquals(Z.FOUR, r1.size());
    assertTrue(r1.contains(Z.ONE));
    assertTrue(r1.contains(Z.FOUR));
    assertTrue(r1.contains(Z.SEVEN));
    assertTrue(r1.contains(Z.TEN));
    final LeftCoset<Z> r2 = new LeftCoset<>(z12, Z.TWO, g3);
    assertEquals(Z.FOUR, r2.size());
    assertTrue(r2.contains(Z.TWO));
    assertTrue(r2.contains(Z.FIVE));
    assertTrue(r2.contains(Z.EIGHT));
    assertTrue(r2.contains(Z.valueOf(11)));
    final LeftCoset<Z> r3 = new LeftCoset<>(z12, Z.THREE, g3);
    assertTrue(r0.equals(r3));
    try {
      new LeftCoset<>(null, Z.ZERO, g3);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      new LeftCoset<>(z12, Z.ZERO, null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      new LeftCoset<>(z12, Z.NEG_ONE, g3);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals("0<3> in \\Z(12)", r0.toString());
    // Tests the iterator
    final HashSet<Z> h = new HashSet<>();
    for (final Z z : r0) {
      h.add(z);
    }
    assertEquals(4, h.size());
    assertTrue(h.contains(Z.ZERO));
    assertTrue(h.contains(Z.THREE));
    assertTrue(h.contains(Z.SIX));
    assertTrue(h.contains(Z.NINE));
  }

}
