package irvine.factor.project.factorial;

import java.io.File;

import irvine.StandardIoTestCase;
import irvine.TestUtils;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class FactorialTest extends StandardIoTestCase {

  private static final String[] EXPECTED = {
    "Number of distinct factors (n<100000): 67",
    "Most known factors for n!-1 is 8 when n = 105",
    "Most known factors for n!+1 is 5 when n = 100",
    "Largest penultimate factor for n!-1 is 24 digits when n = 112",
    "Largest penultimate factor for n!+1 is 28 digits when n = 205",
    "Composites with no known factors for n!-1 is 864 (n<=1000)",
    "Composites with no known factors for n!-1 is 9864 (n<=10000)",
    "Composites with no known factors for n!-1 is 99864 (n<=100000)",
    "Composites with no known factors for n!+1 is 861 (n<=1000)",
    "Composites with no known factors for n!+1 is 9859 (n<=10000)",
    "Composites with no known factors for n!+1 is 99859 (n<=100000)",
    "Smallest composites:",
    "-: 136!-1 C233, 137!-1 C235, 138!-1 C237, 139!-1 C239, 140!-1 C242",
    "+: 139!+1 C239, 140!+1 C242, 141!+1 C244, 142!+1 C246, 143!+1 C248",
    "First holes:",
  };

  public void test() throws Exception {
    final File testFile = File.createTempFile("deaths", "dat");
    try {
      TestUtils.resourceToFile("irvine/factor/project/factorial/test.dat", testFile);
      Factorial.main("-s", testFile.getPath());
    } finally {
      assertTrue(testFile.delete());
    }
    final String s = getOut() + getErr();
    //oldOut.println(s);
    TestUtils.containsAll(s, EXPECTED);
  }
}
