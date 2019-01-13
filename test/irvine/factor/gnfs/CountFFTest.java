package irvine.factor.gnfs;

import java.io.File;

import irvine.StandardIoTestCase;
import irvine.TestUtils;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class CountFFTest extends StandardIoTestCase {

  private static final String[] EXPECTED = {
    ".chopd/test.lasieve-0.20000000-20000010.gz",
    "Pruning(0, 7, 60, 66, 25)-F1->(0, 0, 0, 0, 0)",
    "Creating bitcount",
    "Pass0A: F: 1->0 1: 0->0 2: 0->0 3: 0->0 4: 0->0 5: 0->0",
    "0 nodes, 0 full relations.",
    "Non-free Survivors: ",
    "0 free relations consisting of large primes have been added.",
    "At least 0=0+0 relations can be created.",
  };

  public void test() throws Exception {
    final File testFile = File.createTempFile("test", "chopd");
    final File chopDir = new File(testFile.getPath() + ".chopd");
    assertTrue(chopDir.mkdir());
    final File chopFile = new File(chopDir, "test.lasieve-0.20000000-20000010.gz");
    TestUtils.resourceToFile("irvine/factor/gnfs/resources/temp.lasieve-0.20000000-20000010.gz", chopFile);
    try {
      CountFF.main("-F", "2", testFile.getPath());
    } finally {
      assertTrue(chopFile.delete());
      assertTrue(testFile.delete());
      assertTrue(chopDir.delete());
      assertTrue(new File(testFile.getPath() + ".hash").delete());
    }
    final String s = getOut() + getErr();
    //oldOut.println(s);
    TestUtils.containsAll(s, EXPECTED);
    // Attempt to clean up
    final File[] files = testFile.getParentFile().listFiles((dir, name) -> name.startsWith("gnfs") && name.endsWith("hash"));
    if (files != null) {
      for (final File file : files) {
        assertTrue(file.delete());
      }
    }
  }
}
