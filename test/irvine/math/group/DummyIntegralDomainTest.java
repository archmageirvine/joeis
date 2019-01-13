package irvine.math.group;

import irvine.math.c.ComplexField;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DummyIntegralDomainTest extends TestCase {

  public void test() {
    final ComplexField c = ComplexField.SINGLETON;
    assertTrue(c.isCommutative());
    assertTrue(c.isIntegralDomain());
  }
}
