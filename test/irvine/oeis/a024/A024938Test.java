package irvine.oeis.a024;

import java.util.Arrays;

import irvine.oeis.AbstractSequenceTest;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A024938Test extends AbstractSequenceTest {

  public void testB() {
    assertEquals("[1, 0]", Arrays.toString(new A024938().get(0, 0)));
    assertEquals("[0, 0]", Arrays.toString(new A024938().get(1, 0)));
    assertEquals("[0, 0]", Arrays.toString(new A024938().get(2, 0)));
    assertEquals("[1, 1]", Arrays.toString(new A024938().get(2, 1)));
    assertEquals("[2, 3]", Arrays.toString(new A024938().get(5, 3)));
  }
}
