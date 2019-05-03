package irvine.oeis;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class NamesTest extends TestCase {

  public void test() {
    assertEquals("A265423 <code>(-1)^n + 50*floor(3n/2) - 100*floor(n/4)</code>.", Names.formulaProtect("A265423 (-1)^n + 50*floor(3n/2) - 100*floor(n/4)."));
  }
}
