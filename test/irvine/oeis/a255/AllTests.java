package irvine.oeis.a255;

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
    suite.addTestSuite(A255002Test.class);
    suite.addTestSuite(A255015Test.class);
    suite.addTestSuite(A255016Test.class);
    suite.addTestSuite(A255043Test.class);
    suite.addTestSuite(A255051Test.class);
    suite.addTestSuite(A255115Test.class);
    suite.addTestSuite(A255116Test.class);
    suite.addTestSuite(A255117Test.class);
    suite.addTestSuite(A255118Test.class);
    suite.addTestSuite(A255119Test.class);
    suite.addTestSuite(A255138Test.class);
    suite.addTestSuite(A255184Test.class);
    suite.addTestSuite(A255185Test.class);
    suite.addTestSuite(A255186Test.class);
    suite.addTestSuite(A255187Test.class);
    suite.addTestSuite(A255211Test.class);
    suite.addTestSuite(A255236Test.class);
    suite.addTestSuite(A255253Test.class);
    suite.addTestSuite(A255284Test.class);
    suite.addTestSuite(A255296Test.class);
    suite.addTestSuite(A255301Test.class);
    suite.addTestSuite(A255303Test.class);
    suite.addTestSuite(A255347Test.class);
    suite.addTestSuite(A255353Test.class);
    suite.addTestSuite(A255368Test.class);
    suite.addTestSuite(A255371Test.class);
    suite.addTestSuite(A255372Test.class);
    suite.addTestSuite(A255373Test.class);
    suite.addTestSuite(A255374Test.class);
    suite.addTestSuite(A255375Test.class);
    suite.addTestSuite(A255376Test.class);
    suite.addTestSuite(A255377Test.class);
    suite.addTestSuite(A255378Test.class);
    suite.addTestSuite(A255379Test.class);
    suite.addTestSuite(A255380Test.class);
    suite.addTestSuite(A255386Test.class);
    suite.addTestSuite(A255442Test.class);
    suite.addTestSuite(A255457Test.class);
    suite.addTestSuite(A255459Test.class);
    suite.addTestSuite(A255463Test.class);
    suite.addTestSuite(A255465Test.class);
    suite.addTestSuite(A255467Test.class);
    suite.addTestSuite(A255471Test.class);
    suite.addTestSuite(A255487Test.class);
    suite.addTestSuite(A255499Test.class);
    suite.addTestSuite(A255501Test.class);
    suite.addTestSuite(A255563Test.class);
    suite.addTestSuite(A255596Test.class);
    suite.addTestSuite(A255630Test.class);
    suite.addTestSuite(A255631Test.class);
    suite.addTestSuite(A255632Test.class);
    suite.addTestSuite(A255633Test.class);
    suite.addTestSuite(A255678Test.class);
    suite.addTestSuite(A255680Test.class);
    suite.addTestSuite(A255687Test.class);
    suite.addTestSuite(A255813Test.class);
    suite.addTestSuite(A255814Test.class);
    suite.addTestSuite(A255815Test.class);
    suite.addTestSuite(A255821Test.class);
    suite.addTestSuite(A255840Test.class);
    suite.addTestSuite(A255842Test.class);
    suite.addTestSuite(A255843Test.class);
    suite.addTestSuite(A255844Test.class);
    suite.addTestSuite(A255845Test.class);
    suite.addTestSuite(A255846Test.class);
    suite.addTestSuite(A255847Test.class);
    suite.addTestSuite(A255848Test.class);
    suite.addTestSuite(A255875Test.class);
    suite.addTestSuite(A255876Test.class);
    suite.addTestSuite(A255877Test.class);
    suite.addTestSuite(A255978Test.class);
    suite.addTestSuite(A255983Test.class);
    suite.addTestSuite(A255985Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

