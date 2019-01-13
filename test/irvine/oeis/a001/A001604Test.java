package irvine.oeis.a001;

import irvine.oeis.AbstractSequenceTest;

import java.util.Arrays;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A001604Test extends AbstractSequenceTest {

  public void testSqrt5Binomial() {
    assertEquals("[1, 0]", Arrays.toString(A001604.sqrt5binomial(7, 3, 0)));
    assertEquals("[7, 3]", Arrays.toString(A001604.sqrt5binomial(7, 3, 1)));
    assertEquals("[94, 42]", Arrays.toString(A001604.sqrt5binomial(7, 3, 2)));
    assertEquals("[242032, 108240]", Arrays.toString(A001604.sqrt5binomial(7, 3, 5)));
  }
}
