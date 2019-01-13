package irvine.factor.dist;

import java.io.IOException;

import irvine.StandardIoTestCase;
import irvine.TestUtils;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class LutetiumTest extends StandardIoTestCase {

  public void test() throws IOException {
    final Lutetium lutetium = new Lutetium(11712);
    assertEquals("", lutetium.get());
    lutetium.add("add~test~10000~2~77777");
    assertEquals("test 10000 77777", lutetium.get());
    lutetium.result("result~test~machine~fail");
    final String status = lutetium.status();
    TestUtils.containsAll(status, "Host records:", "1 machine", "Status of all targets:", "test 1/2 @ 10000 C5");
    assertEquals("test machine fail\n", getOut());
  }
}
