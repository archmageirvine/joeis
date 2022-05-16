package irvine.factor.util;

import irvine.factor.factor.Jaguar;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class InfinitaryAliquotSequenceTest extends TestCase {

  public void test() {
    assertEquals("[1, 7, 3, 21, 2, 14, 6, 42]", InfinitaryAliquotSequence.infinitaryDivisors(Jaguar.factor(42)).toString());
  }
}
