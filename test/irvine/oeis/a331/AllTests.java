package irvine.oeis.a331;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A331052Test.class);
    suite.addTestSuite(A331053Test.class);
    suite.addTestSuite(A331054Test.class);
    suite.addTestSuite(A331055Test.class);
    suite.addTestSuite(A331056Test.class);
    suite.addTestSuite(A331057Test.class);
    suite.addTestSuite(A331058Test.class);
    suite.addTestSuite(A331059Test.class);
    suite.addTestSuite(A331060Test.class);
    suite.addTestSuite(A331061Test.class);
    suite.addTestSuite(A331062Test.class);
    suite.addTestSuite(A331063Test.class);
    suite.addTestSuite(A331064Test.class);
    suite.addTestSuite(A331065Test.class);
    suite.addTestSuite(A331066Test.class);
    suite.addTestSuite(A331067Test.class);
    suite.addTestSuite(A331068Test.class);
    suite.addTestSuite(A331069Test.class);
    suite.addTestSuite(A331070Test.class);
    suite.addTestSuite(A331094Test.class);
    suite.addTestSuite(A331095Test.class);
    suite.addTestSuite(A331101Test.class);
    suite.addTestSuite(A331106Test.class);
    suite.addTestSuite(A331115Test.class);
    suite.addTestSuite(A331125Test.class);
    suite.addTestSuite(A331127Test.class);
    suite.addTestSuite(A331189Test.class);
    suite.addTestSuite(A331190Test.class);
    suite.addTestSuite(A331202Test.class);
    suite.addTestSuite(A331236Test.class);
    suite.addTestSuite(A331237Test.class);
    suite.addTestSuite(A331238Test.class);
    suite.addTestSuite(A331265Test.class);
    suite.addTestSuite(A331319Test.class);
    suite.addTestSuite(A331320Test.class);
    suite.addTestSuite(A331321Test.class);
    suite.addTestSuite(A331325Test.class);
    suite.addTestSuite(A331326Test.class);
    suite.addTestSuite(A331347Test.class);
    suite.addTestSuite(A331350Test.class);
    suite.addTestSuite(A331351Test.class);
    suite.addTestSuite(A331352Test.class);
    suite.addTestSuite(A331353Test.class);
    suite.addTestSuite(A331354Test.class);
    suite.addTestSuite(A331356Test.class);
    suite.addTestSuite(A331357Test.class);
    suite.addTestSuite(A331358Test.class);
    suite.addTestSuite(A331359Test.class);
    suite.addTestSuite(A331360Test.class);
    suite.addTestSuite(A331361Test.class);
    suite.addTestSuite(A331403Test.class);
    suite.addTestSuite(A331408Test.class);
    suite.addTestSuite(A331413Test.class);
    suite.addTestSuite(A331419Test.class);
    suite.addTestSuite(A331420Test.class);
    suite.addTestSuite(A331422Test.class);
    suite.addTestSuite(A331429Test.class);
    suite.addTestSuite(A331445Test.class);
    suite.addTestSuite(A331480Test.class);
    suite.addTestSuite(A331501Test.class);
    suite.addTestSuite(A331502Test.class);
    suite.addTestSuite(A331528Test.class);
    suite.addTestSuite(A331536Test.class);
    suite.addTestSuite(A331551Test.class);
    suite.addTestSuite(A331552Test.class);
    suite.addTestSuite(A331574Test.class);
    suite.addTestSuite(A331575Test.class);
    suite.addTestSuite(A331576Test.class);
    suite.addTestSuite(A331630Test.class);
    suite.addTestSuite(A331642Test.class);
    suite.addTestSuite(A331729Test.class);
    suite.addTestSuite(A331790Test.class);
    suite.addTestSuite(A331817Test.class);
    suite.addTestSuite(A331890Test.class);
    suite.addTestSuite(A331943Test.class);
    suite.addTestSuite(A331952Test.class);
    suite.addTestSuite(A331987Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
