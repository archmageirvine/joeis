package irvine.math.c;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ComplexEiTest extends TestCase {

  public void test() {
    TestUtils.assertEquals(new C(-0.00114829559127532579), ComplexEi.ei(new C(-5.0)), 1e-14);
    TestUtils.assertEquals(new C(40.185275355803177), ComplexEi.ei(new C(5.0)), 1e-14);
    TestUtils.assertEquals(new C(-0.123067588366110027173898, 1.2150820965308132367932), ComplexEi.ei(new C(0.25, 0.3)), 1e-14);
    TestUtils.assertEquals(new C(0.337403922900968134662646203889, -2.51687939716207963417267500546), ComplexEi.ei(new C(0, -1)), 1e-14);
    TestUtils.assertEquals(new C(-1576.150426576851744763716335, 436.9192317011328139922047076), ComplexEi.ei(new C(10, 10)), 1e-12);
    TestUtils.assertEquals(new C(-0.0051488251426104921444435539, -3.13302179368395291258366683), ComplexEi.ei(new C(0, -100)), 1e-12);
  }

}

