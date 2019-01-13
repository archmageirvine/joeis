package irvine.math.z;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SemiprimeTest extends TestCase {

  public void test() {
    final Semiprime s = new Semiprime("irvine/oeis/a046/a046461.dat");
    assertNull(s.semiprime(Z.valueOf(123456)));
    assertNotNull(s.semiprime(Z.valueOf(1234567)));
  }
}
