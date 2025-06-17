package irvine.math.q;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class QUtilsTest extends TestCase {

  public void testArray() {
    final Q[] res = QUtils.toQ("[1/2,42]");
    assertEquals(Q.HALF, res[0]);
    assertEquals(new Q(42), res[1]);
    assertEquals(2, res.length);
    assertEquals(0, QUtils.toQ("").length);
    assertEquals("[-1/10, 12345, -1, 0, 5]", Arrays.toString(QUtils.toQ("(-1/10,12345,-1,,5}")));
  }
}

