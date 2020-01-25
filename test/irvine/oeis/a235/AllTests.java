package irvine.oeis.a235;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A235108Test.class);
    suite.addTestSuite(A235115Test.class);
    suite.addTestSuite(A235118Test.class);
    suite.addTestSuite(A235136Test.class);
    suite.addTestSuite(A235163Test.class);
    suite.addTestSuite(A235269Test.class);
    suite.addTestSuite(A235271Test.class);
    suite.addTestSuite(A235282Test.class);
    suite.addTestSuite(A235332Test.class);
    suite.addTestSuite(A235341Test.class);
    suite.addTestSuite(A235355Test.class);
    suite.addTestSuite(A235367Test.class);
    suite.addTestSuite(A235383Test.class);
    suite.addTestSuite(A235451Test.class);
    suite.addTestSuite(A235498Test.class);
    suite.addTestSuite(A235499Test.class);
    suite.addTestSuite(A235510Test.class);
    suite.addTestSuite(A235537Test.class);
    suite.addTestSuite(A235583Test.class);
    suite.addTestSuite(A235593Test.class);
    suite.addTestSuite(A235594Test.class);
    suite.addTestSuite(A235597Test.class);
    suite.addTestSuite(A235599Test.class);
    suite.addTestSuite(A235623Test.class);
    suite.addTestSuite(A235643Test.class);
    suite.addTestSuite(A235686Test.class);
    suite.addTestSuite(A235699Test.class);
    suite.addTestSuite(A235700Test.class);
    suite.addTestSuite(A235701Test.class);
    suite.addTestSuite(A235702Test.class);
    suite.addTestSuite(A235716Test.class);
    suite.addTestSuite(A235789Test.class);
    suite.addTestSuite(A235800Test.class);
    suite.addTestSuite(A235801Test.class);
    suite.addTestSuite(A235877Test.class);
    suite.addTestSuite(A235878Test.class);
    suite.addTestSuite(A235879Test.class);
    suite.addTestSuite(A235880Test.class);
    suite.addTestSuite(A235881Test.class);
    suite.addTestSuite(A235882Test.class);
    suite.addTestSuite(A235883Test.class);
    suite.addTestSuite(A235886Test.class);
    suite.addTestSuite(A235887Test.class);
    suite.addTestSuite(A235888Test.class);
    suite.addTestSuite(A235889Test.class);
    suite.addTestSuite(A235890Test.class);
    suite.addTestSuite(A235891Test.class);
    suite.addTestSuite(A235892Test.class);
    suite.addTestSuite(A235895Test.class);
    suite.addTestSuite(A235944Test.class);
    suite.addTestSuite(A235988Test.class);
    suite.addTestSuite(A235996Test.class);
    suite.addTestSuite(A235997Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
