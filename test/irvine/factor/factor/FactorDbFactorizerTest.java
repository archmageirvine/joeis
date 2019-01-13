package irvine.factor.factor;

import java.io.IOException;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class FactorDbFactorizerTest extends TestCase {

  public void testIds() {
    assertEquals("[1100000001141657486]", FactorDbFactorizer.extractIds("<html><td>133 <a href=\"index.php?showid=1100000000922103046\">(show)</a></td>\n<td><a href=\"index.php?id=1100000000922103046\"><font color=\"#002099\">87!+82</font><a href=\"index.php?id=1100000001141657486\"><font color=\"#000000\">2552757102527120645391143</font></a></html>").toString());
  }

  public void testIdsBad() {
    try {
      FactorDbFactorizer.extractIds("<html><td>133 <a href=\"index.php?showid=1100000000922103046\">(show)</a></td>\n<td><a href=\"index.php?id=1100000000922103046\"><font color=\"#002099\">87!+82</font><a href=\"index.php?id=1100000001141657486</html>");
      fail();
    } catch (final RuntimeException e) {
      // ok
    }
  }

  public void testGetNumber() throws IOException {
    assertEquals(Z.valueOf(137438953471L), FactorDbFactorizer.getNumber("<html>\n</tr><tr><td align=\"center\">Number</td>\n<td align=\"center\">137438953471<br>\n</html>"));
  }

  public void testGetNumberBad() {
    try {
      FactorDbFactorizer.getNumber("");
      fail();
    } catch (final IOException e) {
      // ok
    }
  }
}
