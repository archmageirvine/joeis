package irvine.factor.prime;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PumaTest extends TestCase {

  public void test() {
    assertEquals(1, Puma.prime(0));
    assertEquals(2, Puma.prime(1));
    assertEquals(3, Puma.prime(2));
    assertEquals(181, Puma.prime(42));
    assertEquals(42, Puma.primePi(181));
    assertEquals(Z.valueOf(181), Puma.primeZ(42));
    assertEquals(Z.valueOf(42), Puma.primePiZ(181));
    assertEquals(0, Puma.primePi(0));
    assertEquals(0, Puma.primePi(1));
    assertEquals(1, Puma.primePi(2));
  }
}
