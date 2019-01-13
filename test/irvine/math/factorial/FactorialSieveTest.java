package irvine.math.factorial;

import java.io.IOException;

import irvine.StandardIoTestCase;
import irvine.TestUtils;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class FactorialSieveTest extends StandardIoTestCase {

  public void test() throws IOException {
    final FactorialSieve fs = new FactorialSieve(10, 100, null);
    fs.sieve(37, 50);
    assertEquals("Sieving from 37 to 50", getErr().trim());
    final String out = getOut();
    TestUtils.containsAll(out,
      " 35!-1 37 SAI",
      " 36!+1 37 SAI",
      " 23!+1 47 SAI",
      " 46!+1 47 SAI",
      "-"
    );
  }
}
