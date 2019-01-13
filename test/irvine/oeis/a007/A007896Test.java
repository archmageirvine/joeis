package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A007896Test extends AbstractSequenceTest {

  public void testDirMul() {
    assertEquals("[2, 7]", Arrays.toString(A007896.dirmul(new Z[] {Z.ONE, Z.TWO}, new Z[] {Z.TWO, Z.THREE})));
    assertEquals("[2, 7, 6]", Arrays.toString(A007896.dirmul(new Z[] {Z.ONE, Z.TWO, Z.ONE}, new Z[] {Z.TWO, Z.THREE, Z.FOUR})));
  }
}
