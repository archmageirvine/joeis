package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class EdgeCountsTest extends TestCase {

  public void testStar3() {
    assertEquals(342, EdgeCounts.star3(42));
  }

  public void testStar4() {
    assertEquals(854, EdgeCounts.star4(42));
  }

  public void testStar5() {
    assertEquals(1702, EdgeCounts.star5(42));
  }

  public void testQuadrP0() {
    assertEquals(416, EdgeCounts.quadrP0(42));
  }

  public void testQuadrP1() {
    assertEquals(172, EdgeCounts.quadrP1(42));
  }

  public void testQuadrP2() {
    assertEquals(532, EdgeCounts.quadrP2(42));
  }

  public void testQuadrP3() {
    assertEquals(1312, EdgeCounts.quadrP3(42));
  }

  public void testFourOp() {
    assertEquals(252, EdgeCounts.fourOp(42));
  }

  public void testFiveOp() {
    assertEquals(636, EdgeCounts.fiveOp(42));
  }

  public void testSOp() {
    assertEquals(1524, EdgeCounts.sOp(42));
  }

  public void testMin5A() {
    assertEquals(240, EdgeCounts.min5A(42));
  }

  public void testMin5B0() {
    assertEquals(732, EdgeCounts.min5B0(42));
  }

  public void testMin5B1() {
    assertEquals(1356, EdgeCounts.min5B1(42));
  }

  public void testMin5C() {
    assertEquals(2820, EdgeCounts.min5C(42));
  }

  public void testPOp() {
    assertEquals(528, EdgeCounts.pOp(42));
  }

  public void testQOp() {
    assertEquals(1044, EdgeCounts.qOp(42));
  }

}
