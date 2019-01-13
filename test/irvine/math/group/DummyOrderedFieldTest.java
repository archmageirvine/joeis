package irvine.math.group;

import irvine.math.q.Rationals;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DummyOrderedFieldTest extends TestCase {

  public void test() {
    assertTrue(Rationals.SINGLETON.multiplicativeGroup() instanceof MultiplicativeGroup);
  }
}
