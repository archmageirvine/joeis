package irvine.math.group;

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
    suite.addTestSuite(AffineGroupCycleIndexTest.class);
    suite.addTestSuite(AlternatingGroupTest.class);
    suite.addTestSuite(BaseStrongGeneratingCandidateElementTest.class);
    suite.addTestSuite(CayleyTableTest.class);
    suite.addTestSuite(CentralizerTest.class);
    suite.addTestSuite(CentreTest.class);
    suite.addTestSuite(CyclicGroupTest.class);
    suite.addTestSuite(DefaultQuotientGroupTest.class);
    suite.addTestSuite(DegreeLimitedPolynomialRingFieldTest.class);
    suite.addTestSuite(DicyclicGroupTest.class);
    suite.addTestSuite(DihedralGroupTest.class);
    suite.addTestSuite(DirectProductTest.class);
    suite.addTestSuite(DirectSumTest.class);
    suite.addTestSuite(DummyFieldTest.class);
    suite.addTestSuite(DummyGroupTest.class);
    suite.addTestSuite(DummyIntegralDomainTest.class);
    suite.addTestSuite(DummyOrderedFieldTest.class);
    suite.addTestSuite(DummyOrderedIntegralDomainTest.class);
    suite.addTestSuite(DummyRingTest.class);
    suite.addTestSuite(ExceptionalG23Test.class);
    suite.addTestSuite(FiniteIdealTest.class);
    suite.addTestSuite(GaloisFieldTest.class);
    suite.addTestSuite(GaussianIntegersTest.class);
    suite.addTestSuite(GeneralLinearCycleIndexTest.class);
    suite.addTestSuite(GeneralLinearGroupTest.class);
    suite.addTestSuite(GeneratorTest.class);
    suite.addTestSuite(GroupFactoryTest.class);
    suite.addTestSuite(GroupUtilsTest.class);
    suite.addTestSuite(IntegerFieldTest.class);
    suite.addTestSuite(IntegerMultiplesTest.class);
    suite.addTestSuite(IntegerPermutationGroupTest.class);
    suite.addTestSuite(IntegersModTest.class);
    suite.addTestSuite(IntegersModMulTest.class);
    suite.addTestSuite(IsomorphicTest.class);
    suite.addTestSuite(Janko1Test.class);
    suite.addTestSuite(Janko2Test.class);
    suite.addTestSuite(LeftCosetTest.class);
    suite.addTestSuite(Mathieu11Test.class);
    suite.addTestSuite(Mathieu12Test.class);
    suite.addTestSuite(Mathieu22Test.class);
    suite.addTestSuite(Mathieu23Test.class);
    suite.addTestSuite(Mathieu24Test.class);
    suite.addTestSuite(MatrixGroupTest.class);
    suite.addTestSuite(MatrixGroupRingTest.class);
    suite.addTestSuite(MatrixFieldTest.class);
    suite.addTestSuite(MatrixRingTest.class);
    suite.addTestSuite(MultiplicativeGroupTest.class);
    suite.addTestSuite(MultivariatePolynomialRingTest.class);
    suite.addTestSuite(PolynomialRingFieldTest.class);
    suite.addTestSuite(PolynomialRingTest.class);
    suite.addTestSuite(QPolynomialRingTest.class);
    suite.addTestSuite(RightCosetTest.class);
    suite.addTestSuite(RingFactorialTest.class);
    suite.addTestSuite(SchreierArrayTest.class);
    suite.addTestSuite(SchreierSimsTest.class);
    suite.addTestSuite(ShanksPhiTest.class);
    suite.addTestSuite(SingletonTest.class);
    suite.addTestSuite(SpecialLinearGroupTest.class);
    suite.addTestSuite(SubgroupTest.class);
    suite.addTestSuite(SubgroupIteratorTest.class);
    suite.addTestSuite(Suzuki8Test.class);
    suite.addTestSuite(SymmetricGroupTest.class);
    suite.addTestSuite(Unitary33Test.class);
    suite.addTestSuite(Unitary34Test.class);
    suite.addTestSuite(Unitary35Test.class);
    suite.addTestSuite(Unitary42Test.class);
    suite.addTestSuite(VectorSpaceTest.class);
    suite.addTestSuite(VectorSpaceOverFieldTest.class);
    suite.addTestSuite(ZeroSkippingIteratorTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
