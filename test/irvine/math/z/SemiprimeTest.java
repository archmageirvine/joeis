package irvine.math.z;

import irvine.StandardIoTestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SemiprimeTest extends StandardIoTestCase {

  private static final String LS = System.lineSeparator();

  public void test() {
    final Semiprime s = new Semiprime("irvine/oeis/a046/a046461.dat");
    assertNull(s.semiprime(Z.valueOf(123456)));
    assertNotNull(s.semiprime(Z.valueOf(1234567)));
    assertEquals("", getOut());
  }

  public void testVerbose() {
    final Semiprime s = new Semiprime("irvine/oeis/a046/a046461.dat");
    s.setVerbose(true);
    assertNull(s.semiprime(Z.valueOf(123456)));
    assertNotNull(s.semiprime(Z.valueOf(1234567)));
    assertEquals("Semiprime candidate: 123456" + LS + "Semiprime candidate: 1234567" + LS + "Found <127>" + LS, getOut());
  }
}
