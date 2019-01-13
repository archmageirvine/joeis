package irvine.math.r;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DickmanTest extends TestCase {

  public void testDickman() {
    assertEquals(1.0, Dickman.dickman(0.5), 1e-8);
    assertEquals(1.0, Dickman.dickman(1.0), 1e-8);
    assertEquals(3.0685282E-1, Dickman.dickman(2.0), 1e-8);
    assertEquals(4.8608388E-2, Dickman.dickman(3.0), 1e-8);
    assertEquals(4.9109256E-3, Dickman.dickman(4.0), 1e-8);
    assertEquals(3.5472470E-4, Dickman.dickman(5.0), 1e-8);
    assertEquals(1.9649696E-5, Dickman.dickman(6.0), 1e-8);
    assertEquals(8.7456700E-7, Dickman.dickman(7.0), 1e-8);
    assertEquals(3.2320693E-8, Dickman.dickman(8.0), 1e-8);
    assertEquals(1.0162483E-9, Dickman.dickman(9.0), 1e-8);
    assertEquals(2.7701718E-11, Dickman.dickman(10.0), 1e-8);
  }
}
