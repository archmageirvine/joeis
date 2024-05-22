package irvine.math.function;

import java.util.Arrays;
import java.util.Collections;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MinTest extends TestCase {

  public void testMin() {
    assertEquals(Z.ZERO, Functions.MIN.z(Z.ZERO, Z.ZERO, Z.TWO, Z.ONE));
    assertEquals(Z.ONE, Functions.MIN.z(Z.TWO, Z.TWO, Z.TWO, Z.ONE));
    assertEquals(Z.ONE, Functions.MIN.z(Z.ONE));
    assertNull(Functions.MIN.z(new Z[] {}));
  }

  public void testMinCollection() {
    assertNull(Functions.MIN.z(Collections.emptyList()));
    assertEquals(Z.ONE, Functions.MIN.z(Collections.singleton(Z.ONE)));
    assertEquals(Z.ONE, Functions.MIN.z(Arrays.asList(Z.ONE, Z.TWO)));
    assertEquals(Z.ONE, Functions.MIN.z(Arrays.asList(Z.TWO, Z.FIVE, Z.ONE)));
  }
}
