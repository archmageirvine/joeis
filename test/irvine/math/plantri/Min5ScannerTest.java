package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Min5ScannerTest extends TestCase {

  /*
    3-connected planar triangulations with minimum degree 5 (plantri -m5),
  and 3-connected planar graphs (convex polytopes) with minimum degree 5
  (plantri -pm5).

                       triangulations                polytopes

   nv  ne  nf            all            O-P             all             O-P

   12  30  20 |              1              1 |              1              1
   13  33  22 |              0              0 |              0              0
   14  36  24 |              1              1 |              1              1
   15  39  26 |              1              1 |              1              1
   16  42  28 |              3              4 |              5              6
   17  45  30 |              4              4 |              8              8
   18  48  32 |             12             17 |             30             46
   19  51  34 |             23             33 |             85            135
   20  54  36 |             73            117 |            392            686
   21  57  38 |            192            331 |           1587           2961
   22  60  40 |            651           1180 |           7657          14744
   23  63  42 |           2070           3899 |          36291          71207
   */
  public void testTriangulationsMin5() {
    assertEquals(1, new Plantri().count(12, 5, -1, -1, false, false, false, false));
    assertEquals(0, new Plantri().count(13, 5, -1, -1, false, false, false, false));
    assertEquals(1, new Plantri().count(14, 5, -1, -1, false, false, false, false));
    assertEquals(1, new Plantri().count(15, 5, -1, -1, false, false, false, false));
    assertEquals(3, new Plantri().count(16, 5, -1, -1, false, false, false, false));
    assertEquals(4, new Plantri().count(17, 5, -1, -1, false, false, false, false));
    assertEquals(12, new Plantri().count(18, 5, -1, -1, false, false, false, false));
    assertEquals(23, new Plantri().count(19, 5, -1, -1, false, false, false, false));
    assertEquals(73, new Plantri().count(20, 5, -1, -1, false, false, false, false));
    assertEquals(192, new Plantri().count(21, 5, -1, -1, false, false, false, false));
    assertEquals(651, new Plantri().count(22, 5, -1, -1, false, false, false, false));
  }

  public void testTriangulationsMin5OP() {
    assertEquals(1, new Plantri().count(12, 5, -1, -1, true, false, false, false));
    assertEquals(0, new Plantri().count(13, 5, -1, -1, true, false, false, false));
    assertEquals(1, new Plantri().count(14, 5, -1, -1, true, false, false, false));
    assertEquals(1, new Plantri().count(15, 5, -1, -1, true, false, false, false));
    assertEquals(4, new Plantri().count(16, 5, -1, -1, true, false, false, false));
    assertEquals(4, new Plantri().count(17, 5, -1, -1, true, false, false, false));
    assertEquals(17, new Plantri().count(18, 5, -1, -1, true, false, false, false));
    assertEquals(33, new Plantri().count(19, 5, -1, -1, true, false, false, false));
    assertEquals(117, new Plantri().count(20, 5, -1, -1, true, false, false, false));
    assertEquals(331, new Plantri().count(21, 5, -1, -1, true, false, false, false));
  }

  public void testConvexPolytopesMin5() {
    assertEquals(1, new Plantri().count(12, 5, -1, -1, false, true, false, false));
    assertEquals(0, new Plantri().count(13, 5, -1, -1, false, true, false, false));
    assertEquals(1, new Plantri().count(14, 5, -1, -1, false, true, false, false));
    assertEquals(1, new Plantri().count(15, 5, -1, -1, false, true, false, false));
    assertEquals(5, new Plantri().count(16, 5, -1, -1, false, true, false, false));
    assertEquals(8, new Plantri().count(17, 5, -1, -1, false, true, false, false));
    assertEquals(30, new Plantri().count(18, 5, -1, -1, false, true, false, false));
    assertEquals(85, new Plantri().count(19, 5, -1, -1, false, true, false, false));
    assertEquals(392, new Plantri().count(20, 5, -1, -1, false, true, false, false));
    assertEquals(1587, new Plantri().count(21, 5, -1, -1, false, true, false, false));
  }

  public void testConvexPolytopesMin5OP() {
    assertEquals(1, new Plantri().count(12, 5, -1, -1, true, true, false, false));
    assertEquals(0, new Plantri().count(13, 5, -1, -1, true, true, false, false));
    assertEquals(1, new Plantri().count(14, 5, -1, -1, true, true, false, false));
    assertEquals(1, new Plantri().count(15, 5, -1, -1, true, true, false, false));
    assertEquals(6, new Plantri().count(16, 5, -1, -1, true, true, false, false));
    assertEquals(8, new Plantri().count(17, 5, -1, -1, true, true, false, false));
    assertEquals(46, new Plantri().count(18, 5, -1, -1, true, true, false, false));
    assertEquals(135, new Plantri().count(19, 5, -1, -1, true, true, false, false));
    assertEquals(686, new Plantri().count(20, 5, -1, -1, true, true, false, false));
  }

}
