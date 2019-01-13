package irvine.oeis;

import java.io.IOException;

import irvine.math.z.Z;
import irvine.oeis.a005.A005266;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class FactorizationSequenceTest extends TestCase {

  public void test() throws IOException {
    try (final A005266 s = new A005266()) {
      for (int k = 0; k < 5; ++k) {
        s.next();
      }
      assertEquals(Z.valueOf(68729), s.next());
      assertEquals(Z.valueOf(3739), s.next());
      assertEquals(Z.valueOf(6221191), s.next());
      assertEquals(Z.valueOf(157170297801581L), s.next());
      assertEquals(new Z("70724343608203457341903"), s.next());
      assertEquals(new Z("46316297682014731387158877659877"), s.next());
    }
  }
}
