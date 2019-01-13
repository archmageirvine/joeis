package irvine.graph;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DecisionTest extends TestCase {

  public void testDecision() {
    TestUtils.testEnum(Decision.class, "[UNKNOWN, YES, NO]");
  }
}

