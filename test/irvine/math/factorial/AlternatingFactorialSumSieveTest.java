package irvine.math.factorial;

import java.io.IOException;

import irvine.StandardIoTestCase;
import irvine.TestUtils;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class AlternatingFactorialSumSieveTest extends StandardIoTestCase {

  public void test() throws IOException {
    final AlternatingFactorialSumSieve fs = new AlternatingFactorialSumSieve(100, null);
    fs.sieve(37, 50);
    assertEquals("Sieving from 37 to 50", getErr().trim());
    final String out = getOut();
    TestUtils.containsAll(out,
      " A(35) 37 SAI",
      " A(13) 47 SAI",
      " A(17) 47 SAI",
      " A(30) 47 SAI",
      "-"
    );
  }
}
