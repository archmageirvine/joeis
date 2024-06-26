package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class LucasTest extends TestCase {

  public void testLucas() {
    final Function1 f = new Lucas();
    assertEquals(Z.TWO, f.z(0));
    assertEquals(Z.ONE, f.z(1));
    assertEquals(new Z("-49941774772757703300470707773688236620346480720862218592914831305649185180429"), f.z(-367));
    assertEquals(new Z("80807489040814020041266183636939143192786617912140668064464649421515377682847"), f.z(-368));
    Z a = Z.ONE;
    Z b = Z.THREE;
    for (int k = 2; k < 1000; ++k) {
      assertEquals(b, f.z(k));
      final Z c = b.add(a);
      a = b;
      b = c;
    }
  }
}
