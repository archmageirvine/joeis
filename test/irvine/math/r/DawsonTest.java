package irvine.math.r;

import static irvine.TestUtils.assertEqualsLocal;
import static irvine.math.r.Dawson.dawson;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DawsonTest extends TestCase {




  public void testDawson() {
    assertEqualsLocal(0, dawson(0), 0);
    assertEqualsLocal(0.5410442246351816, dawson(0.9241388730), 1E-10);
    assertEqualsLocal(0.4276866160089908, dawson(1.5019752683), 1E-10);
    assertEqualsLocal(-0.5410442246351816, dawson(-0.9241388730), 1E-10);
    assertEqualsLocal(-0.4276866160089908, dawson(-1.5019752683), 1E-10);
    assertEqualsLocal(0.1293480012360051, dawson(4), 1E-10);
    assertEqualsLocal(-0.1293480012360051, dawson(-4), 1E-10);
    assertEqualsLocal(0.0721809746582363, dawson(7), 1E-10);
    assertEqualsLocal(-0.0721809746582363, dawson(-7), 1E-10);
    assertEqualsLocal(0.0696412276421707, dawson(ConstantsTest.sump(7.25)), 1E-13);
    assertEqualsLocal(5E-10, dawson(1E9), 1E-20);
    assertEqualsLocal(-5E-10, dawson(-1E9), 1E-20);
    assertEqualsLocal(4.999999999999999E-10, dawson(ConstantsTest.bump(1E9)), 1E-20);
    assertEqualsLocal(5E-201, dawson(1E200), 1E-210);
    assertEqualsLocal(-5E-201, dawson(-1E200), 1E-210);
    assertEqualsLocal(0.5380795069127684, dawson(ConstantsTest.sump(1)), 1E-14);
    assertEqualsLocal(-0.5380795069127684, dawson(-ConstantsTest.sump(1)), 1E-14);
  }

}
