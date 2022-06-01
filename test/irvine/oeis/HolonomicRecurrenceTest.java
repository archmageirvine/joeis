package irvine.oeis;

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class HolonomicRecurrenceTest extends TestCase {

  public void test() {
    final HolonomicRecurrence seq = new HolonomicRecurrence(1, "[0,-4,-2,0,1]", "[1,0,1,3]", 0);
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.ZERO, seq.next());
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.THREE, seq.next());
    assertEquals(Z.TWO, seq.next());
    assertEquals(Z.TEN, seq.next());
    assertEquals(Z.valueOf(16), seq.next());
    assertEquals(Z.valueOf(28), seq.next());
    assertEquals(Z.valueOf(72), seq.next());
    assertEquals(Z.valueOf(120), seq.next());
  }
}
