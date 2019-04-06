package irvine.oeis.a173;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A173000Test.class);
    suite.addTestSuite(A173009Test.class);
    suite.addTestSuite(A173018Test.class);
    suite.addTestSuite(A173031Test.class);
    suite.addTestSuite(A173036Test.class);
    suite.addTestSuite(A173044Test.class);
    suite.addTestSuite(A173078Test.class);
    suite.addTestSuite(A173089Test.class);
    suite.addTestSuite(A173105Test.class);
    suite.addTestSuite(A173115Test.class);
    suite.addTestSuite(A173116Test.class);
    suite.addTestSuite(A173121Test.class);
    suite.addTestSuite(A173125Test.class);
    suite.addTestSuite(A173126Test.class);
    suite.addTestSuite(A173127Test.class);
    suite.addTestSuite(A173141Test.class);
    suite.addTestSuite(A173154Test.class);
    suite.addTestSuite(A173173Test.class);
    suite.addTestSuite(A173187Test.class);
    suite.addTestSuite(A173193Test.class);
    suite.addTestSuite(A173196Test.class);
    suite.addTestSuite(A173200Test.class);
    suite.addTestSuite(A173202Test.class);
    suite.addTestSuite(A173205Test.class);
    suite.addTestSuite(A173225Test.class);
    suite.addTestSuite(A173234Test.class);
    suite.addTestSuite(A173237Test.class);
    suite.addTestSuite(A173259Test.class);
    suite.addTestSuite(A173262Test.class);
    suite.addTestSuite(A173267Test.class);
    suite.addTestSuite(A173275Test.class);
    suite.addTestSuite(A173276Test.class);
    suite.addTestSuite(A173294Test.class);
    suite.addTestSuite(A173307Test.class);
    suite.addTestSuite(A173308Test.class);
    suite.addTestSuite(A173309Test.class);
    suite.addTestSuite(A173343Test.class);
    suite.addTestSuite(A173344Test.class);
    suite.addTestSuite(A173346Test.class);
    suite.addTestSuite(A173391Test.class);
    suite.addTestSuite(A173393Test.class);
    suite.addTestSuite(A173432Test.class);
    suite.addTestSuite(A173434Test.class);
    suite.addTestSuite(A173448Test.class);
    suite.addTestSuite(A173450Test.class);
    suite.addTestSuite(A173490Test.class);
    suite.addTestSuite(A173495Test.class);
    suite.addTestSuite(A173511Test.class);
    suite.addTestSuite(A173512Test.class);
    suite.addTestSuite(A173521Test.class);
    suite.addTestSuite(A173536Test.class);
    suite.addTestSuite(A173559Test.class);
    suite.addTestSuite(A173562Test.class);
    suite.addTestSuite(A173573Test.class);
    suite.addTestSuite(A173577Test.class);
    suite.addTestSuite(A173593Test.class);
    suite.addTestSuite(A173598Test.class);
    suite.addTestSuite(A173635Test.class);
    suite.addTestSuite(A173657Test.class);
    suite.addTestSuite(A173674Test.class);
    suite.addTestSuite(A173686Test.class);
    suite.addTestSuite(A173690Test.class);
    suite.addTestSuite(A173691Test.class);
    suite.addTestSuite(A173704Test.class);
    suite.addTestSuite(A173707Test.class);
    suite.addTestSuite(A173711Test.class);
    suite.addTestSuite(A173712Test.class);
    suite.addTestSuite(A173714Test.class);
    suite.addTestSuite(A173716Test.class);
    suite.addTestSuite(A173721Test.class);
    suite.addTestSuite(A173722Test.class);
    suite.addTestSuite(A173731Test.class);
    suite.addTestSuite(A173734Test.class);
    suite.addTestSuite(A173735Test.class);
    suite.addTestSuite(A173736Test.class);
    suite.addTestSuite(A173737Test.class);
    suite.addTestSuite(A173764Test.class);
    suite.addTestSuite(A173766Test.class);
    suite.addTestSuite(A173768Test.class);
    suite.addTestSuite(A173770Test.class);
    suite.addTestSuite(A173772Test.class);
    suite.addTestSuite(A173776Test.class);
    suite.addTestSuite(A173802Test.class);
    suite.addTestSuite(A173804Test.class);
    suite.addTestSuite(A173805Test.class);
    suite.addTestSuite(A173806Test.class);
    suite.addTestSuite(A173807Test.class);
    suite.addTestSuite(A173808Test.class);
    suite.addTestSuite(A173809Test.class);
    suite.addTestSuite(A173810Test.class);
    suite.addTestSuite(A173811Test.class);
    suite.addTestSuite(A173812Test.class);
    suite.addTestSuite(A173813Test.class);
    suite.addTestSuite(A173833Test.class);
    suite.addTestSuite(A173834Test.class);
    suite.addTestSuite(A173835Test.class);
    suite.addTestSuite(A173855Test.class);
    suite.addTestSuite(A173858Test.class);
    suite.addTestSuite(A173862Test.class);
    suite.addTestSuite(A173873Test.class);
    suite.addTestSuite(A173896Test.class);
    suite.addTestSuite(A173952Test.class);
    suite.addTestSuite(A173960Test.class);
    suite.addTestSuite(A173961Test.class);
    suite.addTestSuite(A173962Test.class);
    suite.addTestSuite(A173963Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

