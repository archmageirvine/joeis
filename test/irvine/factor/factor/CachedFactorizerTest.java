package irvine.factor.factor;

import java.io.File;
import java.io.IOException;

import irvine.TestUtils;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.util.io.IOUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CachedFactorizerTest extends TestCase {

  public void test() throws IOException {
    final File cache = TestUtils.createTempDir("cache", "test");
    try {
      final CachedFactorizer cf = new CachedFactorizer(new Cheetah(), cache);
      assertEquals("3.109", FactorSequence.toString(cf.factorize(Z.valueOf(327))));
      final File f = new File(cache, "00");
      assertTrue(f.exists());
      final File f0 = new File(f, "00");
      assertTrue(f0.exists());
      final File f1 = new File(f, "01");
      assertTrue(f1.exists());
      final File f2 = new File(f1, "47");
      assertTrue(f2.exists());
      assertEquals("3", IOUtils.readAll(f2).trim());
      assertEquals("3.109", FactorSequence.toString(cf.factorize(Z.valueOf(327))));
    } finally {
      assertTrue(IOUtils.deleteAll(cache));
    }
  }
}
